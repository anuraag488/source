package p000;

import ads_mobile_sdk.C0042b3;
import ads_mobile_sdk.lx1;
import ads_mobile_sdk.sy3;
import ads_mobile_sdk.z34;
import android.graphics.Rect;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ed5 extends AbstractC1350y implements hk5 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.hk5
    /* JADX INFO: renamed from: a */
    public final Object mo955a(z34 z34Var, wm0 wm0Var) {
        lx1 lx1Var;
        if (wm0Var instanceof lx1) {
            lx1Var = (lx1) wm0Var;
            int i = lx1Var.f7029d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lx1Var.f7029d = i - Integer.MIN_VALUE;
            } else {
                lx1Var = new lx1(this, (ym0) wm0Var);
            }
        } else {
            lx1Var = new lx1(this, (ym0) wm0Var);
        }
        Object objValueOf = lx1Var.f7027b;
        Object obj = ap0.f14763a;
        int i2 = lx1Var.f7029d;
        wm0 wm0Var2 = null;
        if (i2 == 0) {
            k43.m7376J(objValueOf);
            lx1Var.f7026a = this;
            lx1Var.f7029d = 1;
            Rect rect = z34Var.f14058d;
            Rect rect2 = z34Var.f14063i;
            Rect rect3 = z34Var.f14061g;
            int iWidth = rect.width();
            int iHeight = z34Var.f14058d.height();
            objValueOf = Boolean.valueOf((z34Var.f14062h && rect3.height() == iHeight && rect3.width() == iWidth) && (z34Var.f14064j && rect2.height() == iHeight && rect2.width() == iWidth));
            if (objValueOf == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = lx1Var.f7026a;
            k43.m7376J(objValueOf);
        }
        if (((Boolean) objValueOf).booleanValue()) {
            for (Map.Entry entry : ((Map) this.f34753b).entrySet()) {
                sy3.m2303a((zo0) this.f34752a, (t82) null, new C0042b3((String) entry.getKey(), (ua5) entry.getValue(), wm0Var2, (byte) 8), 3);
            }
        }
        return ju4.f22634a;
    }
}
