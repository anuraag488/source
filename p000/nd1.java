package p000;

import android.content.Context;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nd1 implements mq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ qe3 f25703a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ hd1 f25704b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ mq1 f25705c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ od1 f25706d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ C1349xz f25707e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ C0950nl f25708f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ sw2 f25709g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ sw2 f25710h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ sw2 f25711i;

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
        ir1 ir1Var;
        Object obj3;
        boolean z;
        Object obj4;
        boolean zBooleanValue;
        qe3 qe3Var = this.f25703a;
        hd1 hd1Var = this.f25704b;
        mq1 mq1Var = this.f25705c;
        od1 od1Var = this.f25706d;
        C1349xz c1349xz = this.f25707e;
        C0950nl c0950nl = this.f25708f;
        sw2 sw2Var = this.f25709g;
        sw2 sw2Var2 = this.f25710h;
        sw2 sw2Var3 = this.f25711i;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var2 = (ir1) mi0Var;
        boolean zM6871T = ir1Var2.m6871T(iIntValue & 1, (iIntValue & 3) != 2);
        ju4 ju4Var = ju4.f22634a;
        if (!zM6871T) {
            ir1Var2.m6874W();
            return ju4Var;
        }
        Boolean boolMo9873f = qe3Var.mo9873f();
        Boolean bool = Boolean.FALSE;
        boolean zM13387o = z62.m13387o(boolMo9873f, bool);
        i50 i50Var = ki0.f23136a;
        if (zM13387o) {
            ir1Var2.m6885d0(1804585000);
            hd1 hd1Var2 = ((od1) ir1Var2.m6898k(pd1.m9499d())).f26636a;
            Object objM6869O = ir1Var2.m6869O();
            if (objM6869O == i50Var) {
                objM6869O = new fj0((byte) 11);
                ir1Var2.m6905n0(objM6869O);
            }
            wp1 wp1Var = (wp1) objM6869O;
            Object objM6869O2 = ir1Var2.m6869O();
            if (objM6869O2 == i50Var) {
                objM6869O2 = C0971o5.f26343f;
                ir1Var2.m6905n0(objM6869O2);
            }
            Object objM5367q0 = ev0.m5367q0("navbar_trial_mode", true, (wp1) objM6869O2, wp1Var, ir1Var2, 3504);
            ir1 ir1Var3 = ir1Var2;
            sw2Var.setValue((xp4) objM5367q0);
            ir1Var3.m6912r(false);
            ir1Var = ir1Var3;
        } else {
            ir1 ir1Var4 = ir1Var2;
            ir1Var4.m6885d0(1804764707);
            ir1Var4.m6912r(false);
            ir1Var = ir1Var4;
        }
        xp4 xp4Var = (xp4) sw2Var.getValue();
        Boolean boolValueOf = Boolean.valueOf(qe3Var.mo9870c());
        Boolean boolValueOf2 = Boolean.valueOf(qe3Var.mo9868a());
        boolean zM6890g = ir1Var.m6890g(qe3Var);
        Object objM6869O3 = ir1Var.m6869O();
        if (zM6890g || objM6869O3 == i50Var) {
            C0675g4 c0675g4 = new C0675g4((byte) 26);
            c0675g4.f19600b = qe3Var;
            c0675g4.f19601c = sw2Var;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(c0675g4);
            obj3 = c0675g4;
        } else {
            obj3 = objM6869O3;
        }
        wp1 wp1Var2 = (wp1) obj3;
        if (ir1Var.m6890g(boolValueOf2) | ir1Var.m6890g(xp4Var) | ir1Var.m6890g(boolValueOf)) {
            lb5.m7914W(ir1Var, wp1Var2);
        }
        if (((xp4) sw2Var.getValue()) == xp4.f34521b) {
            ir1Var.m6885d0(1805043924);
            if (z62.m13387o(qe3Var.mo9873f(), bool)) {
                ir1Var.m6885d0(1805100127);
                ir1Var.m6885d0(1903884007);
                if (((Boolean) ir1Var.m6898k(pd1.f27531c)).booleanValue()) {
                    ir1Var.m6912r(false);
                    zBooleanValue = false;
                    z = false;
                } else {
                    xz4 xz4Var = (xz4) ir1Var.m6898k(la1.f23888a);
                    Object objM6869O4 = ir1Var.m6869O();
                    if (objM6869O4 == i50Var) {
                        objM6869O4 = k43.m7398w(Boolean.valueOf(xz4Var.m12798a() != null));
                        ir1Var.m6905n0(objM6869O4);
                    }
                    sw2 sw2Var4 = (sw2) objM6869O4;
                    od1 od1Var2 = (od1) ir1Var.m6898k(pd1.m9499d());
                    Context context = (Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b);
                    g12 g12Var = (g12) o02.f26260q.getValue();
                    boolean zM6894i = ir1Var.m6894i(context);
                    Object objM6869O5 = ir1Var.m6869O();
                    Object obj5 = objM6869O5;
                    if (zM6894i || objM6869O5 == i50Var) {
                        C1317x3 c1317x3 = new C1317x3((byte) 1);
                        c1317x3.f33950b = context;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c1317x3);
                        obj5 = c1317x3;
                    }
                    z93 z93VarM154a = aa3.m154a("Display over other apps", "", g12Var, (wp1) obj5, new n14((byte) 8), ir1Var);
                    C1354y3 c1354y3 = (C1354y3) ir1Var.m6898k(AbstractC0637f4.f18723a);
                    gr1 gr1VarM4685N = dt0.m4685N(ir1Var);
                    boolean zM6886e = ir1Var.m6886e(90) | ir1Var.m6890g(xz4Var) | ir1Var.m6890g(od1Var2) | ir1Var.m6890g(c1354y3) | ir1Var.m6890g(z93VarM154a) | ir1Var.m6894i(gr1VarM4685N);
                    Object objM6869O6 = ir1Var.m6869O();
                    if (zM6886e || objM6869O6 == i50Var) {
                        objM6869O6 = new C0934n5(xz4Var, od1Var2, c1354y3, z93VarM154a, gr1VarM4685N, sw2Var4, (wm0) null);
                        ir1Var.m6905n0(objM6869O6);
                    }
                    lb5.m7926g(ir1Var, (mq1) objM6869O6, ju4Var);
                    zBooleanValue = ((Boolean) sw2Var4.getValue()).booleanValue();
                    z = false;
                    ir1Var.m6912r(false);
                }
                sw2Var2.setValue(Boolean.valueOf(zBooleanValue));
                ir1Var.m6912r(z);
            } else {
                ir1Var.m6885d0(1805173411);
                Object objM6869O7 = ir1Var.m6869O();
                if (objM6869O7 == i50Var) {
                    obj4 = objM6869O7;
                    C0725hh c0725hh = new C0725hh((byte) 5);
                    c0725hh.f20571b = sw2Var2;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0725hh);
                    obj4 = c0725hh;
                }
                obj4 = objM6869O7;
                lb5.m7932m(ju4Var, (wp1) obj4, ir1Var);
                z = false;
                ir1Var.m6912r(false);
            }
            ir1Var.m6912r(z);
        } else {
            z = false;
            ir1Var.m6885d0(1805242851);
            ir1Var.m6912r(false);
        }
        pg0 pg0Var = zy5.f36482k;
        ir1Var.m6885d0(-1327238898);
        pg0Var.invoke(mq1Var, ir1Var, 0);
        ir1Var.m6912r(z);
        ir1Var.m6885d0(-1327239381);
        ir1Var.m6912r(z);
        pd1.m9496a(od1Var, c1349xz, ir1Var, 384);
        cp1 cp1Var = hd1Var.f20487e;
        sp1 sp1Var = (sp1) sw2Var3.getValue();
        Object objM6869O8 = ir1Var.m6869O();
        Object obj6 = objM6869O8;
        if (objM6869O8 == i50Var) {
            C0725hh c0725hh2 = new C0725hh((byte) 6);
            c0725hh2.f20571b = sw2Var;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(c0725hh2);
            obj6 = c0725hh2;
        }
        int i = pe3.f27565d;
        pd1.m9497b(c0950nl, c1349xz, cp1Var, sp1Var, qe3Var, (wp1) obj6, ir1Var, 196608);
        return ju4Var;
    }
}
