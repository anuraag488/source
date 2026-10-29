package p000;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: me */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0906me implements ti1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24835a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f24836b;

    public /* synthetic */ C0906me(byte b) {
        this.f24835a = b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public Object m8286a(wm0 wm0Var) {
        au0 au0Var;
        ru0 ru0Var = (ru0) this.f24836b;
        if (wm0Var instanceof au0) {
            au0Var = (au0) wm0Var;
            int i = au0Var.f14877v;
            if ((i & Integer.MIN_VALUE) != 0) {
                au0Var.f14877v = i - Integer.MIN_VALUE;
            } else {
                au0Var = new au0(this, wm0Var);
            }
        } else {
            au0Var = new au0(this, wm0Var);
        }
        Object obj = au0Var.f14875t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = au0Var.f14877v;
        ju4 ju4Var = ju4.f22634a;
        if (i2 != 0) {
            if (i2 == 1) {
                k43.m7376J(obj);
                return ju4Var;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k43.m7376J(obj);
        if (!(ru0Var.f29632h.m10917b() instanceof yf1)) {
            au0Var.f14877v = 1;
            if (ru0Var.m10433f(true, au0Var) == ap0Var) {
                return ap0Var;
            }
        }
        return ju4Var;
    }

    @Override // p000.ti1
    public final Object emit(Object obj, wm0 wm0Var) {
        byte b = this.f24835a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                z32 z32Var = (z32) this.f24836b;
                if (Build.VERSION.SDK_INT >= 34) {
                    z32Var.m13307C().startStylusHandwriting((View) z32Var.f35738b);
                } else {
                    z32Var.getClass();
                }
                return ju4Var;
            case 1:
                String str = (String) obj;
                xn2 xn2Var = (xn2) this.f24836b;
                String strM12721a = xn2Var.m12721a();
                k44 k44Var = k44.f22883b;
                if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                    xn2Var.m12722b(k44Var, strM12721a, str, null);
                }
                return ju4Var;
            case 2:
                Object objM8330f = ((C0910mi) this.f24836b).m8330f(wm0Var, new Float(AbstractC0506bw.f15654a.mo3662c(((C1233uv) obj).f32198c)));
                return objM8330f == ap0.f14763a ? objM8330f : ju4Var;
            case 3:
                sw2 sw2Var = (sw2) this.f24836b;
                LinkedHashMap linkedHashMap = r30.f28977a;
                ((yp1) sw2Var.getValue()).invoke((Intent) obj);
                return ju4Var;
            case 4:
                return m8286a(wm0Var);
            case 5:
                ((eu2) this.f24836b).f18491c.m13400i(((Number) obj).floatValue());
                return ju4Var;
            default:
                ((a34) this.f24836b).f81c.set((ih1) obj);
                return ju4Var;
        }
    }
}
