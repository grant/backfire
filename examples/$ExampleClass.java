package com.alch.generators.constants;

import java.util.function.Function;

/**
 * An example class
 */
public class $Model extends React {
  private class prop {
    /** optional banner to be included at the top of the modal */
    public String bannerImgSrc = "";
    /** CSS classes to be added to the modal */
    public String className = "";
    /** Method to end the modal sequence on demand */
    public Function onClose = ModalSequenceManager.nextStep;
    /** Whether to show the 'x' close button in the top right */
    public Boolean showCloseButton = true;
    /** whether the modal is in a waiting state */
    public Boolean waiting = false;
  }

  @Override
  private void render() {
    Func getCloseButton = () -> {
      return $DOM.div.className("modal-exit").onClick(this.props.onClose).html(
          "&times"
      );
    };

    Func getModalSpinner = () -> {
      return $DOM.div.className("modal-waiting").html(
          $Loader.loading(true)
      );
    };

    return $DOM.div.className("Modal " + this.props.className).html(
        $DOM.div.className("modal-dialog " + (this.props.delayed ? "delayed" : "")).html(
            this.props.showCloseButton ? getCloseButton.call(this) : null,
            this.props.waiting ? getModalSpinner() : null,
            this.props.bannerImgSrc ?
                $DOM.div.className("modal-banner").html(
                    $DOM.img.src(this.props.bannerImgSrc)
                ) : null,
            $DOM.div.className("modal-content").html(
                this.props.children
            )
        )
    );
  }
}