package p000;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.lang.invoke.VarHandle;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ju5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22635a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C1372yl f22636b;

    public /* synthetic */ ju5(byte b) {
        this.f22635a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f22635a;
        C1372yl c1372yl = this.f22636b;
        switch (b) {
            case 0:
                c1372yl.getClass();
                ju5 ju5Var = new ju5((byte) 1);
                ju5Var.f22636b = c1372yl;
                VarHandle.storeStoreFence();
                ((Executor) c1372yl.f35307d).execute(ju5Var);
                break;
            default:
                JSONObject jSONObject = new JSONObject();
                Application application = (Application) c1372yl.f35304a;
                try {
                    jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
                    Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
                    String strConcat = null;
                    if (applicationIcon != null && applicationIcon.getIntrinsicWidth() > 0 && applicationIcon.getIntrinsicHeight() > 0) {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        applicationIcon.draw(canvas);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        strConcat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
                    }
                    jSONObject.put("app_icon", strConcat);
                    JSONObject jSONObject2 = new JSONObject();
                    mq5 mq5Var = (mq5) c1372yl.f35311h;
                    for (String str : mq5Var.m8377a().keySet()) {
                        jSONObject2.put(str, mq5Var.m8377a().get(str));
                    }
                    jSONObject.put("stored_infos_map", jSONObject2);
                    break;
                } catch (JSONException unused) {
                }
                ((ts5) c1372yl.f35310g).f31395h.m10444a("UMP_configureFormWithAppAssets", jSONObject.toString());
                break;
        }
    }
}
