package com.qyh.eyekotlin.mvp.mine

import android.graphics.Typeface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.qyh.eyekotlin.R
import com.qyh.eyekotlin.mvp.mine.advise.AdviseFragment
import com.qyh.eyekotlin.mvp.mine.cache.CacheFragment
import com.qyh.eyekotlin.mvp.mine.watch.WatchFragment
import com.qyh.eyekotlin.mvp.videodetail.VideoDetailFragment
import com.qyh.eyekotlin.ui.MainFragment
import com.qyh.eyekotlin.utils.newIntent
import kotlinx.android.synthetic.main.fragment_mine.*
import me.yokeyword.fragmentation.SupportFragment

/**
 * @author 邱永恒
 *
 * @playDuration 2018/2/25  15:57
 *
 * @desc ${TODD}
 *
 */
class MineFragment : SupportFragment(), View.OnClickListener {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_mine, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    fun initView() {
        tv_advise.setOnClickListener(this)
        tv_watch.setOnClickListener(this)
        tv_save.setOnClickListener(this)
        tv_advise.typeface = Typeface.createFromAsset(context?.assets, "fonts/FZLanTingHeiS-DB1-GB-Regular.TTF")
        tv_watch.typeface = Typeface.createFromAsset(context?.assets, "fonts/FZLanTingHeiS-DB1-GB-Regular.TTF")
        tv_save.typeface = Typeface.createFromAsset(context?.assets, "fonts/FZLanTingHeiS-DB1-GB-Regular.TTF")
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_watch -> {
                // 观看记录
                (parentFragment as MainFragment).start(WatchFragment())
            }
            R.id.tv_advise -> {
                // 了解作者
                (parentFragment as MainFragment).start(AdviseFragment())
            }
            R.id.tv_save -> {
                // 缓存记录
                (parentFragment as MainFragment).start(CacheFragment())
            }
        }
    }
}
