package p000;

import android.view.View;
import android.view.ViewParent;
import java.io.File;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dh0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f17045a;

    public /* synthetic */ dh0(byte b) {
        this.f17045a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f17045a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                vg2 vg2Var = (vg2) obj;
                oi2.m9121c(vg2Var, null, zy5.f36479h, 3);
                oi2.m9121c(vg2Var, null, zy5.f36481j, 3);
                return ju4Var;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                wx2.f33826f.setValue(bool);
                return ju4Var;
            case 2:
                oi2.m9121c((vg2) obj, null, zp0.f36241d, 3);
                return ju4Var;
            case 3:
                ((Long) obj).getClass();
                return ju4Var;
            case 4:
                bi0 bi0Var = (bi0) obj;
                wf2 wf2Var = bi0Var instanceof wf2 ? (wf2) bi0Var : null;
                if (wf2Var != null && wf2Var.f33310R) {
                    q32.m9721c("Apply is called on deactivated node " + bi0Var);
                }
                return ju4Var;
            case 5:
                return Boolean.valueOf(!(((lt2) obj) instanceof ji0));
            case 6:
                View view = ((ry4) ((aj0) obj).mo2998b(jx1.f22711a)).f29736a;
                while (view != null) {
                    Object tag = view.getTag(C0995R.id.view_tree_navigation_event_dispatcher_owner);
                    if (tag != null) {
                        return tag;
                    }
                    ViewParent viewParentM8506p = n40.m8506p(view);
                    view = viewParentM8506p instanceof View ? (View) viewParentM8506p : null;
                }
                return null;
            case 7:
                return (ym2) hb0.m6298J0((Iterable) ((aj0) obj).mo2998b(ij0.f21480o));
            case 8:
                return ju4Var;
            case 9:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                }
                return str + " : " + value;
            case 10:
                return Boolean.valueOf(i25.m6617k(obj));
            case 11:
                return Boolean.TRUE;
            case 12:
                return Double.valueOf(50.0d);
            case 13:
                return ju4Var;
            case 14:
                return Boolean.FALSE;
            case 15:
                return 0;
            case 16:
                return "[" + ((as0) obj) + ']';
            case 17:
                f12.m5445c((f12) obj, uw4.m11675a("M12,4L12,1L8,5l4,4L12,6c3.31,0,6,2.69,6,6c0,1.01,-0.25,1.97,-0.7,2.8l1.46,1.46C19.54,15.03,20,13.57,20,12c0,-4.42,-3.58,-8,-8,-8ZM12,18c-3.31,0,-6,-2.69,-6,-6c0,-1.01,0.25,-1.97,0.7,-2.8L5.24,7.74C4.46,8.97,4,10.43,4,12c0,4.42,3.58,8,8,8v3l4,-4l-4,-4v3Z"), new ga4(pb0.f27495b), 0.0f, 0.0f, 0, 0.0f, 16374);
                return ju4Var;
            case 18:
                f12.m5445c((f12) obj, uw4.m11675a("M14,12c0,-1.1,-0.9,-2,-2,-2s-2,0.9,-2,2s0.9,2,2,2s2,-0.9,2,-2ZM12,3c-4.97,0,-9,4.03,-9,9L0,12l4,4l4,-4L5,12c0,-3.87,3.13,-7,7,-7s7,3.13,7,7s-3.13,7,-7,7c-1.51,0,-2.91,-0.49,-4.06,-1.3l-1.42,1.44C8.04,20.3,9.94,21,12,21c4.97,0,9,-4.03,9,-9s-4.03,-9,-9,-9Z"), new ga4(pb0.f27495b), 0.0f, 0.0f, 0, 0.0f, 16374);
                return ju4Var;
            case 19:
                f12.m5445c((f12) obj, uw4.m11675a("M14.59,7.41L18.17,11H6v2h12.17l-3.59,3.59L16,18l6,-6l-6,-6L14.59,7.41ZM2,6v12h2V6H2Z"), new ga4(pb0.f27495b), 0.0f, 0.0f, 0, 0.0f, 16374);
                return ju4Var;
            case 20:
                f12.m5445c((f12) obj, uw4.m11675a("M21,10.12h-6.78l2.74,-2.82c-2.73,-2.7,-7.15,-2.8,-9.88,-0.1c-2.73,2.71,-2.73,7.08,0,9.79s7.15,2.71,9.88,0C18.32,15.65,19,14.08,19,12.1h2c0,1.98,-0.88,4.55,-2.64,6.29c-3.51,3.48,-9.21,3.48,-12.72,0c-3.5,-3.47,-3.53,-9.11,-0.02,-12.58s9.14,-3.47,12.65,0L21,3V10.12ZM12.5,8v4.25l3.5,2.08l-0.72,1.21L11,13V8H12.5Z"), new ga4(pb0.f27495b), 0.0f, 0.0f, 0, 0.0f, 16374);
                return ju4Var;
            case 21:
                f12.m5445c((f12) obj, uw4.m11675a("M19,6.41L17.59,5L12,10.59L6.41,5L5,6.41L10.59,12L5,17.59L6.41,19L12,13.41L17.59,19L19,17.59L13.41,12Z"), new ga4(pb0.f27495b), 0.0f, 0.0f, 0, 0.0f, 16374);
                return ju4Var;
            case 22:
                f12 f12Var = (f12) obj;
                List listM11675a = uw4.m11675a("M2,22l14,-5l-9,-9Z");
                long j = pb0.f27495b;
                f12.m5445c(f12Var, listM11675a, new ga4(j), 0.0f, 0.0f, 0, 0.0f, 16374);
                f12.m5445c(f12Var, uw4.m11675a("M14.53,12.53l5.59,-5.59c0.49,-0.49,1.28,-0.49,1.77,0l0.59,0.59l1.06,-1.06l-0.59,-0.59c-1.07,-1.07,-2.82,-1.07,-3.89,0l-5.59,5.59L14.53,12.53Z"), new ga4(j), 0.0f, 0.0f, 0, 0.0f, 16374);
                f12.m5445c(f12Var, uw4.m11675a("M10.06,6.88L9.47,7.47l1.06,1.06l0.59,-0.59c1.07,-1.07,1.07,-2.82,0,-3.89l-0.59,-0.59L9.47,4.53l0.59,0.59C10.54,5.6,10.54,6.4,10.06,6.88Z"), new ga4(j), 0.0f, 0.0f, 0, 0.0f, 16374);
                f12.m5445c(f12Var, uw4.m11675a("M17.06,11.88l-1.59,1.59l1.06,1.06l1.59,-1.59c0.49,-0.49,1.28,-0.49,1.77,0l1.61,1.61l1.06,-1.06l-1.61,-1.61C19.87,10.81,18.13,10.81,17.06,11.88Z"), new ga4(j), 0.0f, 0.0f, 0, 0.0f, 16374);
                f12.m5445c(f12Var, uw4.m11675a("M15.06,5.88l-3.59,3.59l1.06,1.06l3.59,-3.59c1.07,-1.07,1.07,-2.82,0,-3.89l-1.59,-1.59l-1.06,1.06l1.59,1.59C15.54,4.6,15.54,5.4,15.06,5.88Z"), new ga4(j), 0.0f, 0.0f, 0, 0.0f, 16374);
                return ju4Var;
            case 23:
                oi2.m9121c((vg2) obj, null, C0638f5.f18753g, 3);
                return ju4Var;
            case 24:
                ((File) obj).getCanonicalFile().getAbsolutePath();
                c74 c74Var = new c74();
                c74Var.f15860a = hx2.m6530a();
                c74Var.f15861b = new js1((byte) 6);
                c74Var.f15862c = qq2.m10032p(new C0872lh(2, 0 == true ? 1 : 0, (byte) 6));
                VarHandle.storeStoreFence();
                return c74Var;
            case 25:
                ((cl1) obj).mo4040c(false);
                return ju4Var;
            case 26:
                return obj;
            case 27:
                return ju4Var;
            case 28:
                return ju4Var;
            default:
                return ju4Var;
        }
    }
}
