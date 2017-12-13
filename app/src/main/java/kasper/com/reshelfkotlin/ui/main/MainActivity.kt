package kasper.com.reshelfkotlin.ui.main

import android.os.Bundle
import android.support.v4.app.Fragment
import kasper.com.reshelfkotlin.R
import kasper.com.reshelfkotlin.ui.base.BaseActivity
import kasper.com.reshelfkotlin.ui.home.HomeFragment

class MainActivity : BaseActivity<MainPresenter, MainView>(), MainView {

    override fun getLayoutResId(): Int {
        return R.layout.activity_main
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        openFragment(HomeFragment())
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.content, fragment)
                .commit()
    }
}
