package cm.grant.examples;

import cm.grant.backfire.$DOM;
import cm.grant.backfire.DOMNode;
import cm.grant.backfire.PropTypes;
import cm.grant.backfire.ReactComponent;
import cm.grant.backfire.js.Func;

/**
 *
 */
public class $Loader extends ReactComponent {
  public enum FLAVOR {
    DEFAULT,
    CONSOLE,
    INLINE
  }

  public enum SIZE {
    SMALL,
    MEDIUM,
    LARGE
  }

  private Props props = new Props();
  public static class Props extends PropTypes {
    public boolean loading;
    public FLAVOR flavor = FLAVOR.DEFAULT;
    public SIZE size = SIZE.MEDIUM;
  }

  public $Loader(Props loaderProps) {
    props = loaderProps;
  }

  @Override
  protected DOMNode render() {
    Func<DOMNode> getLoaderGraphic = () -> {
      DOMNode $graphic = null;
      switch (props.flavor) {
        case INLINE:
          $graphic = $DOM.div().className("inline-loader-graphic");
        case DEFAULT:
          $graphic = $DOM.div().className("default-loader-graphic");
        case CONSOLE:
          $graphic = $DOM.img().src("/image/sift-hex-loader.gif").className("sift-loader-gif");
      }
      return $graphic;
    };

    return $DOM.div().className("Loader " + props.flavor + " " + props.size).html(
        props.loading ? getLoaderGraphic.get() : null
    );
  }
}