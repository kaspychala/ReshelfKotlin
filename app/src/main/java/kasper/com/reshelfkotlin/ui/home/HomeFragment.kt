package kasper.com.reshelfkotlin.ui.home

import android.os.Bundle
import kasper.com.reshelfkotlin.R
import kasper.com.reshelfkotlin.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * Created by Kasper on 13.12.2017.
 */
class HomeFragment: BaseFragment<HomePresenter, HomeView>(), HomeView {

    override fun showText(string: String) {
        tvChange.text = string
    }

    override fun getLayoutResId(): Int {
        return R.layout.fragment_home
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        presenter.fetchText()
    }
}