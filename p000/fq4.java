package p000;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fq4 implements ti1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ql3 f19226a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f19227b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ ti1 f19228c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ String[] f19229d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ int[] f19230e;

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r4.emit(r2, r5) == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
    
        if (r4.emit(r2, r5) == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        return r6;
     */
    @Override // p000.ti1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(int[] iArr, wm0 wm0Var) {
        eq4 eq4Var;
        fq4 fq4Var = this;
        int[] iArr2 = iArr;
        String[] strArr = fq4Var.f19229d;
        ti1 ti1Var = fq4Var.f19228c;
        if (wm0Var instanceof eq4) {
            eq4Var = (eq4) wm0Var;
            int i = eq4Var.f18379x;
            if ((i & Integer.MIN_VALUE) != 0) {
                eq4Var.f18379x = i - Integer.MIN_VALUE;
            } else {
                eq4Var = new eq4(fq4Var, wm0Var);
            }
        } else {
            eq4Var = new eq4(fq4Var, wm0Var);
        }
        Object obj = eq4Var.f18377v;
        ap0 ap0Var = ap0.f14763a;
        int i2 = eq4Var.f18379x;
        Object obj2 = null;
        if (i2 == 0) {
            k43.m7376J(obj);
            ql3 ql3Var = fq4Var.f19226a;
            if (ql3Var.f28555a != null) {
                int[] iArr3 = fq4Var.f19230e;
                ArrayList arrayList = new ArrayList();
                int length = strArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    String str = strArr[i3];
                    int i5 = i4 + 1;
                    Object obj3 = obj2;
                    Object obj4 = ql3Var.f28555a;
                    if (obj4 == null) {
                        C1077qn.m9989o("Required value was null.");
                        return obj3;
                    }
                    int i6 = iArr3[i4];
                    if (((int[]) obj4)[i6] != iArr2[i6]) {
                        arrayList.add(str);
                    }
                    i3++;
                    obj2 = obj3;
                    i4 = i5;
                }
                if (!arrayList.isEmpty()) {
                    Set setM6322h1 = hb0.m6322h1(arrayList);
                    eq4Var.f18375t = fq4Var;
                    eq4Var.f18376u = iArr2;
                    eq4Var.f18379x = 2;
                }
            } else if (fq4Var.f19227b) {
                Set setM9216k0 = AbstractC0990oo.m9216k0(strArr);
                eq4Var.f18375t = fq4Var;
                eq4Var.f18376u = iArr2;
                eq4Var.f18379x = 1;
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int[] iArr4 = eq4Var.f18376u;
            fq4 fq4Var2 = eq4Var.f18375t;
            k43.m7376J(obj);
            iArr2 = iArr4;
            fq4Var = fq4Var2;
        }
        fq4Var.f19226a.f28555a = iArr2;
        return ju4.f22634a;
    }
}
