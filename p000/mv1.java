package p000;

import android.os.Build;
import android.os.VibrationEffect;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mv1 implements fv1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25229a;

    /* JADX INFO: renamed from: b */
    public Object f25230b;

    public /* synthetic */ mv1(byte b) {
        this.f25229a = b;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    @Override // p000.fv1
    /* JADX INFO: renamed from: a */
    public final void mo5818a(int i) {
        dv1 dv1Var;
        int i2;
        int i3 = 16;
        switch (this.f25229a) {
            case 0:
                lv1 lv1Var = (lv1) this.f25230b;
                if (i == 16) {
                    dv1Var = new dv1(d55.m4371p(0.7f, 1, 0), nv1.m8856a());
                } else if (i == 6) {
                    dv1Var = new dv1(d55.m4371p(0.5f, 1, 0), nv1.m8856a());
                } else if (i == 13 || i == 23 || i == 3) {
                    dv1Var = new dv1(d55.m4371p(0.7f, 1, 0), nv1.m8856a());
                } else if (i == 0) {
                    dv1Var = new dv1(d55.m4371p(1.0f, 1, 0), VibrationEffect.createWaveform(new long[]{100}, new int[]{qq2.m10010E(127.5f)}, -1));
                } else if (i == 17) {
                    dv1Var = new dv1(d55.m4371p(0.7f, 1, 0), nv1.m8856a());
                } else if (i == 27) {
                    ArrayList arrayList = new ArrayList(5);
                    for (int i4 = 0; i4 < 5; i4++) {
                        arrayList.add(new ev1(0.3f, 8, 0));
                    }
                    dv1Var = new dv1(arrayList, VibrationEffect.createWaveform(new long[]{10, 20, 20, 10}, new int[]{10, 30, 50, 10}, -1));
                } else if (i == 26) {
                    dv1Var = new dv1(d55.m4371p(0.5f, 7, 0), nv1.m8857b());
                } else if (i == 9 || i == 22 || i == 21 || i == 1) {
                    dv1Var = new dv1(d55.m4371p(0.7f, 1, 0), nv1.m8856a());
                } else {
                    C1077qn.m9985k("Unexpected haptic feedback ".concat(gv1.m6173a(i)));
                }
                lv1Var.m8115a(dv1Var);
                break;
            default:
                if (i != 16) {
                    if (i == 6) {
                        i3 = 6;
                    } else if (i == 13) {
                        i3 = 13;
                    } else if (i == 23) {
                        i3 = 23;
                    } else if (i == 3) {
                        i3 = 3;
                    } else if (i == 0) {
                        i3 = 0;
                    } else if (i == 17) {
                        i3 = 17;
                    } else if (i == 27) {
                        i3 = 27;
                    } else if (i == 26) {
                        i3 = 26;
                    } else if (i == 9) {
                        i3 = 9;
                    } else if (i == 22) {
                        i3 = 22;
                    } else if (i == 21) {
                        i3 = 21;
                    } else {
                        i3 = i == 1 ? 1 : -1;
                    }
                }
                View view = (View) this.f25230b;
                int i5 = cy4.f16619a;
                if (i3 == -1) {
                    i2 = -1;
                } else if (Build.VERSION.SDK_INT < 34) {
                    switch (i3) {
                        case 21:
                        case 23:
                        case 26:
                            i2 = 6;
                            break;
                        case 22:
                        case 24:
                        case 27:
                            i2 = 4;
                            break;
                        case 25:
                            i2 = 0;
                            break;
                        default:
                            i2 = i3;
                            break;
                    }
                } else {
                    i2 = i3;
                }
                if (i2 != -1) {
                    view.performHapticFeedback(i2);
                    break;
                }
                break;
        }
    }
}
