package p000;

import java.lang.invoke.VarHandle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vi2 implements lu3, gu3 {

    /* JADX INFO: renamed from: a */
    public final mu3 f32644a;

    /* JADX INFO: renamed from: b */
    public final gu3 f32645b;

    /* JADX INFO: renamed from: c */
    public final mw2 f32646c;

    public vi2(lu3 lu3Var, Map map, iu3 iu3Var) {
        b71 b71Var = new b71((byte) 15);
        b71Var.f15141b = lu3Var;
        VarHandle.storeStoreFence();
        this.f32644a = ou3.m9279a(map, b71Var);
        this.f32645b = iu3Var;
        mw2 mw2Var = uv3.f32207a;
        this.f32646c = new mw2();
    }

    @Override // p000.lu3
    /* JADX INFO: renamed from: a */
    public final ku3 mo8109a(String str, wp1 wp1Var) {
        return this.f32644a.mo8109a(str, wp1Var);
    }

    @Override // p000.lu3
    /* JADX INFO: renamed from: b */
    public final boolean mo8110b(Object obj) {
        return this.f32644a.mo8110b(obj);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // p000.lu3
    /* JADX INFO: renamed from: c */
    public final Map mo8111c() {
        mw2 mw2Var = this.f32646c;
        Object[] objArr = mw2Var.f25258b;
        long[] jArr = mw2Var.f25257a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.f32645b.mo6171f(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.f32644a.mo8111c();
    }

    @Override // p000.lu3
    /* JADX INFO: renamed from: d */
    public final Object mo8112d(String str) {
        return this.f32644a.mo8112d(str);
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
    @Override // p000.gu3
    /* JADX INFO: renamed from: e */
    public final void mo6170e(Object obj, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        Object obj2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-858296452);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6894i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6894i(this) ? 256 : 128;
        }
        if (ir1Var.m6871T(i2 & 1, (i2 & 147) != 146)) {
            this.f32645b.mo6170e(obj, pg0Var, ir1Var, i2 & 126);
            boolean zM6894i = ir1Var.m6894i(this) | ir1Var.m6894i(obj);
            Object objM6869O = ir1Var.m6869O();
            if (zM6894i || objM6869O == ki0.f23136a) {
                obj2 = objM6869O;
                na1 na1Var = new na1((byte) 9);
                na1Var.f25595b = this;
                na1Var.f25596c = obj;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(na1Var);
                obj2 = na1Var;
            }
            obj2 = objM6869O;
            lb5.m7923d(obj, (yp1) obj2, ir1Var);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1403zf c1403zf = new C1403zf((byte) 7);
            c1403zf.f36036c = this;
            c1403zf.f36037d = obj;
            c1403zf.f36038e = pg0Var;
            c1403zf.f36035b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1403zf;
        }
    }

    @Override // p000.gu3
    /* JADX INFO: renamed from: f */
    public final void mo6171f(Object obj) {
        this.f32645b.mo6171f(obj);
    }
}
