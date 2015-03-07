package cm.grant.examples;

import grant.cm.backfire.$DOM;
import grant.cm.backfire.PropTypes;
import grant.cm.backfire.ReactComponent;
import grant.cm.backfire.js.Func;

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
    public Func onClose = new Func();
    /** Whether to show the 'x' close button in the top right */
    public Boolean showCloseButton = true;
    /** whether the modal is in a waiting state */
    public Boolean waiting = false;
  }

  @Override
  protected void render() {
    $DOM.divImpl div = $DOM.div();
    $DOM.divImpl div2 = $DOM.div();
    System.out.println(div.i);

//    Func getCloseButton = () -> {
//      return $DOM.div().className("modal-exit").onClick(props.onClose).html(
//          "&times"
//      );
//    };
//
//    Func getModalSpinner = () -> {
//      return $DOM.div.className("modal-waiting").html(
//          $Loader.loading(true)
//      );
//    };
//
//    return $DOM.div.className("Modal " + this.props.className).html(
//        $DOM.div.className("modal-dialog " + (this.props.delayed ? "delayed" : "")).html(
//            this.props.showCloseButton ? getCloseButton.call(this) : null,
//            this.props.waiting ? getModalSpinner() : null,
//            this.props.bannerImgSrc ?
//                $DOM.div.className("modal-banner").html(
//                    $DOM.img.src(this.props.bannerImgSrc)
//                ) : null,
//            $DOM.div.className("modal-content").html(
//                this.props.children
//            )
//        )
//    );
  }
}