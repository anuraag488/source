package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ot2 {

    /* JADX INFO: renamed from: a */
    public ViewTreeObserverOnGlobalLayoutListenerC1140sc f27084a;

    /* JADX INFO: renamed from: b */
    public cw2 f27085b;

    /* JADX INFO: renamed from: c */
    public cw2 f27086c;

    /* JADX INFO: renamed from: d */
    public cw2 f27087d;

    /* JADX INFO: renamed from: e */
    public cw2 f27088e;

    /* JADX INFO: renamed from: f */
    public boolean f27089f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [mt2] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [mt2] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [uw2] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [uw2] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: b */
    public static void m9265b(mt2 mt2Var, yh3 yh3Var) {
        if (!mt2Var.f25195a.f25208n) {
            q32.m9721c("visitSubtreeIf called on an unattached node");
        }
        uw2 uw2Var = new uw2(new mt2[16]);
        mt2 mt2Var2 = mt2Var.f25195a;
        mt2 mt2Var3 = mt2Var2.f25200f;
        if (mt2Var3 == null) {
            sc6.m10663e(uw2Var, mt2Var2);
        } else {
            uw2Var.m11663b(mt2Var3);
        }
        while (true) {
            int i = uw2Var.f32213c;
            if (i == 0) {
                return;
            }
            mt2 mt2Var4 = (mt2) uw2Var.m11672l(i - 1);
            if ((mt2Var4.f25198d & 32) != 0) {
                mt2 mt2Var5 = mt2Var4;
                while (true) {
                    if (mt2Var5 != null && mt2Var5.f25208n) {
                        if ((mt2Var5.f25197c & 32) != 0) {
                            ?? M10644P = mt2Var5;
                            ?? uw2Var2 = 0;
                            while (M10644P != 0) {
                                if (M10644P instanceof pt2) {
                                    if (((pt2) M10644P).mo9667l().mo6633o(yh3Var)) {
                                        break;
                                    }
                                } else if ((M10644P.f25197c & 32) != 0 && (M10644P instanceof qx0)) {
                                    mt2 mt2Var6 = ((qx0) M10644P).f28863p;
                                    int i2 = 0;
                                    M10644P = M10644P;
                                    uw2Var2 = uw2Var2;
                                    while (mt2Var6 != null) {
                                        if ((mt2Var6.f25197c & 32) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                uw2Var2 = uw2Var2;
                                                M10644P = mt2Var6;
                                            } else {
                                                if (uw2Var2 == 0) {
                                                    uw2Var2 = new uw2(new mt2[16]);
                                                }
                                                if (M10644P != 0) {
                                                    uw2Var2.m11663b(M10644P);
                                                    M10644P = 0;
                                                }
                                                uw2Var2.m11663b(mt2Var6);
                                            }
                                        }
                                        mt2Var6 = mt2Var6.f25200f;
                                        M10644P = M10644P;
                                        uw2Var2 = uw2Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M10644P = sc6.m10644P(uw2Var2);
                            }
                        }
                        mt2Var5 = mt2Var5.f25200f;
                    }
                }
            }
            sc6.m10663e(uw2Var, mt2Var4);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9266a() {
        if (this.f27089f) {
            return;
        }
        this.f27089f = true;
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = this.f27084a;
        g32 g32Var = new g32((byte) 9);
        g32Var.f19558b = this;
        VarHandle.storeStoreFence();
        cw2 cw2Var = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30136p0;
        if (cw2Var.m4204e(g32Var)) {
            return;
        }
        cw2Var.m4200a(g32Var);
    }
}
