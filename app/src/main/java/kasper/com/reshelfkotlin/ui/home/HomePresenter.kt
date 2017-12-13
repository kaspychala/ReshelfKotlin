package kasper.com.reshelfkotlin.ui.home

import kasper.com.reshelfkotlin.ui.base.BasePresenter
import javax.inject.Inject

/**
 * Created by Kasper on 13.12.2017.
 */
class HomePresenter @Inject constructor(): BasePresenter<HomeView>() {

    fun fetchText(){
        view.showText("I'm visible!")
    }
}