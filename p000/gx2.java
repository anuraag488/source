package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gx2 extends u14 {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20171i = AtomicReferenceFieldUpdater.newUpdater(gx2.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ long f20172j = AbstractC1078qo.f28633a.objectFieldOffset(gx2.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public gx2(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : hx2.f20911a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6190d() {
        return Math.max(AbstractC1078qo.f28633a.getIntVolatile(this, u14.f31595f), 0) == 0;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: e */
    public final Object m6191e(wm0 wm0Var) {
        boolean zM6192f = m6192f();
        ju4 ju4Var = ju4.f22634a;
        if (!zM6192f) {
            b70 b70VarM3824u = c20.m3824u(C0006a5.m86x(wm0Var));
            try {
                fx2 fx2Var = new fx2();
                fx2Var.f19376b = this;
                fx2Var.f19375a = b70VarM3824u;
                VarHandle.storeStoreFence();
                while (true) {
                    int andDecrement = u14.f31594e.getAndDecrement(this);
                    if (andDecrement <= this.f31598a) {
                        if (andDecrement > 0) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20171i;
                            gx2 gx2Var = fx2Var.f19376b;
                            atomicReferenceFieldUpdater.set(gx2Var, null);
                            b70 b70Var = fx2Var.f19375a;
                            b71 b71Var = new b71((byte) 17);
                            b71Var.f15141b = gx2Var;
                            VarHandle.storeStoreFence();
                            int i = b70Var.f20971c;
                            C0928n c0928n = new C0928n((byte) 2);
                            c0928n.f25353b = b71Var;
                            VarHandle.storeStoreFence();
                            b70Var.m3480C(ju4Var, i, c0928n);
                            break;
                        }
                        if (m11204b(fx2Var)) {
                            break;
                        }
                    }
                }
                Object objM3495r = b70VarM3824u.m3495r();
                ap0 ap0Var = ap0.f14763a;
                if (objM3495r != ap0Var) {
                    objM3495r = ju4Var;
                }
                if (objM3495r == ap0Var) {
                    return objM3495r;
                }
            } catch (Throwable th) {
                b70VarM3824u.m3479B();
                throw th;
            }
        }
        return ju4Var;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6192f() {
        gx2 gx2Var;
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = u14.f31595f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile > this.f31598a) {
                while (true) {
                    Unsafe unsafe2 = AbstractC1078qo.f28633a;
                    long j2 = u14.f31595f;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j2);
                    int i = this.f31598a;
                    if (intVolatile2 <= i) {
                        gx2Var = this;
                        break;
                    }
                    gx2 gx2Var2 = this;
                    gx2Var = gx2Var2;
                    if (unsafe2.compareAndSwapInt(gx2Var2, j2, intVolatile2, i)) {
                        break;
                    }
                    this = gx2Var;
                }
            } else {
                gx2Var = this;
                if (intVolatile <= 0) {
                    return false;
                }
                if (unsafe.compareAndSwapInt(gx2Var, j, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(gx2Var, f20172j, (Object) null);
                    return true;
                }
            }
            this = gx2Var;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6193g(Object obj) {
        while (this.m6190d()) {
            Object objectVolatile = AbstractC1078qo.f28633a.getObjectVolatile(this, f20172j);
            C0641f8 c0641f8 = hx2.f20911a;
            if (objectVolatile != c0641f8) {
                if (objectVolatile != obj && obj != null) {
                    xd2.m12668o("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                gx2 gx2Var = this;
                if (AbstractC1078qo.f28633a.compareAndSwapObject(gx2Var, f20172j, objectVolatile, c0641f8)) {
                    gx2Var.m11205c();
                    return;
                }
                this = gx2Var;
            }
        }
        C1077qn.m9989o("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + ev0.m5354d0(this) + "[isLocked=" + m6190d() + ",owner=" + AbstractC1078qo.f28633a.getObjectVolatile(this, f20172j) + ']';
    }
}
