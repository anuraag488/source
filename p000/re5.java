package p000;

import ads_mobile_sdk.AbstractC0137h;
import ads_mobile_sdk.s41;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class re5 implements jg5 {
    @Override // p000.jg5
    /* JADX INFO: renamed from: a */
    public final Object mo270a(s41 s41Var, Map map, wm0 wm0Var) {
        String str = (String) map.get("urls");
        ju4 ju4Var = ju4.f22634a;
        if (str == null || str.length() == 0) {
            AbstractC0137h.m1115c("URLs missing in canOpenURLs GMSG.", null);
            return ju4Var;
        }
        List<String> listM6353s0 = hd4.m6353s0(str, new String[]{","}, 6);
        wa2 wa2Var = new wa2();
        PackageManager packageManager = s41Var.getContext().getPackageManager();
        for (String str2 : listM6353s0) {
            List listM6353s1 = hd4.m6353s0(str2, new String[]{";"}, 2);
            boolean z = false;
            if (packageManager.resolveActivity(new Intent(listM6353s1.size() > 1 ? hd4.m6360z0((String) listM6353s1.get(1)).toString() : "android.intent.action.VIEW", Uri.parse(hd4.m6360z0((String) listM6353s1.get(0)).toString())), 65536) != null) {
                z = true;
            }
            wa2Var.m12182v(str2, Boolean.valueOf(z));
        }
        String str3 = (String) map.get("ad_mid");
        if (str3 != null && !hd4.m6345k0(str3)) {
            wa2Var.m12183w("ad_mid", str3);
        }
        Object objM2210a = s41Var.m2210a(wa2Var, "openableURLs", wm0Var);
        return objM2210a == ap0.f14763a ? objM2210a : ju4Var;
    }

    @Override // p000.jg5
    /* JADX INFO: renamed from: j */
    public final int mo271j() {
        return 22;
    }
}
