package p000;

import android.util.Log;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y24 extends of4 implements nq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f34822t;

    /* JADX INFO: renamed from: u */
    public boolean f34823u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ ti1 f34824v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Serializable f34825w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y24(int i, wm0 wm0Var, byte b) {
        super(i, wm0Var);
        this.f34822t = b;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Serializable, java.lang.Object[]] */
    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.f34822t;
        ju4 ju4Var = ju4.f22634a;
        int i = 3;
        ti1 ti1Var = (ti1) obj;
        switch (b) {
            case 0:
                y24 y24Var = new y24(i, (wm0) obj3, (byte) 0);
                y24Var.f34824v = ti1Var;
                y24Var.f34825w = (Throwable) obj2;
                return y24Var.invokeSuspend(ju4Var);
            default:
                y24 y24Var2 = new y24(i, (wm0) obj3, (byte) 1);
                y24Var2.f34824v = ti1Var;
                y24Var2.f34825w = (Object[]) obj2;
                return y24Var2.invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ql0 ql0Var;
        byte b = this.f34822t;
        ju4 ju4Var = ju4.f22634a;
        ql0 ql0Var2 = null;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f34823u;
                if (z) {
                    if (z) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                ti1 ti1Var = this.f34824v;
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f34825w);
                hw2 hw2Var = new hw2(true);
                this.f34824v = null;
                this.f34823u = true;
                return ti1Var.emit(hw2Var, this) == ap0Var ? ap0Var : ju4Var;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f34823u;
                if (z2) {
                    if (z2) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                ti1 ti1Var2 = this.f34824v;
                ql0[] ql0VarArr = (ql0[]) ((Object[]) this.f34825w);
                int length = ql0VarArr.length;
                int i = 0;
                while (true) {
                    ql0Var = ol0.f26840a;
                    if (i < length) {
                        ql0 ql0Var3 = ql0VarArr[i];
                        if (z62.m13387o(ql0Var3, ql0Var)) {
                            i++;
                        } else {
                            ql0Var2 = ql0Var3;
                        }
                    }
                }
                if (ql0Var2 != null) {
                    ql0Var = ql0Var2;
                }
                this.f34823u = true;
                return ti1Var2.emit(ql0Var, this) == ap0Var2 ? ap0Var2 : ju4Var;
        }
    }
}
