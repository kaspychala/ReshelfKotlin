package kasper.com.reshelfkotlin.ui.base

import javax.inject.Inject

/**
 * Created by Kasper on 09.12.2017.
 */
abstract class BasePresenter<V: BaseView> {

    @Inject
    lateinit var view: V
}