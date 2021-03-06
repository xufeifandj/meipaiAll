package com.gzw.mp.bean;

/**
 * 视频列表
 * coder by 背离记 on 2015/11/10.
 */
public class TimeLineBean {
    private MediaBean media;
    private String recommend_caption;
    private String recommend_cover_pic;
    private String type;
    private String scheme;

    /**获取话题信息
     * @return
     */
    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    /**
     * 视频对象
     */
    public MediaBean getMedia() {
        return media;
    }

    public void setMedia(MediaBean media) {
        this.media = media;
    }

    /**
     * 视频标题
     */
    public String getRecommend_caption() {
        return recommend_caption;
    }

    public void setRecommend_caption(String recommend_caption) {
        this.recommend_caption = recommend_caption;
    }

    /**
     * 视频缩略图320*320
     */
    public String getRecommend_cover_pic() {
        return recommend_cover_pic;
    }

    public void setRecommend_cover_pic(String recommend_cover_pic) {
        this.recommend_cover_pic = recommend_cover_pic;
    }

    /**
     * 视频类型
     * @return
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
