package p000;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yf5 implements PackageManager.OnChecksumsReadyListener {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ m60 f35198a;

    @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
    public final void onChecksumsReady(List list) {
        m60 m60Var = this.f35198a;
        if (list == null) {
            m60Var.m8198a("");
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum apkChecksum = (ApkChecksum) list.get(i);
                if (apkChecksum.getType() == 8) {
                    m60Var.m8198a(C1087qx.f28858f.m10152f().m10150c(apkChecksum.getValue()));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        m60Var.m8198a("");
    }
}
