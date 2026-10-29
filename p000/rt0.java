package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rt0 extends of4 implements yp1 {

    /* JADX INFO: renamed from: A */
    public byte f29595A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ ru0 f29596B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ ot0 f29597C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ C1122rv f29598D;

    /* JADX INFO: renamed from: t */
    public gx2 f29599t;

    /* JADX INFO: renamed from: u */
    public ml3 f29600u;

    /* JADX INFO: renamed from: v */
    public ql3 f29601v;

    /* JADX INFO: renamed from: w */
    public Object f29602w;

    /* JADX INFO: renamed from: x */
    public Object f29603x;

    /* JADX INFO: renamed from: y */
    public Iterator f29604y;

    /* JADX INFO: renamed from: z */
    public int f29605z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt0(ru0 ru0Var, ot0 ot0Var, C1122rv c1122rv, wm0 wm0Var) {
        super(1, wm0Var);
        this.f29596B = ru0Var;
        this.f29597C = ot0Var;
        this.f29598D = c1122rv;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        ot0 ot0Var = this.f29597C;
        C1122rv c1122rv = this.f29598D;
        return new rt0(this.f29596B, ot0Var, c1122rv, (wm0) obj).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:40:0x0115  */
    /* JADX WARN: Code duplicated, block: B:49:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:21:0x00ab->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws Throwable {
        gx2 gx2VarM6530a;
        ml3 ml3Var;
        ql3 ql3Var;
        ql3 ql3Var2;
        gx2 gx2Var;
        Iterator it;
        gx2 gx2Var2;
        ml3 ml3Var2;
        ql3 ql3Var3;
        qt0 qt0Var;
        ql3 ql3Var4;
        ml3 ml3Var3;
        mq1 mq1Var;
        Object obj2;
        int iHashCode;
        Integer numM3865a;
        int i;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f29595A;
        C1122rv c1122rv = this.f29598D;
        ru0 ru0Var = this.f29596B;
        if (b == 0) {
            k43.m7376J(obj);
            gx2VarM6530a = hx2.m6530a();
            ml3Var = new ml3();
            ql3Var = new ql3();
            this.f29599t = gx2VarM6530a;
            this.f29600u = ml3Var;
            this.f29601v = ql3Var;
            this.f29602w = ql3Var;
            this.f29595A = (byte) 1;
            obj = ru0Var.m10435h(true, this.f29597C, this);
            if (obj != ap0Var) {
                ql3Var2 = ql3Var;
            }
            return ap0Var;
        }
        if (b == 1) {
            ql3Var = (ql3) this.f29602w;
            ql3Var2 = this.f29601v;
            ml3Var = this.f29600u;
            gx2VarM6530a = this.f29599t;
            k43.m7376J(obj);
        } else {
            if (b == 2) {
                it = this.f29604y;
                qt0Var = (qt0) this.f29602w;
                ql3Var3 = this.f29601v;
                ml3Var2 = this.f29600u;
                gx2Var2 = this.f29599t;
                k43.m7376J(obj);
                while (it.hasNext()) {
                    mq1Var = (mq1) it.next();
                    this.f29599t = gx2Var2;
                    this.f29600u = ml3Var2;
                    this.f29601v = ql3Var3;
                    this.f29602w = qt0Var;
                    this.f29603x = null;
                    this.f29604y = it;
                    this.f29595A = (byte) 2;
                    if (mq1Var.invoke(qt0Var, this) == ap0Var) {
                        return ap0Var;
                    }
                }
                ql3Var2 = ql3Var3;
                ml3Var = ml3Var2;
                gx2Var = gx2Var2;
                c1122rv.f29654e = null;
                this.f29599t = null;
                this.f29600u = ml3Var;
                this.f29601v = ql3Var2;
                this.f29602w = null;
                this.f29603x = gx2Var;
                this.f29604y = null;
                this.f29595A = (byte) 3;
                if (gx2Var.m6191e(this) != ap0Var) {
                    ql3Var4 = ql3Var2;
                    ml3Var3 = ml3Var;
                    ml3Var3.f25002a = true;
                    gx2Var.m6193g(null);
                    obj2 = ql3Var4.f28555a;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    c74 c74VarM10430c = ru0Var.m10430c();
                    this.f29599t = null;
                    this.f29600u = null;
                    this.f29601v = null;
                    this.f29602w = null;
                    this.f29603x = obj2;
                    this.f29605z = iHashCode;
                    this.f29595A = (byte) 4;
                    numM3865a = c74VarM10430c.m3865a();
                    if (numM3865a != ap0Var) {
                        i = iHashCode;
                        obj = numM3865a;
                    }
                }
                return ap0Var;
            }
            if (b == 3) {
                gx2Var = (gx2) this.f29603x;
                ql3Var4 = this.f29601v;
                ml3Var3 = this.f29600u;
                k43.m7376J(obj);
                try {
                    ml3Var3.f25002a = true;
                    gx2Var.m6193g(null);
                    obj2 = ql3Var4.f28555a;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    c74 c74VarM10430c2 = ru0Var.m10430c();
                    this.f29599t = null;
                    this.f29600u = null;
                    this.f29601v = null;
                    this.f29602w = null;
                    this.f29603x = obj2;
                    this.f29605z = iHashCode;
                    this.f29595A = (byte) 4;
                    numM3865a = c74VarM10430c2.m3865a();
                    if (numM3865a != ap0Var) {
                        i = iHashCode;
                        obj = numM3865a;
                    }
                    return ap0Var;
                } catch (Throwable th) {
                    gx2Var.m6193g(null);
                    throw th;
                }
            }
            if (b != 4) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f29605z;
            obj2 = this.f29603x;
            k43.m7376J(obj);
        }
        return new at0(i, ((Number) obj).intValue(), obj2);
        ql3Var.f28555a = ((at0) obj).f14852b;
        qt0 qt0Var2 = new qt0();
        qt0Var2.f28780a = gx2VarM6530a;
        qt0Var2.f28781b = ml3Var;
        qt0Var2.f28782c = ql3Var2;
        qt0Var2.f28783d = ru0Var;
        VarHandle.storeStoreFence();
        List list = (List) c1122rv.f29654e;
        if (list != null) {
            it = list.iterator();
            gx2Var2 = gx2VarM6530a;
            ml3Var2 = ml3Var;
            ql3Var3 = ql3Var2;
            qt0Var = qt0Var2;
            while (it.hasNext()) {
                mq1Var = (mq1) it.next();
                this.f29599t = gx2Var2;
                this.f29600u = ml3Var2;
                this.f29601v = ql3Var3;
                this.f29602w = qt0Var;
                this.f29603x = null;
                this.f29604y = it;
                this.f29595A = (byte) 2;
                if (mq1Var.invoke(qt0Var, this) == ap0Var) {
                    return ap0Var;
                }
            }
            ql3Var2 = ql3Var3;
            ml3Var = ml3Var2;
            gx2Var = gx2Var2;
        } else {
            gx2Var = gx2VarM6530a;
        }
        c1122rv.f29654e = null;
        this.f29599t = null;
        this.f29600u = ml3Var;
        this.f29601v = ql3Var2;
        this.f29602w = null;
        this.f29603x = gx2Var;
        this.f29604y = null;
        this.f29595A = (byte) 3;
        if (gx2Var.m6191e(this) != ap0Var) {
            ql3Var4 = ql3Var2;
            ml3Var3 = ml3Var;
            ml3Var3.f25002a = true;
            gx2Var.m6193g(null);
            obj2 = ql3Var4.f28555a;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            c74 c74VarM10430c3 = ru0Var.m10430c();
            this.f29599t = null;
            this.f29600u = null;
            this.f29601v = null;
            this.f29602w = null;
            this.f29603x = obj2;
            this.f29605z = iHashCode;
            this.f29595A = (byte) 4;
            numM3865a = c74VarM10430c3.m3865a();
            if (numM3865a != ap0Var) {
                i = iHashCode;
                obj = numM3865a;
                return new at0(i, ((Number) obj).intValue(), obj2);
            }
        }
        return ap0Var;
    }
}
