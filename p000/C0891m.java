package p000;

import ads_mobile_sdk.b63;
import ads_mobile_sdk.n13;
import ads_mobile_sdk.sy3;
import ads_mobile_sdk.v03;
import android.content.Context;
import android.os.Handler;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: renamed from: m */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0891m implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24489a;

    public /* synthetic */ C0891m(byte b) {
        this.f24489a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f24489a;
        byte b2 = 0;
        wm0 wm0Var = null;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                kz3 kz3Var = (kz3) obj;
                kz3Var.m7753a(null, oh6.f26713G);
                C0861l6 c0861l6 = (C0861l6) kz3Var.f23637a.f32595b.mo2998b(AbstractC0935n6.f25472a);
                if (((Boolean) c0861l6.f23814c.getValue()).booleanValue()) {
                    C0928n c0928n = new C0928n(b2);
                    c0928n.f25353b = c0861l6;
                    VarHandle.storeStoreFence();
                    kz3Var.m7753a(null, new pg0(654566621, true, c0928n));
                }
                return ju4Var;
            case 1:
                kz3 kz3Var2 = (kz3) obj;
                kz3Var2.m7753a(null, oh6.f26750x);
                kz3Var2.m7753a(null, oh6.f26708B);
                return ju4Var;
            case 2:
                tc3 tc3Var = (tc3) obj;
                if (tc3Var != null && tc3Var.f31073a == 2) {
                    b2 = 1;
                }
                return Boolean.valueOf(b2 ^ 1);
            case 3:
                return ju4Var;
            case 4:
                return ju4Var;
            case 5:
                C1060q6 c1060q6 = (C1060q6) obj;
                InterfaceC1309ww interfaceC1309ww = c1060q6.f28232a;
                c1060q6.f28232a = null;
                c1060q6.removeAllViews();
                if (interfaceC1309ww == null) {
                    c1060q6.m9743a();
                } else {
                    c1060q6.f28234c = null;
                }
                c1060q6.m9744b();
                if (interfaceC1309ww != null) {
                    n13 n13Var = ((b63) interfaceC1309ww).f1023e;
                    sy3.m2303a(n13Var.f3749b, (t82) null, new v03(n13Var, wm0Var, b2), 3);
                }
                return ju4Var;
            case 6:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            case 7:
                return Boolean.TRUE;
            case 8:
                ((Integer) obj).getClass();
                return Float.valueOf(Float.NaN);
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.TRUE;
            case 11:
                return Boolean.valueOf(zt5.m13757B((i14) obj));
            case 12:
                return (yb3) obj;
            case 13:
                aj0 aj0Var = (aj0) obj;
                aj0Var.mo2998b(AndroidCompositionLocals_androidKt.f14650a);
                return ((Context) aj0Var.mo2998b(AndroidCompositionLocals_androidKt.f14651b)).getResources();
            case 14:
                return Boolean.valueOf(zt5.m13757B((i14) obj));
            case 15:
                ((Long) obj).getClass();
                return ju4Var;
            case 16:
                ic2[] ic2VarArr = o14.f26289a;
                ((q14) obj).mo4898a(m14.f24575x, ju4Var);
                return ju4Var;
            case 17:
                ((Long) obj).getClass();
                return ju4Var;
            case 18:
                return ju4Var;
            case 19:
                AbstractC0492bi abstractC0492bi = (AbstractC0492bi) obj;
                Handler handler = abstractC0492bi.getHandler();
                C1293wh c1293wh = abstractC0492bi.f15301r;
                RunnableC0683gc runnableC0683gc = new RunnableC0683gc((byte) 2);
                runnableC0683gc.f19736b = c1293wh;
                VarHandle.storeStoreFence();
                handler.post(runnableC0683gc);
                return ju4Var;
            case 20:
                return ju4Var;
            case 21:
                return ju4Var;
            case 22:
                return ju4Var;
            case 23:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 24:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 25:
                return Boolean.valueOf(!(((InterfaceC0728hk) obj) instanceof r73));
            case 26:
                o14.m8925f((q14) obj);
                return ju4Var;
            case 27:
                return v71.f32439a;
            default:
                f12 f12Var = (f12) obj;
                int i = uw4.f32218a;
                v71 v71Var = v71.f32439a;
                f12Var.m5447a("", 0.0f, 0.0f, 0.0f, 0.35f, 0.35f, 0.5f, 8.5f, v71Var);
                List listM11675a = uw4.m11675a("M15.5417,1.66669C15.1833,1.66669,14.8417,1.76669,14.5333,1.94169L3.21667,8.74169C2.775,9.00002,2.5,9.48335,2.5,10C2.5,10.5167,2.775,11,3.21667,11.2584L14.5333,18.05C14.8417,18.2334,15.1833,18.325,15.5417,18.325C16.625,18.325,17.5,17.45,17.5,16.3667V3.62502C17.5,2.54169,16.625,1.66669,15.5417,1.66669Z");
                long j = pb0.f27497d;
                f12.m5445c(f12Var, listM11675a, new ga4(j), 0.0f, 0.0f, 0, 0.0f, 16374);
                f12Var.m5450f();
                f12Var.m5447a("", 0.0f, 0.0f, 0.0f, 0.35f, 0.35f, 8.5f, 8.5f, v71Var);
                f12.m5445c(f12Var, uw4.m11675a("M10.0001,18.3334C5.40008,18.3334,1.66675,14.6,1.66675,10C1.66675,5.40002,5.40008,1.66669,10.0001,1.66669C14.6001,1.66669,18.3334,5.40002,18.3334,10C18.3334,14.6,14.6001,18.3334,10.0001,18.3334Z"), new ga4(j), 0.0f, 0.0f, 0, 0.0f, 16374);
                f12Var.m5450f();
                f12Var.m5447a("", 0.0f, 0.0f, 0.0f, 0.35f, 0.35f, 16.5f, 8.5f, v71Var);
                f12.m5445c(f12Var, uw4.m11675a("M4.47634,2.5H15.5241C16.6164,2.5,17.5002,3.38382,17.5002,4.4761V15.5239C17.5002,16.6162,16.6164,17.5,15.5241,17.5H4.47634C3.38407,17.5,2.50024,16.6162,2.50024,15.5239V4.4761C2.50024,3.38382,3.38407,2.5,4.47634,2.5Z"), new ga4(j), 0.0f, 0.0f, 0, 0.0f, 16374);
                f12Var.m5450f();
                return ju4Var;
        }
    }
}
