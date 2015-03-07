module.exports = (function() {
  'use strict';

  return React.createClass({
    propTypes: {
      /** optional banner to be included at the top of the modal */
      bannerImgSrc: React.PropTypes.string,
      /** CSS classes to be added to the modal */
      className: React.PropTypes.string,
      /** Method to end the modal sequence on demand */
      onClose: React.PropTypes.func,
      /** Whether to show the 'x' close button in the top right */
      showCloseButton: React.PropTypes.bool,
      /** whether the modal is in a waiting state */
      waiting: React.PropTypes.bool
    },

    getDefaultProps: function() {
      return {
        bannerImgSrc: '',
        className: '',
        // defaults to simply end the sequence
        onClose: ModalSequenceManager.nextStep,
        showCloseButton: true,
        waiting: false
      };
    },

    render: function() {
      function getCloseButton() {
        return (
          <div className='modal-exit' onClick={this.props.onClose} >
            &times;
          </div>
        );
      }

      function getModalSpinner() {
        return (
          <div className='modal-waiting'>
            <Loader loading={true} />
          </div>
        );
      }

      return (
        <div className={'Modal ' + this.props.className}>
          <div className={'modal-dialog ' + (this.props.delayed ? 'delayed' : '')}>
            {this.props.showCloseButton ? getCloseButton.call(this) : null}
            {this.props.waiting ? getModalSpinner() : null}

            {this.props.bannerImgSrc ?
              <div className='modal-banner'>
                <img src={this.props.bannerImgSrc} />
              </div>
            : null}

            <div className='modal-content'>
              {this.props.children}
            </div>
          </div>
        </div>
      );
    }
  });
})();