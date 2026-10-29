package p000;

import android.content.Context;
import android.media.session.PlaybackState;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kr2 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23351a;

    public /* synthetic */ kr2(byte b) {
        this.f23351a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) throws Throwable {
        byte b = this.f23351a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                PlaybackState playbackState = (PlaybackState) obj;
                return (playbackState == null || playbackState.getState() != 3) ? "Play" : "Pause";
            case 1:
                PlaybackState playbackState2 = (PlaybackState) obj;
                return (playbackState2 == null || playbackState2.getState() != 3) ? oh6.m9115u() : (g12) o02.f26262s.getValue();
            case 2:
                return "Skip next";
            case 3:
                return (g12) o02.f26237E.getValue();
            case 4:
                return "Skip previous";
            case 5:
                return (g12) o02.f26238F.getValue();
            case 6:
                n73 n73Var = (n73) obj;
                return d55.m4367l("[", n73Var.f25498b, ", ", n73Var.f25499c, ")");
            case 7:
                Map.Entry entry = (Map.Entry) obj;
                Object value = entry.getValue();
                return c75.m3879k("  ", ((xd3) entry.getKey()).f34170a, " = ", value instanceof byte[] ? AbstractC0990oo.m9211f0((byte[]) value, ", ", 56) : String.valueOf(entry.getValue()));
            case 8:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 9:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 10:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 11:
                return new C0874lj((wv3) obj);
            case 12:
                return ju4Var;
            case 13:
                kr3 kr3Var = (kr3) obj;
                return new ny2(kr3Var, kr3Var, kr3Var.f23352a, zc6.f35986d);
            case 14:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 15:
                return Integer.valueOf((-((Integer) obj).intValue()) / 2);
            case 16:
                g32 g32Var = ((v03) obj).f32288a;
                if (g32Var != null) {
                    g32Var.invoke();
                }
                return ju4Var;
            case 17:
                e13 e13Var = (e13) obj;
                wf2 wf2Var = e13Var.f17625u;
                try {
                    if (e13Var.mo3599F()) {
                        e13Var.m4850A1(true);
                        break;
                    }
                    return ju4Var;
                } catch (Throwable th) {
                    wf2Var.m12270a0(th);
                    throw null;
                }
            case 18:
                q63 q63Var = ((e13) obj).f17623V;
                if (q63Var != null) {
                    ((du1) q63Var).m4735c();
                }
                return ju4Var;
            case 19:
                ((Long) obj).getClass();
                return ju4Var;
            case 20:
                ((s90) obj).f29999b = v71.f32439a;
                return ju4Var;
            case 21:
                z23 z23Var = (z23) obj;
                if (z23Var.mo3599F()) {
                    z23Var.f35722a.mo4194P();
                }
                return ju4Var;
            case 22:
                aj0 aj0Var = (aj0) obj;
                int i = AbstractC1216ue.f31795a;
                Context context = (Context) aj0Var.mo2998b(AndroidCompositionLocals_androidKt.f14651b);
                ky0 ky0Var = (ky0) aj0Var.mo2998b(ij0.f21473h);
                l63 l63Var = (l63) aj0Var.mo2998b(m63.f24686a);
                if (l63Var == null) {
                    return null;
                }
                long j = l63Var.f23818a;
                g73 g73Var = l63Var.f23819b;
                C1327xd c1327xd = new C1327xd();
                c1327xd.f34162a = context;
                c1327xd.f34163b = ky0Var;
                c1327xd.f34164c = j;
                c1327xd.f34165d = g73Var;
                VarHandle.storeStoreFence();
                return c1327xd;
            case 23:
                wf2 wf2Var2 = (wf2) obj;
                if (wf2Var2.m12256J()) {
                    wf2.m12244V(wf2Var2, false, 7);
                }
                return ju4Var;
            case 24:
                wf2 wf2Var3 = (wf2) obj;
                if (wf2Var3.m12256J()) {
                    wf2.m12245X(wf2Var3, false, 7);
                }
                return ju4Var;
            case 25:
                wf2 wf2Var4 = (wf2) obj;
                if (wf2Var4.m12256J()) {
                    wf2Var4.m12254H();
                }
                return ju4Var;
            case 26:
                wf2 wf2Var5 = (wf2) obj;
                if (wf2Var5.m12256J()) {
                    wf2Var5.m12268W(false);
                }
                return ju4Var;
            case 27:
                wf2 wf2Var6 = (wf2) obj;
                if (wf2Var6.m12256J()) {
                    wf2Var6.m12268W(false);
                }
                return ju4Var;
            case 28:
                wf2 wf2Var7 = (wf2) obj;
                if (wf2Var7.m12256J()) {
                    wf2Var7.m12267U(false);
                }
                return ju4Var;
            default:
                wf2 wf2Var8 = (wf2) obj;
                if (wf2Var8.m12256J()) {
                    wf2Var8.m12267U(false);
                }
                return ju4Var;
        }
    }
}
