package cm.grant.examples;

import cm.grant.backfire.$DOM;
import cm.grant.backfire.DOMNode;
import cm.grant.backfire.PropTypes;
import cm.grant.backfire.ReactComponent;
import cm.grant.backfire.js.Func;
import cm.grant.backfire.js.Noop;

/**
 * An example modal class
 */
public class $Modal extends ReactComponent {
  private Props props = new Props();
  public class Props extends PropTypes {
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

  public $Modal() {}
  public $Modal(Props props) {
    this.props = props;
  }

  @Override
  protected DOMNode render() {
    Func getCloseButton = () ->
      $DOM.div().className("modal-exit").onClick(this.props.onClose).html(
          "&times"
      );

    Func getModalSpinner = () -> {
      $Loader.Props loaderProps = new $Loader.Props();
      loaderProps.loading = true;
      return $DOM.div().className("modal-waiting").html(
          new $Loader(loaderProps)
      );
    };


    Func getCloseButton1 = getCloseButton;
    return $DOM.div().className("Modal " + this.props.className).html(
        $DOM.div().className("modal-dialog " + (this.props.delayed ? "delayed" : "")).html(
            this.props.showCloseButton ? getCloseButton.get() : null,
            this.props.waiting ? getModalSpinner.get() : null,
            this.props.bannerImgSrc.isEmpty() ?
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