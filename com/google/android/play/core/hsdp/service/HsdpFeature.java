package com.google.android.play.core.hsdp.service;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public enum HsdpFeature {
    SERVICE_BASED_HSDP("flag_enable_hsdp_service"),
    SERVICE_BASED_HSDP_PREWARM("flag_enable_hsdp_service_prewarm"),
    HSDP_PERSISTENT_OPEN_AFFORDANCE("flag_enable_hpoa"),
    SERVICE_BASED_HSDP_PERSISTENT_OPEN_AFFORDANCE("flag_enable_hpoa_in_hsdp_service");

    private final String key;

    HsdpFeature(String str) {
        this.key = str;
    }

    public String getKey() {
        return this.key;
    }
}
