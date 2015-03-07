package cm.grant.examples;

import cm.grant.backfire.$DOM;
import cm.grant.backfire.PropTypes;
import cm.grant.backfire.ReactComponent;
import cm.grant.backfire.js.Func;
import cm.grant.backfire.js.Noop;

import java.util.function.LongUnaryOperator;

/**
 * An example class
 */
public class $ExampleComponent extends ReactComponent {
  private Props props = new Props();
  class Props extends PropTypes {
    /** optional banner to be included at the top of the modal */
    public String bannerImgSrc = "";
    /** CSS classes to be added to the modal */
    public String className = "";
    /** Method to end the modal sequence on demand */
    public Func onClose = new Noop();
    /** Whether to show the 'x' close button in the top right */
    public Boolean showCloseButton = true;
    /** whether the modal is in a waiting state */
    public Boolean waiting = false;
    /** whether the modal is delayed */
    public Boolean delayed = false;
  }

  @Override
  protected void render() {
    Func getCloseButton = () -> {
      $DOM.div().className("modal-exit").onClick(props.onClose).html(
          "&times"
      );
    };

    Func getModalSpinner = () -> {
      $DOM.div().className("modal-waiting").html(
          $Loader.loading(true)
      );
    };

    return $DOM.div().className("Modal " + this.props.className).html(
        $DOM.div().className("modal-dialog " + (props.delayed ? "delayed" : "")).html(
            this.props.showCloseButton ? getCloseButton.run() : null,
            this.props.waiting ? getModalSpinner.run() : null,
            this.props.bannerImgSrc ?
                $DOM.div().className("modal-banner").html(
                    $DOM.img().src(this.props.bannerImgSrc)
                ) : null,
            $DOM.div().className("modal-content").html(
                props.children
            )
        )
    );
  }
}