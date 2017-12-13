package kasper.com.reshelfkotlin.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import javax.inject.Inject

/**
 * Created by Kasper on 09.12.2017.
 */
abstract class BaseFragment<P: BasePresenter<V>, V: BaseView>: DaggerFragment(), BaseView {

    @Inject
    lateinit var presenter: P

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(getLayoutResId(), container, false)
    }

    protected abstract fun getLayoutResId(): Int
}