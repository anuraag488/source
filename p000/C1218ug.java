package p000;

import ads_mobile_sdk.C0079d3;
import ads_mobile_sdk.C0102ej;
import ads_mobile_sdk.C0248n7;
import ads_mobile_sdk.d50;
import ads_mobile_sdk.h32;
import ads_mobile_sdk.k32;
import ads_mobile_sdk.s41;
import ads_mobile_sdk.tq2;
import ads_mobile_sdk.v32;
import android.content.ContentResolver;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;

/* JADX INFO: renamed from: ug */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1218ug extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f31833t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f31834u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f31835v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f31836w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f31837x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f31838y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1218ug(Class cls, Method method, ContentResolver contentResolver, String str, Integer num, wm0 wm0Var) {
        super(2, wm0Var);
        this.f31833t = (byte) 0;
        this.f31834u = cls;
        this.f31835v = method;
        this.f31836w = contentResolver;
        this.f31837x = str;
        this.f31838y = num;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f31833t;
        Object obj2 = this.f31838y;
        Object obj3 = this.f31836w;
        Object obj4 = this.f31835v;
        Object obj5 = this.f31837x;
        switch (b) {
            case 0:
                return new C1218ug((Class) this.f31834u, (Method) obj4, (ContentResolver) obj3, (String) obj5, (Integer) obj2, wm0Var);
            case 1:
                C1218ug c1218ug = new C1218ug(obj4, obj3, obj5, obj2, wm0Var, (byte) 1);
                c1218ug.f31834u = obj;
                return c1218ug;
            case 2:
                C1218ug c1218ug2 = new C1218ug(obj4, obj3, obj5, obj2, wm0Var, (byte) 2);
                c1218ug2.f31834u = obj;
                return c1218ug2;
            case 3:
                return new C1218ug((s41) this.f31834u, wm0Var, (String) obj5, (String) obj4, (String) obj3, (String) obj2);
            case 4:
                C1218ug c1218ug3 = new C1218ug((tq2) obj2, (h32) obj3, (v32) obj4, (wa2) obj5, wm0Var);
                c1218ug3.f31834u = obj;
                return c1218ug3;
            default:
                return new C1218ug((s41) this.f31834u, (String) obj5, (UUID) obj4, (String) obj3, (String) obj2, wm0Var);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        byte b = this.f31833t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((C1218ug) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((C1218ug) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((C1218ug) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 3:
                ((C1218ug) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
                return ju4Var;
            case 4:
                return ((C1218ug) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                ((C1218ug) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
                return ju4Var;
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
        byte b = this.f31833t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f31838y;
        Object obj3 = this.f31836w;
        Object obj4 = this.f31835v;
        Object obj5 = this.f31837x;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                Method method = (Method) obj4;
                ContentResolver contentResolver = (ContentResolver) obj3;
                String str = (String) obj5;
                Integer num = (Integer) obj2;
                if (!((Class) this.f31834u).equals(String.class)) {
                    return method.invoke(null, contentResolver, str, num);
                }
                Object objInvoke = method.invoke(null, contentResolver, str);
                return objInvoke == null ? num : objInvoke;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                zo0 zo0Var = (zo0) this.f31834u;
                h30 h30Var = (h30) obj4;
                wm0 wm0Var = null;
                lb5.m7910S(zo0Var, null, null, new C0671g0(h30Var, (e13) obj3, (C0675g4) obj5, wm0Var, (byte) 11), 3);
                return lb5.m7910S(zo0Var, null, null, new C0594e0((Object) h30Var, obj2, wm0Var, (byte) 12), 3);
            case 2:
                zo0 zo0Var2 = (zo0) this.f31834u;
                ap0 ap0Var3 = ap0.f14763a;
                k43.m7376J(obj);
                wm0 wm0Var2 = null;
                lb5.m7910S(zo0Var2, null, null, new u10((C0910mi) obj4, wm0Var2, (byte) 1), 3);
                return lb5.m7910S(zo0Var2, null, null, new C1199ty((yp1) obj3, (xs1) obj5, (C0910mi) obj2, wm0Var2, (byte) 6), 3);
            case 3:
                ap0 ap0Var4 = ap0.f14763a;
                k43.m7376J(obj);
                ((s41) this.f31834u).loadDataWithBaseURL((String) obj5, (String) obj4, (String) obj3, (String) obj2, null);
                return ju4Var;
            case 4:
                ap0 ap0Var5 = ap0.f14763a;
                k43.m7376J(obj);
                zo0 zo0Var3 = (zo0) this.f31834u;
                v32 v32Var = (v32) obj4;
                ro0 ro0Var = v32Var.f12588b;
                h32 h32Var = (h32) obj3;
                wa2 wa2Var = (wa2) obj5;
                wm0 wm0Var3 = null;
                lb5.m7910S(zo0Var3, ro0Var, null, new k32(h32Var, v32Var, wa2Var, wm0Var3, (byte) 0), 2);
                lb5.m7910S(zo0Var3, ro0Var, null, new k32(h32Var, v32Var, wa2Var, wm0Var3, (byte) 1), 2);
                lb5.m7910S(zo0Var3, ro0Var, null, new k32(h32Var, v32Var, wa2Var, wm0Var3, (byte) 2), 2);
                lb5.m7910S(zo0Var3, ro0Var, null, new k32(h32Var, v32Var, wa2Var, wm0Var3, (byte) 3), 2);
                lb5.m7910S(zo0Var3, ro0Var, null, new d50((tq2) obj2, h32Var, v32Var, (wa2) obj5, null), 2);
                lb5.m7910S(zo0Var3, ro0Var, null, new C0079d3(h32Var, v32Var, wa2Var, (wm0) null), 2);
                lb5.m7910S(zo0Var3, ro0Var, null, new C0102ej((byte) 8, wm0Var3, h32Var, v32Var, wa2Var, false), 2);
                return lb5.m7910S(zo0Var3, ro0Var, null, new C0248n7((Object) wa2Var, (Object) h32Var, wm0Var3, (byte) 18), 2);
            default:
                ap0 ap0Var6 = ap0.f14763a;
                k43.m7376J(obj);
                s41 s41Var = (s41) this.f31834u;
                StringBuilder sb = new StringBuilder();
                sb.append((String) obj5);
                sb.append("({\"id\": \"");
                sb.append((UUID) obj4);
                sb.append("\", \"args\": ");
                sb.append((String) obj3);
                s41Var.evaluateJavascript(c75.m3881m(sb, ", \"use_javascript_interface\": \"", (String) obj2, "\"});"), null);
                return ju4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1218ug(Object obj, Object obj2, Object obj3, Object obj4, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f31833t = b;
        this.f31835v = obj;
        this.f31836w = obj2;
        this.f31837x = obj3;
        this.f31838y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1218ug(s41 s41Var, wm0 wm0Var, String str, String str2, String str3, String str4) {
        super(2, wm0Var);
        this.f31833t = (byte) 3;
        this.f31834u = s41Var;
        this.f31837x = str;
        this.f31835v = str2;
        this.f31836w = str3;
        this.f31838y = str4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1218ug(s41 s41Var, String str, UUID uuid, String str2, String str3, wm0 wm0Var) {
        super(2, wm0Var);
        this.f31833t = (byte) 5;
        this.f31834u = s41Var;
        this.f31837x = str;
        this.f31835v = uuid;
        this.f31836w = str2;
        this.f31838y = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1218ug(tq2 tq2Var, h32 h32Var, v32 v32Var, wa2 wa2Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f31833t = (byte) 4;
        this.f31835v = v32Var;
        this.f31836w = h32Var;
        this.f31837x = wa2Var;
        this.f31838y = tq2Var;
    }
}
