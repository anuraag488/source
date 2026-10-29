package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.content.res.AssetFileDescriptor;
import java.io.IOException;

/* JADX INFO: renamed from: v9 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1248v9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32469a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f32470b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f32471c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f32472d;

    public /* synthetic */ RunnableC1248v9(byte b) {
        this.f32469a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o12 o12Var = null;
        switch (this.f32469a) {
            case 0:
                AbstractC1323x9 abstractC1323x9 = (AbstractC1323x9) this.f32471c;
                zl2 zl2Var = (zl2) this.f32472d;
                int i = this.f32470b;
                try {
                    if (zl2Var.isCancelled()) {
                        abstractC1323x9.f34070l = null;
                        abstractC1323x9.cancel(false);
                    } else {
                        abstractC1323x9.m12530s(i, zl2Var);
                    }
                    return;
                } finally {
                    abstractC1323x9.m12531t(null);
                }
            case 1:
                zf0 zf0Var = (zf0) this.f32471c;
                int i2 = this.f32470b;
                Object obj = ((C1392z4) this.f32472d).f35744a;
                String str = (String) zf0Var.f36039a.get(Integer.valueOf(i2));
                if (str == null) {
                    return;
                }
                C0563d5 c0563d5 = (C0563d5) zf0Var.f36043e.get(str);
                if ((c0563d5 != null ? c0563d5.f16782a : null) == null) {
                    zf0Var.f36045g.remove(str);
                    zf0Var.f36044f.put(str, obj);
                    return;
                } else {
                    InterfaceC1355y4 interfaceC1355y4 = c0563d5.f16782a;
                    if (zf0Var.f36042d.remove(str)) {
                        interfaceC1355y4.mo7271b(obj);
                        return;
                    }
                    return;
                }
            case 2:
                ((zf0) this.f32471c).m13543a(this.f32470b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f32472d));
                return;
            default:
                u72 u72Var = (u72) this.f32471c;
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) this.f32472d;
                int i3 = this.f32470b;
                x72 x72Var = u72Var.f31696b;
                m60 m60Var = u72Var.f31695a;
                x72Var.m12525l(m60Var);
                try {
                    x72Var.m12521g(m60Var, i3, zc6.m13510G(assetFileDescriptor, x72Var.f34036a, true));
                    return;
                } catch (IOException | UnsupportedOperationException e) {
                    m60Var.m8199b(new g82("Retrieving error failed: " + e.getMessage()));
                    return;
                } catch (yj2 unused) {
                    C1077qn.m9985k("unreachable");
                    return;
                }
        }
    }
}
