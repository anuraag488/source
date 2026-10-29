package p000;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class nj0 {

    /* JADX INFO: renamed from: a */
    public static final C0641f8 f25879a = new C0641f8("CLOSED", (byte) 8);

    /* JADX INFO: renamed from: a */
    public static final Object m8780a(a04 a04Var, long j, mq1 mq1Var) {
        while (true) {
            a04 a04Var2 = a04Var;
            while (true) {
                if (a04Var2.f22d >= j && !a04Var2.mo3d()) {
                    return a04Var2;
                }
                Unsafe unsafe = AbstractC1078qo.f28633a;
                long j2 = oj0.f26776a;
                Object objectVolatile = unsafe.getObjectVolatile(a04Var2, j2);
                C0641f8 c0641f8 = f25879a;
                if (objectVolatile == c0641f8) {
                    return c0641f8;
                }
                a04Var = (a04) ((oj0) objectVolatile);
                if (a04Var != null) {
                    break;
                }
                a04 a04Var3 = (a04) mq1Var.invoke(Long.valueOf(a04Var2.f22d + 1), a04Var2);
                if (unsafe.compareAndSwapObject(a04Var2, j2, (Object) null, a04Var3)) {
                    if (a04Var2.mo3d()) {
                        a04Var2.m9130e();
                    }
                    a04Var2 = a04Var3;
                }
            }
        }
    }
}
