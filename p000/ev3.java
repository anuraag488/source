package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ev3 {

    /* JADX INFO: renamed from: a */
    public static final yg3 f18515a = m5407a(new z13(3), new t63(11));

    /* JADX INFO: renamed from: a */
    public static final yg3 m5407a(mq1 mq1Var, yp1 yp1Var) {
        yg3 yg3Var = new yg3((byte) 3);
        yg3Var.f35215b = mq1Var;
        yg3Var.f35216c = yp1Var;
        VarHandle.storeStoreFence();
        return yg3Var;
    }
}
