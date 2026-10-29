package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class pd1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ic2[] f27529a = {new hh3(pd1.class, "LocalFeatureModuleState", "getLocalFeatureModuleState()Landroidx/compose/runtime/ProvidableCompositionLocal;"), new jw2(pd1.class, "showPromo", "getShowPromo(Lessentials/data/Settings;)Z", 1)};

    /* JADX INFO: renamed from: b */
    public static final C1040pn f27530b = hj0.m6413a();

    /* JADX INFO: renamed from: c */
    public static final nc4 f27531c = new nc4(new da2((byte) 12));

    /* JADX INFO: renamed from: d */
    public static final tt2 f27532d = h44.m6219c("show_promo", Boolean.TRUE, a10.f32a);

    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00df  */
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
    /* JADX INFO: renamed from: a */
    public static final void m9496a(od1 od1Var, C1349xz c1349xz, mi0 mi0Var, int i) {
        Object obj;
        boolean z;
        boolean z2;
        boolean z3;
        Object obj2;
        pg0 pg0Var = zy5.f36477f;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-2136850667);
        int i2 = i | (ir1Var.m6890g(od1Var) ? 4 : 2) | (ir1Var.m6890g(c1349xz) ? 32 : 16) | (ir1Var.m6894i(pg0Var) ? 2048 : 1024);
        if (ir1Var.m6871T(i2 & 1, (i2 & 1171) != 1170)) {
            xn2 xn2Var = (xn2) ir1Var.m6898k(yn2.f35357b);
            Object obj3 = ki0.f23136a;
            if (xn2Var == null) {
                ir1Var.m6885d0(-1476823888);
                ir1Var.m6912r(false);
                obj = null;
            } else {
                ir1Var.m6885d0(-1476823887);
                boolean zM6890g = ir1Var.m6890g("FeatureHost") | ir1Var.m6890g(xn2Var);
                Object objM6869O = ir1Var.m6869O();
                if (zM6890g || objM6869O == obj3) {
                    objM6869O = xn2Var.m12723c("FeatureHost");
                    ir1Var.m6905n0(objM6869O);
                }
                obj = (xn2) objM6869O;
                ir1Var.m6912r(false);
            }
            v93 v93Var = od1Var.f26637b;
            qe3 qe3Var = od1Var.f26639d;
            Boolean boolMo11770a = v93Var.mo11770a();
            Boolean bool = Boolean.FALSE;
            boolean zM13387o = z62.m13387o(boolMo11770a, bool);
            ju4 ju4Var = ju4.f22634a;
            if (zM13387o || (z62.m13387o(qe3Var.mo9873f(), bool) && !qe3Var.mo9868a())) {
                ir1Var.m6885d0(1087487582);
                if ((i2 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                boolean zM6894i = z | ir1Var.m6894i(obj);
                if ((i2 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = zM6894i | z2;
                Object objM6869O2 = ir1Var.m6869O();
                obj2 = objM6869O2;
                if (z3 || objM6869O2 == obj3) {
                    C1048pv c1048pv = new C1048pv((byte) 6);
                    c1048pv.f28016b = od1Var;
                    c1048pv.f28017c = obj;
                    c1048pv.f28018d = c1349xz;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c1048pv);
                    obj2 = c1048pv;
                }
                lb5.m7932m(ju4Var, (wp1) obj2, ir1Var);
                ir1Var.m6912r(false);
            } else {
                if (c1349xz != null ? z62.m13387o((Boolean) c1349xz.f34730d.getValue(), bool) : false) {
                    ir1Var.m6885d0(1087487582);
                    if ((i2 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean zM6894i2 = z | ir1Var.m6894i(obj);
                    if ((i2 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = zM6894i2 | z2;
                    Object objM6869O3 = ir1Var.m6869O();
                    obj2 = objM6869O3;
                    if (z3) {
                        C1048pv c1048pv2 = new C1048pv((byte) 6);
                        c1048pv2.f28016b = od1Var;
                        c1048pv2.f28017c = obj;
                        c1048pv2.f28018d = c1349xz;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c1048pv2);
                        obj2 = c1048pv2;
                    } else {
                        C1048pv c1048pv3 = new C1048pv((byte) 6);
                        c1048pv3.f28016b = od1Var;
                        c1048pv3.f28017c = obj;
                        c1048pv3.f28018d = c1349xz;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c1048pv3);
                        obj2 = c1048pv3;
                    }
                    lb5.m7932m(ju4Var, (wp1) obj2, ir1Var);
                    ir1Var.m6912r(false);
                } else {
                    ir1Var.m6885d0(1087778765);
                    ir1Var.m6912r(false);
                }
            }
            Object objM6869O4 = ir1Var.m6869O();
            if (objM6869O4 == obj3) {
                C1053q c1053q = new C1053q((byte) 25);
                c1053q.f28113b = od1Var;
                VarHandle.storeStoreFence();
                objM6869O4 = s94.m10566b(c1053q);
                ir1Var.m6905n0(objM6869O4);
            }
            if (((Boolean) ((xb4) objM6869O4).getValue()).booleanValue()) {
                ir1Var.m6885d0(1088105412);
                Object obj4 = (InterfaceC0755ia) ir1Var.m6898k(AbstractC1138sa.f30027b);
                if (obj == null && obj4 == null) {
                    ir1Var.m6885d0(1088403725);
                    ir1Var.m6912r(false);
                } else {
                    ir1Var.m6885d0(1088191344);
                    boolean zM6894i3 = ir1Var.m6894i(obj) | ir1Var.m6890g(obj4);
                    Object objM6869O5 = ir1Var.m6869O();
                    Object obj5 = objM6869O5;
                    if (zM6894i3 || objM6869O5 == obj3) {
                        na1 na1Var = new na1((byte) 1);
                        na1Var.f25595b = obj;
                        na1Var.f25596c = obj4;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(na1Var);
                        obj5 = na1Var;
                    }
                    lb5.m7923d(ju4Var, (yp1) obj5, ir1Var);
                    ir1Var.m6912r(false);
                }
                pg0Var.invoke(ir1Var, Integer.valueOf((i2 >> 9) & 14));
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6885d0(1088421581);
                ir1Var.m6912r(false);
            }
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ne0 ne0Var = new ne0((byte) 28);
            ne0Var.f25728b = od1Var;
            ne0Var.f25729c = c1349xz;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ne0Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9497b(C0950nl c0950nl, C1349xz c1349xz, cp1 cp1Var, sp1 sp1Var, qe3 qe3Var, wp1 wp1Var, mi0 mi0Var, int i) {
        pg0 pg0Var = zy5.f36476e;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1856303576);
        int i2 = i | (ir1Var.m6890g(c0950nl) ? 4 : 2) | (ir1Var.m6890g(c1349xz) ? 32 : 16) | (ir1Var.m6890g(cp1Var) ? 256 : 128) | (ir1Var.m6890g(sp1Var) ? 2048 : 1024) | (ir1Var.m6890g(qe3Var) ? 16384 : 8192) | (ir1Var.m6894i(pg0Var) ? 1048576 : 524288);
        byte b = 0;
        byte b2 = 1;
        if (ir1Var.m6871T(i2 & 1, (599187 & i2) != 599186)) {
            Object objM6869O = ir1Var.m6869O();
            if (objM6869O == ki0.f23136a) {
                objM6869O = new dh0((byte) 23);
                ir1Var.m6905n0(objM6869O);
            }
            cv0.m4169a((yp1) objM6869O, ir1Var, 6);
            jd1 jd1Var = new jd1(b);
            jd1Var.f22175d = cp1Var;
            jd1Var.f22174c = c1349xz;
            jd1Var.f22177f = qe3Var;
            jd1Var.f22178g = wp1Var;
            jd1Var.f22173b = c0950nl;
            jd1Var.f22176e = sp1Var;
            VarHandle.storeStoreFence();
            la1.m7885a(vd6.m11834R(292528249, jd1Var, ir1Var), ir1Var, 6);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            jd1 jd1Var2 = new jd1(b2);
            jd1Var2.f22173b = c0950nl;
            jd1Var2.f22174c = c1349xz;
            jd1Var2.f22175d = cp1Var;
            jd1Var2.f22176e = sp1Var;
            jd1Var2.f22177f = qe3Var;
            jd1Var2.f22178g = wp1Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = jd1Var2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9498c(hd1 hd1Var, mq1 mq1Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1788849351);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ir1Var.m6890g(hd1Var) : ir1Var.m6894i(hd1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(mq1Var) ? 32 : 16;
        }
        if (ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            dc0 dc0Var = hd1Var.f20484b;
            ne0 ne0Var = new ne0((byte) 27);
            ne0Var.f25728b = hd1Var;
            ne0Var.f25729c = mq1Var;
            VarHandle.storeStoreFence();
            AbstractC1410zm.m13637a(dc0Var, null, null, null, null, vd6.m11834R(2090541951, ne0Var, ir1Var), ir1Var, 196608);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            mg0 mg0Var = new mg0((byte) 3);
            mg0Var.f24879c = hd1Var;
            mg0Var.f24880d = mq1Var;
            mg0Var.f24878b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = mg0Var;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final xh3 m9499d() {
        return (xh3) f27530b.m9574l(null, f27529a[0]);
    }
}
