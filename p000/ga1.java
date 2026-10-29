package p000;

import essentials.app.EsActivity;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ga1 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f19684a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f19685b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f19686c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f19687d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f19688e;

    public /* synthetic */ ga1(byte b) {
        this.f19684a = b;
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
    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        mv1 mv1Var;
        Object obj5;
        Object obj6;
        Object obj7;
        byte b = this.f19684a;
        i50 i50Var = ki0.f23136a;
        ju4 ju4Var = ju4.f22634a;
        byte b2 = 0;
        byte b3 = 1;
        switch (b) {
            case 0:
                EsActivity esActivity = (EsActivity) this.f19686c;
                int i = this.f19687d;
                EsActivity.C0624a c0624a = (EsActivity.C0624a) this.f19688e;
                mw3 mw3Var = c0624a.f18449c;
                boolean z = this.f19685b;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = EsActivity.f18447A;
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    Boolean boolValueOf = Boolean.valueOf(i25.m6629y(ir1Var));
                    boolean zM6894i = ir1Var.m6894i(esActivity);
                    Object objM6869O = ir1Var.m6869O();
                    if (zM6894i || objM6869O == i50Var) {
                        obj3 = objM6869O;
                        ha1 ha1Var = new ha1(b2);
                        ha1Var.f20458b = esActivity;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(ha1Var);
                        obj3 = ha1Var;
                    }
                    lb5.m7932m(boolValueOf, (wp1) obj3, ir1Var);
                    mv1 mv1Var2 = null;
                    xj3 xj3Var = new xj3(esActivity.f14447a.f26811i, null);
                    sw2 sw2VarM10028l = qq2.m10028l(xj3Var, xj3Var.getValue(), ir1Var, 0, 0);
                    xz4 xz4Var = (xz4) ir1Var.m6898k(la1.f23888a);
                    if (((fk2) sw2VarM10028l.getValue()).m5728a(fk2.f19058e)) {
                        ir1Var.m6885d0(-783632732);
                        wv1.f33759b.m12424k(6, ir1Var);
                        boolean zM6890g = ir1Var.m6890g(xz4Var) | ir1Var.m6894i(esActivity) | ir1Var.m6886e(i);
                        Object objM6869O2 = ir1Var.m6869O();
                        if (zM6890g || objM6869O2 == i50Var) {
                            obj5 = objM6869O2;
                            ia1 ia1Var = new ia1(b2);
                            ia1Var.f21200c = xz4Var;
                            ia1Var.f21199b = esActivity;
                            ia1Var.f21201d = i;
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(ia1Var);
                            obj5 = ia1Var;
                        }
                        lb5.m7923d(xz4Var, (yp1) obj5, ir1Var);
                        ir1Var.m6912r(false);
                    } else {
                        ir1Var.m6885d0(-783256020);
                        ir1Var.m6912r(false);
                    }
                    zh3 zh3VarMo7523a = qw3.m10146b().mo7523a(mw3Var);
                    zh3 zh3VarMo7523a2 = st4.m10911a().mo7523a(mw3Var);
                    zh3 zh3VarMo7523a3 = ou3.f27125a.mo7523a(c0624a.f18448b);
                    xh3 xh3Var = ij0.f21477l;
                    lv1 lv1Var = (lv1) ir1Var.m6898k(nv1.f26110a);
                    if (lv1Var != null) {
                        mv1Var = new mv1(b2);
                        mv1Var.f25230b = lv1Var;
                        VarHandle.storeStoreFence();
                    }
                    if (mv1Var2 == null) {
                        mv1Var2 = mv1Var;
                        ir1Var.m6885d0(1360216797);
                        obj4 = (fv1) ir1Var.m6898k(xh3Var);
                    } else {
                        mv1Var2 = mv1Var;
                        ir1Var.m6885d0(1360214503);
                        obj4 = mv1Var2;
                    }
                    ir1Var.m6912r(false);
                    zh3[] zh3VarArr = {zh3VarMo7523a, zh3VarMo7523a2, zh3VarMo7523a3, xh3Var.mo7523a(obj4)};
                    ga1 ga1Var = new ga1(b3);
                    ga1Var.f19688e = xz4Var;
                    ga1Var.f19685b = z;
                    ga1Var.f19686c = esActivity;
                    ga1Var.f19687d = i;
                    VarHandle.storeStoreFence();
                    as4.m3245d(zh3VarArr, vd6.m11834R(1978420566, ga1Var, ir1Var), ir1Var, 48);
                }
                break;
            case 1:
                xz4 xz4Var2 = (xz4) this.f19688e;
                boolean z2 = this.f19685b;
                EsActivity esActivity2 = (EsActivity) this.f19686c;
                int i3 = this.f19687d;
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i4 = EsActivity.f18447A;
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ir1Var2.m6874W();
                    break;
                } else {
                    w94 w94Var = xz4Var2.f34750e;
                    ArrayList arrayList = new ArrayList();
                    ListIterator listIterator = w94Var.listIterator();
                    while (true) {
                        ow1 ow1Var = (ow1) listIterator;
                        if (!ow1Var.hasNext()) {
                            if (z2) {
                                ir1Var2.m6885d0(-708801349);
                                boolean zM6894i2 = ir1Var2.m6894i(esActivity2) | ir1Var2.m6890g(xz4Var2) | ir1Var2.m6886e(i3);
                                Object objM6869O3 = ir1Var2.m6869O();
                                if (zM6894i2 || objM6869O3 == i50Var) {
                                    obj6 = objM6869O3;
                                    ia1 ia1Var2 = new ia1(b3);
                                    ia1Var2.f21199b = esActivity2;
                                    ia1Var2.f21200c = xz4Var2;
                                    ia1Var2.f21201d = i3;
                                    VarHandle.storeStoreFence();
                                    ir1Var2.m6905n0(ia1Var2);
                                    obj6 = ia1Var2;
                                }
                                lb5.m7923d(ju4Var, (yp1) obj6, ir1Var2);
                                if (arrayList.isEmpty()) {
                                    ir1Var2.m6885d0(-708386507);
                                    boolean zM6894i3 = ir1Var2.m6894i(esActivity2);
                                    Object objM6869O4 = ir1Var2.m6869O();
                                    if (zM6894i3 || objM6869O4 == i50Var) {
                                        obj7 = objM6869O4;
                                        ha1 ha1Var2 = new ha1(b3);
                                        ha1Var2.f20458b = esActivity2;
                                        VarHandle.storeStoreFence();
                                        ir1Var2.m6905n0(ha1Var2);
                                        obj7 = ha1Var2;
                                    }
                                    lb5.m7932m(ju4Var, (wp1) obj7, ir1Var2);
                                    ir1Var2.m6912r(false);
                                } else {
                                    ir1Var2.m6885d0(-708333652);
                                    ir1Var2.m6912r(false);
                                }
                                ir1Var2.m6912r(false);
                            } else {
                                ir1Var2.m6885d0(-708323732);
                                ir1Var2.m6912r(false);
                            }
                            if (!z2) {
                                ir1Var2.m6885d0(-707992063);
                                ne0 ne0Var = new ne0((byte) 24);
                                ne0Var.f25728b = arrayList;
                                ne0Var.f25729c = xz4Var2;
                                VarHandle.storeStoreFence();
                                kf4.m7511a(null, null, 0L, 0L, 0.0f, vd6.m11834R(-190235383, ne0Var, ir1Var2), ir1Var2, 12582912, 127);
                                ir1Var2.m6912r(false);
                            } else {
                                ir1Var2.m6885d0(-707943827);
                                EsActivity.m5323k(arrayList, xz4Var2, ir1Var2);
                                ir1Var2.m6912r(false);
                            }
                            break;
                        } else {
                            Object next = ow1Var.next();
                            if (((wz4) next).f33880a == i3) {
                                arrayList.add(next);
                            }
                        }
                    }
                }
                break;
            case 2:
                nt2 nt2Var = (nt2) this.f19686c;
                mq1 mq1Var = (mq1) this.f19688e;
                int i5 = this.f19687d;
                boolean z3 = this.f19685b;
                ((Integer) obj2).getClass();
                ae4.m2948a(nt2Var, mq1Var, (mi0) obj, vd6.m11838V(i5 | 1), z3 ? 1 : 0);
                break;
            default:
                boolean z4 = this.f19685b;
                oo3 oo3Var = (oo3) this.f19686c;
                pk4 pk4Var = (pk4) this.f19688e;
                int i6 = this.f19687d;
                ((Integer) obj2).getClass();
                y70.m13023c(z4, oo3Var, pk4Var, (mi0) obj, vd6.m11838V(i6 | 1));
                break;
        }
        return ju4Var;
    }
}
