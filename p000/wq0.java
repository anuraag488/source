package p000;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wq0 {

    /* JADX INFO: renamed from: e */
    public static final Charset f33599e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f */
    public static final byte f33600f = 15;

    /* JADX INFO: renamed from: g */
    public static final vq0 f33601g = new vq0();

    /* JADX INFO: renamed from: h */
    public static final C1254vf f33602h = new C1254vf(2);

    /* JADX INFO: renamed from: i */
    public static final ip0 f33603i = new ip0((byte) 2);

    /* JADX INFO: renamed from: a */
    public AtomicInteger f33604a;

    /* JADX INFO: renamed from: b */
    public if1 f33605b;

    /* JADX INFO: renamed from: c */
    public C1372yl f33606c;

    /* JADX INFO: renamed from: d */
    public kp0 f33607d;

    /* JADX INFO: renamed from: a */
    public static void m12369a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m12370e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f33599e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m12371f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f33599e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m12372b() {
        ArrayList arrayList = new ArrayList();
        if1 if1Var = this.f33605b;
        arrayList.addAll(if1.m6785f(((File) if1Var.f21329f).listFiles()));
        arrayList.addAll(if1.m6785f(((File) if1Var.f21330g).listFiles()));
        C1254vf c1254vf = f33602h;
        Collections.sort(arrayList, c1254vf);
        List listM6785f = if1.m6785f(((File) if1Var.f21328e).listFiles());
        Collections.sort(listM6785f, c1254vf);
        arrayList.addAll(listM6785f);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final NavigableSet m12373c() {
        return new TreeSet(if1.m6785f(((File) this.f33605b.f21327d).list())).descendingSet();
    }

    /* JADX INFO: renamed from: d */
    public final void m12374d(pq0 pq0Var, String str, boolean z) {
        if1 if1Var = this.f33605b;
        int i = this.f33606c.m13167e().f15796a.f35741a;
        f33601g.getClass();
        try {
            m12371f(if1Var.m6788c(str, zi4.m13621u("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f33604a.getAndIncrement())), z ? "_" : "")), vq0.f32797a.m12084h(pq0Var));
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e);
        }
        ip0 ip0Var = new ip0((byte) 3);
        if1Var.getClass();
        File file = new File((File) if1Var.f21327d, str);
        file.mkdirs();
        List<File> listM6785f = if1.m6785f(file.listFiles(ip0Var));
        Collections.sort(listM6785f, new C1254vf((byte) 3));
        int size = listM6785f.size();
        for (File file2 : listM6785f) {
            if (size <= i) {
                return;
            }
            if1.m6784e(file2);
            size--;
        }
    }
}
