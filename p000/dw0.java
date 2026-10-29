package p000;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dw0 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f17453a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ew0 f17454b;

    public /* synthetic */ dw0(byte b) {
        this.f17453a = b;
    }

    /* JADX INFO: renamed from: a */
    private final Object m4772a() {
        String string;
        ew0 ew0Var = this.f17454b;
        synchronized (ew0Var) {
            try {
                zv1 zv1Var = (zv1) ew0Var.f18532a.get();
                ArrayList arrayListM13804a = zv1Var.m13804a();
                synchronized (zv1Var) {
                    e82 e82Var = zv1Var.f36410a;
                    b71 b71Var = new b71((byte) 9);
                    b71Var.f15141b = zv1Var;
                    VarHandle.storeStoreFence();
                    e82Var.getClass();
                }
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < arrayListM13804a.size(); i++) {
                    C0664fu c0664fu = (C0664fu) arrayListM13804a.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", c0664fu.f19283a);
                    jSONObject.put("dates", new JSONArray((Collection) c0664fu.f19284b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return string;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        switch (this.f17453a) {
            case 0:
                return m4772a();
            default:
                ew0 ew0Var = this.f17454b;
                synchronized (ew0Var) {
                    zv1 zv1Var = (zv1) ew0Var.f18532a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    fx0 fx0Var = (fx0) ew0Var.f18534c.get();
                    js1 js1Var = fx0Var.f19372b;
                    synchronized (((HashSet) js1Var.f22555a)) {
                        setUnmodifiableSet = Collections.unmodifiableSet((HashSet) js1Var.f22555a);
                        break;
                    }
                    boolean zIsEmpty = setUnmodifiableSet.isEmpty();
                    String string = fx0Var.f19371a;
                    if (!zIsEmpty) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        sb.append(' ');
                        synchronized (((HashSet) js1Var.f22555a)) {
                            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) js1Var.f22555a);
                            break;
                        }
                        sb.append(fx0.m5841a(setUnmodifiableSet2));
                        string = sb.toString();
                    }
                    zv1Var.m13805d(string, jCurrentTimeMillis);
                }
                return null;
        }
    }
}
