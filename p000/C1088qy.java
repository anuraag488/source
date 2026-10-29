package p000;

import android.content.Context;
import android.os.VibrationEffect;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import java.io.IOException;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: qy */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1088qy extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f28872t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f28873u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1088qy(Object obj, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f28872t = b;
        this.f28873u = obj;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f28872t;
        Object obj2 = this.f28873u;
        switch (b) {
            case 0:
                return new C1088qy((co4) obj2, wm0Var, (byte) 0);
            case 1:
                return new C1088qy((d01) obj2, wm0Var, (byte) 1);
            case 2:
                return new C1088qy((lv1) obj2, wm0Var, (byte) 2);
            case 3:
                return new C1088qy((tb3) obj2, wm0Var, (byte) 3);
            case 4:
                return new C1088qy((wp1) obj2, wm0Var, (byte) 4);
            default:
                return new C1088qy((vy4) obj2, wm0Var, (byte) 5);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28872t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                ((C1088qy) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
                return ju4Var;
            case 1:
                return ((C1088qy) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
            case 2:
                ((C1088qy) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
                return ju4Var;
            case 3:
                return ((C1088qy) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
            case 4:
                ((C1088qy) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
                return ju4Var;
            default:
                ((C1088qy) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
                return ju4Var;
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        String str;
        int i = 0;
        byte b = 1;
        switch (this.f28872t) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                ((co4) this.f28873u).m4053a();
                return ju4.f22634a;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                d01 d01Var = (d01) this.f28873u;
                synchronized (d01Var) {
                    if (!d01Var.f16675l || d01Var.f16676m) {
                        return ju4.f22634a;
                    }
                    try {
                        d01Var.m4256v();
                        break;
                    } catch (IOException unused) {
                        d01Var.f16677n = true;
                    }
                    try {
                        if ((d01Var.f16672i >= 2000 ? 1 : 0) != 0) {
                            d01Var.m4245B();
                        }
                        break;
                    } catch (IOException unused2) {
                        d01Var.f16678o = true;
                        d01Var.f16673j = zp0.m13681m(new m00());
                    }
                    return ju4.f22634a;
                }
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                k43.m7376J(obj);
                lv1 lv1Var = (lv1) this.f28873u;
                if (lv1Var != null) {
                    VibrationEffect vibrationEffectCreateWaveform = VibrationEffect.createWaveform(new long[]{1000}, new int[]{255}, -1);
                    nc4 nc4Var = nv1.f26110a;
                    lv1Var.m8115a(new dv1(null, vibrationEffectCreateWaveform));
                }
                return ju4.f22634a;
            case 3:
                ap0 ap0Var4 = ap0.f14763a;
                k43.m7376J(obj);
                tb3 tb3Var = (tb3) this.f28873u;
                Context context = tb3Var.f31054b;
                j04 j04Var = tb3Var.f31055c;
                TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
                int iOrdinal = j04Var.ordinal();
                if (iOrdinal == 0) {
                    str = "edittext";
                } else {
                    if (iOrdinal != 1) {
                        C0670g.m5864c();
                        return null;
                    }
                    str = "textview";
                }
                TextClassifier textClassifierCreateTextClassificationSession = textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
                tb3Var.f31058f = textClassifierCreateTextClassificationSession;
                return textClassifierCreateTextClassificationSession;
            case 4:
                ap0 ap0Var5 = ap0.f14763a;
                k43.m7376J(obj);
                ((wp1) this.f28873u).invoke();
                return ju4.f22634a;
            default:
                ap0 ap0Var6 = ap0.f14763a;
                k43.m7376J(obj);
                long jNanoTime = System.nanoTime();
                vy4 vy4Var = (vy4) this.f28873u;
                if (jNanoTime == vy4Var.f32973c) {
                    i = vy4Var.f32974d + 1;
                } else {
                    vy4Var.f32973c = jNanoTime;
                }
                vy4Var.f32974d = i;
                C1122rv c1122rv = (C1122rv) vy4Var.f32972b.f27604c;
                C0942nd c0942nd = new C0942nd(b);
                c0942nd.f25690b = jNanoTime + ((long) i);
                VarHandle.storeStoreFence();
                c1122rv.m10453l(c0942nd);
                return ju4.f22634a;
        }
    }
}
