package p000;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;

/* JADX INFO: renamed from: c5 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0515c5 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15806a;

    public /* synthetic */ C0515c5(byte b) {
        this.f15806a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        Choreographer choreographer;
        byte b = this.f15806a;
        ju4 ju4Var = ju4.f22634a;
        wm0 wm0Var = null;
        switch (b) {
            case 0:
                return Integer.valueOf(mj3.f24971a.m3408h(2147418112) + 65536);
            case 1:
                return EnumC1059q5.f28220a;
            case 2:
                AndroidCompositionLocals_androidKt.m3054a("LocalConfiguration");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.m3054a("LocalContext");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.m3054a("LocalImageVectorCache");
                throw null;
            case 5:
                AndroidCompositionLocals_androidKt.m3054a("LocalResourceIdCache");
                throw null;
            case 6:
                AndroidCompositionLocals_androidKt.m3054a("LocalView");
                throw null;
            case 7:
                return "DEFAULT_TEST_TAG";
            case 8:
                return UUID.randomUUID();
            case 9:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    pw0 pw0Var = l01.f23664a;
                    choreographer = (Choreographer) y70.m13014O(mp2.f25111a, new C0872lh(2, wm0Var, (byte) 0));
                }
                C0946nh c0946nh = new C0946nh(choreographer, Handler.createAsync(Looper.getMainLooper()));
                return qs5.m10089N(c0946nh, c0946nh.f25798k);
            case 10:
            case 11:
            case 12:
                return ju4Var;
            case 13:
                return new ho4(-3.4028235E38f, 0.0f, 0.0f);
            case 14:
                return Float.valueOf(1.0f);
            case 15:
                return v71.f32439a;
            case 16:
                return new C0534co(C1112rl.Companion.serializer());
            case 17:
                return null;
            case 18:
                return new ga4(zy5.m13869d(1308617531));
            case 19:
                throw new ClassCastException();
            case 20:
                return null;
            case 21:
                return new Intent("android.media.action.STILL_IMAGE_CAMERA_SECURE");
            case 22:
                return null;
            case 23:
                return k43.m7398w(null);
            case 24:
                return qq2.m10020d("https://play.google.com/store/apps/developer?id=Manuel+Wrage");
            case 25:
                return qq2.m10020d("https://play.google.com/store/account/subscriptions");
            case 26:
                return qq2.m10020d("https://www.reddit.com/r/manuelwrageapps");
            case 27:
                return qq2.m10020d("https://sites.google.com/view/ivianuu-privacy-policy");
            case 28:
                return qq2.m10020d("https://github.com/IVIanuu");
            default:
                return ju4Var;
        }
    }
}
