package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e83 {

    /* JADX INFO: renamed from: a */
    @s24("initial_ad_unit_id")
    public final String f17881a;

    /* JADX INFO: renamed from: b */
    @s24("ad_source_name")
    public final String f17882b;

    /* JADX INFO: renamed from: c */
    @s24("click_urls")
    public final List<String> f17883c;

    /* JADX INFO: renamed from: d */
    @s24("imp_urls")
    public final List<String> f17884d;

    /* JADX INFO: renamed from: e */
    @s24("manual_tracking_urls")
    public final List<String> f17885e;

    /* JADX INFO: renamed from: f */
    @s24("fill_urls")
    public final List<String> f17886f;

    /* JADX INFO: renamed from: g */
    @s24("video_start_urls")
    public final List<String> f17887g;

    /* JADX INFO: renamed from: h */
    @s24("video_reward_urls")
    public final List<String> f17888h;

    /* JADX INFO: renamed from: i */
    @s24("video_complete_urls")
    public final List<String> f17889i;

    /* JADX INFO: renamed from: j */
    @s24("is_closable_area_disabled")
    public final boolean f17890j;

    /* JADX INFO: renamed from: k */
    @s24("recursive_request_parameters")
    public final wa2 f17891k;

    /* JADX INFO: renamed from: l */
    @s24("is_analytics_logging_enabled")
    public final boolean f17892l;

    /* JADX INFO: renamed from: m */
    @s24("rewards")
    public List<Bundle> f17893m = v71.f32439a;

    /* JADX INFO: renamed from: n */
    @s24("recursive_signal_collection")
    public final o92 f17894n;

    public e83(String str, String str2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, boolean z, wa2 wa2Var, boolean z2, o92 o92Var) {
        this.f17881a = str;
        this.f17882b = str2;
        this.f17883c = arrayList;
        this.f17884d = arrayList2;
        this.f17885e = arrayList3;
        this.f17886f = arrayList4;
        this.f17887g = arrayList5;
        this.f17888h = arrayList6;
        this.f17889i = arrayList7;
        this.f17890j = z;
        this.f17891k = wa2Var;
        this.f17892l = z2;
        this.f17894n = o92Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e83)) {
            return false;
        }
        e83 e83Var = (e83) obj;
        return z62.m13387o(this.f17881a, e83Var.f17881a) && z62.m13387o(this.f17882b, e83Var.f17882b) && z62.m13387o(this.f17883c, e83Var.f17883c) && z62.m13387o(this.f17884d, e83Var.f17884d) && z62.m13387o(this.f17885e, e83Var.f17885e) && z62.m13387o(this.f17886f, e83Var.f17886f) && z62.m13387o(this.f17887g, e83Var.f17887g) && z62.m13387o(this.f17888h, e83Var.f17888h) && z62.m13387o(this.f17889i, e83Var.f17889i) && this.f17890j == e83Var.f17890j && z62.m13387o(this.f17891k, e83Var.f17891k) && this.f17892l == e83Var.f17892l && z62.m13387o(this.f17893m, e83Var.f17893m) && z62.m13387o(this.f17894n, e83Var.f17894n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final int hashCode() {
        int iM3250i = as4.m3250i(this.f17889i, as4.m3250i(this.f17888h, as4.m3250i(this.f17887g, as4.m3250i(this.f17886f, as4.m3250i(this.f17885e, as4.m3250i(this.f17884d, as4.m3250i(this.f17883c, kx5.m7712i(this.f17881a.hashCode() * 31, this.f17882b))))))));
        boolean z = this.f17890j;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iM10716d = se0.m10716d(this.f17891k, (iM3250i + r1) * 31);
        boolean z2 = this.f17892l;
        int i = (iM10716d + (z2 ? 1 : z2)) * 31;
        List<Bundle> list = this.f17893m;
        int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        o92 o92Var = this.f17894n;
        return iHashCode + (o92Var != null ? o92Var.f26491a.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f17881a;
        String str2 = this.f17882b;
        List<String> list = this.f17883c;
        List<String> list2 = this.f17884d;
        List<String> list3 = this.f17885e;
        List<String> list4 = this.f17886f;
        List<String> list5 = this.f17887g;
        List<String> list6 = this.f17888h;
        List<String> list7 = this.f17889i;
        boolean z = this.f17890j;
        wa2 wa2Var = this.f17891k;
        boolean z2 = this.f17892l;
        List<Bundle> list8 = this.f17893m;
        o92 o92Var = this.f17894n;
        StringBuilder sbM13625y = zi4.m13625y("ParentAdConfig(innerAdUnitId=", str, ", adSourceName=", str2, ", clickUrls=");
        sbM13625y.append(list);
        sbM13625y.append(", impressionUrls=");
        sbM13625y.append(list2);
        sbM13625y.append(", manualTrackingUrls=");
        sbM13625y.append(list3);
        sbM13625y.append(", fillUrls=");
        sbM13625y.append(list4);
        sbM13625y.append(", videoStartUrls=");
        sbM13625y.append(list5);
        sbM13625y.append(", videoRewardsUrls=");
        sbM13625y.append(list6);
        sbM13625y.append(", videoCompleteUrls=");
        sbM13625y.append(list7);
        sbM13625y.append(", isClosableAreaDisabled=");
        sbM13625y.append(z);
        sbM13625y.append(", recursiveRequestParameters=");
        sbM13625y.append(wa2Var);
        sbM13625y.append(", isAnalyticsLoggingEnabled=");
        sbM13625y.append(z2);
        sbM13625y.append(", rewardsBundles=");
        sbM13625y.append(list8);
        sbM13625y.append(", recursiveSignalCollectionConfig=");
        sbM13625y.append(o92Var);
        sbM13625y.append(")");
        return sbM13625y.toString();
    }
}
