package p000;

import ads_mobile_sdk.b11;
import ads_mobile_sdk.cy3;
import ads_mobile_sdk.i11;
import ads_mobile_sdk.in3;
import ads_mobile_sdk.j31;
import ads_mobile_sdk.mx3;
import ads_mobile_sdk.s21;
import ads_mobile_sdk.sy3;
import ads_mobile_sdk.w01;
import ads_mobile_sdk.w11;
import ads_mobile_sdk.ym3;
import ads_mobile_sdk.z21;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface ra5 {
    /* JADX WARN: Code duplicated, block: B:32:0x0081 A[Catch: all -> 0x008d, TryCatch #3 {all -> 0x008d, blocks: (B:30:0x007a, B:32:0x0081, B:34:0x0085, B:36:0x0089, B:39:0x008f, B:41:0x0093, B:43:0x0097, B:45:0x009b, B:46:0x009c, B:47:0x00a1, B:48:0x00a2, B:49:0x00a9, B:50:0x00aa, B:51:0x00b1, B:52:0x00b2), top: B:63:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0093 A[Catch: all -> 0x008d, TryCatch #3 {all -> 0x008d, blocks: (B:30:0x007a, B:32:0x0081, B:34:0x0085, B:36:0x0089, B:39:0x008f, B:41:0x0093, B:43:0x0097, B:45:0x009b, B:46:0x009c, B:47:0x00a1, B:48:0x00a2, B:49:0x00a9, B:50:0x00aa, B:51:0x00b1, B:52:0x00b2), top: B:63:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0097 A[Catch: all -> 0x008d, TryCatch #3 {all -> 0x008d, blocks: (B:30:0x007a, B:32:0x0081, B:34:0x0085, B:36:0x0089, B:39:0x008f, B:41:0x0093, B:43:0x0097, B:45:0x009b, B:46:0x009c, B:47:0x00a1, B:48:0x00a2, B:49:0x00a9, B:50:0x00aa, B:51:0x00b1, B:52:0x00b2), top: B:63:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:45:0x009b A[Catch: all -> 0x008d, TryCatch #3 {all -> 0x008d, blocks: (B:30:0x007a, B:32:0x0081, B:34:0x0085, B:36:0x0089, B:39:0x008f, B:41:0x0093, B:43:0x0097, B:45:0x009b, B:46:0x009c, B:47:0x00a1, B:48:0x00a2, B:49:0x00a9, B:50:0x00aa, B:51:0x00b1, B:52:0x00b2), top: B:63:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: all -> 0x008d, TryCatch #3 {all -> 0x008d, blocks: (B:30:0x007a, B:32:0x0081, B:34:0x0085, B:36:0x0089, B:39:0x008f, B:41:0x0093, B:43:0x0097, B:45:0x009b, B:46:0x009c, B:47:0x00a1, B:48:0x00a2, B:49:0x00a9, B:50:0x00aa, B:51:0x00b1, B:52:0x00b2), top: B:63:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a2 A[Catch: all -> 0x008d, TryCatch #3 {all -> 0x008d, blocks: (B:30:0x007a, B:32:0x0081, B:34:0x0085, B:36:0x0089, B:39:0x008f, B:41:0x0093, B:43:0x0097, B:45:0x009b, B:46:0x009c, B:47:0x00a1, B:48:0x00a2, B:49:0x00a9, B:50:0x00aa, B:51:0x00b1, B:52:0x00b2), top: B:63:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa A[Catch: all -> 0x008d, TryCatch #3 {all -> 0x008d, blocks: (B:30:0x007a, B:32:0x0081, B:34:0x0085, B:36:0x0089, B:39:0x008f, B:41:0x0093, B:43:0x0097, B:45:0x009b, B:46:0x009c, B:47:0x00a1, B:48:0x00a2, B:49:0x00a9, B:50:0x00aa, B:51:0x00b1, B:52:0x00b2), top: B:63:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2 A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #3 {all -> 0x008d, blocks: (B:30:0x007a, B:32:0x0081, B:34:0x0085, B:36:0x0089, B:39:0x008f, B:41:0x0093, B:43:0x0097, B:45:0x009b, B:46:0x009c, B:47:0x00a1, B:48:0x00a2, B:49:0x00a9, B:50:0x00aa, B:51:0x00b1, B:52:0x00b2), top: B:63:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    static Object m10258c(ra5 ra5Var, ym0 ym0Var) {
        in3 in3Var;
        mx3 mx3Var;
        zm4 th;
        mx3 mx3Var2;
        if (ym0Var instanceof in3) {
            in3Var = (in3) ym0Var;
            int i = in3Var.f5144e;
            if ((i & Integer.MIN_VALUE) != 0) {
                in3Var.f5144e = i - Integer.MIN_VALUE;
            } else {
                in3Var = new in3(ra5Var, ym0Var);
            }
        } else {
            in3Var = new in3(ra5Var, ym0Var);
        }
        Object obj = in3Var.f5142c;
        Object obj2 = ap0.f14763a;
        int i2 = in3Var.f5144e;
        if (i2 == 0) {
            k43.m7376J(obj);
            WeakHashMap weakHashMap = cy3.f2323a;
            mx3 mx3VarM655a = cy3.m655a(s21.f11041O0, v71.f32439a, true);
            try {
                cy3.m653a().mo1538e().f5885t = new ym3(ra5Var.mo278d(), 6);
                in3Var.f5140a = mx3VarM655a;
                in3Var.f5141b = mx3VarM655a;
                in3Var.f5144e = 1;
                Object objMo279s = ra5Var.mo279s(in3Var);
                if (objMo279s == obj2) {
                    return obj2;
                }
                mx3Var = mx3VarM655a;
                obj = objMo279s;
                mx3Var2 = mx3Var;
            } catch (Throwable th2) {
                mx3Var = mx3VarM655a;
                th = th2;
                mx3Var2 = mx3Var;
                mx3Var.m1736b(th);
                if (!(th instanceof ka5)) {
                    throw th;
                }
                if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                    mx3Var.m1735a(th);
                }
                if (!(th instanceof zm4)) {
                    throw new j31(th);
                }
                if (!(th instanceof CancellationException)) {
                    throw new w01(th);
                }
                if (th instanceof w11) {
                    throw th;
                }
                throw new b11(th);
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mx3Var2 = in3Var.f5141b;
            mx3Var = in3Var.f5140a;
            try {
                k43.m7376J(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    mx3Var.m1736b(th);
                    if (!(th instanceof ka5)) {
                        throw th;
                    }
                    if (!(th instanceof zm4)) {
                        mx3Var.m1735a(th);
                    }
                    if (!(th instanceof zm4)) {
                        throw new j31(th);
                    }
                    if (!(th instanceof CancellationException)) {
                        throw new w01(th);
                    }
                    if (th instanceof w11) {
                        throw th;
                    }
                    throw new b11(th);
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        lb5.m7941v(mx3Var2, th4);
                        throw th5;
                    }
                }
            }
        }
        mi5 mi5Var = (mi5) obj;
        if (mi5Var instanceof i11) {
            sy3.m2306a((i11) mi5Var, false);
        }
        lb5.m7941v(mx3Var2, null);
        return mi5Var;
    }

    /* JADX INFO: renamed from: b */
    default Object mo524b(wm0 wm0Var) {
        return m10258c(this, (ym0) wm0Var);
    }

    /* JADX INFO: renamed from: d */
    z21 mo278d();

    /* JADX INFO: renamed from: s */
    Object mo279s(wm0 wm0Var);
}
