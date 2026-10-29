package p000;

import android.content.pm.PackageInfo;
import android.webkit.WebView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jz4 extends C1408zk {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ byte f22777e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jz4(String str, String str2, byte b) {
        super(str, str2, (byte) 2);
        this.f22777e = b;
    }

    @Override // p000.C1408zk
    /* JADX INFO: renamed from: a */
    public final boolean mo7351a() {
        switch (this.f22777e) {
            case 0:
                if (!super.mo7351a()) {
                    return false;
                }
                WeakHashMap weakHashMap = iz4.f21911a;
                PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                return currentWebViewPackage != null && currentWebViewPackage.getLongVersionCode() >= 636700000;
            case 1:
                if (!super.mo7351a() || !kz4.m7755b("MULTI_PROCESS")) {
                    return false;
                }
                WeakHashMap weakHashMap2 = iz4.f21911a;
                if (kz4.f23640b.mo7351a()) {
                    return mz4.f25346a.getStatics().isMultiProcessEnabled();
                }
                throw kz4.m7754a();
            default:
                if (kz4.m7755b("MULTI_PROFILE")) {
                    return super.mo7351a();
                }
                return false;
        }
    }
}
