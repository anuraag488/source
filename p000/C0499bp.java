package p000;

import android.content.Context;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: renamed from: bp */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0499bp implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15476a;

    public /* synthetic */ C0499bp(byte b) {
        this.f15476a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f15476a;
        dd0 dd0Var = jq2.f22514a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return (AbstractC0696gp) obj;
            case 1:
                C1271vw c1271vw = (C1271vw) obj;
                c1271vw.getClass();
                z62.m13348G(c1271vw);
                return ju4Var;
            case 2:
                ((C1271vw) obj).m12000Q0();
                return ju4Var;
            case 3:
                return ju4Var;
            case 4:
                ((yf2) obj).m13113a();
                return ju4Var;
            case 5:
                return ju4Var;
            case 6:
                return ju4Var;
            case 7:
                if (((Context) ((aj0) obj).mo2998b(AndroidCompositionLocals_androidKt.f14651b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return m30.f24617b;
                }
                k30.f22840a.getClass();
                return j30.f21982c;
            case 8:
                o14.m8923d((q14) obj, 0);
                return ju4Var;
            case 9:
                return ju4Var;
            case 10:
                h83 h83Var = (h83) ((pp4) obj);
                h83Var.f20425p = false;
                y70.m13004E(h83Var);
                return Boolean.FALSE;
            case 11:
                return ((y41) obj).f34853h;
            case 12:
                return Double.valueOf(((y41) obj).f34848c ? 90.0d : 10.0d);
            case 13:
                return new bn0(4.5d, 7.0d, 11.0d, 21.0d);
            case 14:
                return ((y41) obj).f34852g;
            case 15:
                return Double.valueOf(((y41) obj).f34847b != pw4.f28051a ? 80.0d : 30.0d);
            case 16:
                return new bn0(1.0d, 1.0d, 3.0d, 4.5d);
            case 17:
                return ((y41) obj).f34851f;
            case 18:
                return Double.valueOf(((y41) obj).f34847b == pw4.f28051a ? 25.0d : 30.0d);
            case 19:
                return dd0Var.mo4474v();
            case 20:
                return dd0Var.mo4473u();
            case 21:
                return ((y41) obj).f34850e;
            case 22:
                return new bn0(3.0d, 4.5d, 7.0d, 11.0d);
            case 23:
                return ((y41) obj).f34850e;
            case 24:
                return Double.valueOf(((y41) obj).f34847b == pw4.f28051a ? 90.0d : 30.0d);
            case 25:
                return dd0Var.mo4470r();
            case 26:
                return dd0Var.mo4469q();
            case 27:
                return new bn0(3.0d, 4.5d, 7.0d, 11.0d);
            case 28:
                return ((y41) obj).f34852g;
            default:
                return Double.valueOf(((y41) obj).f34847b == pw4.f28051a ? 40.0d : 90.0d);
        }
    }
}
