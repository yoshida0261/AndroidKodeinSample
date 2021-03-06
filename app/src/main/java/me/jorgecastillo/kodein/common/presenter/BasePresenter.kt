package me.jorgecastillo.kodein.common.presenter

/**
 * Presenter contract. It must have a view assigned to the type T.
 */
open class BasePresenter<T : BasePresenter.View> {

  /**
   * Base view contract. All views on this app will have a loading progressbar.
   */
  interface View {
    fun showLoading(): Unit
    fun hideLoading(): Unit
  }

  var view: T? = null

  open fun resume(view: T) {
    this.view = view
  }

  open fun pause() {
    this.view = null
  }
}
