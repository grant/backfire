/** @jsx React.DOM */

var _ = require('underscore'),
    React = require('react');

module.exports = (function () {
  var statics = {
    DEFAULT: 'default-loader',
    CONSOLE: 'console-loader',
    INLINE: 'inline-loader',

    Sizes: {
      SMALL: 'small',
      MEDIUM: 'medium',
      LARGE: 'large'
    }
  };

  return React.createClass({
    propTypes: {
      /**
       * Determines whether or not to display the loader
       * @demo true
       */
      loading: React.PropTypes.bool.isRequired,

      /** Which flavor of the sift loader to display */
      flavor: React.PropTypes.oneOf([statics.DEFAULT, statics.CONSOLE, statics.INLINE]),

      size: React.PropTypes.oneOf(_.values(statics.Sizes))
    },

    statics: statics,

    getDefaultProps: function() {
      return {
        flavor: statics.DEFAULT,
        size: statics.Sizes.MEDIUM
      };
    },

    render: function() {
      var self = this;

      function getLoaderGraphic() {
        if (self.props.flavor === statics.INLINE) {
          return <div className='inline-loader-graphic' />;
        }
        if (self.props.flavor === statics.DEFAULT) {
          return <div className='default-loader-graphic' />;
        }
        if (self.props.flavor === statics.CONSOLE) {
          return <img src='/image/sift-hex-loader.gif' className='sift-loader-gif' />;
        }
      }

      return (
        <div className={'Loader ' + this.props.flavor + ' ' + this.props.size}>
          {this.props.loading ? getLoaderGraphic() : null}
        </div>
      );
    },
  });
}());