package kasper.com.reshelfkotlin.ui.base

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

/**
 * Created by Kasper on 09.12.2017.
 */

abstract class BaseActivity<P: BasePresenter<V>, V: BaseView>: DaggerAppCompatActivity(), BaseView {

    @Inject
    lateinit var presenter: P

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(getLayoutResId())
    }

    protected abstract fun getLayoutResId(): Int
}