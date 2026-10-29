package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uq0 {

    /* JADX INFO: renamed from: f */
    public static final HashMap f32087f;

    /* JADX INFO: renamed from: g */
    public static final String f32088g;

    /* JADX INFO: renamed from: a */
    public Context f32089a;

    /* JADX INFO: renamed from: b */
    public q02 f32090b;

    /* JADX INFO: renamed from: c */
    public C1372yl f32091c;

    /* JADX INFO: renamed from: d */
    public ys2 f32092d;

    /* JADX INFO: renamed from: e */
    public C1372yl f32093e;

    static {
        HashMap map = new HashMap();
        f32087f = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f32088g = "Crashlytics Android SDK/19.4.4";
    }

    /* JADX INFO: renamed from: c */
    public static C0625et m11603c(C1283w7 c1283w7, int i) {
        String str = (String) c1283w7.f33128d;
        String str2 = (String) c1283w7.f33127c;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c1283w7.f33129e;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C1283w7 c1283w8 = (C1283w7) c1283w7.f33126b;
        if (i >= 8) {
            C1283w7 c1283w9 = c1283w8;
            while (c1283w9 != null) {
                c1283w9 = (C1283w7) c1283w9.f33126b;
                i2++;
            }
        }
        C0586dt c0586dt = new C0586dt();
        c0586dt.f17337a = str;
        c0586dt.f17338b = str2;
        List listM11604d = m11604d(stackTraceElementArr, 4);
        if (listM11604d == null) {
            xy4.m12782k("Null frames");
            return null;
        }
        c0586dt.f17339c = listM11604d;
        c0586dt.f17341e = i2;
        c0586dt.f17342f = (byte) (c0586dt.f17342f | 1);
        if (c1283w8 != null && i2 == 0) {
            c0586dt.f17340d = m11603c(c1283w8, i + 1);
        }
        return c0586dt.m4678a();
    }

    /* JADX INFO: renamed from: d */
    public static List m11604d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            C0847kt c0847kt = new C0847kt();
            c0847kt.f23411e = i;
            c0847kt.f23412f = (byte) (c0847kt.f23412f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            c0847kt.f23407a = jMax;
            byte b = (byte) (c0847kt.f23412f | 1);
            c0847kt.f23408b = str;
            c0847kt.f23409c = fileName;
            c0847kt.f23410d = lineNumber;
            c0847kt.f23412f = (byte) (b | 2);
            arrayList.add(c0847kt.m7627a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final List m11605a() {
        C0503bt c0503bt = new C0503bt();
        c0503bt.f15559a = 0L;
        byte b = (byte) (c0503bt.f15563e | 1);
        c0503bt.f15560b = 0L;
        c0503bt.f15563e = (byte) (b | 2);
        C1372yl c1372yl = this.f32091c;
        String str = (String) c1372yl.f35307d;
        if (str == null) {
            xy4.m12782k("Null name");
            return null;
        }
        c0503bt.f15561c = str;
        c0503bt.f15562d = (String) c1372yl.f35305b;
        return Collections.singletonList(c0503bt.m3667a());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7  */
    /* JADX INFO: renamed from: b */
    public final C1046pt m11606b(int i) {
        boolean z;
        Float fValueOf;
        int i2;
        long j;
        Context context = this.f32089a;
        boolean z2 = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                z = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    if (intExtra2 != -1 && intExtra3 != -1) {
                        fValueOf = Float.valueOf(intExtra2 / intExtra3);
                    }
                } catch (IllegalStateException e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                }
                Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
                if (z || fValueOf == null) {
                    i2 = 1;
                } else {
                    i2 = ((double) fValueOf.floatValue()) < 0.99d ? 2 : 3;
                }
                if (!se0.m10697J() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                    z2 = true;
                }
                long jM10728j = se0.m10728j(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j = jM10728j - memoryInfo.availMem;
                if (j <= 0) {
                    j = 0;
                }
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                long blockSize = statFs.getBlockSize();
                long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
                C1009ot c1009ot = new C1009ot();
                c1009ot.f27066a = dValueOf;
                c1009ot.f27067b = i2;
                byte b = (byte) (c1009ot.f27072g | 1);
                c1009ot.f27068c = z2;
                c1009ot.f27069d = i;
                c1009ot.f27070e = j;
                c1009ot.f27071f = blockCount;
                c1009ot.f27072g = (byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16);
                return c1009ot.m9262a();
            }
            z = false;
        } catch (IllegalStateException e2) {
            e = e2;
            z = false;
        }
        fValueOf = null;
        if (fValueOf != null) {
        }
        if (z) {
            i2 = 1;
        } else {
            i2 = 1;
        }
        if (!se0.m10697J()) {
            z2 = true;
        }
        long jM10728j2 = se0.m10728j(context);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
        j = jM10728j2 - memoryInfo2.availMem;
        if (j <= 0) {
            j = 0;
        }
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize2 = statFs2.getBlockSize();
        long blockCount2 = (((long) statFs2.getBlockCount()) * blockSize2) - (blockSize2 * ((long) statFs2.getAvailableBlocks()));
        C1009ot c1009ot2 = new C1009ot();
        c1009ot2.f27066a = dValueOf;
        c1009ot2.f27067b = i2;
        byte b2 = (byte) (c1009ot2.f27072g | 1);
        c1009ot2.f27068c = z2;
        c1009ot2.f27069d = i;
        c1009ot2.f27070e = j;
        c1009ot2.f27071f = blockCount2;
        c1009ot2.f27072g = (byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16);
        return c1009ot2.m9262a();
    }
}
