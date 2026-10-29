package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class f40 implements b80 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f18724d = AtomicLongFieldUpdater.newUpdater(f40.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f18725e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f18726f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f18727g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18728h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18729i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ long f18730j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ long f18731k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ long f18732l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ long f18733m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ long f18734n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ long f18735o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ long f18736p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ long f18737q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ long f18738r;
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a */
    public final int f18739a;

    /* JADX INFO: renamed from: b */
    public final yp1 f18740b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c */
    public final C0928n f18741c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = AbstractC1078qo.f28633a;
        f18738r = unsafe.objectFieldOffset(f40.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        f18725e = AtomicLongFieldUpdater.newUpdater(f40.class, "receivers$volatile");
        f18736p = unsafe.objectFieldOffset(f40.class.getDeclaredField("receivers$volatile"));
        f18726f = AtomicLongFieldUpdater.newUpdater(f40.class, "bufferEnd$volatile");
        f18731k = unsafe.objectFieldOffset(f40.class.getDeclaredField("bufferEnd$volatile"));
        f18727g = AtomicLongFieldUpdater.newUpdater(f40.class, "completedExpandBuffersAndPauseFlag$volatile");
        f18734n = unsafe.objectFieldOffset(f40.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        f18728h = AtomicReferenceFieldUpdater.newUpdater(f40.class, Object.class, "sendSegment$volatile");
        f18737q = unsafe.objectFieldOffset(f40.class.getDeclaredField("sendSegment$volatile"));
        f18729i = AtomicReferenceFieldUpdater.newUpdater(f40.class, Object.class, "receiveSegment$volatile");
        f18735o = unsafe.objectFieldOffset(f40.class.getDeclaredField("receiveSegment$volatile"));
        f18732l = unsafe.objectFieldOffset(f40.class.getDeclaredField("bufferEndSegment$volatile"));
        f18730j = unsafe.objectFieldOffset(f40.class.getDeclaredField("_closeCause$volatile"));
        f18733m = unsafe.objectFieldOffset(f40.class.getDeclaredField("closeHandler$volatile"));
    }

    public f40(int i, yp1 yp1Var) {
        long j;
        this.f18739a = i;
        this.f18740b = yp1Var;
        C0928n c0928n = null;
        if (i < 0) {
            C1077qn.m9988n(c75.m3878j("Invalid channel capacity: ", i, ", should be >=0"));
            throw null;
        }
        p80 p80Var = h40.f20360a;
        if (i != 0) {
            j = i != Integer.MAX_VALUE ? i : Long.MAX_VALUE;
        } else {
            j = 0;
        }
        this.bufferEnd$volatile = j;
        this.completedExpandBuffersAndPauseFlag$volatile = m5492m();
        p80 p80Var2 = new p80(0L, null, this, 3);
        this.sendSegment$volatile = p80Var2;
        this.receiveSegment$volatile = p80Var2;
        this.bufferEndSegment$volatile = m5471B() ? h40.f20360a : p80Var2;
        if (yp1Var != null) {
            c0928n = new C0928n((byte) 1);
            c0928n.f25353b = this;
            VarHandle.storeStoreFence();
        }
        this.f18741c = c0928n;
        this._closeCause$volatile = h40.f20378s;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: F */
    public static Object m5468F(f40 f40Var, ym0 ym0Var) {
        d40 d40Var;
        p80 p80Var;
        if (ym0Var instanceof d40) {
            d40Var = (d40) ym0Var;
            int i = d40Var.f16772v;
            if ((i & Integer.MIN_VALUE) != 0) {
                d40Var.f16772v = i - Integer.MIN_VALUE;
            } else {
                d40Var = new d40(f40Var, ym0Var);
            }
        } else {
            d40Var = new d40(f40Var, ym0Var);
        }
        d40 d40Var2 = d40Var;
        Object obj = d40Var2.f16770t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = d40Var2.f16772v;
        if (i2 != 0) {
            if (i2 == 1) {
                k43.m7376J(obj);
                return ((o80) obj).f26421a;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k43.m7376J(obj);
        p80 p80Var2 = (p80) AbstractC1078qo.f28633a.getObjectVolatile(f40Var, f18735o);
        while (!f40Var.m5502y()) {
            long andIncrement = f18725e.getAndIncrement(f40Var);
            long j = h40.f20361b;
            long j2 = andIncrement / j;
            int i3 = (int) (andIncrement % j);
            if (p80Var2.f22d != j2) {
                p80 p80VarM5490k = f40Var.m5490k(j2, p80Var2);
                if (p80VarM5490k == null) {
                    continue;
                } else {
                    p80Var = p80VarM5490k;
                }
            } else {
                p80Var = p80Var2;
            }
            f40 f40Var2 = f40Var;
            Object objM5479K = f40Var2.m5479K(p80Var, i3, andIncrement, null);
            if (objM5479K == h40.f20372m) {
                C1077qn.m9989o("unexpected");
                return null;
            }
            if (objM5479K != h40.f20374o) {
                if (objM5479K != h40.f20373n) {
                    p80Var.m9128a();
                    return objM5479K;
                }
                d40Var2.f16772v = 1;
                Object objM5475G = f40Var2.m5475G(p80Var, i3, andIncrement, d40Var2);
                return objM5475G == ap0Var ? ap0Var : objM5475G;
            }
            if (andIncrement < f40Var2.m5499u()) {
                p80Var.m9128a();
            }
            f40Var = f40Var2;
            p80Var2 = p80Var;
        }
        Throwable thM5494p = f40Var.m5494p();
        m80 m80Var = new m80();
        m80Var.f24722a = thM5494p;
        VarHandle.storeStoreFence();
        return m80Var;
    }

    /* JADX INFO: renamed from: A */
    public boolean mo5470A() {
        return false;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m5471B() {
        long jM5492m = m5492m();
        return jM5492m == 0 || jM5492m == Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: C */
    public final void m5472C(long j, p80 p80Var) {
        p80 p80Var2;
        p80 p80Var3;
        while (p80Var.f22d < j && (p80Var3 = (p80) p80Var.m9129c()) != null) {
            p80Var = p80Var3;
        }
        while (true) {
            p80 p80Var4 = p80Var;
            while (p80Var4.mo3d() && (p80Var2 = (p80) p80Var4.m9129c()) != null) {
                p80Var4 = p80Var2;
            }
            while (true) {
                Unsafe unsafe = AbstractC1078qo.f28633a;
                long j2 = f18732l;
                a04 a04Var = (a04) unsafe.getObjectVolatile(this, j2);
                if (a04Var.f22d >= p80Var4.f22d) {
                    return;
                }
                if (!p80Var4.m8j()) {
                    break;
                }
                f40 f40Var = this;
                if (unsafe.compareAndSwapObject(f40Var, j2, a04Var, p80Var4)) {
                    if (a04Var.m4f()) {
                        a04Var.m9130e();
                        return;
                    }
                    return;
                } else {
                    if (p80Var4.m4f()) {
                        p80Var4.m9130e();
                    }
                    this = f40Var;
                }
            }
            p80Var = p80Var4;
        }
    }

    /* JADX INFO: renamed from: D */
    public final Object m5473D(wm0 wm0Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        gf0 gf0VarM12847S;
        b70 b70Var = new b70(1, C0006a5.m86x(wm0Var));
        b70Var.m3497u();
        yp1 yp1Var = this.f18740b;
        if (yp1Var == null || (gf0VarM12847S = y42.m12847S(yp1Var, obj, null)) == null) {
            b70Var.resumeWith(k43.m7389n(m5498t()));
        } else {
            se0.m10720f(gf0VarM12847S, m5498t());
            b70Var.resumeWith(k43.m7389n(gf0VarM12847S));
        }
        Object objM3495r = b70Var.m3495r();
        return objM3495r == ap0.f14763a ? objM3495r : ju4.f22634a;
    }

    /* JADX INFO: renamed from: E */
    public final void m5474E(Object obj, b70 b70Var) throws IllegalAccessException, InvocationTargetException {
        yp1 yp1Var = this.f18740b;
        if (yp1Var != null) {
            y42.m12846R(yp1Var, obj, b70Var.f15139e);
        }
        b70Var.resumeWith(k43.m7389n(m5498t()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: G */
    public final Object m5475G(p80 p80Var, int i, long j, ym0 ym0Var) {
        e40 e40Var;
        o80 o80VarM8978a;
        a40 a40Var;
        if (ym0Var instanceof e40) {
            e40Var = (e40) ym0Var;
            int i2 = e40Var.f17681v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e40Var.f17681v = i2 - Integer.MIN_VALUE;
            } else {
                e40Var = new e40(this, ym0Var);
            }
        } else {
            e40Var = new e40(this, ym0Var);
        }
        Object objM3495r = e40Var.f17679t;
        ap0 ap0Var = ap0.f14763a;
        int i3 = e40Var.f17681v;
        a40 a40Var2 = null;
        if (i3 == 0) {
            k43.m7376J(objM3495r);
            e40Var.f17681v = 1;
            b70 b70VarM3824u = c20.m3824u(C0006a5.m86x(e40Var));
            try {
                xk3 xk3Var = new xk3();
                xk3Var.f34340a = b70VarM3824u;
                VarHandle.storeStoreFence();
                Object objM5479K = m5479K(p80Var, i, j, xk3Var);
                if (objM5479K == h40.f20372m) {
                    xk3Var.mo3483a(p80Var, i);
                } else {
                    Object obj = h40.f20374o;
                    yp1 yp1Var = this.f18740b;
                    if (objM5479K == obj) {
                        if (j < m5499u()) {
                            p80Var.m9128a();
                        }
                        p80 p80Var2 = (p80) AbstractC1078qo.f28633a.getObjectVolatile(this, f18735o);
                        while (true) {
                            if (m5502y()) {
                                Throwable thM5494p = m5494p();
                                m80 m80Var = new m80();
                                m80Var.f24722a = thM5494p;
                                VarHandle.storeStoreFence();
                                b70VarM3824u.resumeWith(o80.m8978a(m80Var));
                            } else {
                                long andIncrement = f18725e.getAndIncrement(this);
                                long j2 = h40.f20361b;
                                long j3 = andIncrement / j2;
                                int i4 = (int) (andIncrement % j2);
                                if (p80Var2.f22d != j3) {
                                    p80 p80VarM5490k = m5490k(j3, p80Var2);
                                    if (p80VarM5490k != null) {
                                        p80Var2 = p80VarM5490k;
                                    }
                                }
                                Object objM5479K2 = m5479K(p80Var2, i4, andIncrement, xk3Var);
                                if (objM5479K2 == h40.f20372m) {
                                    xk3Var.mo3483a(p80Var2, i4);
                                } else if (objM5479K2 == h40.f20374o) {
                                    if (andIncrement < m5499u()) {
                                        p80Var2.m9128a();
                                    }
                                } else {
                                    if (objM5479K2 == h40.f20373n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    p80Var2.m9128a();
                                    o80VarM8978a = o80.m8978a(objM5479K2);
                                    if (yp1Var != null) {
                                        a40Var = new a40(3, this, f40.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 1);
                                        a40Var2 = a40Var;
                                    }
                                    b70VarM3824u.mo113h(o80VarM8978a, a40Var2);
                                }
                            }
                        }
                    } else {
                        p80Var.m9128a();
                        o80VarM8978a = o80.m8978a(objM5479K);
                        if (yp1Var != null) {
                            a40Var = new a40(3, this, f40.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 1);
                            a40Var2 = a40Var;
                        }
                        b70VarM3824u.mo113h(o80VarM8978a, a40Var2);
                    }
                }
                objM3495r = b70VarM3824u.m3495r();
                ap0 ap0Var2 = ap0.f14763a;
                if (objM3495r == ap0Var) {
                    return ap0Var;
                }
            } catch (Throwable th) {
                b70VarM3824u.m3479B();
                throw th;
            }
        } else {
            if (i3 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(objM3495r);
        }
        return ((o80) objM3495r).f26421a;
    }

    /* JADX INFO: renamed from: H */
    public final void m5476H(yy4 yy4Var, boolean z) {
        if (yy4Var instanceof a70) {
            ((wm0) yy4Var).resumeWith(k43.m7389n(z ? m5496r() : m5498t()));
            return;
        }
        if (yy4Var instanceof xk3) {
            b70 b70Var = ((xk3) yy4Var).f34340a;
            Throwable thM5494p = m5494p();
            m80 m80Var = new m80();
            m80Var.f24722a = thM5494p;
            VarHandle.storeStoreFence();
            b70Var.resumeWith(o80.m8978a(m80Var));
            return;
        }
        if (!(yy4Var instanceof z30)) {
            if (yy4Var instanceof g04) {
                ((g04) yy4Var).m5880i(this, h40.f20371l);
                return;
            } else {
                nm0.m8798k(yy4Var, "Unexpected waiter: ");
                return;
            }
        }
        z30 z30Var = (z30) yy4Var;
        b70 b70Var2 = z30Var.f35733b;
        z30Var.f35733b = null;
        z30Var.f35732a = h40.f20371l;
        Throwable thM5494p2 = z30Var.f35734c.m5494p();
        if (thM5494p2 == null) {
            b70Var2.resumeWith(Boolean.FALSE);
        } else {
            b70Var2.resumeWith(k43.m7389n(thM5494p2));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: I */
    public final boolean m5477I(Object obj, Object obj2) {
        byte b = 1;
        if (obj instanceof g04) {
            return ((g04) obj).m5880i(this, obj2) == 0;
        }
        boolean z = obj instanceof xk3;
        yp1 yp1Var = this.f18740b;
        a40 a40Var = null;
        a40 a40Var2 = null;
        up4 up4Var = null;
        if (z) {
            b70 b70Var = ((xk3) obj).f34340a;
            o80 o80VarM8978a = o80.m8978a(obj2);
            if (yp1Var != null) {
                a40Var2 = new a40(3, this, f40.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 1);
            }
            p80 p80Var = h40.f20360a;
            C0641f8 c0641f8Mo114j = b70Var.mo114j(o80VarM8978a, a40Var2);
            if (c0641f8Mo114j == null) {
                return false;
            }
            b70Var.mo116s(c0641f8Mo114j);
            return true;
        }
        if (!(obj instanceof z30)) {
            if (!(obj instanceof a70)) {
                nm0.m8798k(obj, "Unexpected receiver type: ");
                return false;
            }
            a70 a70Var = (a70) obj;
            if (yp1Var != null) {
                a40Var = new a40(3, this, f40.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 0);
            }
            p80 p80Var2 = h40.f20360a;
            C0641f8 c0641f8Mo114j2 = a70Var.mo114j(obj2, a40Var);
            if (c0641f8Mo114j2 == null) {
                return false;
            }
            a70Var.mo116s(c0641f8Mo114j2);
            return true;
        }
        z30 z30Var = (z30) obj;
        b70 b70Var2 = z30Var.f35733b;
        z30Var.f35733b = null;
        z30Var.f35732a = obj2;
        Object obj3 = Boolean.TRUE;
        yp1 yp1Var2 = z30Var.f35734c.f18740b;
        if (yp1Var2 != null) {
            up4Var = new up4(b);
            up4Var.f32065b = yp1Var2;
            up4Var.f32066c = obj2;
            VarHandle.storeStoreFence();
        }
        p80 p80Var3 = h40.f20360a;
        C0641f8 c0641f8Mo114j3 = b70Var2.mo114j(obj3, up4Var);
        if (c0641f8Mo114j3 == null) {
            return false;
        }
        b70Var2.mo116s(c0641f8Mo114j3);
        return true;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m5478J(Object obj, p80 p80Var, int i) {
        qq4 qq4Var;
        boolean z = obj instanceof a70;
        ju4 ju4Var = ju4.f22634a;
        if (z) {
            a70 a70Var = (a70) obj;
            p80 p80Var2 = h40.f20360a;
            C0641f8 c0641f8Mo114j = a70Var.mo114j(ju4Var, null);
            if (c0641f8Mo114j == null) {
                return false;
            }
            a70Var.mo116s(c0641f8Mo114j);
            return true;
        }
        if (!(obj instanceof g04)) {
            nm0.m8798k(obj, "Unexpected waiter: ");
            return false;
        }
        int iM5880i = ((g04) obj).m5880i(this, ju4Var);
        if (iM5880i == 0) {
            qq4Var = qq4.f28694a;
        } else if (iM5880i == 1) {
            qq4Var = qq4.f28695b;
        } else if (iM5880i == 2) {
            qq4Var = qq4.f28696c;
        } else {
            if (iM5880i != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iM5880i).toString());
            }
            qq4Var = qq4.f28697d;
        }
        if (qq4Var == qq4.f28695b) {
            p80Var.m9381n(i, null);
        }
        return qq4Var == qq4.f28694a;
    }

    /* JADX INFO: renamed from: K */
    public final Object m5479K(p80 p80Var, int i, long j, Object obj) {
        Object objM9379l = p80Var.m9379l(i);
        AtomicReferenceArray atomicReferenceArray = p80Var.f27418h;
        long j2 = f18738r;
        if (objM9379l == null) {
            if (j >= (AbstractC1078qo.f28633a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (obj == null) {
                    return h40.f20373n;
                }
                if (p80Var.m9378k(i, objM9379l, obj)) {
                    m5489j();
                    return h40.f20372m;
                }
            }
        } else if (objM9379l == h40.f20363d && p80Var.m9378k(i, objM9379l, h40.f20368i)) {
            m5489j();
            Object obj2 = atomicReferenceArray.get(i * 2);
            p80Var.m9381n(i, null);
            return obj2;
        }
        while (true) {
            Object objM9379l2 = p80Var.m9379l(i);
            if (objM9379l2 == null || objM9379l2 == h40.f20364e) {
                if (j < (AbstractC1078qo.f28633a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                    if (p80Var.m9378k(i, objM9379l2, h40.f20367h)) {
                        m5489j();
                        return h40.f20374o;
                    }
                } else {
                    if (obj == null) {
                        return h40.f20373n;
                    }
                    if (p80Var.m9378k(i, objM9379l2, obj)) {
                        m5489j();
                        return h40.f20372m;
                    }
                }
            } else if (objM9379l2 != h40.f20363d) {
                C0641f8 c0641f8 = h40.f20369j;
                if (objM9379l2 == c0641f8) {
                    return h40.f20374o;
                }
                if (objM9379l2 == h40.f20367h) {
                    return h40.f20374o;
                }
                if (objM9379l2 == h40.f20371l) {
                    m5489j();
                    return h40.f20374o;
                }
                if (objM9379l2 != h40.f20366g && p80Var.m9378k(i, objM9379l2, h40.f20365f)) {
                    boolean z = objM9379l2 instanceof zy4;
                    if (z) {
                        objM9379l2 = ((zy4) objM9379l2).f36471a;
                    }
                    if (m5478J(objM9379l2, p80Var, i)) {
                        p80Var.m9382o(i, h40.f20368i);
                        m5489j();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        p80Var.m9381n(i, null);
                        return obj3;
                    }
                    p80Var.m9382o(i, c0641f8);
                    p80Var.m7i();
                    if (z) {
                        m5489j();
                    }
                    return h40.f20374o;
                }
            } else if (p80Var.m9378k(i, objM9379l2, h40.f20368i)) {
                m5489j();
                Object obj4 = atomicReferenceArray.get(i * 2);
                p80Var.m9381n(i, null);
                return obj4;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final int m5480L(p80 p80Var, int i, Object obj, long j, Object obj2, boolean z) {
        p80Var.m9381n(i, obj);
        if (z) {
            return m5481M(p80Var, i, obj, j, obj2, z);
        }
        Object objM9379l = p80Var.m9379l(i);
        if (objM9379l == null) {
            if (m5483b(j)) {
                if (p80Var.m9378k(i, null, h40.f20363d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (p80Var.m9378k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objM9379l instanceof yy4) {
            p80Var.m9381n(i, null);
            if (m5477I(objM9379l, obj)) {
                p80Var.m9382o(i, h40.f20368i);
                return 0;
            }
            C0641f8 c0641f8 = h40.f20370k;
            if (p80Var.f27418h.getAndSet((i * 2) + 1, c0641f8) == c0641f8) {
                return 5;
            }
            p80Var.m9380m(i, true);
            return 5;
        }
        return m5481M(p80Var, i, obj, j, obj2, z);
    }

    /* JADX INFO: renamed from: M */
    public final int m5481M(p80 p80Var, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objM9379l = p80Var.m9379l(i);
            if (objM9379l == null) {
                if (!m5483b(j) || z) {
                    if (z) {
                        if (p80Var.m9378k(i, null, h40.f20369j)) {
                            p80Var.m7i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (p80Var.m9378k(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (p80Var.m9378k(i, null, h40.f20363d)) {
                    break;
                }
            } else {
                if (objM9379l != h40.f20364e) {
                    C0641f8 c0641f8 = h40.f20370k;
                    if (objM9379l == c0641f8) {
                        p80Var.m9381n(i, null);
                        return 5;
                    }
                    if (objM9379l == h40.f20367h) {
                        p80Var.m9381n(i, null);
                        return 5;
                    }
                    if (objM9379l == h40.f20371l) {
                        p80Var.m9381n(i, null);
                        m5503z();
                        return 4;
                    }
                    p80Var.m9381n(i, null);
                    if (objM9379l instanceof zy4) {
                        objM9379l = ((zy4) objM9379l).f36471a;
                    }
                    if (m5477I(objM9379l, obj)) {
                        p80Var.m9382o(i, h40.f20368i);
                        return 0;
                    }
                    if (p80Var.f27418h.getAndSet((i * 2) + 1, c0641f8) != c0641f8) {
                        p80Var.m9380m(i, true);
                    }
                    return 5;
                }
                if (p80Var.m9378k(i, objM9379l, h40.f20363d)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: N */
    public final void m5482N(long j) {
        f40 f40Var = this;
        if (f40Var.m5471B()) {
            return;
        }
        while (f40Var.m5492m() <= j) {
            f40Var = this;
        }
        int i = h40.f20362c;
        int i2 = 0;
        while (true) {
            long j2 = f18734n;
            if (i2 < i) {
                long jM5492m = f40Var.m5492m();
                if (jM5492m == (AbstractC1078qo.f28633a.getLongVolatile(f40Var, j2) & 4611686018427387903L) && jM5492m == f40Var.m5492m()) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    Unsafe unsafe = AbstractC1078qo.f28633a;
                    long longVolatile = unsafe.getLongVolatile(f40Var, j2);
                    if (unsafe.compareAndSwapLong(f40Var, f18734n, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                        break;
                    } else {
                        f40Var = this;
                    }
                }
                while (true) {
                    long jM5492m2 = f40Var.m5492m();
                    Unsafe unsafe2 = AbstractC1078qo.f28633a;
                    long longVolatile2 = unsafe2.getLongVolatile(f40Var, j2);
                    long j3 = longVolatile2 & 4611686018427387903L;
                    boolean z = (longVolatile2 & 4611686018427387904L) != 0;
                    if (jM5492m2 == j3 && jM5492m2 == f40Var.m5492m()) {
                        break;
                    }
                    if (z) {
                        f40Var = this;
                    } else {
                        f40Var = this;
                        unsafe2.compareAndSwapLong(f40Var, f18734n, longVolatile2, j3 + 4611686018427387904L);
                    }
                }
                while (true) {
                    Unsafe unsafe3 = AbstractC1078qo.f28633a;
                    long longVolatile3 = unsafe3.getLongVolatile(f40Var, j2);
                    if (unsafe3.compareAndSwapLong(f40Var, f18734n, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                        return;
                    } else {
                        f40Var = this;
                    }
                }
            }
        }
    }

    @Override // p000.b80
    /* JADX INFO: renamed from: a */
    public final void mo3508a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m5486f(cancellationException, true);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5483b(long j) {
        return j < m5492m() || j < m5497s() + ((long) this.f18739a);
    }

    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x015b  */
    /* JADX WARN: Code duplicated, block: B:91:0x015e A[RETURN] */
    @Override // p000.y14
    /* JADX INFO: renamed from: c */
    public Object mo5484c(wm0 wm0Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        ju4 ju4Var;
        Object objM3495r;
        ap0 ap0Var;
        int i;
        f40 f40Var = this;
        Unsafe unsafe = AbstractC1078qo.f28633a;
        long j = f18737q;
        p80 p80Var = (p80) unsafe.getObjectVolatile(f40Var, j);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f18724d;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(f40Var);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zM5501x = f40Var.m5501x(andIncrement, false);
            int i2 = h40.f20361b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = p80Var.f22d;
            ju4Var = ju4.f22634a;
            if (j5 != j4) {
                p80 p80VarM5491l = f40Var.m5491l(j4, p80Var);
                if (p80VarM5491l != null) {
                    p80Var = p80VarM5491l;
                } else if (zM5501x) {
                    Object objM5473D = m5473D(wm0Var, obj);
                    if (objM5473D != ap0.f14763a) {
                        break;
                    }
                    return objM5473D;
                }
            }
            int iM5480L = f40Var.m5480L(p80Var, i3, obj, j2, null, zM5501x);
            if (iM5480L == 0) {
                p80Var.m9128a();
                return ju4Var;
            }
            if (iM5480L == 1) {
                break;
            }
            if (iM5480L == 2) {
                if (!zM5501x) {
                    return ju4Var;
                }
                p80Var.m7i();
                Object objM5473D2 = m5473D(wm0Var, obj);
                return objM5473D2 == ap0.f14763a ? objM5473D2 : ju4Var;
            }
            if (iM5480L == 3) {
                b70 b70VarM3824u = c20.m3824u(C0006a5.m86x(wm0Var));
                try {
                    int iM5480L2 = m5480L(p80Var, i3, obj, j2, b70VarM3824u, false);
                    if (iM5480L2 != 0) {
                        if (iM5480L2 == 1) {
                            ju4Var = ju4Var;
                            b70VarM3824u.resumeWith(ju4Var);
                        } else if (iM5480L2 != 2) {
                            if (iM5480L2 != 4) {
                                String str = "unexpected";
                                if (iM5480L2 != 5) {
                                    throw new IllegalStateException("unexpected");
                                }
                                p80Var.m9128a();
                                p80 p80Var2 = (p80) AbstractC1078qo.f28633a.getObjectVolatile(this, j);
                                while (true) {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j6 = andIncrement2 & 1152921504606846975L;
                                    boolean zM5501x2 = m5501x(andIncrement2, false);
                                    int i4 = h40.f20361b;
                                    atomicLongFieldUpdater = atomicLongFieldUpdater;
                                    long j7 = i4;
                                    long j8 = j6 / j7;
                                    int i5 = (int) (j6 % j7);
                                    ju4Var = ju4Var;
                                    if (p80Var2.f22d != j8) {
                                        p80 p80VarM5491l2 = m5491l(j8, p80Var2);
                                        if (p80VarM5491l2 != null) {
                                            i = i5;
                                            p80Var2 = p80VarM5491l2;
                                        } else if (zM5501x2) {
                                        }
                                    } else {
                                        i = i5;
                                    }
                                    int iM5480L3 = m5480L(p80Var2, i, obj, j6, b70VarM3824u, zM5501x2);
                                    if (iM5480L3 == 0) {
                                        p80Var2.m9128a();
                                    } else if (iM5480L3 != 1) {
                                        if (iM5480L3 == 2) {
                                            if (!zM5501x2) {
                                                b70VarM3824u.mo3483a(p80Var2, i + i4);
                                                break;
                                            }
                                            p80Var2.m7i();
                                        } else {
                                            if (iM5480L3 == 3) {
                                                throw new IllegalStateException(str);
                                            }
                                            if (iM5480L3 != 4) {
                                                if (iM5480L3 == 5) {
                                                    p80Var2.m9128a();
                                                }
                                                str = str;
                                            } else if (j6 < m5497s()) {
                                                p80Var2.m9128a();
                                            }
                                        }
                                    }
                                }
                            } else {
                                ju4Var = ju4Var;
                                if (j2 < m5497s()) {
                                    p80Var.m9128a();
                                }
                            }
                            m5474E(obj, b70VarM3824u);
                            break;
                        } else {
                            ju4Var = ju4Var;
                            b70VarM3824u.mo3483a(p80Var, i3 + i2);
                        }
                        objM3495r = b70VarM3824u.m3495r();
                        ap0Var = ap0.f14763a;
                        if (objM3495r != ap0Var) {
                            objM3495r = ju4Var;
                        }
                        if (objM3495r == ap0Var) {
                            return objM3495r;
                        }
                        return ju4Var;
                    }
                    ju4Var = ju4Var;
                    p80Var.m9128a();
                    b70VarM3824u.resumeWith(ju4Var);
                    objM3495r = b70VarM3824u.m3495r();
                    ap0Var = ap0.f14763a;
                    if (objM3495r != ap0Var) {
                        objM3495r = ju4Var;
                    }
                    if (objM3495r == ap0Var) {
                        return objM3495r;
                    }
                    return ju4Var;
                } catch (Throwable th) {
                    b70VarM3824u.m3479B();
                    throw th;
                }
            }
            if (iM5480L == 4) {
                if (j2 < m5497s()) {
                    p80Var.m9128a();
                }
                Object objM5473D3 = m5473D(wm0Var, obj);
                if (objM5473D3 != ap0.f14763a) {
                    break;
                }
                return objM5473D3;
            }
            if (iM5480L == 5) {
                p80Var.m9128a();
            }
            f40Var = this;
        }
        return ju4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [long] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [b70] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // p000.b80
    /* JADX INFO: renamed from: d */
    public final Object mo3509d(wm0 wm0Var) {
        p80 p80Var;
        Throwable th;
        ?? r1;
        b70 b70Var;
        a40 a40Var;
        p80 p80Var2;
        Unsafe unsafe = AbstractC1078qo.f28633a;
        ?? r2 = f18735o;
        p80 p80Var3 = (p80) unsafe.getObjectVolatile(this, (long) r2);
        while (!this.m5502y()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f18725e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = h40.f20361b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (p80Var3.f22d != j2) {
                p80 p80VarM5490k = this.m5490k(j2, p80Var3);
                if (p80VarM5490k == null) {
                    continue;
                } else {
                    p80Var = p80VarM5490k;
                }
            } else {
                p80Var = p80Var3;
            }
            f40 f40Var = this;
            Object objM5479K = f40Var.m5479K(p80Var, i, andIncrement, null);
            C0641f8 c0641f8 = h40.f20372m;
            a40 a40Var2 = null;
            if (objM5479K == c0641f8) {
                C1077qn.m9989o("unexpected");
                return null;
            }
            C0641f8 c0641f9 = h40.f20374o;
            if (objM5479K == c0641f9) {
                if (andIncrement < f40Var.m5499u()) {
                    p80Var.m9128a();
                }
                this = f40Var;
                p80Var3 = p80Var;
            } else {
                if (objM5479K != h40.f20373n) {
                    p80Var.m9128a();
                    return objM5479K;
                }
                b70 b70VarM3824u = c20.m3824u(C0006a5.m86x(wm0Var));
                try {
                    Object objM5479K2 = f40Var.m5479K(p80Var, i, andIncrement, b70VarM3824u);
                    try {
                        if (objM5479K2 == c0641f8) {
                            b70VarM3824u.mo3483a(p80Var, i);
                        } else {
                            yp1 yp1Var = f40Var.f18740b;
                            try {
                                if (objM5479K2 == c0641f9) {
                                    if (andIncrement < f40Var.m5499u()) {
                                        p80Var.m9128a();
                                    }
                                    p80 p80Var4 = (p80) AbstractC1078qo.f28633a.getObjectVolatile(f40Var, (long) r2);
                                    while (true) {
                                        if (f40Var.m5502y()) {
                                            b70VarM3824u.resumeWith(k43.m7389n(f40Var.m5496r()));
                                        } else {
                                            b70 b70Var2 = b70VarM3824u;
                                            try {
                                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(f40Var);
                                                long j3 = h40.f20361b;
                                                long j4 = andIncrement2 / j3;
                                                int i2 = (int) (andIncrement2 % j3);
                                                if (p80Var4.f22d != j4) {
                                                    try {
                                                        p80 p80VarM5490k2 = f40Var.m5490k(j4, p80Var4);
                                                        if (p80VarM5490k2 == null) {
                                                            b70VarM3824u = b70Var2;
                                                        } else {
                                                            p80Var2 = p80VarM5490k2;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        r1 = b70Var2;
                                                        r1.m3479B();
                                                        throw th;
                                                    }
                                                } else {
                                                    p80Var2 = p80Var4;
                                                }
                                                f40 f40Var2 = f40Var;
                                                objM5479K2 = f40Var2.m5479K(p80Var2, i2, andIncrement2, b70Var2);
                                                f40Var = f40Var2;
                                                p80 p80Var5 = p80Var2;
                                                b70Var = b70Var2;
                                                if (objM5479K2 == h40.f20372m) {
                                                    b70Var.mo3483a(p80Var5, i2);
                                                } else if (objM5479K2 == h40.f20374o) {
                                                    if (andIncrement2 < f40Var.m5499u()) {
                                                        p80Var5.m9128a();
                                                    }
                                                    p80Var4 = p80Var5;
                                                    b70VarM3824u = b70Var;
                                                } else {
                                                    if (objM5479K2 == h40.f20373n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    p80Var5.m9128a();
                                                    if (yp1Var != null) {
                                                        a40Var = new a40(3, f40Var, f40.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 0);
                                                        a40Var2 = a40Var;
                                                    }
                                                    b70Var.mo113h(objM5479K2, a40Var2);
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r2 = b70Var2;
                                                th = th;
                                                r1 = r2;
                                                r1.m3479B();
                                                throw th;
                                            }
                                        }
                                    }
                                } else {
                                    b70Var = b70VarM3824u;
                                    p80Var.m9128a();
                                    if (yp1Var != null) {
                                        a40Var = new a40(3, f40Var, f40.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 0);
                                        a40Var2 = a40Var;
                                    }
                                    b70Var.mo113h(objM5479K2, a40Var2);
                                }
                                Object objM3495r = b70Var.m3495r();
                                ap0 ap0Var = ap0.f14763a;
                                return objM3495r;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                        b70Var = b70VarM3824u;
                        Object objM3495r2 = b70Var.m3495r();
                        ap0 ap0Var2 = ap0.f14763a;
                        return objM3495r2;
                    } catch (Throwable th5) {
                        th = th5;
                        r1 = b70VarM3824u;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    r2 = b70VarM3824u;
                }
            }
        }
        Throwable thM5496r = this.m5496r();
        int i3 = lb4.f23914a;
        throw thM5496r;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5485e(Throwable th) {
        return m5486f(th, false);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5486f(Throwable th, boolean z) {
        long j;
        Object objectVolatile;
        Unsafe unsafe;
        long j2;
        long longVolatile;
        Unsafe unsafe2;
        long j3;
        long longVolatile2;
        if (z) {
            do {
                unsafe2 = AbstractC1078qo.f28633a;
                j3 = f18738r;
                longVolatile2 = unsafe2.getLongVolatile(this, j3);
                if (((int) (longVolatile2 >> 60)) != 0) {
                    break;
                }
                p80 p80Var = h40.f20360a;
            } while (!unsafe2.compareAndSwapLong(this, j3, longVolatile2, (longVolatile2 & 1152921504606846975L) + 1152921504606846976L));
        }
        f40 f40Var = this;
        boolean zCompareAndSwapObject = AbstractC1078qo.f28633a.compareAndSwapObject(f40Var, f18730j, h40.f20378s, th);
        if (z) {
            do {
                unsafe = AbstractC1078qo.f28633a;
                j2 = f18738r;
                longVolatile = unsafe.getLongVolatile(f40Var, j2);
            } while (!unsafe.compareAndSwapLong(f40Var, j2, longVolatile, (longVolatile & 1152921504606846975L) + 3458764513820540928L));
        } else {
            while (true) {
                Unsafe unsafe3 = AbstractC1078qo.f28633a;
                long j4 = f18738r;
                long longVolatile3 = unsafe3.getLongVolatile(f40Var, j4);
                int i = (int) (longVolatile3 >> 60);
                if (i == 0) {
                    j = (longVolatile3 & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j = (longVolatile3 & 1152921504606846975L) + 3458764513820540928L;
                }
                if (unsafe3.compareAndSwapLong(f40Var, j4, longVolatile3, j)) {
                    break;
                }
                f40Var = this;
            }
        }
        f40Var.m5503z();
        if (zCompareAndSwapObject) {
            while (true) {
                Unsafe unsafe4 = AbstractC1078qo.f28633a;
                long j5 = f18733m;
                objectVolatile = unsafe4.getObjectVolatile(f40Var, j5);
                if (unsafe4.compareAndSwapObject(f40Var, j5, objectVolatile, objectVolatile == null ? h40.f20376q : h40.f20377r)) {
                    break;
                }
                f40Var = this;
            }
            if (objectVolatile != null) {
                as4.m3259r(1, objectVolatile);
                ((yp1) objectVolatile).invoke(m5494p());
                return zCompareAndSwapObject;
            }
        }
        return zCompareAndSwapObject;
    }

    /* JADX INFO: renamed from: g */
    public final p80 m5487g(long j) {
        oj0 oj0Var;
        long j2;
        Unsafe unsafe = AbstractC1078qo.f28633a;
        Object objectVolatile = unsafe.getObjectVolatile(this, f18732l);
        p80 p80Var = (p80) unsafe.getObjectVolatile(this, f18737q);
        if (p80Var.f22d > ((p80) objectVolatile).f22d) {
            objectVolatile = p80Var;
        }
        p80 p80Var2 = (p80) unsafe.getObjectVolatile(this, f18735o);
        if (p80Var2.f22d > ((p80) objectVolatile).f22d) {
            objectVolatile = p80Var2;
        }
        oj0 oj0Var2 = (oj0) objectVolatile;
        loop0: while (true) {
            oj0Var = oj0Var2;
            while (true) {
                int i = oj0.f26778c;
                oj0Var.getClass();
                Unsafe unsafe2 = AbstractC1078qo.f28633a;
                long j3 = oj0.f26776a;
                Object objectVolatile2 = unsafe2.getObjectVolatile(oj0Var, j3);
                C0641f8 c0641f8 = nj0.f25879a;
                if (objectVolatile2 == c0641f8) {
                    break loop0;
                }
                oj0Var2 = (oj0) objectVolatile2;
                if (oj0Var2 == null) {
                    if (unsafe2.compareAndSwapObject(oj0Var, j3, (Object) null, c0641f8)) {
                        break loop0;
                    }
                }
            }
        }
        p80 p80Var3 = (p80) oj0Var;
        if (mo5470A()) {
            p80 p80Var4 = p80Var3;
            loop2: while (true) {
                int i2 = h40.f20361b - 1;
                while (true) {
                    if (-1 < i2) {
                        j2 = (p80Var4.f22d * ((long) h40.f20361b)) + ((long) i2);
                        if (j2 >= m5497s()) {
                            while (true) {
                                Object objM9379l = p80Var4.m9379l(i2);
                                if (objM9379l != null && objM9379l != h40.f20364e) {
                                    if (objM9379l != h40.f20363d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (p80Var4.m9378k(i2, objM9379l, h40.f20371l)) {
                                    p80Var4.m7i();
                                    break;
                                }
                            }
                            i2--;
                        }
                    } else {
                        p80Var4 = (p80) ((oj0) AbstractC1078qo.f28633a.getObjectVolatile(p80Var4, oj0.f26777b));
                        if (p80Var4 == null) {
                        }
                    }
                    j2 = -1;
                    break;
                }
            }
            if (j2 != -1) {
                m5488h(j2);
            }
        }
        Object objM3798C = null;
        loop5: for (p80 p80Var5 = p80Var3; p80Var5 != null; p80Var5 = (p80) ((oj0) AbstractC1078qo.f28633a.getObjectVolatile(p80Var5, oj0.f26777b))) {
            for (int i3 = h40.f20361b - 1; -1 < i3; i3--) {
                if ((p80Var5.f22d * ((long) h40.f20361b)) + ((long) i3) < j) {
                    break loop5;
                }
                while (true) {
                    Object objM9379l2 = p80Var5.m9379l(i3);
                    if (objM9379l2 != null && objM9379l2 != h40.f20364e) {
                        if (!(objM9379l2 instanceof zy4)) {
                            if (!(objM9379l2 instanceof yy4)) {
                                break;
                            }
                            if (p80Var5.m9378k(i3, objM9379l2, h40.f20371l)) {
                                objM3798C = c20.m3798C(objM3798C, objM9379l2);
                                p80Var5.m9380m(i3, true);
                                break;
                            }
                        } else {
                            if (p80Var5.m9378k(i3, objM9379l2, h40.f20371l)) {
                                objM3798C = c20.m3798C(objM3798C, ((zy4) objM9379l2).f36471a);
                                p80Var5.m9380m(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (p80Var5.m9378k(i3, objM9379l2, h40.f20371l)) {
                            p80Var5.m7i();
                            break;
                        }
                    }
                }
            }
        }
        if (objM3798C != null) {
            if (!(objM3798C instanceof ArrayList)) {
                m5476H((yy4) objM3798C, true);
                return p80Var3;
            }
            ArrayList arrayList = (ArrayList) objM3798C;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m5476H((yy4) arrayList.get(size), true);
            }
        }
        return p80Var3;
    }

    /* JADX INFO: renamed from: h */
    public final void m5488h(long j) {
        gf0 gf0VarM12847S;
        p80 p80Var = (p80) AbstractC1078qo.f28633a.getObjectVolatile(this, f18735o);
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j2 = f18736p;
            long longVolatile = unsafe.getLongVolatile(this, j2);
            if (j < Math.max(((long) this.f18739a) + longVolatile, this.m5492m())) {
                return;
            }
            this = this;
            if (unsafe.compareAndSwapLong(this, j2, longVolatile, 1 + longVolatile)) {
                long j3 = h40.f20361b;
                long j4 = longVolatile / j3;
                int i = (int) (longVolatile % j3);
                if (p80Var.f22d != j4) {
                    p80 p80VarM5490k = this.m5490k(j4, p80Var);
                    if (p80VarM5490k != null) {
                        p80Var = p80VarM5490k;
                    }
                }
                p80 p80Var2 = p80Var;
                Object objM5479K = this.m5479K(p80Var2, i, longVolatile, null);
                if (objM5479K != h40.f20374o) {
                    p80Var2.m9128a();
                    yp1 yp1Var = this.f18740b;
                    if (yp1Var != null && (gf0VarM12847S = y42.m12847S(yp1Var, objM5479K, null)) != null) {
                        throw gf0VarM12847S;
                    }
                } else if (longVolatile < this.m5499u()) {
                    p80Var2.m9128a();
                }
                p80Var = p80Var2;
            }
        }
    }

    @Override // p000.b80
    /* JADX INFO: renamed from: i */
    public final Object mo3510i() {
        p80 p80Var;
        Unsafe unsafe = AbstractC1078qo.f28633a;
        long longVolatile = unsafe.getLongVolatile(this, f18736p);
        long longVolatile2 = unsafe.getLongVolatile(this, f18738r);
        if (m5501x(longVolatile2, true)) {
            Throwable thM5494p = m5494p();
            m80 m80Var = new m80();
            m80Var.f24722a = thM5494p;
            VarHandle.storeStoreFence();
            return m80Var;
        }
        long j = longVolatile2 & 1152921504606846975L;
        n80 n80Var = o80.f26420b;
        if (longVolatile >= j) {
            return n80Var;
        }
        Object obj = h40.f20370k;
        p80 p80Var2 = (p80) unsafe.getObjectVolatile(this, f18735o);
        while (!this.m5502y()) {
            long andIncrement = f18725e.getAndIncrement(this);
            long j2 = h40.f20361b;
            long j3 = andIncrement / j2;
            int i = (int) (andIncrement % j2);
            if (p80Var2.f22d != j3) {
                p80 p80VarM5490k = this.m5490k(j3, p80Var2);
                if (p80VarM5490k == null) {
                    continue;
                } else {
                    p80Var = p80VarM5490k;
                }
            } else {
                p80Var = p80Var2;
            }
            f40 f40Var = this;
            Object objM5479K = f40Var.m5479K(p80Var, i, andIncrement, obj);
            p80Var2 = p80Var;
            if (objM5479K == h40.f20372m) {
                yy4 yy4Var = obj instanceof yy4 ? (yy4) obj : null;
                if (yy4Var != null) {
                    yy4Var.mo3483a(p80Var2, i);
                }
                f40Var.m5482N(andIncrement);
                p80Var2.m7i();
                return n80Var;
            }
            if (objM5479K != h40.f20374o) {
                if (objM5479K != h40.f20373n) {
                    p80Var2.m9128a();
                    return objM5479K;
                }
                C1077qn.m9989o("unexpected");
                return null;
            }
            if (andIncrement < f40Var.m5499u()) {
                p80Var2.m9128a();
            }
            this = f40Var;
        }
        Throwable thM5494p2 = this.m5494p();
        m80 m80Var2 = new m80();
        m80Var2.f24722a = thM5494p2;
        VarHandle.storeStoreFence();
        return m80Var2;
    }

    @Override // p000.b80
    public final z30 iterator() {
        z30 z30Var = new z30();
        z30Var.f35734c = this;
        z30Var.f35732a = h40.f20375p;
        VarHandle.storeStoreFence();
        return z30Var;
    }

    /* JADX INFO: renamed from: j */
    public final void m5489j() {
        Object objM8780a;
        f40 f40Var = this;
        if (f40Var.m5471B()) {
            return;
        }
        p80 p80Var = (p80) AbstractC1078qo.f28633a.getObjectVolatile(f40Var, f18732l);
        while (true) {
            long andIncrement = f18726f.getAndIncrement(f40Var);
            long j = andIncrement / ((long) h40.f20361b);
            if (f40Var.m5499u() <= andIncrement) {
                if (p80Var.f22d < j && p80Var.m9129c() != null) {
                    f40Var.m5472C(j, p80Var);
                }
                f40Var.m5500v(1L);
                return;
            }
            if (p80Var.f22d != j) {
                g40 g40Var = g40.f19602b;
                while (true) {
                    objM8780a = nj0.m8780a(p80Var, j, g40Var);
                    if (as4.m3227F(objM8780a)) {
                        break;
                    }
                    a04 a04VarM3226E = as4.m3226E(objM8780a);
                    while (true) {
                        Unsafe unsafe = AbstractC1078qo.f28633a;
                        long j2 = f18732l;
                        a04 a04Var = (a04) unsafe.getObjectVolatile(f40Var, j2);
                        if (a04Var.f22d >= a04VarM3226E.f22d) {
                            f40Var = this;
                            break;
                        }
                        if (!a04VarM3226E.m8j()) {
                            break;
                        }
                        f40Var = this;
                        if (unsafe.compareAndSwapObject(f40Var, j2, a04Var, a04VarM3226E)) {
                            if (!a04Var.m4f()) {
                                break;
                            }
                            a04Var.m9130e();
                            break;
                        } else if (a04VarM3226E.m4f()) {
                            a04VarM3226E.m9130e();
                        }
                    }
                    f40Var = this;
                }
                p80 p80Var2 = null;
                if (as4.m3227F(objM8780a)) {
                    f40Var.m5503z();
                    f40Var.m5472C(j, p80Var);
                    f40Var.m5500v(1L);
                } else {
                    p80 p80Var3 = (p80) as4.m3226E(objM8780a);
                    long j3 = p80Var3.f22d;
                    if (j3 > j) {
                        long j4 = ((long) h40.f20361b) * j3;
                        if (AbstractC1078qo.f28633a.compareAndSwapLong(f40Var, f18731k, 1 + andIncrement, j4)) {
                            f40Var.m5500v(j4 - andIncrement);
                        } else {
                            f40Var.m5500v(1L);
                        }
                    } else {
                        p80Var2 = p80Var3;
                    }
                }
                if (p80Var2 == null) {
                    continue;
                } else {
                    p80Var = p80Var2;
                }
            }
            int i = (int) (andIncrement % ((long) h40.f20361b));
            Object objM9379l = p80Var.m9379l(i);
            boolean z = objM9379l instanceof yy4;
            long j5 = f18736p;
            if (!z || andIncrement < AbstractC1078qo.f28633a.getLongVolatile(f40Var, j5) || !p80Var.m9378k(i, objM9379l, h40.f20366g)) {
                while (true) {
                    Object objM9379l2 = p80Var.m9379l(i);
                    if (objM9379l2 instanceof yy4) {
                        if (andIncrement < AbstractC1078qo.f28633a.getLongVolatile(f40Var, j5)) {
                            zy4 zy4Var = new zy4();
                            zy4Var.f36471a = (yy4) objM9379l2;
                            VarHandle.storeStoreFence();
                            if (p80Var.m9378k(i, objM9379l2, zy4Var)) {
                                f40Var.m5500v(1L);
                                return;
                            }
                        } else if (p80Var.m9378k(i, objM9379l2, h40.f20366g)) {
                            if (!f40Var.m5478J(objM9379l2, p80Var, i)) {
                                p80Var.m9382o(i, h40.f20369j);
                                p80Var.m7i();
                                break;
                            } else {
                                p80Var.m9382o(i, h40.f20363d);
                                f40Var.m5500v(1L);
                                return;
                            }
                        }
                    } else {
                        if (objM9379l2 == h40.f20369j) {
                            break;
                        }
                        if (objM9379l2 == null) {
                            if (p80Var.m9378k(i, objM9379l2, h40.f20364e)) {
                                f40Var.m5500v(1L);
                                return;
                            }
                        } else if (objM9379l2 == h40.f20363d || objM9379l2 == h40.f20367h || objM9379l2 == h40.f20368i || objM9379l2 == h40.f20370k || objM9379l2 == h40.f20371l) {
                            f40Var.m5500v(1L);
                            return;
                        } else if (objM9379l2 != h40.f20365f) {
                            nm0.m8798k(objM9379l2, "Unexpected cell state: ");
                            return;
                        }
                    }
                }
                f40Var.m5500v(1L);
            } else if (f40Var.m5478J(objM9379l, p80Var, i)) {
                p80Var.m9382o(i, h40.f20363d);
                f40Var.m5500v(1L);
                return;
            } else {
                p80Var.m9382o(i, h40.f20369j);
                p80Var.m7i();
                f40Var.m5500v(1L);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final p80 m5490k(long j, p80 p80Var) {
        Object objM8780a;
        p80 p80Var2;
        Unsafe unsafe;
        long j2;
        long longVolatile;
        p80 p80Var3 = h40.f20360a;
        g40 g40Var = g40.f19602b;
        loop0: while (true) {
            objM8780a = nj0.m8780a(p80Var, j, g40Var);
            if (!as4.m3227F(objM8780a)) {
                a04 a04VarM3226E = as4.m3226E(objM8780a);
                while (true) {
                    Unsafe unsafe2 = AbstractC1078qo.f28633a;
                    long j3 = f18735o;
                    a04 a04Var = (a04) unsafe2.getObjectVolatile(this, j3);
                    if (a04Var.f22d >= a04VarM3226E.f22d) {
                        break loop0;
                    }
                    if (!a04VarM3226E.m8j()) {
                        break;
                    }
                    if (unsafe2.compareAndSwapObject(this, j3, a04Var, a04VarM3226E)) {
                        if (!a04Var.m4f()) {
                            break loop0;
                        }
                        a04Var.m9130e();
                        break loop0;
                    }
                    if (a04VarM3226E.m4f()) {
                        a04VarM3226E.m9130e();
                    }
                }
            } else {
                break;
            }
        }
        if (as4.m3227F(objM8780a)) {
            m5503z();
            if (p80Var.f22d * ((long) h40.f20361b) < m5499u()) {
                p80Var.m9128a();
                return null;
            }
        } else {
            p80 p80Var4 = (p80) as4.m3226E(objM8780a);
            long j4 = p80Var4.f22d;
            if (m5471B() || j > m5492m() / ((long) h40.f20361b)) {
                p80Var2 = p80Var4;
                break;
            }
            while (true) {
                Unsafe unsafe3 = AbstractC1078qo.f28633a;
                long j5 = f18732l;
                a04 a04Var2 = (a04) unsafe3.getObjectVolatile(this, j5);
                if (a04Var2.f22d >= j4 || !p80Var4.m8j()) {
                    p80Var2 = p80Var4;
                    break;
                }
                p80Var2 = p80Var4;
                if (unsafe3.compareAndSwapObject(this, j5, a04Var2, p80Var4)) {
                    if (!a04Var2.m4f()) {
                        break;
                    }
                    a04Var2.m9130e();
                    break;
                }
                if (p80Var2.m4f()) {
                    p80Var2.m9130e();
                }
                p80Var4 = p80Var2;
            }
            if (j4 <= j) {
                return p80Var2;
            }
            long j6 = j4 * ((long) h40.f20361b);
            do {
                unsafe = AbstractC1078qo.f28633a;
                j2 = f18736p;
                longVolatile = unsafe.getLongVolatile(this, j2);
                if (longVolatile >= j6) {
                    break;
                }
            } while (!unsafe.compareAndSwapLong(this, j2, longVolatile, j6));
            if (j4 * ((long) h40.f20361b) < m5499u()) {
                p80Var2.m9128a();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final p80 m5491l(long j, p80 p80Var) {
        Object objM8780a;
        p80 p80Var2;
        long j2;
        f40 f40Var = this;
        p80 p80Var3 = h40.f20360a;
        g40 g40Var = g40.f19602b;
        loop0: while (true) {
            objM8780a = nj0.m8780a(p80Var, j, g40Var);
            if (!as4.m3227F(objM8780a)) {
                a04 a04VarM3226E = as4.m3226E(objM8780a);
                while (true) {
                    Unsafe unsafe = AbstractC1078qo.f28633a;
                    long j3 = f18737q;
                    a04 a04Var = (a04) unsafe.getObjectVolatile(f40Var, j3);
                    if (a04Var.f22d >= a04VarM3226E.f22d) {
                        break loop0;
                    }
                    if (!a04VarM3226E.m8j()) {
                        break;
                    }
                    if (unsafe.compareAndSwapObject(f40Var, j3, a04Var, a04VarM3226E)) {
                        if (!a04Var.m4f()) {
                            break loop0;
                        }
                        a04Var.m9130e();
                        break loop0;
                    }
                    if (a04VarM3226E.m4f()) {
                        a04VarM3226E.m9130e();
                    }
                }
            } else {
                break;
            }
        }
        p80 p80Var4 = null;
        if (as4.m3227F(objM8780a)) {
            f40Var.m5503z();
            if (p80Var.f22d * ((long) h40.f20361b) >= f40Var.m5497s()) {
                return null;
            }
            p80Var.m9128a();
            return null;
        }
        p80 p80Var5 = (p80) as4.m3226E(objM8780a);
        long j4 = p80Var5.f22d;
        if (j4 <= j) {
            return p80Var5;
        }
        long j5 = j4 * ((long) h40.f20361b);
        while (true) {
            Unsafe unsafe2 = AbstractC1078qo.f28633a;
            long j6 = f18738r;
            long longVolatile = unsafe2.getLongVolatile(f40Var, j6);
            long j7 = 1152921504606846975L & longVolatile;
            if (j7 >= j5) {
                p80Var2 = p80Var4;
                j2 = j4;
                break;
            }
            p80Var2 = p80Var4;
            j2 = j4;
            if (unsafe2.compareAndSwapLong(f40Var, j6, longVolatile, j7 + (((long) ((int) (longVolatile >> 60))) << 60))) {
                break;
            }
            f40Var = this;
            p80Var4 = p80Var2;
            j4 = j2;
        }
        if (j2 * ((long) h40.f20361b) >= m5497s()) {
            return p80Var2;
        }
        p80Var5.m9128a();
        return p80Var2;
    }

    /* JADX INFO: renamed from: m */
    public final long m5492m() {
        return AbstractC1078qo.f28633a.getLongVolatile(this, f18731k);
    }

    @Override // p000.y14
    /* JADX INFO: renamed from: n */
    public Object mo5493n(Object obj) throws IllegalAccessException, InvocationTargetException {
        m80 m80Var;
        Throwable thM5498t;
        f40 f40Var = this;
        Unsafe unsafe = AbstractC1078qo.f28633a;
        long longVolatile = unsafe.getLongVolatile(f40Var, f18738r);
        long j = 1152921504606846975L;
        boolean z = f40Var.m5501x(longVolatile, false) ? false : !f40Var.m5483b(longVolatile & 1152921504606846975L);
        n80 n80Var = o80.f26420b;
        if (z) {
            return n80Var;
        }
        Object obj2 = h40.f20369j;
        p80 p80Var = (p80) unsafe.getObjectVolatile(f40Var, f18737q);
        while (true) {
            long andIncrement = f18724d.getAndIncrement(f40Var);
            long j2 = andIncrement & j;
            boolean zM5501x = f40Var.m5501x(andIncrement, false);
            int i = h40.f20361b;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (p80Var.f22d != j4) {
                p80 p80VarM5491l = f40Var.m5491l(j4, p80Var);
                if (p80VarM5491l != null) {
                    p80Var = p80VarM5491l;
                } else {
                    if (zM5501x) {
                        thM5498t = f40Var.m5498t();
                        m80Var = new m80();
                        break;
                    }
                    j = 1152921504606846975L;
                }
            }
            int iM5480L = f40Var.m5480L(p80Var, i2, obj, j2, obj2, zM5501x);
            ju4 ju4Var = ju4.f22634a;
            if (iM5480L == 0) {
                p80Var.m9128a();
                return ju4Var;
            }
            if (iM5480L == 1) {
                return ju4Var;
            }
            if (iM5480L == 2) {
                if (zM5501x) {
                    p80Var.m7i();
                    thM5498t = m5498t();
                    m80Var = new m80();
                    break;
                }
                yy4 yy4Var = obj2 instanceof yy4 ? (yy4) obj2 : null;
                if (yy4Var != null) {
                    yy4Var.mo3483a(p80Var, i2 + i);
                }
                p80Var.m7i();
                return n80Var;
            }
            if (iM5480L == 3) {
                C1077qn.m9989o("unexpected");
                return null;
            }
            if (iM5480L == 4) {
                if (j2 < m5497s()) {
                    p80Var.m9128a();
                }
                thM5498t = m5498t();
                m80Var = new m80();
                break;
            }
            if (iM5480L == 5) {
                p80Var.m9128a();
            }
            j = 1152921504606846975L;
            f40Var = this;
        }
        m80Var.f24722a = thM5498t;
        VarHandle.storeStoreFence();
        return m80Var;
    }

    @Override // p000.b80
    /* JADX INFO: renamed from: o */
    public final Object mo3511o(nd0 nd0Var) {
        return m5468F(this, nd0Var);
    }

    /* JADX INFO: renamed from: p */
    public final Throwable m5494p() {
        return (Throwable) AbstractC1078qo.f28633a.getObjectVolatile(this, f18730j);
    }

    /* JADX INFO: renamed from: q */
    public final C1283w7 m5495q() {
        b40 b40Var = b40.f15071b;
        as4.m3259r(3, b40Var);
        c40 c40Var = c40.f15793b;
        as4.m3259r(3, c40Var);
        return new C1283w7(this, b40Var, c40Var, this.f18741c);
    }

    /* JADX INFO: renamed from: r */
    public final Throwable m5496r() {
        Throwable thM5494p = m5494p();
        return thM5494p == null ? new oa0("Channel was closed") : thM5494p;
    }

    /* JADX INFO: renamed from: s */
    public final long m5497s() {
        return AbstractC1078qo.f28633a.getLongVolatile(this, f18736p);
    }

    /* JADX INFO: renamed from: t */
    public final Throwable m5498t() {
        Throwable thM5494p = m5494p();
        return thM5494p == null ? new pa0("Channel was closed") : thM5494p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        String string;
        StringBuilder sb = new StringBuilder();
        Unsafe unsafe = AbstractC1078qo.f28633a;
        int longVolatile = (int) (unsafe.getLongVolatile(this, f18738r) >> 60);
        if (longVolatile == 2) {
            sb.append("closed,");
        } else if (longVolatile == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f18739a + ',');
        sb.append("data=[");
        int i = 0;
        boolean z = true;
        List listM7694Y = kx5.m7694Y(unsafe.getObjectVolatile(this, f18735o), unsafe.getObjectVolatile(this, f18737q), unsafe.getObjectVolatile(this, f18732l));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM7694Y) {
            if (((p80) obj) != h40.f20360a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            xy4.m12795x();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((p80) next).f22d;
            do {
                Object next2 = it.next();
                long j2 = ((p80) next2).f22d;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        p80 p80Var = (p80) next;
        long jM5497s = m5497s();
        long jM5499u = m5499u();
        loop2: while (true) {
            int i2 = h40.f20361b;
            int i3 = i;
            while (i3 < i2) {
                str = null;
                long j3 = (p80Var.f22d * ((long) h40.f20361b)) + ((long) i3);
                if (j3 >= jM5499u && j3 >= jM5497s) {
                    break loop2;
                }
                Object objM9379l = p80Var.m9379l(i3);
                boolean z2 = z;
                Object obj2 = p80Var.f27418h.get(i3 * 2);
                if (objM9379l instanceof a70) {
                    string = (jM5499u > j3 || j3 >= jM5497s) ? (jM5497s > j3 || j3 >= jM5499u) ? "cont" : "send" : "receive";
                } else if (objM9379l instanceof g04) {
                    string = (jM5499u > j3 || j3 >= jM5497s) ? (jM5497s > j3 || j3 >= jM5499u) ? "select" : "onSend" : "onReceive";
                } else if (objM9379l instanceof xk3) {
                    string = "receiveCatching";
                } else if (objM9379l instanceof zy4) {
                    string = "EB(" + objM9379l + ')';
                } else if (z62.m13387o(objM9379l, h40.f20365f) || z62.m13387o(objM9379l, h40.f20366g)) {
                    string = "resuming_sender";
                } else {
                    if (objM9379l != null && !objM9379l.equals(h40.f20364e) && !objM9379l.equals(h40.f20368i) && !objM9379l.equals(h40.f20367h) && !objM9379l.equals(h40.f20370k) && !objM9379l.equals(h40.f20369j) && !objM9379l.equals(h40.f20371l)) {
                        string = objM9379l.toString();
                    }
                    i3++;
                    z = z2;
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i3++;
                z = z2;
            }
            boolean z3 = z;
            str = null;
            p80Var = (p80) p80Var.m9129c();
            if (p80Var == null) {
                break;
            }
            z = z3;
            i = 0;
        }
        if (sb.length() == 0) {
            ds3.m4667k("Char sequence is empty.");
            return str;
        }
        if (sb.charAt(hd4.m6339e0(sb)) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final long m5499u() {
        return AbstractC1078qo.f28633a.getLongVolatile(this, f18738r) & 1152921504606846975L;
    }

    /* JADX INFO: renamed from: v */
    public final void m5500v(long j) {
        if ((f18727g.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((AbstractC1078qo.f28633a.getLongVolatile(this, f18734n) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m5501x(long j, boolean z) throws IllegalAccessException, InvocationTargetException {
        f40 f40Var = this;
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                f40Var.m5487g(j & 1152921504606846975L);
                if (z) {
                    while (true) {
                        Unsafe unsafe = AbstractC1078qo.f28633a;
                        long j2 = f18735o;
                        p80 p80VarM5490k = (p80) unsafe.getObjectVolatile(f40Var, j2);
                        long jM5497s = f40Var.m5497s();
                        if (f40Var.m5499u() <= jM5497s) {
                            break;
                        }
                        long j3 = h40.f20361b;
                        long j4 = jM5497s / j3;
                        if (p80VarM5490k.f22d != j4 && (p80VarM5490k = f40Var.m5490k(j4, p80VarM5490k)) == null) {
                            if (((p80) unsafe.getObjectVolatile(f40Var, j2)).f22d < j4) {
                                break;
                            }
                        } else {
                            p80VarM5490k.m9128a();
                            int i2 = (int) (jM5497s % j3);
                            while (true) {
                                Object objM9379l = p80VarM5490k.m9379l(i2);
                                if (objM9379l != null && objM9379l != h40.f20364e) {
                                    if (objM9379l != h40.f20363d && (objM9379l == h40.f20369j || objM9379l == h40.f20371l || objM9379l == h40.f20368i || objM9379l == h40.f20367h || (objM9379l != h40.f20366g && (objM9379l == h40.f20365f || jM5497s != f40Var.m5497s())))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else {
                                    if (p80VarM5490k.m9378k(i2, objM9379l, h40.f20367h)) {
                                        f40Var.m5489j();
                                        break;
                                    }
                                    f40Var = this;
                                }
                            }
                            AbstractC1078qo.f28633a.compareAndSwapLong(f40Var, f18736p, jM5497s, 1 + jM5497s);
                            f40Var = this;
                        }
                    }
                }
            } else {
                if (i != 3) {
                    xy4.m12780h(c75.m3877i(i, "unexpected close status: "));
                    return false;
                }
                p80 p80VarM5487g = f40Var.m5487g(j & 1152921504606846975L);
                gf0 gf0VarM12847S = null;
                Object objM3798C = null;
                loop0: do {
                    AtomicReferenceArray atomicReferenceArray = p80VarM5487g.f27418h;
                    for (int i3 = h40.f20361b - 1; -1 < i3; i3--) {
                        long j5 = (p80VarM5487g.f22d * ((long) h40.f20361b)) + ((long) i3);
                        while (true) {
                            Object objM9379l2 = p80VarM5487g.m9379l(i3);
                            if (objM9379l2 == h40.f20368i) {
                                break loop0;
                            }
                            C0641f8 c0641f8 = h40.f20363d;
                            yp1 yp1Var = f40Var.f18740b;
                            if (objM9379l2 != c0641f8) {
                                if (objM9379l2 != h40.f20364e && objM9379l2 != null) {
                                    if (!(objM9379l2 instanceof yy4) && !(objM9379l2 instanceof zy4)) {
                                        C0641f8 c0641f9 = h40.f20366g;
                                        if (objM9379l2 == c0641f9 || objM9379l2 == h40.f20365f) {
                                            break loop0;
                                        }
                                        if (objM9379l2 != c0641f9) {
                                            break;
                                        }
                                    } else {
                                        if (j5 < f40Var.m5497s()) {
                                            break loop0;
                                        }
                                        yy4 yy4Var = objM9379l2 instanceof zy4 ? ((zy4) objM9379l2).f36471a : (yy4) objM9379l2;
                                        if (p80VarM5487g.m9378k(i3, objM9379l2, h40.f20371l)) {
                                            if (yp1Var != null) {
                                                gf0VarM12847S = y42.m12847S(yp1Var, atomicReferenceArray.get(i3 * 2), gf0VarM12847S);
                                            }
                                            objM3798C = c20.m3798C(objM3798C, yy4Var);
                                            p80VarM5487g.m9381n(i3, null);
                                            p80VarM5487g.m7i();
                                            break;
                                        }
                                    }
                                } else {
                                    if (p80VarM5487g.m9378k(i3, objM9379l2, h40.f20371l)) {
                                        p80VarM5487g.m7i();
                                        break;
                                    }
                                }
                            } else {
                                if (j5 < f40Var.m5497s()) {
                                    break loop0;
                                }
                                if (p80VarM5487g.m9378k(i3, objM9379l2, h40.f20371l)) {
                                    if (yp1Var != null) {
                                        gf0VarM12847S = y42.m12847S(yp1Var, atomicReferenceArray.get(i3 * 2), gf0VarM12847S);
                                    }
                                    p80VarM5487g.m9381n(i3, null);
                                    p80VarM5487g.m7i();
                                    break;
                                }
                            }
                        }
                    }
                    p80VarM5487g = (p80) ((oj0) AbstractC1078qo.f28633a.getObjectVolatile(p80VarM5487g, oj0.f26777b));
                } while (p80VarM5487g != null);
                if (objM3798C != null) {
                    if (objM3798C instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objM3798C;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            f40Var.m5476H((yy4) arrayList.get(size), false);
                        }
                    } else {
                        f40Var.m5476H((yy4) objM3798C, false);
                    }
                }
                if (gf0VarM12847S != null) {
                    throw gf0VarM12847S;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m5502y() {
        return m5501x(AbstractC1078qo.f28633a.getLongVolatile(this, f18738r), true);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m5503z() {
        return m5501x(AbstractC1078qo.f28633a.getLongVolatile(this, f18738r), false);
    }
}
