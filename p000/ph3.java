package p000;

import java.lang.invoke.VarHandle;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ph3 {

    /* JADX INFO: renamed from: c */
    public static final ph3 f27607c;

    /* JADX INFO: renamed from: a */
    public ar3 f27608a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap f27609b;

    static {
        ph3 ph3Var = new ph3();
        ph3Var.f27609b = new ConcurrentHashMap();
        ls2 ls2Var = ar3.f14810h;
        try {
            ls2Var = (ls2) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
        }
        ls2[] ls2VarArr = {or1.f26991b, ls2Var};
        pp2 pp2Var = new pp2();
        pp2Var.f27885a = ls2VarArr;
        ar3 ar3Var = new ar3((byte) 3);
        Charset charset = k62.f22939a;
        ar3Var.f14813b = pp2Var;
        VarHandle.storeStoreFence();
        ph3Var.f27608a = ar3Var;
        VarHandle.storeStoreFence();
        f27607c = ph3Var;
    }

    /* JADX INFO: renamed from: a */
    public final fw3 m9531a(Class cls) {
        sc1 sc1Var;
        fw3 fw3VarM9639z;
        Class cls2;
        k62.m7408a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f27609b;
        fw3 fw3Var = (fw3) concurrentHashMap.get(cls);
        if (fw3Var != null) {
            return fw3Var;
        }
        ar3 ar3Var = this.f27608a;
        ar3Var.getClass();
        Class cls3 = jw3.f22700a;
        if (!tr1.class.isAssignableFrom(cls) && (cls2 = jw3.f22700a) != null && !cls2.isAssignableFrom(cls)) {
            C1077qn.m9987m("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        qj3 qj3VarMo8101a = ((pp2) ar3Var.f14813b).mo8101a(cls);
        if ((qj3VarMo8101a.f28529d & 2) == 2) {
            if (tr1.class.isAssignableFrom(cls)) {
                pu4 pu4Var = jw3.f22702c;
                sc1 sc1Var2 = tc1.f31068a;
                AbstractC1240v1 abstractC1240v1 = qj3VarMo8101a.f28526a;
                rs2 rs2Var = new rs2();
                rs2Var.f29579b = pu4Var;
                rs2Var.f29580c = sc1Var2;
                rs2Var.f29578a = abstractC1240v1;
                VarHandle.storeStoreFence();
                fw3VarM9639z = rs2Var;
            } else {
                pu4 pu4Var2 = jw3.f22701b;
                sc1 sc1Var3 = tc1.f31069b;
                if (sc1Var3 == null) {
                    C1077qn.m9989o("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                AbstractC1240v1 abstractC1240v2 = qj3VarMo8101a.f28526a;
                rs2 rs2Var2 = new rs2();
                rs2Var2.f29579b = pu4Var2;
                rs2Var2.f29580c = sc1Var3;
                rs2Var2.f29578a = abstractC1240v2;
                VarHandle.storeStoreFence();
                fw3VarM9639z = rs2Var2;
            }
        } else if (tr1.class.isAssignableFrom(cls)) {
            fw3VarM9639z = ps2.m9639z(qj3VarMo8101a, u03.f31579b, vl2.f32722b, jw3.f22702c, d55.m4376u(qj3VarMo8101a.m9893a()) != 1 ? tc1.f31068a : null, aq2.f14776b);
        } else {
            t03 t03Var = u03.f31578a;
            ul2 ul2Var = vl2.f32721a;
            pu4 pu4Var3 = jw3.f22701b;
            if (d55.m4376u(qj3VarMo8101a.m9893a()) != 1) {
                sc1 sc1Var4 = tc1.f31069b;
                if (sc1Var4 == null) {
                    C1077qn.m9989o("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                sc1Var = sc1Var4;
            } else {
                sc1Var = null;
            }
            fw3VarM9639z = ps2.m9639z(qj3VarMo8101a, t03Var, ul2Var, pu4Var3, sc1Var, aq2.f14775a);
        }
        fw3 fw3Var2 = (fw3) concurrentHashMap.putIfAbsent(cls, fw3VarM9639z);
        return fw3Var2 != null ? fw3Var2 : fw3VarM9639z;
    }
}
