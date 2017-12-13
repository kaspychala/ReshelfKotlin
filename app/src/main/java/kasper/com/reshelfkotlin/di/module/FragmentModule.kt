package kasper.com.reshelfkotlin.di.module

import dagger.Module
import dagger.Provides
import kasper.com.reshelfkotlin.di.scope.PerFragment
import kasper.com.reshelfkotlin.ui.base.BaseView
import kasper.com.reshelfkotlin.ui.base.BaseFragment



/**
 * Created by Kasper on 13.12.2017.
 */

@Module
abstract class FragmentModule<in F : BaseFragment<*, *>, out V : BaseView> {

    @Provides
    @PerFragment
    fun provideView(fragment: F): V {
        return fragment as V
    }

}