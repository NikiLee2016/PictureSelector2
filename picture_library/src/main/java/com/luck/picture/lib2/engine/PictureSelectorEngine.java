package com.luck.picture.lib2.engine;

import com.luck.picture.lib2.entity.LocalMedia;
import com.luck.picture.lib2.listener.OnResultCallbackListener;

/**
 * @author：luck
 * @date：2020/4/22 11:36 AM
 * @describe：PictureSelectorEngine
 */
public interface PictureSelectorEngine {

    /**
     * Create ImageLoad Engine
     *
     * @return
     */
    ImageEngine createEngine();

    /**
     * Create Result Listener
     *
     * @return
     */
    OnResultCallbackListener<LocalMedia> getResultCallbackListener();
}
