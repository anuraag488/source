package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ac4 extends AbstractC1056q2 implements si1, yq1, yb4, qw2 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ long f246f = AbstractC1078qo.f28633a.objectFieldOffset(ac4.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e */
    public int f247e;

    public ac4(Object obj) {
        this._state$volatile = obj;
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: a */
    public final si1 mo193a(ro0 ro0Var, int i, y30 y30Var) {
        return (((i < 0 || i >= 2) && i != -2) || y30Var != y30.f34833b) ? z44.m13333c(this, ro0Var, i, y30Var) : this;
    }

    @Override // p000.AbstractC1056q2
    /* JADX INFO: renamed from: c */
    public final AbstractC1093r2 mo194c() {
        cc4 cc4Var = new cc4();
        cc4Var.f15926a = new AtomicReference(null);
        VarHandle.storeStoreFence();
        return cc4Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:28:0x0070, B:30:0x007a, B:33:0x0081, B:34:0x0085, B:36:0x0088, B:46:0x00ac, B:49:0x00b9, B:51:0x00de, B:52:0x00e1, B:38:0x008e, B:42:0x0095, B:21:0x004b, B:24:0x0053, B:27:0x0061), top: B:59:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:28:0x0070, B:30:0x007a, B:33:0x0081, B:34:0x0085, B:36:0x0088, B:46:0x00ac, B:49:0x00b9, B:51:0x00de, B:52:0x00e1, B:38:0x008e, B:42:0x0095, B:21:0x004b, B:24:0x0053, B:27:0x0061), top: B:59:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:28:0x0070, B:30:0x007a, B:33:0x0081, B:34:0x0085, B:36:0x0088, B:46:0x00ac, B:49:0x00b9, B:51:0x00de, B:52:0x00e1, B:38:0x008e, B:42:0x0095, B:21:0x004b, B:24:0x0053, B:27:0x0061), top: B:59:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00de A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:28:0x0070, B:30:0x007a, B:33:0x0081, B:34:0x0085, B:36:0x0088, B:46:0x00ac, B:49:0x00b9, B:51:0x00de, B:52:0x00e1, B:38:0x008e, B:42:0x0095, B:21:0x004b, B:24:0x0053, B:27:0x0061), top: B:59:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00b8 -> B:28:0x0070). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.si1
    public final java.lang.Object collect(p000.ti1 r13, p000.wm0 r14) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ac4.collect(ti1, wm0):java.lang.Object");
    }

    @Override // p000.AbstractC1056q2
    /* JADX INFO: renamed from: d */
    public final AbstractC1093r2[] mo195d() {
        return new cc4[2];
    }

    @Override // p000.qw2
    /* JADX INFO: renamed from: e */
    public final void mo196e() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // p000.qw2, p000.ti1
    public final Object emit(Object obj, wm0 wm0Var) {
        m199j(obj);
        return ju4.f22634a;
    }

    @Override // p000.qw2
    /* JADX INFO: renamed from: f */
    public final boolean mo197f(Object obj) {
        m200k(null, obj);
        return true;
    }

    @Override // p000.yb4
    public final Object getValue() {
        Object objectVolatile = AbstractC1078qo.f28633a.getObjectVolatile(this, f246f);
        if (objectVolatile == e23.f17640a) {
            return null;
        }
        return objectVolatile;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m198i(Object obj, Object obj2) {
        C0641f8 c0641f8 = e23.f17640a;
        if (obj == null) {
            obj = c0641f8;
        }
        if (obj2 == null) {
            obj2 = c0641f8;
        }
        return m200k(obj, obj2);
    }

    /* JADX INFO: renamed from: j */
    public final void m199j(Object obj) {
        if (obj == null) {
            obj = e23.f17640a;
        }
        m200k(null, obj);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m200k(Object obj, Object obj2) {
        int i;
        AbstractC1093r2[] abstractC1093r2Arr;
        C0641f8 c0641f8;
        synchronized (this) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f246f;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !z62.m13387o(objectVolatile, obj)) {
                return false;
            }
            if (z62.m13387o(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j, obj2);
            int i2 = this.f247e;
            if ((i2 & 1) != 0) {
                this.f247e = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.f247e = i3;
            AbstractC1093r2[] abstractC1093r2Arr2 = this.f28150a;
            while (true) {
                cc4[] cc4VarArr = (cc4[]) abstractC1093r2Arr2;
                if (cc4VarArr != null) {
                    for (cc4 cc4Var : cc4VarArr) {
                        if (cc4Var != null) {
                            AtomicReference atomicReference = cc4Var.f15926a;
                            while (true) {
                                Object obj3 = atomicReference.get();
                                if (obj3 == null || obj3 == (c0641f8 = bc4.f15208b)) {
                                    break;
                                }
                                C0641f8 c0641f9 = bc4.f15207a;
                                if (obj3 != c0641f9) {
                                    if (atomicReference.compareAndSet(obj3, c0641f9)) {
                                        ((b70) obj3).resumeWith(ju4.f22634a);
                                        break;
                                    }
                                } else {
                                    if (atomicReference.compareAndSet(obj3, c0641f8)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f247e;
                    if (i == i3) {
                        this.f247e = i3 + 1;
                        return true;
                    }
                    abstractC1093r2Arr = this.f28150a;
                }
                abstractC1093r2Arr2 = abstractC1093r2Arr;
                i3 = i;
            }
        }
    }
}
