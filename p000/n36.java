package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class n36 {

    /* JADX INFO: renamed from: a */
    public static final tt2 f25429a;

    static {
        tt2 tt2Var = new tt2((byte) 21, false);
        tt2Var.f31428b = new ReentrantReadWriteLock(false);
        tt2Var.f31429c = new HashMap();
        tt2Var.f31430d = new AtomicInteger();
        new ArrayList();
        VarHandle.storeStoreFence();
        f25429a = tt2Var;
    }
}
