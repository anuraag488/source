package p000;

import android.app.BroadcastOptions;
import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qm6 implements oc6 {

    /* JADX INFO: renamed from: K */
    public static volatile qm6 f28580K;

    /* JADX INFO: renamed from: A */
    public long f28581A;

    /* JADX INFO: renamed from: B */
    public final HashMap f28582B;

    /* JADX INFO: renamed from: C */
    public final HashMap f28583C;

    /* JADX INFO: renamed from: D */
    public final HashMap f28584D;

    /* JADX INFO: renamed from: F */
    public eh6 f28586F;

    /* JADX INFO: renamed from: G */
    public String f28587G;

    /* JADX INFO: renamed from: H */
    public kk6 f28588H;

    /* JADX INFO: renamed from: I */
    public long f28589I;

    /* JADX INFO: renamed from: J */
    public final bt5 f28590J;

    /* JADX INFO: renamed from: a */
    public final n96 f28591a;

    /* JADX INFO: renamed from: b */
    public final q76 f28592b;

    /* JADX INFO: renamed from: c */
    public ar5 f28593c;

    /* JADX INFO: renamed from: d */
    public e86 f28594d;

    /* JADX INFO: renamed from: e */
    public fl6 f28595e;

    /* JADX INFO: renamed from: f */
    public vn5 f28596f;

    /* JADX INFO: renamed from: g */
    public final q76 f28597g;

    /* JADX INFO: renamed from: h */
    public q76 f28598h;

    /* JADX INFO: renamed from: i */
    public rj6 f28599i;

    /* JADX INFO: renamed from: j */
    public final vl6 f28600j;

    /* JADX INFO: renamed from: k */
    public y86 f28601k;

    /* JADX INFO: renamed from: l */
    public final oa6 f28602l;

    /* JADX INFO: renamed from: n */
    public boolean f28604n;

    /* JADX INFO: renamed from: o */
    public long f28605o;

    /* JADX INFO: renamed from: p */
    public ArrayList f28606p;

    /* JADX INFO: renamed from: r */
    public int f28608r;

    /* JADX INFO: renamed from: s */
    public int f28609s;

    /* JADX INFO: renamed from: t */
    public boolean f28610t;

    /* JADX INFO: renamed from: u */
    public boolean f28611u;

    /* JADX INFO: renamed from: v */
    public boolean f28612v;

    /* JADX INFO: renamed from: w */
    public FileLock f28613w;

    /* JADX INFO: renamed from: x */
    public FileChannel f28614x;

    /* JADX INFO: renamed from: y */
    public ArrayList f28615y;

    /* JADX INFO: renamed from: z */
    public ArrayList f28616z;

    /* JADX INFO: renamed from: m */
    public final AtomicBoolean f28603m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q */
    public final LinkedList f28607q = new LinkedList();

    /* JADX INFO: renamed from: E */
    public final HashMap f28585E = new HashMap();

    public qm6(y63 y63Var) {
        bt5 bt5Var = new bt5((byte) 15);
        bt5Var.f15596b = this;
        VarHandle.storeStoreFence();
        this.f28590J = bt5Var;
        oa6 oa6VarM9017q = oa6.m9017q(y63Var.f34949a, null, null);
        this.f28602l = oa6VarM9017q;
        this.f28581A = -1L;
        vl6 vl6Var = new vl6(oa6VarM9017q);
        vl6Var.f19870f = this;
        VarHandle.storeStoreFence();
        this.f28600j = vl6Var;
        q76 q76Var = new q76(this, (byte) 2);
        q76Var.m10369v();
        this.f28597g = q76Var;
        q76 q76Var2 = new q76(this, (byte) 0);
        q76Var2.m10369v();
        this.f28592b = q76Var2;
        n96 n96Var = new n96(this);
        n96Var.f25581h = new C0805jo(0);
        n96Var.f25582i = new C0805jo(0);
        n96Var.f25583j = new C0805jo(0);
        n96Var.f25584k = new C0805jo(0);
        n96Var.f25585l = new C0805jo(0);
        n96Var.f25589p = new C0805jo(0);
        n96Var.f25590q = new C0805jo(0);
        n96Var.f25580L = new C0805jo(0);
        n96Var.f25586m = new C0805jo(0);
        n96Var.f25587n = new uk3(n96Var);
        bt5 bt5Var2 = new bt5((byte) 10);
        bt5Var2.f15596b = n96Var;
        VarHandle.storeStoreFence();
        n96Var.f25588o = bt5Var2;
        VarHandle.storeStoreFence();
        n96Var.m10369v();
        this.f28591a = n96Var;
        this.f28582B = new HashMap();
        this.f28583C = new HashMap();
        this.f28584D = new HashMap();
        ea6 ea6VarMo9020c = mo9020c();
        fk6 fk6Var = new fk6((byte) 1);
        fk6Var.f19064b = this;
        VarHandle.storeStoreFence();
        ea6VarMo9020c.m5033D(fk6Var);
    }

    /* JADX INFO: renamed from: B */
    public static qm6 m9920B(Service service) {
        y42.m12854a0(service.getApplicationContext());
        if (f28580K == null) {
            synchronized (qm6.class) {
                try {
                    if (f28580K == null) {
                        y63 y63Var = new y63();
                        Context applicationContext = service.getApplicationContext();
                        y42.m12854a0(applicationContext);
                        y63Var.f34949a = applicationContext;
                        VarHandle.storeStoreFence();
                        f28580K = new qm6(y63Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f28580K;
    }

    /* JADX INFO: renamed from: C */
    public static final void m9921C(l96 l96Var, String str) {
        List listM7876h = l96Var.m7876h();
        for (int i = 0; i < listM7876h.size(); i++) {
            if (str.equals(((x96) listM7876h.get(i)).m12547p())) {
                l96Var.m11054c();
                ((m96) l96Var.f31181b).m8239D(i);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public static String m9922K(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public static final boolean m9923Q(cp6 cp6Var) {
        return !TextUtils.isEmpty(cp6Var.f16350e);
    }

    /* JADX INFO: renamed from: R */
    public static final void m9924R(qa6 qa6Var) {
        qa6Var.m11054c();
        ((ua6) qa6Var.f31181b).m11464g0(Long.MAX_VALUE);
        qa6Var.m11054c();
        ((ua6) qa6Var.f31181b).m11467h0(Long.MIN_VALUE);
        for (int i = 0; i < qa6Var.m9832V(); i++) {
            m96 m96VarM11426S1 = ((ua6) qa6Var.f31181b).m11426S1(i);
            if (m96VarM11426S1.m8249t() < ((ua6) qa6Var.f31181b).m11445Z1()) {
                long jM8249t = m96VarM11426S1.m8249t();
                qa6Var.m11054c();
                ((ua6) qa6Var.f31181b).m11464g0(jM8249t);
            }
            if (m96VarM11426S1.m8249t() > ((ua6) qa6Var.f31181b).m11451b2()) {
                long jM8249t2 = m96VarM11426S1.m8249t();
                qa6Var.m11054c();
                ((ua6) qa6Var.f31181b).m11467h0(jM8249t2);
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public static final void m9925S(rl6 rl6Var) {
        if (rl6Var == null) {
            C1077qn.m9989o("Upload Component not created");
        } else {
            if (rl6Var.f29401g) {
                return;
            }
            C1077qn.m9989o("Component not initialized: ".concat(String.valueOf(rl6Var.getClass())));
        }
    }

    /* JADX INFO: renamed from: T */
    public static final Boolean m9926T(cp6 cp6Var) {
        Boolean bool = cp6Var.f16364s;
        String str = cp6Var.f16346F;
        if (!TextUtils.isEmpty(str)) {
            int iOrdinal = ((rc6) bt5.m3674g(str).f15596b).ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m9927c0(l96 l96Var, int i, String str) {
        List listM7876h = l96Var.m7876h();
        for (int i2 = 0; i2 < listM7876h.size(); i2++) {
            if ("_err".equals(((x96) listM7876h.get(i2)).m12547p())) {
                return;
            }
        }
        u96 u96VarM12535A = x96.m12535A();
        u96VarM12535A.m11305h("_err");
        u96VarM12535A.m11307j(i);
        x96 x96Var = (x96) u96VarM12535A.m11056e();
        u96 u96VarM12535A2 = x96.m12535A();
        u96VarM12535A2.m11305h("_ev");
        u96VarM12535A2.m11306i(str);
        x96 x96Var2 = (x96) u96VarM12535A2.m11056e();
        l96Var.m7878j(x96Var);
        l96Var.m7878j(x96Var2);
    }

    /* JADX INFO: renamed from: A */
    public final void m9928A() {
        mo9020c().mo5038t();
        m9962k0();
        if (this.f28604n) {
            return;
        }
        this.f28604n = true;
        mo9020c().mo5038t();
        FileLock fileLock = this.f28613w;
        oa6 oa6Var = this.f28602l;
        if (fileLock == null || !fileLock.isValid()) {
            op5 op5Var = ((oa6) this.f28593c.f36084a).f26512d;
            File filesDir = oa6Var.f26509a.getFilesDir();
            int i = ku5.f23526b;
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
                this.f28614x = channel;
                FileLock fileLockTryLock = channel.tryLock();
                this.f28613w = fileLockTryLock;
                if (fileLockTryLock == null) {
                    mo9019b().f16835j.m12504a("Storage concurrent data access panic");
                    return;
                }
                mo9019b().f16831L.m12504a("Storage concurrent access okay");
            } catch (FileNotFoundException e) {
                mo9019b().f16835j.m12505b(e, "Failed to acquire storage lock");
                return;
            } catch (IOException e2) {
                mo9019b().f16835j.m12505b(e2, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e3) {
                mo9019b().f16838m.m12505b(e3, "Storage lock already acquired");
                return;
            }
        } else {
            mo9019b().f16831L.m12504a("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.f28614x;
        mo9020c().mo5038t();
        int i2 = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            mo9019b().f16835j.m12504a("Bad channel to read from");
        } else {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int i3 = fileChannel.read(byteBufferAllocate);
                if (i3 == 4) {
                    byteBufferAllocate.flip();
                    i2 = byteBufferAllocate.getInt();
                } else if (i3 != -1) {
                    mo9019b().f16838m.m12505b(Integer.valueOf(i3), "Unexpected data length. Bytes read");
                }
            } catch (IOException e4) {
                mo9019b().f16835j.m12505b(e4, "Failed to read from channel");
            }
        }
        e66 e66VarM9029p = oa6Var.m9029p();
        e66VarM9029p.m9741u();
        int i4 = e66VarM9029p.f17852i;
        mo9020c().mo5038t();
        if (i2 > i4) {
            mo9019b().f16835j.m12506c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i2), Integer.valueOf(i4));
            return;
        }
        if (i2 < i4) {
            FileChannel fileChannel2 = this.f28614x;
            mo9020c().mo5038t();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                mo9019b().f16835j.m12504a("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                byteBufferAllocate2.putInt(i4);
                byteBufferAllocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(byteBufferAllocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        mo9019b().f16835j.m12505b(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    mo9019b().f16831L.m12506c("Storage version upgraded. Previous, current version", Integer.valueOf(i2), Integer.valueOf(i4));
                    return;
                } catch (IOException e5) {
                    mo9019b().f16835j.m12505b(e5, "Failed to write to channel");
                }
            }
            mo9019b().f16835j.m12506c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i2), Integer.valueOf(i4));
        }
    }

    /* JADX INFO: renamed from: D */
    public final int m9929D(String str, w42 w42Var) throws Throwable {
        rc6 rc6VarM8652y;
        n96 n96Var = this.f28591a;
        a66 a66VarM8651P = n96Var.m8651P(str);
        vc6 vc6Var = vc6.AD_PERSONALIZATION;
        if (a66VarM8651P == null) {
            w42Var.m12095z(vc6Var, sp5.FAILSAFE);
            return 1;
        }
        ar5 ar5Var = this.f28593c;
        m9925S(ar5Var);
        z76 z76VarM3212y0 = ar5Var.m3212y0(str);
        if (z76VarM3212y0 == null || ((rc6) bt5.m3674g(z76VarM3212y0.m13438s()).f15596b) != rc6.POLICY || (rc6VarM8652y = n96Var.m8652y(str, vc6Var)) == rc6.UNINITIALIZED) {
            w42Var.m12095z(vc6Var, sp5.REMOTE_DEFAULT);
            if (n96Var.m8650O(str, vc6Var)) {
                return 0;
            }
        } else {
            w42Var.m12095z(vc6Var, sp5.REMOTE_ENFORCED_DEFAULT);
            if (rc6VarM8652y == rc6.GRANTED) {
                return 0;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: E */
    public final HashMap m9930E(m96 m96Var) {
        Serializable serializableM9766J;
        HashMap map = new HashMap();
        m9958i0();
        HashMap map2 = new HashMap();
        for (x96 x96Var : m96Var.m8244o()) {
            if (x96Var.m12547p().startsWith("gad_") && (serializableM9766J = q76.m9766J(x96Var)) != null) {
                map2.put(x96Var.m12547p(), serializableM9766J);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    /* JADX INFO: renamed from: F */
    public final void m9931F() {
        mo9020c().mo5038t();
        if (this.f28607q.isEmpty()) {
            return;
        }
        kk6 kk6Var = this.f28588H;
        byte b = 2;
        if (kk6Var == null) {
            kk6 kk6Var2 = new kk6(this, this.f28602l, b);
            this.f28588H = kk6Var2;
            kk6Var = kk6Var2;
        }
        if (kk6Var.f21720c != 0) {
            return;
        }
        mo9022e().getClass();
        long jMax = Math.max(0L, ((long) ((Integer) e56.f17720B0.m4379a(null)).intValue()) - (SystemClock.elapsedRealtime() - this.f28589I));
        mo9019b().f16831L.m12505b(Long.valueOf(jMax), "Scheduling notify next app runnable, delay in ms");
        kk6 kk6Var3 = this.f28588H;
        if (kk6Var3 == null) {
            kk6 kk6Var4 = new kk6(this, this.f28602l, b);
            this.f28588H = kk6Var4;
            kk6Var3 = kk6Var4;
        }
        kk6Var3.m6923b(jMax);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03b1 A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00da, B:20:0x00f3, B:22:0x00fd, B:206:0x06bb, B:27:0x012d, B:30:0x013f, B:32:0x0145, B:47:0x0189, B:49:0x019b, B:52:0x01c0, B:54:0x01ca, B:56:0x01da, B:58:0x01e8, B:60:0x01f8, B:61:0x0203, B:62:0x0206, B:64:0x021c, B:115:0x0420, B:116:0x042c, B:119:0x0436, B:125:0x0459, B:122:0x0448, B:147:0x04e1, B:149:0x04ed, B:152:0x04fe, B:154:0x050f, B:156:0x051b, B:173:0x0581, B:175:0x058b, B:176:0x0597, B:178:0x05a1, B:180:0x05b1, B:182:0x05bb, B:183:0x05ce, B:185:0x05d4, B:186:0x05ed, B:188:0x05f3, B:189:0x0611, B:190:0x061f, B:194:0x0646, B:191:0x0625, B:193:0x0631, B:195:0x064d, B:196:0x066a, B:198:0x0670, B:200:0x0683, B:201:0x0690, B:203:0x0697, B:205:0x06a5, B:161:0x0533, B:163:0x0541, B:166:0x0554, B:168:0x0565, B:170:0x0571, B:129:0x0461, B:131:0x046d, B:133:0x0479, B:146:0x04c4, B:138:0x049c, B:141:0x04ae, B:143:0x04b4, B:145:0x04be, B:72:0x0246, B:75:0x0254, B:77:0x0262, B:81:0x02b7, B:78:0x0286, B:80:0x0296, B:85:0x02c4, B:87:0x02ea, B:88:0x030e, B:90:0x0345, B:92:0x034b, B:95:0x0357, B:97:0x038c, B:98:0x03a7, B:100:0x03b1, B:102:0x03bf, B:106:0x03d3, B:103:0x03c7, B:109:0x03da, B:112:0x03e8, B:113:0x0407, B:36:0x014f, B:38:0x015c, B:40:0x016a, B:42:0x0170, B:46:0x017b, B:209:0x06d3, B:211:0x06e5, B:213:0x06ee, B:224:0x071f, B:214:0x06f6, B:216:0x06ff, B:218:0x0705, B:221:0x0711, B:223:0x0719, B:225:0x0722, B:226:0x072e, B:229:0x0736, B:231:0x0748, B:232:0x0753, B:234:0x075b, B:238:0x0788, B:240:0x07a4, B:242:0x07b7, B:244:0x07d3, B:246:0x07e6, B:248:0x0833, B:250:0x0839, B:256:0x0864, B:258:0x086c, B:259:0x088a, B:261:0x0890, B:262:0x08a4, B:264:0x08bb, B:266:0x08cc, B:268:0x08de, B:271:0x08e9, B:273:0x08ef, B:274:0x0905, B:276:0x090b, B:278:0x091b, B:280:0x0937, B:283:0x0953, B:285:0x097a, B:305:0x0ac0, B:308:0x0ad0, B:286:0x0993, B:288:0x09a7, B:290:0x09c4, B:292:0x09eb, B:294:0x0a1b, B:295:0x0a28, B:297:0x0a3e, B:299:0x0a5b, B:301:0x0a82, B:303:0x0ab2, B:309:0x0ad8, B:311:0x0b35, B:312:0x0b48, B:315:0x0b50, B:318:0x0b6f, B:320:0x0b88, B:322:0x0b9d, B:324:0x0ba2, B:326:0x0ba6, B:328:0x0baa, B:330:0x0bb4, B:332:0x0bbd, B:334:0x0bc1, B:336:0x0bc7, B:338:0x0bd2, B:340:0x0be0, B:407:0x0e3c, B:342:0x0be8, B:344:0x0c04, B:349:0x0c1f, B:351:0x0c40, B:352:0x0c48, B:354:0x0c4e, B:356:0x0c60, B:362:0x0c76, B:364:0x0c8c, B:365:0x0cad, B:367:0x0cb9, B:369:0x0ccf, B:370:0x0d0d, B:376:0x0d29, B:378:0x0d34, B:380:0x0d38, B:382:0x0d3c, B:384:0x0d40, B:385:0x0d4c, B:386:0x0d51, B:388:0x0d57, B:390:0x0d6d, B:391:0x0d72, B:406:0x0e39, B:393:0x0db1, B:395:0x0db5, B:399:0x0dc9, B:401:0x0de5, B:402:0x0dec, B:405:0x0e2d, B:396:0x0dba, B:347:0x0c0a, B:408:0x0e40, B:410:0x0e4a, B:411:0x0e5e, B:412:0x0e66, B:414:0x0e6c, B:415:0x0e80, B:417:0x0e92, B:437:0x0f3f, B:439:0x0f45, B:441:0x0f5a, B:444:0x0f61, B:449:0x0fa2, B:445:0x0f70, B:447:0x0f7e, B:448:0x0f8b, B:450:0x0fb1, B:418:0x0eab, B:420:0x0eb1, B:422:0x0ec1, B:424:0x0ec8, B:430:0x0ede, B:432:0x0ee5, B:434:0x0f30, B:436:0x0f37, B:435:0x0f34, B:431:0x0ee2, B:423:0x0ec5, B:251:0x0849, B:253:0x084f, B:255:0x0855, B:245:0x07e3, B:241:0x07b4, B:235:0x0761, B:237:0x0767, B:451:0x0fcc), top: B:457:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x03bf A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00da, B:20:0x00f3, B:22:0x00fd, B:206:0x06bb, B:27:0x012d, B:30:0x013f, B:32:0x0145, B:47:0x0189, B:49:0x019b, B:52:0x01c0, B:54:0x01ca, B:56:0x01da, B:58:0x01e8, B:60:0x01f8, B:61:0x0203, B:62:0x0206, B:64:0x021c, B:115:0x0420, B:116:0x042c, B:119:0x0436, B:125:0x0459, B:122:0x0448, B:147:0x04e1, B:149:0x04ed, B:152:0x04fe, B:154:0x050f, B:156:0x051b, B:173:0x0581, B:175:0x058b, B:176:0x0597, B:178:0x05a1, B:180:0x05b1, B:182:0x05bb, B:183:0x05ce, B:185:0x05d4, B:186:0x05ed, B:188:0x05f3, B:189:0x0611, B:190:0x061f, B:194:0x0646, B:191:0x0625, B:193:0x0631, B:195:0x064d, B:196:0x066a, B:198:0x0670, B:200:0x0683, B:201:0x0690, B:203:0x0697, B:205:0x06a5, B:161:0x0533, B:163:0x0541, B:166:0x0554, B:168:0x0565, B:170:0x0571, B:129:0x0461, B:131:0x046d, B:133:0x0479, B:146:0x04c4, B:138:0x049c, B:141:0x04ae, B:143:0x04b4, B:145:0x04be, B:72:0x0246, B:75:0x0254, B:77:0x0262, B:81:0x02b7, B:78:0x0286, B:80:0x0296, B:85:0x02c4, B:87:0x02ea, B:88:0x030e, B:90:0x0345, B:92:0x034b, B:95:0x0357, B:97:0x038c, B:98:0x03a7, B:100:0x03b1, B:102:0x03bf, B:106:0x03d3, B:103:0x03c7, B:109:0x03da, B:112:0x03e8, B:113:0x0407, B:36:0x014f, B:38:0x015c, B:40:0x016a, B:42:0x0170, B:46:0x017b, B:209:0x06d3, B:211:0x06e5, B:213:0x06ee, B:224:0x071f, B:214:0x06f6, B:216:0x06ff, B:218:0x0705, B:221:0x0711, B:223:0x0719, B:225:0x0722, B:226:0x072e, B:229:0x0736, B:231:0x0748, B:232:0x0753, B:234:0x075b, B:238:0x0788, B:240:0x07a4, B:242:0x07b7, B:244:0x07d3, B:246:0x07e6, B:248:0x0833, B:250:0x0839, B:256:0x0864, B:258:0x086c, B:259:0x088a, B:261:0x0890, B:262:0x08a4, B:264:0x08bb, B:266:0x08cc, B:268:0x08de, B:271:0x08e9, B:273:0x08ef, B:274:0x0905, B:276:0x090b, B:278:0x091b, B:280:0x0937, B:283:0x0953, B:285:0x097a, B:305:0x0ac0, B:308:0x0ad0, B:286:0x0993, B:288:0x09a7, B:290:0x09c4, B:292:0x09eb, B:294:0x0a1b, B:295:0x0a28, B:297:0x0a3e, B:299:0x0a5b, B:301:0x0a82, B:303:0x0ab2, B:309:0x0ad8, B:311:0x0b35, B:312:0x0b48, B:315:0x0b50, B:318:0x0b6f, B:320:0x0b88, B:322:0x0b9d, B:324:0x0ba2, B:326:0x0ba6, B:328:0x0baa, B:330:0x0bb4, B:332:0x0bbd, B:334:0x0bc1, B:336:0x0bc7, B:338:0x0bd2, B:340:0x0be0, B:407:0x0e3c, B:342:0x0be8, B:344:0x0c04, B:349:0x0c1f, B:351:0x0c40, B:352:0x0c48, B:354:0x0c4e, B:356:0x0c60, B:362:0x0c76, B:364:0x0c8c, B:365:0x0cad, B:367:0x0cb9, B:369:0x0ccf, B:370:0x0d0d, B:376:0x0d29, B:378:0x0d34, B:380:0x0d38, B:382:0x0d3c, B:384:0x0d40, B:385:0x0d4c, B:386:0x0d51, B:388:0x0d57, B:390:0x0d6d, B:391:0x0d72, B:406:0x0e39, B:393:0x0db1, B:395:0x0db5, B:399:0x0dc9, B:401:0x0de5, B:402:0x0dec, B:405:0x0e2d, B:396:0x0dba, B:347:0x0c0a, B:408:0x0e40, B:410:0x0e4a, B:411:0x0e5e, B:412:0x0e66, B:414:0x0e6c, B:415:0x0e80, B:417:0x0e92, B:437:0x0f3f, B:439:0x0f45, B:441:0x0f5a, B:444:0x0f61, B:449:0x0fa2, B:445:0x0f70, B:447:0x0f7e, B:448:0x0f8b, B:450:0x0fb1, B:418:0x0eab, B:420:0x0eb1, B:422:0x0ec1, B:424:0x0ec8, B:430:0x0ede, B:432:0x0ee5, B:434:0x0f30, B:436:0x0f37, B:435:0x0f34, B:431:0x0ee2, B:423:0x0ec5, B:251:0x0849, B:253:0x084f, B:255:0x0855, B:245:0x07e3, B:241:0x07b4, B:235:0x0761, B:237:0x0767, B:451:0x0fcc), top: B:457:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x03c7 A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00da, B:20:0x00f3, B:22:0x00fd, B:206:0x06bb, B:27:0x012d, B:30:0x013f, B:32:0x0145, B:47:0x0189, B:49:0x019b, B:52:0x01c0, B:54:0x01ca, B:56:0x01da, B:58:0x01e8, B:60:0x01f8, B:61:0x0203, B:62:0x0206, B:64:0x021c, B:115:0x0420, B:116:0x042c, B:119:0x0436, B:125:0x0459, B:122:0x0448, B:147:0x04e1, B:149:0x04ed, B:152:0x04fe, B:154:0x050f, B:156:0x051b, B:173:0x0581, B:175:0x058b, B:176:0x0597, B:178:0x05a1, B:180:0x05b1, B:182:0x05bb, B:183:0x05ce, B:185:0x05d4, B:186:0x05ed, B:188:0x05f3, B:189:0x0611, B:190:0x061f, B:194:0x0646, B:191:0x0625, B:193:0x0631, B:195:0x064d, B:196:0x066a, B:198:0x0670, B:200:0x0683, B:201:0x0690, B:203:0x0697, B:205:0x06a5, B:161:0x0533, B:163:0x0541, B:166:0x0554, B:168:0x0565, B:170:0x0571, B:129:0x0461, B:131:0x046d, B:133:0x0479, B:146:0x04c4, B:138:0x049c, B:141:0x04ae, B:143:0x04b4, B:145:0x04be, B:72:0x0246, B:75:0x0254, B:77:0x0262, B:81:0x02b7, B:78:0x0286, B:80:0x0296, B:85:0x02c4, B:87:0x02ea, B:88:0x030e, B:90:0x0345, B:92:0x034b, B:95:0x0357, B:97:0x038c, B:98:0x03a7, B:100:0x03b1, B:102:0x03bf, B:106:0x03d3, B:103:0x03c7, B:109:0x03da, B:112:0x03e8, B:113:0x0407, B:36:0x014f, B:38:0x015c, B:40:0x016a, B:42:0x0170, B:46:0x017b, B:209:0x06d3, B:211:0x06e5, B:213:0x06ee, B:224:0x071f, B:214:0x06f6, B:216:0x06ff, B:218:0x0705, B:221:0x0711, B:223:0x0719, B:225:0x0722, B:226:0x072e, B:229:0x0736, B:231:0x0748, B:232:0x0753, B:234:0x075b, B:238:0x0788, B:240:0x07a4, B:242:0x07b7, B:244:0x07d3, B:246:0x07e6, B:248:0x0833, B:250:0x0839, B:256:0x0864, B:258:0x086c, B:259:0x088a, B:261:0x0890, B:262:0x08a4, B:264:0x08bb, B:266:0x08cc, B:268:0x08de, B:271:0x08e9, B:273:0x08ef, B:274:0x0905, B:276:0x090b, B:278:0x091b, B:280:0x0937, B:283:0x0953, B:285:0x097a, B:305:0x0ac0, B:308:0x0ad0, B:286:0x0993, B:288:0x09a7, B:290:0x09c4, B:292:0x09eb, B:294:0x0a1b, B:295:0x0a28, B:297:0x0a3e, B:299:0x0a5b, B:301:0x0a82, B:303:0x0ab2, B:309:0x0ad8, B:311:0x0b35, B:312:0x0b48, B:315:0x0b50, B:318:0x0b6f, B:320:0x0b88, B:322:0x0b9d, B:324:0x0ba2, B:326:0x0ba6, B:328:0x0baa, B:330:0x0bb4, B:332:0x0bbd, B:334:0x0bc1, B:336:0x0bc7, B:338:0x0bd2, B:340:0x0be0, B:407:0x0e3c, B:342:0x0be8, B:344:0x0c04, B:349:0x0c1f, B:351:0x0c40, B:352:0x0c48, B:354:0x0c4e, B:356:0x0c60, B:362:0x0c76, B:364:0x0c8c, B:365:0x0cad, B:367:0x0cb9, B:369:0x0ccf, B:370:0x0d0d, B:376:0x0d29, B:378:0x0d34, B:380:0x0d38, B:382:0x0d3c, B:384:0x0d40, B:385:0x0d4c, B:386:0x0d51, B:388:0x0d57, B:390:0x0d6d, B:391:0x0d72, B:406:0x0e39, B:393:0x0db1, B:395:0x0db5, B:399:0x0dc9, B:401:0x0de5, B:402:0x0dec, B:405:0x0e2d, B:396:0x0dba, B:347:0x0c0a, B:408:0x0e40, B:410:0x0e4a, B:411:0x0e5e, B:412:0x0e66, B:414:0x0e6c, B:415:0x0e80, B:417:0x0e92, B:437:0x0f3f, B:439:0x0f45, B:441:0x0f5a, B:444:0x0f61, B:449:0x0fa2, B:445:0x0f70, B:447:0x0f7e, B:448:0x0f8b, B:450:0x0fb1, B:418:0x0eab, B:420:0x0eb1, B:422:0x0ec1, B:424:0x0ec8, B:430:0x0ede, B:432:0x0ee5, B:434:0x0f30, B:436:0x0f37, B:435:0x0f34, B:431:0x0ee2, B:423:0x0ec5, B:251:0x0849, B:253:0x084f, B:255:0x0855, B:245:0x07e3, B:241:0x07b4, B:235:0x0761, B:237:0x0767, B:451:0x0fcc), top: B:457:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:108:0x03d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x03da A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00da, B:20:0x00f3, B:22:0x00fd, B:206:0x06bb, B:27:0x012d, B:30:0x013f, B:32:0x0145, B:47:0x0189, B:49:0x019b, B:52:0x01c0, B:54:0x01ca, B:56:0x01da, B:58:0x01e8, B:60:0x01f8, B:61:0x0203, B:62:0x0206, B:64:0x021c, B:115:0x0420, B:116:0x042c, B:119:0x0436, B:125:0x0459, B:122:0x0448, B:147:0x04e1, B:149:0x04ed, B:152:0x04fe, B:154:0x050f, B:156:0x051b, B:173:0x0581, B:175:0x058b, B:176:0x0597, B:178:0x05a1, B:180:0x05b1, B:182:0x05bb, B:183:0x05ce, B:185:0x05d4, B:186:0x05ed, B:188:0x05f3, B:189:0x0611, B:190:0x061f, B:194:0x0646, B:191:0x0625, B:193:0x0631, B:195:0x064d, B:196:0x066a, B:198:0x0670, B:200:0x0683, B:201:0x0690, B:203:0x0697, B:205:0x06a5, B:161:0x0533, B:163:0x0541, B:166:0x0554, B:168:0x0565, B:170:0x0571, B:129:0x0461, B:131:0x046d, B:133:0x0479, B:146:0x04c4, B:138:0x049c, B:141:0x04ae, B:143:0x04b4, B:145:0x04be, B:72:0x0246, B:75:0x0254, B:77:0x0262, B:81:0x02b7, B:78:0x0286, B:80:0x0296, B:85:0x02c4, B:87:0x02ea, B:88:0x030e, B:90:0x0345, B:92:0x034b, B:95:0x0357, B:97:0x038c, B:98:0x03a7, B:100:0x03b1, B:102:0x03bf, B:106:0x03d3, B:103:0x03c7, B:109:0x03da, B:112:0x03e8, B:113:0x0407, B:36:0x014f, B:38:0x015c, B:40:0x016a, B:42:0x0170, B:46:0x017b, B:209:0x06d3, B:211:0x06e5, B:213:0x06ee, B:224:0x071f, B:214:0x06f6, B:216:0x06ff, B:218:0x0705, B:221:0x0711, B:223:0x0719, B:225:0x0722, B:226:0x072e, B:229:0x0736, B:231:0x0748, B:232:0x0753, B:234:0x075b, B:238:0x0788, B:240:0x07a4, B:242:0x07b7, B:244:0x07d3, B:246:0x07e6, B:248:0x0833, B:250:0x0839, B:256:0x0864, B:258:0x086c, B:259:0x088a, B:261:0x0890, B:262:0x08a4, B:264:0x08bb, B:266:0x08cc, B:268:0x08de, B:271:0x08e9, B:273:0x08ef, B:274:0x0905, B:276:0x090b, B:278:0x091b, B:280:0x0937, B:283:0x0953, B:285:0x097a, B:305:0x0ac0, B:308:0x0ad0, B:286:0x0993, B:288:0x09a7, B:290:0x09c4, B:292:0x09eb, B:294:0x0a1b, B:295:0x0a28, B:297:0x0a3e, B:299:0x0a5b, B:301:0x0a82, B:303:0x0ab2, B:309:0x0ad8, B:311:0x0b35, B:312:0x0b48, B:315:0x0b50, B:318:0x0b6f, B:320:0x0b88, B:322:0x0b9d, B:324:0x0ba2, B:326:0x0ba6, B:328:0x0baa, B:330:0x0bb4, B:332:0x0bbd, B:334:0x0bc1, B:336:0x0bc7, B:338:0x0bd2, B:340:0x0be0, B:407:0x0e3c, B:342:0x0be8, B:344:0x0c04, B:349:0x0c1f, B:351:0x0c40, B:352:0x0c48, B:354:0x0c4e, B:356:0x0c60, B:362:0x0c76, B:364:0x0c8c, B:365:0x0cad, B:367:0x0cb9, B:369:0x0ccf, B:370:0x0d0d, B:376:0x0d29, B:378:0x0d34, B:380:0x0d38, B:382:0x0d3c, B:384:0x0d40, B:385:0x0d4c, B:386:0x0d51, B:388:0x0d57, B:390:0x0d6d, B:391:0x0d72, B:406:0x0e39, B:393:0x0db1, B:395:0x0db5, B:399:0x0dc9, B:401:0x0de5, B:402:0x0dec, B:405:0x0e2d, B:396:0x0dba, B:347:0x0c0a, B:408:0x0e40, B:410:0x0e4a, B:411:0x0e5e, B:412:0x0e66, B:414:0x0e6c, B:415:0x0e80, B:417:0x0e92, B:437:0x0f3f, B:439:0x0f45, B:441:0x0f5a, B:444:0x0f61, B:449:0x0fa2, B:445:0x0f70, B:447:0x0f7e, B:448:0x0f8b, B:450:0x0fb1, B:418:0x0eab, B:420:0x0eb1, B:422:0x0ec1, B:424:0x0ec8, B:430:0x0ede, B:432:0x0ee5, B:434:0x0f30, B:436:0x0f37, B:435:0x0f34, B:431:0x0ee2, B:423:0x0ec5, B:251:0x0849, B:253:0x084f, B:255:0x0855, B:245:0x07e3, B:241:0x07b4, B:235:0x0761, B:237:0x0767, B:451:0x0fcc), top: B:457:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:111:0x03e6 A[DONT_INVERT, PHI: r2
  0x03e6: PHI (r2v95 u96) = (r2v94 u96), (r2v102 u96) binds: [B:107:0x03d6, B:110:0x03e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x03e8 A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00da, B:20:0x00f3, B:22:0x00fd, B:206:0x06bb, B:27:0x012d, B:30:0x013f, B:32:0x0145, B:47:0x0189, B:49:0x019b, B:52:0x01c0, B:54:0x01ca, B:56:0x01da, B:58:0x01e8, B:60:0x01f8, B:61:0x0203, B:62:0x0206, B:64:0x021c, B:115:0x0420, B:116:0x042c, B:119:0x0436, B:125:0x0459, B:122:0x0448, B:147:0x04e1, B:149:0x04ed, B:152:0x04fe, B:154:0x050f, B:156:0x051b, B:173:0x0581, B:175:0x058b, B:176:0x0597, B:178:0x05a1, B:180:0x05b1, B:182:0x05bb, B:183:0x05ce, B:185:0x05d4, B:186:0x05ed, B:188:0x05f3, B:189:0x0611, B:190:0x061f, B:194:0x0646, B:191:0x0625, B:193:0x0631, B:195:0x064d, B:196:0x066a, B:198:0x0670, B:200:0x0683, B:201:0x0690, B:203:0x0697, B:205:0x06a5, B:161:0x0533, B:163:0x0541, B:166:0x0554, B:168:0x0565, B:170:0x0571, B:129:0x0461, B:131:0x046d, B:133:0x0479, B:146:0x04c4, B:138:0x049c, B:141:0x04ae, B:143:0x04b4, B:145:0x04be, B:72:0x0246, B:75:0x0254, B:77:0x0262, B:81:0x02b7, B:78:0x0286, B:80:0x0296, B:85:0x02c4, B:87:0x02ea, B:88:0x030e, B:90:0x0345, B:92:0x034b, B:95:0x0357, B:97:0x038c, B:98:0x03a7, B:100:0x03b1, B:102:0x03bf, B:106:0x03d3, B:103:0x03c7, B:109:0x03da, B:112:0x03e8, B:113:0x0407, B:36:0x014f, B:38:0x015c, B:40:0x016a, B:42:0x0170, B:46:0x017b, B:209:0x06d3, B:211:0x06e5, B:213:0x06ee, B:224:0x071f, B:214:0x06f6, B:216:0x06ff, B:218:0x0705, B:221:0x0711, B:223:0x0719, B:225:0x0722, B:226:0x072e, B:229:0x0736, B:231:0x0748, B:232:0x0753, B:234:0x075b, B:238:0x0788, B:240:0x07a4, B:242:0x07b7, B:244:0x07d3, B:246:0x07e6, B:248:0x0833, B:250:0x0839, B:256:0x0864, B:258:0x086c, B:259:0x088a, B:261:0x0890, B:262:0x08a4, B:264:0x08bb, B:266:0x08cc, B:268:0x08de, B:271:0x08e9, B:273:0x08ef, B:274:0x0905, B:276:0x090b, B:278:0x091b, B:280:0x0937, B:283:0x0953, B:285:0x097a, B:305:0x0ac0, B:308:0x0ad0, B:286:0x0993, B:288:0x09a7, B:290:0x09c4, B:292:0x09eb, B:294:0x0a1b, B:295:0x0a28, B:297:0x0a3e, B:299:0x0a5b, B:301:0x0a82, B:303:0x0ab2, B:309:0x0ad8, B:311:0x0b35, B:312:0x0b48, B:315:0x0b50, B:318:0x0b6f, B:320:0x0b88, B:322:0x0b9d, B:324:0x0ba2, B:326:0x0ba6, B:328:0x0baa, B:330:0x0bb4, B:332:0x0bbd, B:334:0x0bc1, B:336:0x0bc7, B:338:0x0bd2, B:340:0x0be0, B:407:0x0e3c, B:342:0x0be8, B:344:0x0c04, B:349:0x0c1f, B:351:0x0c40, B:352:0x0c48, B:354:0x0c4e, B:356:0x0c60, B:362:0x0c76, B:364:0x0c8c, B:365:0x0cad, B:367:0x0cb9, B:369:0x0ccf, B:370:0x0d0d, B:376:0x0d29, B:378:0x0d34, B:380:0x0d38, B:382:0x0d3c, B:384:0x0d40, B:385:0x0d4c, B:386:0x0d51, B:388:0x0d57, B:390:0x0d6d, B:391:0x0d72, B:406:0x0e39, B:393:0x0db1, B:395:0x0db5, B:399:0x0dc9, B:401:0x0de5, B:402:0x0dec, B:405:0x0e2d, B:396:0x0dba, B:347:0x0c0a, B:408:0x0e40, B:410:0x0e4a, B:411:0x0e5e, B:412:0x0e66, B:414:0x0e6c, B:415:0x0e80, B:417:0x0e92, B:437:0x0f3f, B:439:0x0f45, B:441:0x0f5a, B:444:0x0f61, B:449:0x0fa2, B:445:0x0f70, B:447:0x0f7e, B:448:0x0f8b, B:450:0x0fb1, B:418:0x0eab, B:420:0x0eb1, B:422:0x0ec1, B:424:0x0ec8, B:430:0x0ede, B:432:0x0ee5, B:434:0x0f30, B:436:0x0f37, B:435:0x0f34, B:431:0x0ee2, B:423:0x0ec5, B:251:0x0849, B:253:0x084f, B:255:0x0855, B:245:0x07e3, B:241:0x07b4, B:235:0x0761, B:237:0x0767, B:451:0x0fcc), top: B:457:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0407 A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00da, B:20:0x00f3, B:22:0x00fd, B:206:0x06bb, B:27:0x012d, B:30:0x013f, B:32:0x0145, B:47:0x0189, B:49:0x019b, B:52:0x01c0, B:54:0x01ca, B:56:0x01da, B:58:0x01e8, B:60:0x01f8, B:61:0x0203, B:62:0x0206, B:64:0x021c, B:115:0x0420, B:116:0x042c, B:119:0x0436, B:125:0x0459, B:122:0x0448, B:147:0x04e1, B:149:0x04ed, B:152:0x04fe, B:154:0x050f, B:156:0x051b, B:173:0x0581, B:175:0x058b, B:176:0x0597, B:178:0x05a1, B:180:0x05b1, B:182:0x05bb, B:183:0x05ce, B:185:0x05d4, B:186:0x05ed, B:188:0x05f3, B:189:0x0611, B:190:0x061f, B:194:0x0646, B:191:0x0625, B:193:0x0631, B:195:0x064d, B:196:0x066a, B:198:0x0670, B:200:0x0683, B:201:0x0690, B:203:0x0697, B:205:0x06a5, B:161:0x0533, B:163:0x0541, B:166:0x0554, B:168:0x0565, B:170:0x0571, B:129:0x0461, B:131:0x046d, B:133:0x0479, B:146:0x04c4, B:138:0x049c, B:141:0x04ae, B:143:0x04b4, B:145:0x04be, B:72:0x0246, B:75:0x0254, B:77:0x0262, B:81:0x02b7, B:78:0x0286, B:80:0x0296, B:85:0x02c4, B:87:0x02ea, B:88:0x030e, B:90:0x0345, B:92:0x034b, B:95:0x0357, B:97:0x038c, B:98:0x03a7, B:100:0x03b1, B:102:0x03bf, B:106:0x03d3, B:103:0x03c7, B:109:0x03da, B:112:0x03e8, B:113:0x0407, B:36:0x014f, B:38:0x015c, B:40:0x016a, B:42:0x0170, B:46:0x017b, B:209:0x06d3, B:211:0x06e5, B:213:0x06ee, B:224:0x071f, B:214:0x06f6, B:216:0x06ff, B:218:0x0705, B:221:0x0711, B:223:0x0719, B:225:0x0722, B:226:0x072e, B:229:0x0736, B:231:0x0748, B:232:0x0753, B:234:0x075b, B:238:0x0788, B:240:0x07a4, B:242:0x07b7, B:244:0x07d3, B:246:0x07e6, B:248:0x0833, B:250:0x0839, B:256:0x0864, B:258:0x086c, B:259:0x088a, B:261:0x0890, B:262:0x08a4, B:264:0x08bb, B:266:0x08cc, B:268:0x08de, B:271:0x08e9, B:273:0x08ef, B:274:0x0905, B:276:0x090b, B:278:0x091b, B:280:0x0937, B:283:0x0953, B:285:0x097a, B:305:0x0ac0, B:308:0x0ad0, B:286:0x0993, B:288:0x09a7, B:290:0x09c4, B:292:0x09eb, B:294:0x0a1b, B:295:0x0a28, B:297:0x0a3e, B:299:0x0a5b, B:301:0x0a82, B:303:0x0ab2, B:309:0x0ad8, B:311:0x0b35, B:312:0x0b48, B:315:0x0b50, B:318:0x0b6f, B:320:0x0b88, B:322:0x0b9d, B:324:0x0ba2, B:326:0x0ba6, B:328:0x0baa, B:330:0x0bb4, B:332:0x0bbd, B:334:0x0bc1, B:336:0x0bc7, B:338:0x0bd2, B:340:0x0be0, B:407:0x0e3c, B:342:0x0be8, B:344:0x0c04, B:349:0x0c1f, B:351:0x0c40, B:352:0x0c48, B:354:0x0c4e, B:356:0x0c60, B:362:0x0c76, B:364:0x0c8c, B:365:0x0cad, B:367:0x0cb9, B:369:0x0ccf, B:370:0x0d0d, B:376:0x0d29, B:378:0x0d34, B:380:0x0d38, B:382:0x0d3c, B:384:0x0d40, B:385:0x0d4c, B:386:0x0d51, B:388:0x0d57, B:390:0x0d6d, B:391:0x0d72, B:406:0x0e39, B:393:0x0db1, B:395:0x0db5, B:399:0x0dc9, B:401:0x0de5, B:402:0x0dec, B:405:0x0e2d, B:396:0x0dba, B:347:0x0c0a, B:408:0x0e40, B:410:0x0e4a, B:411:0x0e5e, B:412:0x0e66, B:414:0x0e6c, B:415:0x0e80, B:417:0x0e92, B:437:0x0f3f, B:439:0x0f45, B:441:0x0f5a, B:444:0x0f61, B:449:0x0fa2, B:445:0x0f70, B:447:0x0f7e, B:448:0x0f8b, B:450:0x0fb1, B:418:0x0eab, B:420:0x0eb1, B:422:0x0ec1, B:424:0x0ec8, B:430:0x0ede, B:432:0x0ee5, B:434:0x0f30, B:436:0x0f37, B:435:0x0f34, B:431:0x0ee2, B:423:0x0ec5, B:251:0x0849, B:253:0x084f, B:255:0x0855, B:245:0x07e3, B:241:0x07b4, B:235:0x0761, B:237:0x0767, B:451:0x0fcc), top: B:457:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x0530 A[PHI: r8
  0x0530: PHI (r8v32 qa6) = (r8v31 qa6), (r8v31 qa6), (r8v35 qa6) binds: [B:162:0x053f, B:164:0x0550, B:159:0x052e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:214:0x06f6 A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00da, B:20:0x00f3, B:22:0x00fd, B:206:0x06bb, B:27:0x012d, B:30:0x013f, B:32:0x0145, B:47:0x0189, B:49:0x019b, B:52:0x01c0, B:54:0x01ca, B:56:0x01da, B:58:0x01e8, B:60:0x01f8, B:61:0x0203, B:62:0x0206, B:64:0x021c, B:115:0x0420, B:116:0x042c, B:119:0x0436, B:125:0x0459, B:122:0x0448, B:147:0x04e1, B:149:0x04ed, B:152:0x04fe, B:154:0x050f, B:156:0x051b, B:173:0x0581, B:175:0x058b, B:176:0x0597, B:178:0x05a1, B:180:0x05b1, B:182:0x05bb, B:183:0x05ce, B:185:0x05d4, B:186:0x05ed, B:188:0x05f3, B:189:0x0611, B:190:0x061f, B:194:0x0646, B:191:0x0625, B:193:0x0631, B:195:0x064d, B:196:0x066a, B:198:0x0670, B:200:0x0683, B:201:0x0690, B:203:0x0697, B:205:0x06a5, B:161:0x0533, B:163:0x0541, B:166:0x0554, B:168:0x0565, B:170:0x0571, B:129:0x0461, B:131:0x046d, B:133:0x0479, B:146:0x04c4, B:138:0x049c, B:141:0x04ae, B:143:0x04b4, B:145:0x04be, B:72:0x0246, B:75:0x0254, B:77:0x0262, B:81:0x02b7, B:78:0x0286, B:80:0x0296, B:85:0x02c4, B:87:0x02ea, B:88:0x030e, B:90:0x0345, B:92:0x034b, B:95:0x0357, B:97:0x038c, B:98:0x03a7, B:100:0x03b1, B:102:0x03bf, B:106:0x03d3, B:103:0x03c7, B:109:0x03da, B:112:0x03e8, B:113:0x0407, B:36:0x014f, B:38:0x015c, B:40:0x016a, B:42:0x0170, B:46:0x017b, B:209:0x06d3, B:211:0x06e5, B:213:0x06ee, B:224:0x071f, B:214:0x06f6, B:216:0x06ff, B:218:0x0705, B:221:0x0711, B:223:0x0719, B:225:0x0722, B:226:0x072e, B:229:0x0736, B:231:0x0748, B:232:0x0753, B:234:0x075b, B:238:0x0788, B:240:0x07a4, B:242:0x07b7, B:244:0x07d3, B:246:0x07e6, B:248:0x0833, B:250:0x0839, B:256:0x0864, B:258:0x086c, B:259:0x088a, B:261:0x0890, B:262:0x08a4, B:264:0x08bb, B:266:0x08cc, B:268:0x08de, B:271:0x08e9, B:273:0x08ef, B:274:0x0905, B:276:0x090b, B:278:0x091b, B:280:0x0937, B:283:0x0953, B:285:0x097a, B:305:0x0ac0, B:308:0x0ad0, B:286:0x0993, B:288:0x09a7, B:290:0x09c4, B:292:0x09eb, B:294:0x0a1b, B:295:0x0a28, B:297:0x0a3e, B:299:0x0a5b, B:301:0x0a82, B:303:0x0ab2, B:309:0x0ad8, B:311:0x0b35, B:312:0x0b48, B:315:0x0b50, B:318:0x0b6f, B:320:0x0b88, B:322:0x0b9d, B:324:0x0ba2, B:326:0x0ba6, B:328:0x0baa, B:330:0x0bb4, B:332:0x0bbd, B:334:0x0bc1, B:336:0x0bc7, B:338:0x0bd2, B:340:0x0be0, B:407:0x0e3c, B:342:0x0be8, B:344:0x0c04, B:349:0x0c1f, B:351:0x0c40, B:352:0x0c48, B:354:0x0c4e, B:356:0x0c60, B:362:0x0c76, B:364:0x0c8c, B:365:0x0cad, B:367:0x0cb9, B:369:0x0ccf, B:370:0x0d0d, B:376:0x0d29, B:378:0x0d34, B:380:0x0d38, B:382:0x0d3c, B:384:0x0d40, B:385:0x0d4c, B:386:0x0d51, B:388:0x0d57, B:390:0x0d6d, B:391:0x0d72, B:406:0x0e39, B:393:0x0db1, B:395:0x0db5, B:399:0x0dc9, B:401:0x0de5, B:402:0x0dec, B:405:0x0e2d, B:396:0x0dba, B:347:0x0c0a, B:408:0x0e40, B:410:0x0e4a, B:411:0x0e5e, B:412:0x0e66, B:414:0x0e6c, B:415:0x0e80, B:417:0x0e92, B:437:0x0f3f, B:439:0x0f45, B:441:0x0f5a, B:444:0x0f61, B:449:0x0fa2, B:445:0x0f70, B:447:0x0f7e, B:448:0x0f8b, B:450:0x0fb1, B:418:0x0eab, B:420:0x0eb1, B:422:0x0ec1, B:424:0x0ec8, B:430:0x0ede, B:432:0x0ee5, B:434:0x0f30, B:436:0x0f37, B:435:0x0f34, B:431:0x0ee2, B:423:0x0ec5, B:251:0x0849, B:253:0x084f, B:255:0x0855, B:245:0x07e3, B:241:0x07b4, B:235:0x0761, B:237:0x0767, B:451:0x0fcc), top: B:457:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x06ff A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00da, B:20:0x00f3, B:22:0x00fd, B:206:0x06bb, B:27:0x012d, B:30:0x013f, B:32:0x0145, B:47:0x0189, B:49:0x019b, B:52:0x01c0, B:54:0x01ca, B:56:0x01da, B:58:0x01e8, B:60:0x01f8, B:61:0x0203, B:62:0x0206, B:64:0x021c, B:115:0x0420, B:116:0x042c, B:119:0x0436, B:125:0x0459, B:122:0x0448, B:147:0x04e1, B:149:0x04ed, B:152:0x04fe, B:154:0x050f, B:156:0x051b, B:173:0x0581, B:175:0x058b, B:176:0x0597, B:178:0x05a1, B:180:0x05b1, B:182:0x05bb, B:183:0x05ce, B:185:0x05d4, B:186:0x05ed, B:188:0x05f3, B:189:0x0611, B:190:0x061f, B:194:0x0646, B:191:0x0625, B:193:0x0631, B:195:0x064d, B:196:0x066a, B:198:0x0670, B:200:0x0683, B:201:0x0690, B:203:0x0697, B:205:0x06a5, B:161:0x0533, B:163:0x0541, B:166:0x0554, B:168:0x0565, B:170:0x0571, B:129:0x0461, B:131:0x046d, B:133:0x0479, B:146:0x04c4, B:138:0x049c, B:141:0x04ae, B:143:0x04b4, B:145:0x04be, B:72:0x0246, B:75:0x0254, B:77:0x0262, B:81:0x02b7, B:78:0x0286, B:80:0x0296, B:85:0x02c4, B:87:0x02ea, B:88:0x030e, B:90:0x0345, B:92:0x034b, B:95:0x0357, B:97:0x038c, B:98:0x03a7, B:100:0x03b1, B:102:0x03bf, B:106:0x03d3, B:103:0x03c7, B:109:0x03da, B:112:0x03e8, B:113:0x0407, B:36:0x014f, B:38:0x015c, B:40:0x016a, B:42:0x0170, B:46:0x017b, B:209:0x06d3, B:211:0x06e5, B:213:0x06ee, B:224:0x071f, B:214:0x06f6, B:216:0x06ff, B:218:0x0705, B:221:0x0711, B:223:0x0719, B:225:0x0722, B:226:0x072e, B:229:0x0736, B:231:0x0748, B:232:0x0753, B:234:0x075b, B:238:0x0788, B:240:0x07a4, B:242:0x07b7, B:244:0x07d3, B:246:0x07e6, B:248:0x0833, B:250:0x0839, B:256:0x0864, B:258:0x086c, B:259:0x088a, B:261:0x0890, B:262:0x08a4, B:264:0x08bb, B:266:0x08cc, B:268:0x08de, B:271:0x08e9, B:273:0x08ef, B:274:0x0905, B:276:0x090b, B:278:0x091b, B:280:0x0937, B:283:0x0953, B:285:0x097a, B:305:0x0ac0, B:308:0x0ad0, B:286:0x0993, B:288:0x09a7, B:290:0x09c4, B:292:0x09eb, B:294:0x0a1b, B:295:0x0a28, B:297:0x0a3e, B:299:0x0a5b, B:301:0x0a82, B:303:0x0ab2, B:309:0x0ad8, B:311:0x0b35, B:312:0x0b48, B:315:0x0b50, B:318:0x0b6f, B:320:0x0b88, B:322:0x0b9d, B:324:0x0ba2, B:326:0x0ba6, B:328:0x0baa, B:330:0x0bb4, B:332:0x0bbd, B:334:0x0bc1, B:336:0x0bc7, B:338:0x0bd2, B:340:0x0be0, B:407:0x0e3c, B:342:0x0be8, B:344:0x0c04, B:349:0x0c1f, B:351:0x0c40, B:352:0x0c48, B:354:0x0c4e, B:356:0x0c60, B:362:0x0c76, B:364:0x0c8c, B:365:0x0cad, B:367:0x0cb9, B:369:0x0ccf, B:370:0x0d0d, B:376:0x0d29, B:378:0x0d34, B:380:0x0d38, B:382:0x0d3c, B:384:0x0d40, B:385:0x0d4c, B:386:0x0d51, B:388:0x0d57, B:390:0x0d6d, B:391:0x0d72, B:406:0x0e39, B:393:0x0db1, B:395:0x0db5, B:399:0x0dc9, B:401:0x0de5, B:402:0x0dec, B:405:0x0e2d, B:396:0x0dba, B:347:0x0c0a, B:408:0x0e40, B:410:0x0e4a, B:411:0x0e5e, B:412:0x0e66, B:414:0x0e6c, B:415:0x0e80, B:417:0x0e92, B:437:0x0f3f, B:439:0x0f45, B:441:0x0f5a, B:444:0x0f61, B:449:0x0fa2, B:445:0x0f70, B:447:0x0f7e, B:448:0x0f8b, B:450:0x0fb1, B:418:0x0eab, B:420:0x0eb1, B:422:0x0ec1, B:424:0x0ec8, B:430:0x0ede, B:432:0x0ee5, B:434:0x0f30, B:436:0x0f37, B:435:0x0f34, B:431:0x0ee2, B:423:0x0ec5, B:251:0x0849, B:253:0x084f, B:255:0x0855, B:245:0x07e3, B:241:0x07b4, B:235:0x0761, B:237:0x0767, B:451:0x0fcc), top: B:457:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x0705 A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00da, B:20:0x00f3, B:22:0x00fd, B:206:0x06bb, B:27:0x012d, B:30:0x013f, B:32:0x0145, B:47:0x0189, B:49:0x019b, B:52:0x01c0, B:54:0x01ca, B:56:0x01da, B:58:0x01e8, B:60:0x01f8, B:61:0x0203, B:62:0x0206, B:64:0x021c, B:115:0x0420, B:116:0x042c, B:119:0x0436, B:125:0x0459, B:122:0x0448, B:147:0x04e1, B:149:0x04ed, B:152:0x04fe, B:154:0x050f, B:156:0x051b, B:173:0x0581, B:175:0x058b, B:176:0x0597, B:178:0x05a1, B:180:0x05b1, B:182:0x05bb, B:183:0x05ce, B:185:0x05d4, B:186:0x05ed, B:188:0x05f3, B:189:0x0611, B:190:0x061f, B:194:0x0646, B:191:0x0625, B:193:0x0631, B:195:0x064d, B:196:0x066a, B:198:0x0670, B:200:0x0683, B:201:0x0690, B:203:0x0697, B:205:0x06a5, B:161:0x0533, B:163:0x0541, B:166:0x0554, B:168:0x0565, B:170:0x0571, B:129:0x0461, B:131:0x046d, B:133:0x0479, B:146:0x04c4, B:138:0x049c, B:141:0x04ae, B:143:0x04b4, B:145:0x04be, B:72:0x0246, B:75:0x0254, B:77:0x0262, B:81:0x02b7, B:78:0x0286, B:80:0x0296, B:85:0x02c4, B:87:0x02ea, B:88:0x030e, B:90:0x0345, B:92:0x034b, B:95:0x0357, B:97:0x038c, B:98:0x03a7, B:100:0x03b1, B:102:0x03bf, B:106:0x03d3, B:103:0x03c7, B:109:0x03da, B:112:0x03e8, B:113:0x0407, B:36:0x014f, B:38:0x015c, B:40:0x016a, B:42:0x0170, B:46:0x017b, B:209:0x06d3, B:211:0x06e5, B:213:0x06ee, B:224:0x071f, B:214:0x06f6, B:216:0x06ff, B:218:0x0705, B:221:0x0711, B:223:0x0719, B:225:0x0722, B:226:0x072e, B:229:0x0736, B:231:0x0748, B:232:0x0753, B:234:0x075b, B:238:0x0788, B:240:0x07a4, B:242:0x07b7, B:244:0x07d3, B:246:0x07e6, B:248:0x0833, B:250:0x0839, B:256:0x0864, B:258:0x086c, B:259:0x088a, B:261:0x0890, B:262:0x08a4, B:264:0x08bb, B:266:0x08cc, B:268:0x08de, B:271:0x08e9, B:273:0x08ef, B:274:0x0905, B:276:0x090b, B:278:0x091b, B:280:0x0937, B:283:0x0953, B:285:0x097a, B:305:0x0ac0, B:308:0x0ad0, B:286:0x0993, B:288:0x09a7, B:290:0x09c4, B:292:0x09eb, B:294:0x0a1b, B:295:0x0a28, B:297:0x0a3e, B:299:0x0a5b, B:301:0x0a82, B:303:0x0ab2, B:309:0x0ad8, B:311:0x0b35, B:312:0x0b48, B:315:0x0b50, B:318:0x0b6f, B:320:0x0b88, B:322:0x0b9d, B:324:0x0ba2, B:326:0x0ba6, B:328:0x0baa, B:330:0x0bb4, B:332:0x0bbd, B:334:0x0bc1, B:336:0x0bc7, B:338:0x0bd2, B:340:0x0be0, B:407:0x0e3c, B:342:0x0be8, B:344:0x0c04, B:349:0x0c1f, B:351:0x0c40, B:352:0x0c48, B:354:0x0c4e, B:356:0x0c60, B:362:0x0c76, B:364:0x0c8c, B:365:0x0cad, B:367:0x0cb9, B:369:0x0ccf, B:370:0x0d0d, B:376:0x0d29, B:378:0x0d34, B:380:0x0d38, B:382:0x0d3c, B:384:0x0d40, B:385:0x0d4c, B:386:0x0d51, B:388:0x0d57, B:390:0x0d6d, B:391:0x0d72, B:406:0x0e39, B:393:0x0db1, B:395:0x0db5, B:399:0x0dc9, B:401:0x0de5, B:402:0x0dec, B:405:0x0e2d, B:396:0x0dba, B:347:0x0c0a, B:408:0x0e40, B:410:0x0e4a, B:411:0x0e5e, B:412:0x0e66, B:414:0x0e6c, B:415:0x0e80, B:417:0x0e92, B:437:0x0f3f, B:439:0x0f45, B:441:0x0f5a, B:444:0x0f61, B:449:0x0fa2, B:445:0x0f70, B:447:0x0f7e, B:448:0x0f8b, B:450:0x0fb1, B:418:0x0eab, B:420:0x0eb1, B:422:0x0ec1, B:424:0x0ec8, B:430:0x0ede, B:432:0x0ee5, B:434:0x0f30, B:436:0x0f37, B:435:0x0f34, B:431:0x0ee2, B:423:0x0ec5, B:251:0x0849, B:253:0x084f, B:255:0x0855, B:245:0x07e3, B:241:0x07b4, B:235:0x0761, B:237:0x0767, B:451:0x0fcc), top: B:457:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:219:0x070e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0179  */
    /* JADX WARN: Code duplicated, block: B:484:0x02be A[EDGE_INSN: B:484:0x02be->B:82:0x02be BREAK  A[LOOP:9: B:72:0x0246->B:81:0x02b7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x071f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0238  */
    /* JADX WARN: Code duplicated, block: B:75:0x0254 A[Catch: all -> 0x011a, TRY_ENTER, TryCatch #0 {all -> 0x011a, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00da, B:20:0x00f3, B:22:0x00fd, B:206:0x06bb, B:27:0x012d, B:30:0x013f, B:32:0x0145, B:47:0x0189, B:49:0x019b, B:52:0x01c0, B:54:0x01ca, B:56:0x01da, B:58:0x01e8, B:60:0x01f8, B:61:0x0203, B:62:0x0206, B:64:0x021c, B:115:0x0420, B:116:0x042c, B:119:0x0436, B:125:0x0459, B:122:0x0448, B:147:0x04e1, B:149:0x04ed, B:152:0x04fe, B:154:0x050f, B:156:0x051b, B:173:0x0581, B:175:0x058b, B:176:0x0597, B:178:0x05a1, B:180:0x05b1, B:182:0x05bb, B:183:0x05ce, B:185:0x05d4, B:186:0x05ed, B:188:0x05f3, B:189:0x0611, B:190:0x061f, B:194:0x0646, B:191:0x0625, B:193:0x0631, B:195:0x064d, B:196:0x066a, B:198:0x0670, B:200:0x0683, B:201:0x0690, B:203:0x0697, B:205:0x06a5, B:161:0x0533, B:163:0x0541, B:166:0x0554, B:168:0x0565, B:170:0x0571, B:129:0x0461, B:131:0x046d, B:133:0x0479, B:146:0x04c4, B:138:0x049c, B:141:0x04ae, B:143:0x04b4, B:145:0x04be, B:72:0x0246, B:75:0x0254, B:77:0x0262, B:81:0x02b7, B:78:0x0286, B:80:0x0296, B:85:0x02c4, B:87:0x02ea, B:88:0x030e, B:90:0x0345, B:92:0x034b, B:95:0x0357, B:97:0x038c, B:98:0x03a7, B:100:0x03b1, B:102:0x03bf, B:106:0x03d3, B:103:0x03c7, B:109:0x03da, B:112:0x03e8, B:113:0x0407, B:36:0x014f, B:38:0x015c, B:40:0x016a, B:42:0x0170, B:46:0x017b, B:209:0x06d3, B:211:0x06e5, B:213:0x06ee, B:224:0x071f, B:214:0x06f6, B:216:0x06ff, B:218:0x0705, B:221:0x0711, B:223:0x0719, B:225:0x0722, B:226:0x072e, B:229:0x0736, B:231:0x0748, B:232:0x0753, B:234:0x075b, B:238:0x0788, B:240:0x07a4, B:242:0x07b7, B:244:0x07d3, B:246:0x07e6, B:248:0x0833, B:250:0x0839, B:256:0x0864, B:258:0x086c, B:259:0x088a, B:261:0x0890, B:262:0x08a4, B:264:0x08bb, B:266:0x08cc, B:268:0x08de, B:271:0x08e9, B:273:0x08ef, B:274:0x0905, B:276:0x090b, B:278:0x091b, B:280:0x0937, B:283:0x0953, B:285:0x097a, B:305:0x0ac0, B:308:0x0ad0, B:286:0x0993, B:288:0x09a7, B:290:0x09c4, B:292:0x09eb, B:294:0x0a1b, B:295:0x0a28, B:297:0x0a3e, B:299:0x0a5b, B:301:0x0a82, B:303:0x0ab2, B:309:0x0ad8, B:311:0x0b35, B:312:0x0b48, B:315:0x0b50, B:318:0x0b6f, B:320:0x0b88, B:322:0x0b9d, B:324:0x0ba2, B:326:0x0ba6, B:328:0x0baa, B:330:0x0bb4, B:332:0x0bbd, B:334:0x0bc1, B:336:0x0bc7, B:338:0x0bd2, B:340:0x0be0, B:407:0x0e3c, B:342:0x0be8, B:344:0x0c04, B:349:0x0c1f, B:351:0x0c40, B:352:0x0c48, B:354:0x0c4e, B:356:0x0c60, B:362:0x0c76, B:364:0x0c8c, B:365:0x0cad, B:367:0x0cb9, B:369:0x0ccf, B:370:0x0d0d, B:376:0x0d29, B:378:0x0d34, B:380:0x0d38, B:382:0x0d3c, B:384:0x0d40, B:385:0x0d4c, B:386:0x0d51, B:388:0x0d57, B:390:0x0d6d, B:391:0x0d72, B:406:0x0e39, B:393:0x0db1, B:395:0x0db5, B:399:0x0dc9, B:401:0x0de5, B:402:0x0dec, B:405:0x0e2d, B:396:0x0dba, B:347:0x0c0a, B:408:0x0e40, B:410:0x0e4a, B:411:0x0e5e, B:412:0x0e66, B:414:0x0e6c, B:415:0x0e80, B:417:0x0e92, B:437:0x0f3f, B:439:0x0f45, B:441:0x0f5a, B:444:0x0f61, B:449:0x0fa2, B:445:0x0f70, B:447:0x0f7e, B:448:0x0f8b, B:450:0x0fb1, B:418:0x0eab, B:420:0x0eb1, B:422:0x0ec1, B:424:0x0ec8, B:430:0x0ede, B:432:0x0ee5, B:434:0x0f30, B:436:0x0f37, B:435:0x0f34, B:431:0x0ee2, B:423:0x0ec5, B:251:0x0849, B:253:0x084f, B:255:0x0855, B:245:0x07e3, B:241:0x07b4, B:235:0x0761, B:237:0x0767, B:451:0x0fcc), top: B:457:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0262 A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00da, B:20:0x00f3, B:22:0x00fd, B:206:0x06bb, B:27:0x012d, B:30:0x013f, B:32:0x0145, B:47:0x0189, B:49:0x019b, B:52:0x01c0, B:54:0x01ca, B:56:0x01da, B:58:0x01e8, B:60:0x01f8, B:61:0x0203, B:62:0x0206, B:64:0x021c, B:115:0x0420, B:116:0x042c, B:119:0x0436, B:125:0x0459, B:122:0x0448, B:147:0x04e1, B:149:0x04ed, B:152:0x04fe, B:154:0x050f, B:156:0x051b, B:173:0x0581, B:175:0x058b, B:176:0x0597, B:178:0x05a1, B:180:0x05b1, B:182:0x05bb, B:183:0x05ce, B:185:0x05d4, B:186:0x05ed, B:188:0x05f3, B:189:0x0611, B:190:0x061f, B:194:0x0646, B:191:0x0625, B:193:0x0631, B:195:0x064d, B:196:0x066a, B:198:0x0670, B:200:0x0683, B:201:0x0690, B:203:0x0697, B:205:0x06a5, B:161:0x0533, B:163:0x0541, B:166:0x0554, B:168:0x0565, B:170:0x0571, B:129:0x0461, B:131:0x046d, B:133:0x0479, B:146:0x04c4, B:138:0x049c, B:141:0x04ae, B:143:0x04b4, B:145:0x04be, B:72:0x0246, B:75:0x0254, B:77:0x0262, B:81:0x02b7, B:78:0x0286, B:80:0x0296, B:85:0x02c4, B:87:0x02ea, B:88:0x030e, B:90:0x0345, B:92:0x034b, B:95:0x0357, B:97:0x038c, B:98:0x03a7, B:100:0x03b1, B:102:0x03bf, B:106:0x03d3, B:103:0x03c7, B:109:0x03da, B:112:0x03e8, B:113:0x0407, B:36:0x014f, B:38:0x015c, B:40:0x016a, B:42:0x0170, B:46:0x017b, B:209:0x06d3, B:211:0x06e5, B:213:0x06ee, B:224:0x071f, B:214:0x06f6, B:216:0x06ff, B:218:0x0705, B:221:0x0711, B:223:0x0719, B:225:0x0722, B:226:0x072e, B:229:0x0736, B:231:0x0748, B:232:0x0753, B:234:0x075b, B:238:0x0788, B:240:0x07a4, B:242:0x07b7, B:244:0x07d3, B:246:0x07e6, B:248:0x0833, B:250:0x0839, B:256:0x0864, B:258:0x086c, B:259:0x088a, B:261:0x0890, B:262:0x08a4, B:264:0x08bb, B:266:0x08cc, B:268:0x08de, B:271:0x08e9, B:273:0x08ef, B:274:0x0905, B:276:0x090b, B:278:0x091b, B:280:0x0937, B:283:0x0953, B:285:0x097a, B:305:0x0ac0, B:308:0x0ad0, B:286:0x0993, B:288:0x09a7, B:290:0x09c4, B:292:0x09eb, B:294:0x0a1b, B:295:0x0a28, B:297:0x0a3e, B:299:0x0a5b, B:301:0x0a82, B:303:0x0ab2, B:309:0x0ad8, B:311:0x0b35, B:312:0x0b48, B:315:0x0b50, B:318:0x0b6f, B:320:0x0b88, B:322:0x0b9d, B:324:0x0ba2, B:326:0x0ba6, B:328:0x0baa, B:330:0x0bb4, B:332:0x0bbd, B:334:0x0bc1, B:336:0x0bc7, B:338:0x0bd2, B:340:0x0be0, B:407:0x0e3c, B:342:0x0be8, B:344:0x0c04, B:349:0x0c1f, B:351:0x0c40, B:352:0x0c48, B:354:0x0c4e, B:356:0x0c60, B:362:0x0c76, B:364:0x0c8c, B:365:0x0cad, B:367:0x0cb9, B:369:0x0ccf, B:370:0x0d0d, B:376:0x0d29, B:378:0x0d34, B:380:0x0d38, B:382:0x0d3c, B:384:0x0d40, B:385:0x0d4c, B:386:0x0d51, B:388:0x0d57, B:390:0x0d6d, B:391:0x0d72, B:406:0x0e39, B:393:0x0db1, B:395:0x0db5, B:399:0x0dc9, B:401:0x0de5, B:402:0x0dec, B:405:0x0e2d, B:396:0x0dba, B:347:0x0c0a, B:408:0x0e40, B:410:0x0e4a, B:411:0x0e5e, B:412:0x0e66, B:414:0x0e6c, B:415:0x0e80, B:417:0x0e92, B:437:0x0f3f, B:439:0x0f45, B:441:0x0f5a, B:444:0x0f61, B:449:0x0fa2, B:445:0x0f70, B:447:0x0f7e, B:448:0x0f8b, B:450:0x0fb1, B:418:0x0eab, B:420:0x0eb1, B:422:0x0ec1, B:424:0x0ec8, B:430:0x0ede, B:432:0x0ee5, B:434:0x0f30, B:436:0x0f37, B:435:0x0f34, B:431:0x0ee2, B:423:0x0ec5, B:251:0x0849, B:253:0x084f, B:255:0x0855, B:245:0x07e3, B:241:0x07b4, B:235:0x0761, B:237:0x0767, B:451:0x0fcc), top: B:457:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0286 A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00da, B:20:0x00f3, B:22:0x00fd, B:206:0x06bb, B:27:0x012d, B:30:0x013f, B:32:0x0145, B:47:0x0189, B:49:0x019b, B:52:0x01c0, B:54:0x01ca, B:56:0x01da, B:58:0x01e8, B:60:0x01f8, B:61:0x0203, B:62:0x0206, B:64:0x021c, B:115:0x0420, B:116:0x042c, B:119:0x0436, B:125:0x0459, B:122:0x0448, B:147:0x04e1, B:149:0x04ed, B:152:0x04fe, B:154:0x050f, B:156:0x051b, B:173:0x0581, B:175:0x058b, B:176:0x0597, B:178:0x05a1, B:180:0x05b1, B:182:0x05bb, B:183:0x05ce, B:185:0x05d4, B:186:0x05ed, B:188:0x05f3, B:189:0x0611, B:190:0x061f, B:194:0x0646, B:191:0x0625, B:193:0x0631, B:195:0x064d, B:196:0x066a, B:198:0x0670, B:200:0x0683, B:201:0x0690, B:203:0x0697, B:205:0x06a5, B:161:0x0533, B:163:0x0541, B:166:0x0554, B:168:0x0565, B:170:0x0571, B:129:0x0461, B:131:0x046d, B:133:0x0479, B:146:0x04c4, B:138:0x049c, B:141:0x04ae, B:143:0x04b4, B:145:0x04be, B:72:0x0246, B:75:0x0254, B:77:0x0262, B:81:0x02b7, B:78:0x0286, B:80:0x0296, B:85:0x02c4, B:87:0x02ea, B:88:0x030e, B:90:0x0345, B:92:0x034b, B:95:0x0357, B:97:0x038c, B:98:0x03a7, B:100:0x03b1, B:102:0x03bf, B:106:0x03d3, B:103:0x03c7, B:109:0x03da, B:112:0x03e8, B:113:0x0407, B:36:0x014f, B:38:0x015c, B:40:0x016a, B:42:0x0170, B:46:0x017b, B:209:0x06d3, B:211:0x06e5, B:213:0x06ee, B:224:0x071f, B:214:0x06f6, B:216:0x06ff, B:218:0x0705, B:221:0x0711, B:223:0x0719, B:225:0x0722, B:226:0x072e, B:229:0x0736, B:231:0x0748, B:232:0x0753, B:234:0x075b, B:238:0x0788, B:240:0x07a4, B:242:0x07b7, B:244:0x07d3, B:246:0x07e6, B:248:0x0833, B:250:0x0839, B:256:0x0864, B:258:0x086c, B:259:0x088a, B:261:0x0890, B:262:0x08a4, B:264:0x08bb, B:266:0x08cc, B:268:0x08de, B:271:0x08e9, B:273:0x08ef, B:274:0x0905, B:276:0x090b, B:278:0x091b, B:280:0x0937, B:283:0x0953, B:285:0x097a, B:305:0x0ac0, B:308:0x0ad0, B:286:0x0993, B:288:0x09a7, B:290:0x09c4, B:292:0x09eb, B:294:0x0a1b, B:295:0x0a28, B:297:0x0a3e, B:299:0x0a5b, B:301:0x0a82, B:303:0x0ab2, B:309:0x0ad8, B:311:0x0b35, B:312:0x0b48, B:315:0x0b50, B:318:0x0b6f, B:320:0x0b88, B:322:0x0b9d, B:324:0x0ba2, B:326:0x0ba6, B:328:0x0baa, B:330:0x0bb4, B:332:0x0bbd, B:334:0x0bc1, B:336:0x0bc7, B:338:0x0bd2, B:340:0x0be0, B:407:0x0e3c, B:342:0x0be8, B:344:0x0c04, B:349:0x0c1f, B:351:0x0c40, B:352:0x0c48, B:354:0x0c4e, B:356:0x0c60, B:362:0x0c76, B:364:0x0c8c, B:365:0x0cad, B:367:0x0cb9, B:369:0x0ccf, B:370:0x0d0d, B:376:0x0d29, B:378:0x0d34, B:380:0x0d38, B:382:0x0d3c, B:384:0x0d40, B:385:0x0d4c, B:386:0x0d51, B:388:0x0d57, B:390:0x0d6d, B:391:0x0d72, B:406:0x0e39, B:393:0x0db1, B:395:0x0db5, B:399:0x0dc9, B:401:0x0de5, B:402:0x0dec, B:405:0x0e2d, B:396:0x0dba, B:347:0x0c0a, B:408:0x0e40, B:410:0x0e4a, B:411:0x0e5e, B:412:0x0e66, B:414:0x0e6c, B:415:0x0e80, B:417:0x0e92, B:437:0x0f3f, B:439:0x0f45, B:441:0x0f5a, B:444:0x0f61, B:449:0x0fa2, B:445:0x0f70, B:447:0x0f7e, B:448:0x0f8b, B:450:0x0fb1, B:418:0x0eab, B:420:0x0eb1, B:422:0x0ec1, B:424:0x0ec8, B:430:0x0ede, B:432:0x0ee5, B:434:0x0f30, B:436:0x0f37, B:435:0x0f34, B:431:0x0ee2, B:423:0x0ec5, B:251:0x0849, B:253:0x084f, B:255:0x0855, B:245:0x07e3, B:241:0x07b4, B:235:0x0761, B:237:0x0767, B:451:0x0fcc), top: B:457:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0296 A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00da, B:20:0x00f3, B:22:0x00fd, B:206:0x06bb, B:27:0x012d, B:30:0x013f, B:32:0x0145, B:47:0x0189, B:49:0x019b, B:52:0x01c0, B:54:0x01ca, B:56:0x01da, B:58:0x01e8, B:60:0x01f8, B:61:0x0203, B:62:0x0206, B:64:0x021c, B:115:0x0420, B:116:0x042c, B:119:0x0436, B:125:0x0459, B:122:0x0448, B:147:0x04e1, B:149:0x04ed, B:152:0x04fe, B:154:0x050f, B:156:0x051b, B:173:0x0581, B:175:0x058b, B:176:0x0597, B:178:0x05a1, B:180:0x05b1, B:182:0x05bb, B:183:0x05ce, B:185:0x05d4, B:186:0x05ed, B:188:0x05f3, B:189:0x0611, B:190:0x061f, B:194:0x0646, B:191:0x0625, B:193:0x0631, B:195:0x064d, B:196:0x066a, B:198:0x0670, B:200:0x0683, B:201:0x0690, B:203:0x0697, B:205:0x06a5, B:161:0x0533, B:163:0x0541, B:166:0x0554, B:168:0x0565, B:170:0x0571, B:129:0x0461, B:131:0x046d, B:133:0x0479, B:146:0x04c4, B:138:0x049c, B:141:0x04ae, B:143:0x04b4, B:145:0x04be, B:72:0x0246, B:75:0x0254, B:77:0x0262, B:81:0x02b7, B:78:0x0286, B:80:0x0296, B:85:0x02c4, B:87:0x02ea, B:88:0x030e, B:90:0x0345, B:92:0x034b, B:95:0x0357, B:97:0x038c, B:98:0x03a7, B:100:0x03b1, B:102:0x03bf, B:106:0x03d3, B:103:0x03c7, B:109:0x03da, B:112:0x03e8, B:113:0x0407, B:36:0x014f, B:38:0x015c, B:40:0x016a, B:42:0x0170, B:46:0x017b, B:209:0x06d3, B:211:0x06e5, B:213:0x06ee, B:224:0x071f, B:214:0x06f6, B:216:0x06ff, B:218:0x0705, B:221:0x0711, B:223:0x0719, B:225:0x0722, B:226:0x072e, B:229:0x0736, B:231:0x0748, B:232:0x0753, B:234:0x075b, B:238:0x0788, B:240:0x07a4, B:242:0x07b7, B:244:0x07d3, B:246:0x07e6, B:248:0x0833, B:250:0x0839, B:256:0x0864, B:258:0x086c, B:259:0x088a, B:261:0x0890, B:262:0x08a4, B:264:0x08bb, B:266:0x08cc, B:268:0x08de, B:271:0x08e9, B:273:0x08ef, B:274:0x0905, B:276:0x090b, B:278:0x091b, B:280:0x0937, B:283:0x0953, B:285:0x097a, B:305:0x0ac0, B:308:0x0ad0, B:286:0x0993, B:288:0x09a7, B:290:0x09c4, B:292:0x09eb, B:294:0x0a1b, B:295:0x0a28, B:297:0x0a3e, B:299:0x0a5b, B:301:0x0a82, B:303:0x0ab2, B:309:0x0ad8, B:311:0x0b35, B:312:0x0b48, B:315:0x0b50, B:318:0x0b6f, B:320:0x0b88, B:322:0x0b9d, B:324:0x0ba2, B:326:0x0ba6, B:328:0x0baa, B:330:0x0bb4, B:332:0x0bbd, B:334:0x0bc1, B:336:0x0bc7, B:338:0x0bd2, B:340:0x0be0, B:407:0x0e3c, B:342:0x0be8, B:344:0x0c04, B:349:0x0c1f, B:351:0x0c40, B:352:0x0c48, B:354:0x0c4e, B:356:0x0c60, B:362:0x0c76, B:364:0x0c8c, B:365:0x0cad, B:367:0x0cb9, B:369:0x0ccf, B:370:0x0d0d, B:376:0x0d29, B:378:0x0d34, B:380:0x0d38, B:382:0x0d3c, B:384:0x0d40, B:385:0x0d4c, B:386:0x0d51, B:388:0x0d57, B:390:0x0d6d, B:391:0x0d72, B:406:0x0e39, B:393:0x0db1, B:395:0x0db5, B:399:0x0dc9, B:401:0x0de5, B:402:0x0dec, B:405:0x0e2d, B:396:0x0dba, B:347:0x0c0a, B:408:0x0e40, B:410:0x0e4a, B:411:0x0e5e, B:412:0x0e66, B:414:0x0e6c, B:415:0x0e80, B:417:0x0e92, B:437:0x0f3f, B:439:0x0f45, B:441:0x0f5a, B:444:0x0f61, B:449:0x0fa2, B:445:0x0f70, B:447:0x0f7e, B:448:0x0f8b, B:450:0x0fb1, B:418:0x0eab, B:420:0x0eb1, B:422:0x0ec1, B:424:0x0ec8, B:430:0x0ede, B:432:0x0ee5, B:434:0x0f30, B:436:0x0f37, B:435:0x0f34, B:431:0x0ee2, B:423:0x0ec5, B:251:0x0849, B:253:0x084f, B:255:0x0855, B:245:0x07e3, B:241:0x07b4, B:235:0x0761, B:237:0x0767, B:451:0x0fcc), top: B:457:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x02ea A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00da, B:20:0x00f3, B:22:0x00fd, B:206:0x06bb, B:27:0x012d, B:30:0x013f, B:32:0x0145, B:47:0x0189, B:49:0x019b, B:52:0x01c0, B:54:0x01ca, B:56:0x01da, B:58:0x01e8, B:60:0x01f8, B:61:0x0203, B:62:0x0206, B:64:0x021c, B:115:0x0420, B:116:0x042c, B:119:0x0436, B:125:0x0459, B:122:0x0448, B:147:0x04e1, B:149:0x04ed, B:152:0x04fe, B:154:0x050f, B:156:0x051b, B:173:0x0581, B:175:0x058b, B:176:0x0597, B:178:0x05a1, B:180:0x05b1, B:182:0x05bb, B:183:0x05ce, B:185:0x05d4, B:186:0x05ed, B:188:0x05f3, B:189:0x0611, B:190:0x061f, B:194:0x0646, B:191:0x0625, B:193:0x0631, B:195:0x064d, B:196:0x066a, B:198:0x0670, B:200:0x0683, B:201:0x0690, B:203:0x0697, B:205:0x06a5, B:161:0x0533, B:163:0x0541, B:166:0x0554, B:168:0x0565, B:170:0x0571, B:129:0x0461, B:131:0x046d, B:133:0x0479, B:146:0x04c4, B:138:0x049c, B:141:0x04ae, B:143:0x04b4, B:145:0x04be, B:72:0x0246, B:75:0x0254, B:77:0x0262, B:81:0x02b7, B:78:0x0286, B:80:0x0296, B:85:0x02c4, B:87:0x02ea, B:88:0x030e, B:90:0x0345, B:92:0x034b, B:95:0x0357, B:97:0x038c, B:98:0x03a7, B:100:0x03b1, B:102:0x03bf, B:106:0x03d3, B:103:0x03c7, B:109:0x03da, B:112:0x03e8, B:113:0x0407, B:36:0x014f, B:38:0x015c, B:40:0x016a, B:42:0x0170, B:46:0x017b, B:209:0x06d3, B:211:0x06e5, B:213:0x06ee, B:224:0x071f, B:214:0x06f6, B:216:0x06ff, B:218:0x0705, B:221:0x0711, B:223:0x0719, B:225:0x0722, B:226:0x072e, B:229:0x0736, B:231:0x0748, B:232:0x0753, B:234:0x075b, B:238:0x0788, B:240:0x07a4, B:242:0x07b7, B:244:0x07d3, B:246:0x07e6, B:248:0x0833, B:250:0x0839, B:256:0x0864, B:258:0x086c, B:259:0x088a, B:261:0x0890, B:262:0x08a4, B:264:0x08bb, B:266:0x08cc, B:268:0x08de, B:271:0x08e9, B:273:0x08ef, B:274:0x0905, B:276:0x090b, B:278:0x091b, B:280:0x0937, B:283:0x0953, B:285:0x097a, B:305:0x0ac0, B:308:0x0ad0, B:286:0x0993, B:288:0x09a7, B:290:0x09c4, B:292:0x09eb, B:294:0x0a1b, B:295:0x0a28, B:297:0x0a3e, B:299:0x0a5b, B:301:0x0a82, B:303:0x0ab2, B:309:0x0ad8, B:311:0x0b35, B:312:0x0b48, B:315:0x0b50, B:318:0x0b6f, B:320:0x0b88, B:322:0x0b9d, B:324:0x0ba2, B:326:0x0ba6, B:328:0x0baa, B:330:0x0bb4, B:332:0x0bbd, B:334:0x0bc1, B:336:0x0bc7, B:338:0x0bd2, B:340:0x0be0, B:407:0x0e3c, B:342:0x0be8, B:344:0x0c04, B:349:0x0c1f, B:351:0x0c40, B:352:0x0c48, B:354:0x0c4e, B:356:0x0c60, B:362:0x0c76, B:364:0x0c8c, B:365:0x0cad, B:367:0x0cb9, B:369:0x0ccf, B:370:0x0d0d, B:376:0x0d29, B:378:0x0d34, B:380:0x0d38, B:382:0x0d3c, B:384:0x0d40, B:385:0x0d4c, B:386:0x0d51, B:388:0x0d57, B:390:0x0d6d, B:391:0x0d72, B:406:0x0e39, B:393:0x0db1, B:395:0x0db5, B:399:0x0dc9, B:401:0x0de5, B:402:0x0dec, B:405:0x0e2d, B:396:0x0dba, B:347:0x0c0a, B:408:0x0e40, B:410:0x0e4a, B:411:0x0e5e, B:412:0x0e66, B:414:0x0e6c, B:415:0x0e80, B:417:0x0e92, B:437:0x0f3f, B:439:0x0f45, B:441:0x0f5a, B:444:0x0f61, B:449:0x0fa2, B:445:0x0f70, B:447:0x0f7e, B:448:0x0f8b, B:450:0x0fb1, B:418:0x0eab, B:420:0x0eb1, B:422:0x0ec1, B:424:0x0ec8, B:430:0x0ede, B:432:0x0ee5, B:434:0x0f30, B:436:0x0f37, B:435:0x0f34, B:431:0x0ee2, B:423:0x0ec5, B:251:0x0849, B:253:0x084f, B:255:0x0855, B:245:0x07e3, B:241:0x07b4, B:235:0x0761, B:237:0x0767, B:451:0x0fcc), top: B:457:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0345 A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:3:0x0017, B:5:0x002f, B:8:0x0038, B:9:0x0057, B:12:0x0073, B:15:0x00a1, B:17:0x00da, B:20:0x00f3, B:22:0x00fd, B:206:0x06bb, B:27:0x012d, B:30:0x013f, B:32:0x0145, B:47:0x0189, B:49:0x019b, B:52:0x01c0, B:54:0x01ca, B:56:0x01da, B:58:0x01e8, B:60:0x01f8, B:61:0x0203, B:62:0x0206, B:64:0x021c, B:115:0x0420, B:116:0x042c, B:119:0x0436, B:125:0x0459, B:122:0x0448, B:147:0x04e1, B:149:0x04ed, B:152:0x04fe, B:154:0x050f, B:156:0x051b, B:173:0x0581, B:175:0x058b, B:176:0x0597, B:178:0x05a1, B:180:0x05b1, B:182:0x05bb, B:183:0x05ce, B:185:0x05d4, B:186:0x05ed, B:188:0x05f3, B:189:0x0611, B:190:0x061f, B:194:0x0646, B:191:0x0625, B:193:0x0631, B:195:0x064d, B:196:0x066a, B:198:0x0670, B:200:0x0683, B:201:0x0690, B:203:0x0697, B:205:0x06a5, B:161:0x0533, B:163:0x0541, B:166:0x0554, B:168:0x0565, B:170:0x0571, B:129:0x0461, B:131:0x046d, B:133:0x0479, B:146:0x04c4, B:138:0x049c, B:141:0x04ae, B:143:0x04b4, B:145:0x04be, B:72:0x0246, B:75:0x0254, B:77:0x0262, B:81:0x02b7, B:78:0x0286, B:80:0x0296, B:85:0x02c4, B:87:0x02ea, B:88:0x030e, B:90:0x0345, B:92:0x034b, B:95:0x0357, B:97:0x038c, B:98:0x03a7, B:100:0x03b1, B:102:0x03bf, B:106:0x03d3, B:103:0x03c7, B:109:0x03da, B:112:0x03e8, B:113:0x0407, B:36:0x014f, B:38:0x015c, B:40:0x016a, B:42:0x0170, B:46:0x017b, B:209:0x06d3, B:211:0x06e5, B:213:0x06ee, B:224:0x071f, B:214:0x06f6, B:216:0x06ff, B:218:0x0705, B:221:0x0711, B:223:0x0719, B:225:0x0722, B:226:0x072e, B:229:0x0736, B:231:0x0748, B:232:0x0753, B:234:0x075b, B:238:0x0788, B:240:0x07a4, B:242:0x07b7, B:244:0x07d3, B:246:0x07e6, B:248:0x0833, B:250:0x0839, B:256:0x0864, B:258:0x086c, B:259:0x088a, B:261:0x0890, B:262:0x08a4, B:264:0x08bb, B:266:0x08cc, B:268:0x08de, B:271:0x08e9, B:273:0x08ef, B:274:0x0905, B:276:0x090b, B:278:0x091b, B:280:0x0937, B:283:0x0953, B:285:0x097a, B:305:0x0ac0, B:308:0x0ad0, B:286:0x0993, B:288:0x09a7, B:290:0x09c4, B:292:0x09eb, B:294:0x0a1b, B:295:0x0a28, B:297:0x0a3e, B:299:0x0a5b, B:301:0x0a82, B:303:0x0ab2, B:309:0x0ad8, B:311:0x0b35, B:312:0x0b48, B:315:0x0b50, B:318:0x0b6f, B:320:0x0b88, B:322:0x0b9d, B:324:0x0ba2, B:326:0x0ba6, B:328:0x0baa, B:330:0x0bb4, B:332:0x0bbd, B:334:0x0bc1, B:336:0x0bc7, B:338:0x0bd2, B:340:0x0be0, B:407:0x0e3c, B:342:0x0be8, B:344:0x0c04, B:349:0x0c1f, B:351:0x0c40, B:352:0x0c48, B:354:0x0c4e, B:356:0x0c60, B:362:0x0c76, B:364:0x0c8c, B:365:0x0cad, B:367:0x0cb9, B:369:0x0ccf, B:370:0x0d0d, B:376:0x0d29, B:378:0x0d34, B:380:0x0d38, B:382:0x0d3c, B:384:0x0d40, B:385:0x0d4c, B:386:0x0d51, B:388:0x0d57, B:390:0x0d6d, B:391:0x0d72, B:406:0x0e39, B:393:0x0db1, B:395:0x0db5, B:399:0x0dc9, B:401:0x0de5, B:402:0x0dec, B:405:0x0e2d, B:396:0x0dba, B:347:0x0c0a, B:408:0x0e40, B:410:0x0e4a, B:411:0x0e5e, B:412:0x0e66, B:414:0x0e6c, B:415:0x0e80, B:417:0x0e92, B:437:0x0f3f, B:439:0x0f45, B:441:0x0f5a, B:444:0x0f61, B:449:0x0fa2, B:445:0x0f70, B:447:0x0f7e, B:448:0x0f8b, B:450:0x0fb1, B:418:0x0eab, B:420:0x0eb1, B:422:0x0ec1, B:424:0x0ec8, B:430:0x0ede, B:432:0x0ee5, B:434:0x0f30, B:436:0x0f37, B:435:0x0f34, B:431:0x0ee2, B:423:0x0ec5, B:251:0x0849, B:253:0x084f, B:255:0x0855, B:245:0x07e3, B:241:0x07b4, B:235:0x0761, B:237:0x0767, B:451:0x0fcc), top: B:457:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0349  */
    /* JADX INFO: renamed from: G */
    public final boolean m9932G(String str, long j) {
        boolean z;
        int i;
        oa6 oa6Var;
        Long l;
        Long l2;
        long j2;
        long j3;
        int iM8647L;
        long jM7882n;
        long j4;
        String strM4610m0;
        String strM4610m1;
        x96 x96VarM9761C;
        Long lValueOf;
        String str2;
        String str3;
        int i2;
        boolean z2;
        boolean z3;
        String str4;
        boolean z4;
        u96 u96Var;
        int i3;
        boolean z5;
        int i4;
        x96 x96VarM7877i;
        boolean z6;
        String str5;
        int i5;
        int i6;
        qm6 qm6Var = this;
        String str6 = "_ai";
        String str7 = "purchase";
        String str8 = "items";
        Long l3 = 1L;
        qm6Var.m9952f0().m3194i0();
        try {
            p86 p86Var = new p86(qm6Var);
            qm6Var.m9952f0().m3193g0(str, j, qm6Var.f28581A, p86Var);
            ArrayList arrayList = (ArrayList) p86Var.f27461d;
            if (arrayList == null || arrayList.isEmpty()) {
                m9952f0().m3195j0();
                z = false;
            } else {
                qa6 qa6Var = (qa6) ((ua6) p86Var.f27459b).m13569g();
                qa6Var.m11054c();
                ((ua6) qa6Var.f31181b).m11443Z();
                int i7 = -1;
                int i8 = -1;
                int i9 = 0;
                int i10 = 0;
                boolean z7 = false;
                boolean z8 = false;
                l96 l96Var = null;
                l96 l96Var2 = null;
                while (true) {
                    int size = ((ArrayList) p86Var.f27461d).size();
                    i = i10;
                    boolean z9 = z7;
                    oa6Var = qm6Var.f28602l;
                    l = l3;
                    String str9 = str8;
                    if (i9 >= size) {
                        break;
                    }
                    l96 l96Var3 = (l96) ((m96) ((ArrayList) p86Var.f27461d).get(i9)).m13569g();
                    int i11 = i9;
                    int i12 = i8;
                    if (qm6Var.m9951e0().m8645J(((ua6) p86Var.f27459b).m11487o(), l96Var3.m7880l())) {
                        qm6Var.mo9019b().f16838m.m12506c("Dropping blocked raw event. appId", d76.m4401y(((ua6) p86Var.f27459b).m11487o()), oa6Var.f26518j.m9366a(l96Var3.m7880l()));
                        if (!"1".equals(qm6Var.m9951e0().mo7575a(((ua6) p86Var.f27459b).m11487o(), "measurement.upload.blacklist_internal")) && !"1".equals(qm6Var.m9951e0().mo7575a(((ua6) p86Var.f27459b).m11487o(), "measurement.upload.blacklist_public")) && !"_err".equals(l96Var3.m7880l())) {
                            qm6Var.m9960j0();
                            dn6.m4564K(qm6Var.f28590J, ((ua6) p86Var.f27459b).m11487o(), 11, "_ev", l96Var3.m7880l(), 0);
                        }
                        str3 = str6;
                        str4 = str7;
                        i10 = i;
                        str5 = str9;
                        i5 = i11;
                        i8 = i12;
                    } else {
                        String strM7880l = l96Var3.m7880l();
                        if (strM7880l.equals(str7) || strM7880l.equals("_iap") || strM7880l.equals("ecommerce_purchase")) {
                            u96 u96VarM12535A = x96.m12535A();
                            u96VarM12535A.m11305h("_ct");
                            if (z9) {
                                str2 = "returning";
                            } else {
                                String strM11487o = ((ua6) p86Var.f27459b).m11487o();
                                if (qm6Var.m9940P(strM11487o, str7) && qm6Var.m9940P(strM11487o, "_iap") && qm6Var.m9940P(strM11487o, "ecommerce_purchase")) {
                                    str2 = "new";
                                } else {
                                    str2 = "returning";
                                }
                            }
                            u96VarM12535A.m11306i(str2);
                            l96Var3.m7878j((x96) u96VarM12535A.m11056e());
                            z9 = true;
                        }
                        if (l96Var3.m7880l().equals(iw5.m6960c(str6, vd6.f32545h, vd6.f32543f))) {
                            l96Var3.m11054c();
                            ((m96) l96Var3.f31181b).m8240E(str6);
                            qm6Var.mo9019b().f16831L.m12504a("Renaming ad_impression to _ai");
                            if (Log.isLoggable(qm6Var.mo9019b().m4402A(), 5)) {
                                for (int i13 = 0; i13 < ((m96) l96Var3.f31181b).m8245p(); i13++) {
                                    if ("ad_platform".equals(l96Var3.m7877i(i13).m12547p()) && !l96Var3.m7877i(i13).m12549r().isEmpty() && "admob".equalsIgnoreCase(l96Var3.m7877i(i13).m12549r())) {
                                        qm6Var.mo9019b().f16840o.m12504a("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                }
                            }
                        }
                        boolean zM8646K = qm6Var.m9951e0().m8646K(((ua6) p86Var.f27459b).m11487o(), l96Var3.m7880l());
                        if (zM8646K) {
                            str3 = str6;
                            i2 = 0;
                            z2 = false;
                            z3 = false;
                            while (true) {
                                str4 = str7;
                                if (i2 < ((m96) l96Var3.f31181b).m8245p()) {
                                    break;
                                    break;
                                }
                                if ("_c".equals(l96Var3.m7877i(i2).m12547p())) {
                                    u96 u96Var2 = (u96) l96Var3.m7877i(i2).m13569g();
                                    z6 = zM8646K;
                                    u96Var2.m11307j(1L);
                                    x96 x96Var = (x96) u96Var2.m11056e();
                                    l96Var3.m11054c();
                                    ((m96) l96Var3.f31181b).m8254z(i2, x96Var);
                                    z2 = true;
                                } else {
                                    z6 = zM8646K;
                                    if ("_r".equals(l96Var3.m7877i(i2).m12547p())) {
                                        u96 u96Var3 = (u96) l96Var3.m7877i(i2).m13569g();
                                        u96Var3.m11307j(1L);
                                        x96 x96Var2 = (x96) u96Var3.m11056e();
                                        l96Var3.m11054c();
                                        ((m96) l96Var3.f31181b).m8254z(i2, x96Var2);
                                        z3 = true;
                                    }
                                }
                                i2++;
                                str7 = str4;
                                zM8646K = z6;
                            }
                            z4 = zM8646K;
                            if (!z2) {
                                qm6Var.mo9019b().f16831L.m12505b(oa6Var.f26518j.m9366a(l96Var3.m7880l()), "Marking event as conversion");
                                u96 u96VarM12535A2 = x96.m12535A();
                                u96VarM12535A2.m11305h("_c");
                                u96VarM12535A2.m11307j(1L);
                                l96Var3.m7879k(u96VarM12535A2);
                            }
                            if (!z3) {
                                qm6Var.mo9019b().f16831L.m12505b(oa6Var.f26518j.m9366a(l96Var3.m7880l()), "Marking event as real-time");
                                u96 u96VarM12535A3 = x96.m12535A();
                                u96VarM12535A3.m11305h("_r");
                                u96VarM12535A3.m11307j(1L);
                                l96Var3.m7879k(u96VarM12535A3);
                            }
                            if (qm6Var.m9952f0().m3159A0(qm6Var.m9953g(), ((ua6) p86Var.f27459b).m11487o(), false, true, false, false).f26971e > qm6Var.m9950d0().m9223C(((ua6) p86Var.f27459b).m11487o(), e56.f17809p)) {
                                m9921C(l96Var3, "_r");
                            } else {
                                z8 = true;
                            }
                            if (dn6.m4576t0(l96Var3.m7880l())) {
                                qm6Var.mo9019b().f16838m.m12505b(d76.m4401y(((ua6) p86Var.f27459b).m11487o()), "Too many conversions. Not logging as conversion. appId");
                                u96Var = null;
                                z5 = false;
                                i4 = -1;
                                for (i3 = 0; i3 < ((m96) l96Var3.f31181b).m8245p(); i3++) {
                                    x96VarM7877i = l96Var3.m7877i(i3);
                                    if ("_c".equals(x96VarM7877i.m12547p())) {
                                        u96Var = (u96) x96VarM7877i.m13569g();
                                        i4 = i3;
                                    } else if ("_err".equals(x96VarM7877i.m12547p())) {
                                        z5 = true;
                                    }
                                }
                                if (z5) {
                                    if (u96Var != null) {
                                        l96Var3.m11054c();
                                        ((m96) l96Var3.f31181b).m8239D(i4);
                                    } else {
                                        u96Var = null;
                                        if (u96Var != null) {
                                            u96 u96Var4 = (u96) u96Var.clone();
                                            u96Var4.m11305h("_err");
                                            u96Var4.m11307j(10L);
                                            x96 x96Var3 = (x96) u96Var4.m11056e();
                                            l96Var3.m11054c();
                                            ((m96) l96Var3.f31181b).m8254z(i4, x96Var3);
                                        } else {
                                            qm6Var.mo9019b().f16835j.m12505b(d76.m4401y(((ua6) p86Var.f27459b).m11487o()), "Did not find conversion parameter. appId");
                                        }
                                    }
                                } else if (u96Var != null) {
                                    u96 u96Var5 = (u96) u96Var.clone();
                                    u96Var5.m11305h("_err");
                                    u96Var5.m11307j(10L);
                                    x96 x96Var4 = (x96) u96Var5.m11056e();
                                    l96Var3.m11054c();
                                    ((m96) l96Var3.f31181b).m8254z(i4, x96Var4);
                                } else {
                                    qm6Var.mo9019b().f16835j.m12505b(d76.m4401y(((ua6) p86Var.f27459b).m11487o()), "Did not find conversion parameter. appId");
                                }
                            }
                        } else {
                            qm6Var.m9958i0();
                            String strM7880l2 = l96Var3.m7880l();
                            y42.m12851X(strM7880l2);
                            if (strM7880l2.hashCode() == 95027 && strM7880l2.equals("_ui")) {
                                str3 = str6;
                                i2 = 0;
                                z2 = false;
                                z3 = false;
                                while (true) {
                                    str4 = str7;
                                    if (i2 < ((m96) l96Var3.f31181b).m8245p()) {
                                        break;
                                    }
                                    if ("_c".equals(l96Var3.m7877i(i2).m12547p())) {
                                        u96 u96Var6 = (u96) l96Var3.m7877i(i2).m13569g();
                                        z6 = zM8646K;
                                        u96Var6.m11307j(1L);
                                        x96 x96Var5 = (x96) u96Var6.m11056e();
                                        l96Var3.m11054c();
                                        ((m96) l96Var3.f31181b).m8254z(i2, x96Var5);
                                        z2 = true;
                                    } else {
                                        z6 = zM8646K;
                                        if ("_r".equals(l96Var3.m7877i(i2).m12547p())) {
                                            u96 u96Var7 = (u96) l96Var3.m7877i(i2).m13569g();
                                            u96Var7.m11307j(1L);
                                            x96 x96Var6 = (x96) u96Var7.m11056e();
                                            l96Var3.m11054c();
                                            ((m96) l96Var3.f31181b).m8254z(i2, x96Var6);
                                            z3 = true;
                                        }
                                    }
                                    i2++;
                                    str7 = str4;
                                    zM8646K = z6;
                                }
                                z4 = zM8646K;
                                if (!z2 && z4) {
                                    qm6Var.mo9019b().f16831L.m12505b(oa6Var.f26518j.m9366a(l96Var3.m7880l()), "Marking event as conversion");
                                    u96 u96VarM12535A4 = x96.m12535A();
                                    u96VarM12535A4.m11305h("_c");
                                    u96VarM12535A4.m11307j(1L);
                                    l96Var3.m7879k(u96VarM12535A4);
                                }
                                if (!z3) {
                                    qm6Var.mo9019b().f16831L.m12505b(oa6Var.f26518j.m9366a(l96Var3.m7880l()), "Marking event as real-time");
                                    u96 u96VarM12535A5 = x96.m12535A();
                                    u96VarM12535A5.m11305h("_r");
                                    u96VarM12535A5.m11307j(1L);
                                    l96Var3.m7879k(u96VarM12535A5);
                                }
                                if (qm6Var.m9952f0().m3159A0(qm6Var.m9953g(), ((ua6) p86Var.f27459b).m11487o(), false, true, false, false).f26971e > qm6Var.m9950d0().m9223C(((ua6) p86Var.f27459b).m11487o(), e56.f17809p)) {
                                    m9921C(l96Var3, "_r");
                                } else {
                                    z8 = true;
                                }
                                if (dn6.m4576t0(l96Var3.m7880l()) && z4 && qm6Var.m9952f0().m3159A0(qm6Var.m9953g(), ((ua6) p86Var.f27459b).m11487o(), true, false, false, false).f26969c > qm6Var.m9950d0().m9223C(((ua6) p86Var.f27459b).m11487o(), e56.f17807o)) {
                                    qm6Var.mo9019b().f16838m.m12505b(d76.m4401y(((ua6) p86Var.f27459b).m11487o()), "Too many conversions. Not logging as conversion. appId");
                                    u96Var = null;
                                    z5 = false;
                                    i4 = -1;
                                    while (i3 < ((m96) l96Var3.f31181b).m8245p()) {
                                        x96VarM7877i = l96Var3.m7877i(i3);
                                        if ("_c".equals(x96VarM7877i.m12547p())) {
                                            u96Var = (u96) x96VarM7877i.m13569g();
                                            i4 = i3;
                                        } else if ("_err".equals(x96VarM7877i.m12547p())) {
                                            z5 = true;
                                        }
                                    }
                                    if (z5) {
                                        if (u96Var != null) {
                                            u96 u96Var8 = (u96) u96Var.clone();
                                            u96Var8.m11305h("_err");
                                            u96Var8.m11307j(10L);
                                            x96 x96Var7 = (x96) u96Var8.m11056e();
                                            l96Var3.m11054c();
                                            ((m96) l96Var3.f31181b).m8254z(i4, x96Var7);
                                        } else {
                                            qm6Var.mo9019b().f16835j.m12505b(d76.m4401y(((ua6) p86Var.f27459b).m11487o()), "Did not find conversion parameter. appId");
                                        }
                                    } else if (u96Var != null) {
                                        l96Var3.m11054c();
                                        ((m96) l96Var3.f31181b).m8239D(i4);
                                    } else {
                                        u96Var = null;
                                        if (u96Var != null) {
                                            u96 u96Var9 = (u96) u96Var.clone();
                                            u96Var9.m11305h("_err");
                                            u96Var9.m11307j(10L);
                                            x96 x96Var8 = (x96) u96Var9.m11056e();
                                            l96Var3.m11054c();
                                            ((m96) l96Var3.f31181b).m8254z(i4, x96Var8);
                                        } else {
                                            qm6Var.mo9019b().f16835j.m12505b(d76.m4401y(((ua6) p86Var.f27459b).m11487o()), "Did not find conversion parameter. appId");
                                        }
                                    }
                                }
                            } else {
                                str3 = str6;
                                str4 = str7;
                                z4 = false;
                            }
                        }
                        if (z4) {
                            ArrayList arrayList2 = new ArrayList(l96Var3.m7876h());
                            int i14 = -1;
                            int i15 = -1;
                            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                if ("value".equals(((x96) arrayList2.get(i16)).m12547p())) {
                                    i14 = i16;
                                } else if ("currency".equals(((x96) arrayList2.get(i16)).m12547p())) {
                                    i15 = i16;
                                }
                            }
                            if (i14 != -1) {
                                if (((x96) arrayList2.get(i14)).m12550s() || ((x96) arrayList2.get(i14)).m12554w()) {
                                    if (i15 != -1) {
                                        String strM12549r = ((x96) arrayList2.get(i15)).m12549r();
                                        if (strM12549r.length() == 3) {
                                            int iCharCount = 0;
                                            while (iCharCount < strM12549r.length()) {
                                                int iCodePointAt = strM12549r.codePointAt(iCharCount);
                                                if (Character.isLetter(iCodePointAt)) {
                                                    iCharCount += Character.charCount(iCodePointAt);
                                                }
                                            }
                                        }
                                    }
                                    qm6Var.mo9019b().f16840o.m12504a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                    l96Var3.m11054c();
                                    ((m96) l96Var3.f31181b).m8239D(i14);
                                    m9921C(l96Var3, "_c");
                                    m9927c0(l96Var3, 19, "currency");
                                    break;
                                }
                                qm6Var.mo9019b().f16840o.m12504a("Value must be specified with a numeric type.");
                                l96Var3.m11054c();
                                ((m96) l96Var3.f31181b).m8239D(i14);
                                m9921C(l96Var3, "_c");
                                m9927c0(l96Var3, 18, "value");
                            }
                        }
                        if ("_e".equals(l96Var3.m7880l())) {
                            qm6Var.m9958i0();
                            if (q76.m9761C("_fr", (m96) l96Var3.m11056e()) == null) {
                                if (l96Var2 != null && Math.abs(l96Var2.m7881m() - l96Var3.m7881m()) <= 1000) {
                                    l96 l96Var4 = (l96) l96Var2.clone();
                                    if (qm6Var.m9934I(l96Var3, l96Var4)) {
                                        qa6Var = qa6Var;
                                        qa6Var.m9834X(i7, l96Var4);
                                        i8 = i12;
                                        l96Var = null;
                                        l96Var2 = null;
                                    }
                                }
                                qa6Var = qa6Var;
                                l96Var = l96Var3;
                                i8 = i;
                            } else {
                                qa6Var = qa6Var;
                                qa6Var = qa6Var;
                                qa6Var = qa6Var;
                                i8 = i12;
                            }
                        } else if ("_vs".equals(l96Var3.m7880l())) {
                            qm6Var.m9958i0();
                            if (q76.m9761C("_et", (m96) l96Var3.m11056e()) == null) {
                                if (l96Var != null && Math.abs(l96Var.m7881m() - l96Var3.m7881m()) <= 1000) {
                                    l96 l96Var5 = (l96) l96Var.clone();
                                    if (qm6Var.m9934I(l96Var5, l96Var3)) {
                                        qa6Var.m9834X(i12, l96Var5);
                                        i8 = i12;
                                        l96Var = null;
                                        l96Var2 = null;
                                    }
                                }
                                i8 = i12;
                                l96Var2 = l96Var3;
                                i7 = i;
                            } else {
                                qa6Var = qa6Var;
                                qa6Var = qa6Var;
                                i8 = i12;
                            }
                        } else {
                            qa6Var = qa6Var;
                            qa6Var = qa6Var;
                            i8 = i12;
                        }
                        if (((m96) l96Var3.f31181b).m8245p() != 0) {
                            qm6Var.m9958i0();
                            Bundle bundleM9760B = q76.m9760B(l96Var3.m7876h());
                            int i17 = 0;
                            while (i17 < ((m96) l96Var3.f31181b).m8245p()) {
                                x96 x96VarM7877i2 = l96Var3.m7877i(i17);
                                String str10 = str9;
                                if (!x96VarM7877i2.m12547p().equals(str10) || x96VarM7877i2.m12556y().isEmpty()) {
                                    i6 = i17;
                                    if (!x96VarM7877i2.m12547p().equals(str10)) {
                                        qm6Var.m9979w(l96Var3.m7880l(), (u96) x96VarM7877i2.m13569g(), bundleM9760B, ((ua6) p86Var.f27459b).m11487o());
                                    }
                                } else {
                                    String strM11487o2 = ((ua6) p86Var.f27459b).m11487o();
                                    List listM12556y = x96VarM7877i2.m12556y();
                                    Bundle[] bundleArr = new Bundle[listM12556y.size()];
                                    int i18 = 0;
                                    while (i18 < listM12556y.size()) {
                                        x96 x96Var9 = (x96) listM12556y.get(i18);
                                        qm6Var.m9958i0();
                                        Bundle bundleM9760B2 = q76.m9760B(x96Var9.m12556y());
                                        Iterator it = x96Var9.m12556y().iterator();
                                        while (it.hasNext()) {
                                            qm6Var.m9979w(l96Var3.m7880l(), (u96) ((x96) it.next()).m13569g(), bundleM9760B2, strM11487o2);
                                            i17 = i17;
                                            listM12556y = listM12556y;
                                        }
                                        bundleArr[i18] = bundleM9760B2;
                                        i18++;
                                        i17 = i17;
                                        listM12556y = listM12556y;
                                    }
                                    i6 = i17;
                                    bundleM9760B.putParcelableArray(str10, bundleArr);
                                }
                                i17 = i6 + 1;
                                str9 = str10;
                            }
                            str5 = str9;
                            l96Var3.m11054c();
                            ((m96) l96Var3.f31181b).m8238C();
                            q76 q76VarM9958i0 = qm6Var.m9958i0();
                            ArrayList arrayList3 = new ArrayList();
                            for (String str11 : bundleM9760B.keySet()) {
                                u96 u96VarM12535A6 = x96.m12535A();
                                u96VarM12535A6.m11305h(str11);
                                Object obj = bundleM9760B.get(str11);
                                if (obj != null) {
                                    q76VarM9958i0.m9788X(u96VarM12535A6, obj);
                                    arrayList3.add((x96) u96VarM12535A6.m11056e());
                                }
                            }
                            int size2 = arrayList3.size();
                            int i19 = 0;
                            while (i19 < size2) {
                                Object obj2 = arrayList3.get(i19);
                                i19++;
                                l96Var3.m7878j((x96) obj2);
                            }
                        } else {
                            str5 = str9;
                        }
                        i5 = i11;
                        ((ArrayList) p86Var.f27461d).set(i5, (m96) l96Var3.m11056e());
                        qa6Var.m9835Y(l96Var3);
                        i10 = i + 1;
                    }
                    z7 = z9;
                    i9 = i5 + 1;
                    str8 = str5;
                    l3 = l;
                    str6 = str3;
                    str7 = str4;
                }
                long j5 = 0;
                long jLongValue = 0;
                int i20 = i;
                int i21 = 0;
                while (i21 < i20) {
                    m96 m96VarM11426S1 = ((ua6) qa6Var.f31181b).m11426S1(i21);
                    if ("_e".equals(m96VarM11426S1.m8247r())) {
                        qm6Var.m9958i0();
                        if (q76.m9761C("_fr", m96VarM11426S1) != null) {
                            qa6Var.m9836Z(i21);
                            i20--;
                            i21--;
                        } else {
                            qm6Var.m9958i0();
                            x96VarM9761C = q76.m9761C("_et", m96VarM11426S1);
                            if (x96VarM9761C == null) {
                                if (x96VarM9761C.m12550s()) {
                                    lValueOf = Long.valueOf(x96VarM9761C.m12551t());
                                } else {
                                    lValueOf = null;
                                }
                                if (lValueOf == null && lValueOf.longValue() > 0) {
                                    jLongValue += lValueOf.longValue();
                                }
                            }
                        }
                    } else {
                        qm6Var.m9958i0();
                        x96VarM9761C = q76.m9761C("_et", m96VarM11426S1);
                        if (x96VarM9761C == null) {
                            if (x96VarM9761C.m12550s()) {
                                lValueOf = Long.valueOf(x96VarM9761C.m12551t());
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf == null) {
                            }
                        }
                    }
                    i21++;
                }
                qm6Var.m9933H(qa6Var, jLongValue, false);
                Iterator it2 = qa6Var.m9831U().iterator();
                while (it2.hasNext()) {
                    if ("_s".equals(((m96) it2.next()).m8247r())) {
                        qm6Var.m9952f0().m3200o0(qa6Var.m9848o(), "_se");
                        break;
                    }
                }
                if (q76.m9778l0("_sid", qa6Var) >= 0) {
                    qm6Var.m9933H(qa6Var, jLongValue, true);
                } else {
                    int iM9778l0 = q76.m9778l0("_se", qa6Var);
                    if (iM9778l0 >= 0) {
                        qa6Var.m11054c();
                        ((ua6) qa6Var.f31181b).m11455d0(iM9778l0);
                        qm6Var.mo9019b().f16835j.m12505b(d76.m4401y(((ua6) p86Var.f27459b).m11487o()), "Session engagement user property is in the bundle without session ID. appId");
                    }
                }
                String strM11487o3 = ((ua6) p86Var.f27459b).m11487o();
                qm6Var.mo9020c().mo5038t();
                qm6Var.m9962k0();
                z76 z76VarM3212y0 = qm6Var.m9952f0().m3212y0(strM11487o3);
                if (z76VarM3212y0 == null) {
                    qm6Var.mo9019b().f16835j.m12505b(d76.m4401y(strM11487o3), "Cannot fix consent fields without appInfo. appId");
                } else {
                    qm6Var.m9965m(z76VarM3212y0, qa6Var);
                }
                String strM11487o4 = ((ua6) p86Var.f27459b).m11487o();
                qm6Var.mo9020c().mo5038t();
                qm6Var.m9962k0();
                z76 z76VarM3212y1 = qm6Var.m9952f0().m3212y0(strM11487o4);
                if (z76VarM3212y1 == null) {
                    qm6Var.mo9019b().f16838m.m12505b(d76.m4401y(strM11487o4), "Cannot populate ad_campaign_info without appInfo. appId");
                } else {
                    qm6Var.m9967n(z76VarM3212y1, qa6Var);
                }
                m9924R(qa6Var);
                qa6Var.m9823M();
                xc6 xc6Var = xc6.f34159c;
                xc6 xc6VarM12661j = qm6Var.m9947a(((ua6) p86Var.f27459b).m11487o()).m12661j(xc6.m12653c(100, ((ua6) p86Var.f27459b).m11503t0()));
                xc6 xc6VarM3190d0 = qm6Var.m9952f0().m3190d0(((ua6) p86Var.f27459b).m11487o());
                qm6Var.m9952f0().m3189c0(((ua6) p86Var.f27459b).m11487o(), xc6VarM12661j);
                vc6 vc6Var = vc6.ANALYTICS_STORAGE;
                if (!xc6VarM12661j.m12660i(vc6Var) && xc6VarM3190d0.m12660i(vc6Var)) {
                    qm6Var.m9952f0().m3198m0(((ua6) p86Var.f27459b).m11487o());
                } else if (xc6VarM12661j.m12660i(vc6Var) && !xc6VarM3190d0.m12660i(vc6Var)) {
                    qm6Var.m9952f0().m3199n0(((ua6) p86Var.f27459b).m11487o());
                }
                vc6 vc6Var2 = vc6.AD_STORAGE;
                if (!xc6VarM12661j.m12660i(vc6Var2)) {
                    qa6Var.m11054c();
                    ((ua6) qa6Var.f31181b).m11519y1();
                    qa6Var.m11054c();
                    ((ua6) qa6Var.f31181b).m11372A1();
                    qa6Var.m11054c();
                    ((ua6) qa6Var.f31181b).m11422R0();
                }
                if (!xc6VarM12661j.m12660i(vc6Var)) {
                    qa6Var.m11054c();
                    ((ua6) qa6Var.f31181b).m11378C1();
                    qa6Var.m11054c();
                    ((ua6) qa6Var.f31181b).m11441Y0();
                }
                ho6.m6466a();
                if (qm6Var.m9950d0().m9225E(((ua6) p86Var.f27459b).m11487o(), e56.f17748P0)) {
                    qm6Var.m9960j0();
                    if (dn6.m4568Q(((ua6) p86Var.f27459b).m11487o()) && qm6Var.m9947a(((ua6) p86Var.f27459b).m11487o()).m12660i(vc6Var2) && ((ua6) p86Var.f27459b).m11518y0()) {
                        int i22 = 0;
                        while (i22 < qa6Var.m9832V()) {
                            l96 l96Var6 = (l96) ((ua6) qa6Var.f31181b).m11426S1(i22).m13569g();
                            Iterator it3 = l96Var6.m7876h().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    j4 = j5;
                                    break;
                                }
                                if ("_c".equals(((x96) it3.next()).m12547p())) {
                                    if (((ua6) p86Var.f27459b).m11386F0() >= qm6Var.m9950d0().m9223C(((ua6) p86Var.f27459b).m11487o(), e56.f17802l0)) {
                                        int iM9223C = qm6Var.m9950d0().m9223C(((ua6) p86Var.f27459b).m11487o(), e56.f17828y0);
                                        LinkedList linkedList = qm6Var.f28607q;
                                        if (iM9223C > 0) {
                                            j4 = j5;
                                            if (qm6Var.m9952f0().m3159A0(qm6Var.m9953g(), ((ua6) p86Var.f27459b).m11487o(), false, false, false, true).f26973g > iM9223C) {
                                                u96 u96VarM12535A7 = x96.m12535A();
                                                u96VarM12535A7.m11305h("_tnr");
                                                u96VarM12535A7.m11307j(1L);
                                                l96Var6.m7878j((x96) u96VarM12535A7.m11056e());
                                            } else {
                                                if (m9950d0().m9225E(((ua6) p86Var.f27459b).m11487o(), e56.f17752R0)) {
                                                    strM4610m1 = m9960j0().m4610m0();
                                                    u96 u96VarM12535A8 = x96.m12535A();
                                                    u96VarM12535A8.m11305h("_tu");
                                                    u96VarM12535A8.m11306i(strM4610m1);
                                                    l96Var6.m7878j((x96) u96VarM12535A8.m11056e());
                                                } else {
                                                    strM4610m1 = null;
                                                }
                                                u96 u96VarM12535A9 = x96.m12535A();
                                                u96VarM12535A9.m11305h("_tr");
                                                u96VarM12535A9.m11307j(1L);
                                                l96Var6.m7878j((x96) u96VarM12535A9.m11056e());
                                                cl6 cl6VarM9789Y = m9958i0().m9789Y(((ua6) p86Var.f27459b).m11487o(), qa6Var, l96Var6, strM4610m1);
                                                if (cl6VarM9789Y != null) {
                                                    mo9019b().f16831L.m12506c("Generated trigger URI. appId, uri", ((ua6) p86Var.f27459b).m11487o(), cl6VarM9789Y.f16114d);
                                                    m9952f0().m3187a0(((ua6) p86Var.f27459b).m11487o(), cl6VarM9789Y);
                                                    if (!linkedList.contains(((ua6) p86Var.f27459b).m11487o())) {
                                                        linkedList.add(((ua6) p86Var.f27459b).m11487o());
                                                    }
                                                }
                                            }
                                        } else {
                                            j4 = j5;
                                            if (m9950d0().m9225E(((ua6) p86Var.f27459b).m11487o(), e56.f17752R0)) {
                                                strM4610m0 = m9960j0().m4610m0();
                                                u96 u96VarM12535A10 = x96.m12535A();
                                                u96VarM12535A10.m11305h("_tu");
                                                u96VarM12535A10.m11306i(strM4610m0);
                                                l96Var6.m7878j((x96) u96VarM12535A10.m11056e());
                                            } else {
                                                strM4610m0 = null;
                                            }
                                            u96 u96VarM12535A11 = x96.m12535A();
                                            u96VarM12535A11.m11305h("_tr");
                                            u96VarM12535A11.m11307j(1L);
                                            l96Var6.m7878j((x96) u96VarM12535A11.m11056e());
                                            cl6 cl6VarM9789Y2 = m9958i0().m9789Y(((ua6) p86Var.f27459b).m11487o(), qa6Var, l96Var6, strM4610m0);
                                            if (cl6VarM9789Y2 != null) {
                                                mo9019b().f16831L.m12506c("Generated trigger URI. appId, uri", ((ua6) p86Var.f27459b).m11487o(), cl6VarM9789Y2.f16114d);
                                                m9952f0().m3187a0(((ua6) p86Var.f27459b).m11487o(), cl6VarM9789Y2);
                                                if (!linkedList.contains(((ua6) p86Var.f27459b).m11487o())) {
                                                    linkedList.add(((ua6) p86Var.f27459b).m11487o());
                                                }
                                            }
                                        }
                                    } else {
                                        j4 = j5;
                                    }
                                    qa6Var.m9833W(i22, (m96) l96Var6.m11056e());
                                    break;
                                }
                                qm6Var = this;
                            }
                            i22++;
                            qm6Var = this;
                            j5 = j4;
                        }
                    }
                }
                long j6 = j5;
                qa6Var.m11054c();
                ((ua6) qa6Var.f31181b).m11402K1();
                qa6Var.m9820J(m9956h0().m11941y(qa6Var.m9848o(), qa6Var.m9831U(), Collections.unmodifiableList(((ua6) qa6Var.f31181b).m11428T1()), Long.valueOf(((ua6) qa6Var.f31181b).m11445Z1()), Long.valueOf(((ua6) qa6Var.f31181b).m11451b2()), !xc6VarM12661j.m12660i(vc6Var)));
                if (m9950d0().m9232v(((ua6) p86Var.f27459b).m11487o())) {
                    HashMap map = new HashMap();
                    ArrayList arrayList4 = new ArrayList();
                    SecureRandom secureRandomM4614s0 = m9960j0().m4614s0();
                    for (int i23 = 0; i23 < qa6Var.m9832V(); i23++) {
                        l96 l96Var7 = (l96) ((ua6) qa6Var.f31181b).m11426S1(i23).m13569g();
                        if (l96Var7.m7880l().equals("_ep")) {
                            m9958i0();
                            String str12 = (String) q76.m9762D("_en", (m96) l96Var7.m11056e());
                            fs5 fs5VarM3182U = (fs5) map.get(str12);
                            if (fs5VarM3182U == null) {
                                ar5 ar5VarM9952f0 = m9952f0();
                                String strM11487o5 = ((ua6) p86Var.f27459b).m11487o();
                                y42.m12854a0(str12);
                                fs5VarM3182U = ar5VarM9952f0.m3182U("events", strM11487o5, str12);
                                if (fs5VarM3182U != null) {
                                    map.put(str12, fs5VarM3182U);
                                }
                            }
                            if (fs5VarM3182U == null || fs5VarM3182U.f19262i != null) {
                                l2 = l;
                            } else {
                                Long l4 = fs5VarM3182U.f19263j;
                                if (l4 != null && l4.longValue() > 1) {
                                    m9958i0();
                                    q76.m9759A(l96Var7, "_sr", l4);
                                }
                                Boolean bool = fs5VarM3182U.f19264k;
                                if (bool == null || !bool.booleanValue()) {
                                    l2 = l;
                                } else {
                                    m9958i0();
                                    l2 = l;
                                    q76.m9759A(l96Var7, "_efs", l2);
                                }
                                arrayList4.add((m96) l96Var7.m11056e());
                            }
                            qa6Var.m9834X(i23, l96Var7);
                        } else {
                            l2 = l;
                            n96 n96VarM9951e0 = m9951e0();
                            String strM11487o6 = ((ua6) p86Var.f27459b).m11487o();
                            String strMo7575a = n96VarM9951e0.mo7575a(strM11487o6, "measurement.account.time_zone_offset_minutes");
                            if (TextUtils.isEmpty(strMo7575a)) {
                                j2 = j6;
                            } else {
                                try {
                                    j2 = Long.parseLong(strMo7575a);
                                } catch (NumberFormatException e) {
                                    ((oa6) n96VarM9951e0.f36084a).mo9019b().f16838m.m12506c("Unable to parse timezone offset. appId", d76.m4401y(strM11487o6), e);
                                    j2 = j6;
                                }
                            }
                            m9960j0();
                            long j7 = j2 * 60000;
                            long jM7881m = (j7 + l96Var7.m7881m()) / 86400000;
                            m96 m96Var = (m96) l96Var7.m11056e();
                            if (TextUtils.isEmpty("_dbg")) {
                                j3 = j7;
                            } else {
                                Iterator it4 = m96Var.m8244o().iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        x96 x96Var10 = (x96) it4.next();
                                        j3 = j7;
                                        if ("_dbg".equals(x96Var10.m12547p())) {
                                            iM8647L = !l2.equals(Long.valueOf(x96Var10.m12551t())) ? m9951e0().m8647L(((ua6) p86Var.f27459b).m11487o(), l96Var7.m7880l()) : 1;
                                        } else {
                                            j7 = j3;
                                        }
                                    } else {
                                        j3 = j7;
                                    }
                                }
                            }
                            if (iM8647L <= 0) {
                                mo9019b().f16838m.m12506c("Sample rate must be positive. event, rate", l96Var7.m7880l(), Integer.valueOf(iM8647L));
                                arrayList4.add((m96) l96Var7.m11056e());
                                qa6Var.m9834X(i23, l96Var7);
                            } else {
                                fs5 fs5VarM5802b = (fs5) map.get(l96Var7.m7880l());
                                if (fs5VarM5802b == null && (fs5VarM5802b = m9952f0().m3182U("events", ((ua6) p86Var.f27459b).m11487o(), l96Var7.m7880l())) == null) {
                                    mo9019b().f16838m.m12506c("Event being bundled has no eventAggregate. appId, eventName", ((ua6) p86Var.f27459b).m11487o(), l96Var7.m7880l());
                                    fs5VarM5802b = new fs5(((ua6) p86Var.f27459b).m11487o(), l96Var7.m7880l(), 1L, 1L, 1L, l96Var7.m7881m(), 0L, null, null, null, null);
                                }
                                m9958i0();
                                Long l5 = (Long) q76.m9762D("_eid", (m96) l96Var7.m11056e());
                                boolean z10 = l5 != null;
                                if (iM8647L == 1) {
                                    arrayList4.add((m96) l96Var7.m11056e());
                                    if (z10 && (fs5VarM5802b.f19262i != null || fs5VarM5802b.f19263j != null || fs5VarM5802b.f19264k != null)) {
                                        map.put(l96Var7.m7880l(), fs5VarM5802b.m5802b(null, null, null));
                                    }
                                    qa6Var.m9834X(i23, l96Var7);
                                } else {
                                    if (secureRandomM4614s0.nextInt(iM8647L) == 0) {
                                        m9958i0();
                                        Long lValueOf2 = Long.valueOf(iM8647L);
                                        q76.m9759A(l96Var7, "_sr", lValueOf2);
                                        arrayList4.add((m96) l96Var7.m11056e());
                                        if (z10) {
                                            fs5VarM5802b = fs5VarM5802b.m5802b(null, lValueOf2, null);
                                        }
                                        map.put(l96Var7.m7880l(), new fs5(fs5VarM5802b.f19254a, fs5VarM5802b.f19255b, fs5VarM5802b.f19256c, fs5VarM5802b.f19257d, fs5VarM5802b.f19258e, fs5VarM5802b.f19259f, l96Var7.m7881m(), Long.valueOf(jM7881m), fs5VarM5802b.f19262i, fs5VarM5802b.f19263j, fs5VarM5802b.f19264k));
                                        l = l2;
                                    } else {
                                        Long l6 = fs5VarM5802b.f19261h;
                                        if (l6 != null) {
                                            jM7882n = l6.longValue();
                                        } else {
                                            m9960j0();
                                            jM7882n = (j3 + l96Var7.m7882n()) / 86400000;
                                        }
                                        if (jM7882n != jM7881m) {
                                            m9958i0();
                                            q76.m9759A(l96Var7, "_efs", l2);
                                            m9958i0();
                                            Long lValueOf3 = Long.valueOf(iM8647L);
                                            q76.m9759A(l96Var7, "_sr", lValueOf3);
                                            arrayList4.add((m96) l96Var7.m11056e());
                                            if (z10) {
                                                fs5VarM5802b = fs5VarM5802b.m5802b(null, lValueOf3, Boolean.TRUE);
                                            }
                                            l = l2;
                                            map.put(l96Var7.m7880l(), new fs5(fs5VarM5802b.f19254a, fs5VarM5802b.f19255b, fs5VarM5802b.f19256c, fs5VarM5802b.f19257d, fs5VarM5802b.f19258e, fs5VarM5802b.f19259f, l96Var7.m7881m(), Long.valueOf(jM7881m), fs5VarM5802b.f19262i, fs5VarM5802b.f19263j, fs5VarM5802b.f19264k));
                                        } else {
                                            l = l2;
                                            if (z10) {
                                                map.put(l96Var7.m7880l(), fs5VarM5802b.m5802b(l5, null, null));
                                            }
                                            qa6Var.m9834X(i23, l96Var7);
                                        }
                                    }
                                    qa6Var.m9834X(i23, l96Var7);
                                }
                            }
                        }
                        l = l2;
                    }
                    if (arrayList4.size() < qa6Var.m9832V()) {
                        qa6Var.m11054c();
                        ((ua6) qa6Var.f31181b).m11443Z();
                        qa6Var.m11054c();
                        ((ua6) qa6Var.f31181b).m11440Y(arrayList4);
                    }
                    Iterator it5 = map.entrySet().iterator();
                    while (it5.hasNext()) {
                        m9952f0().m3183V("events", (fs5) ((Map.Entry) it5.next()).getValue());
                    }
                }
                String strM11487o7 = ((ua6) p86Var.f27459b).m11487o();
                z76 z76VarM3212y2 = m9952f0().m3212y0(strM11487o7);
                if (z76VarM3212y2 == null) {
                    mo9019b().f16835j.m12505b(d76.m4401y(((ua6) p86Var.f27459b).m11487o()), "Bundling raw events w/o app info. appId");
                } else if (qa6Var.m9832V() > 0) {
                    ea6 ea6Var = z76VarM3212y2.f35837a.f26515g;
                    oa6.m9016l(ea6Var);
                    ea6Var.mo5038t();
                    long j8 = z76VarM3212y2.f35845i;
                    if (j8 != j6) {
                        qa6Var.m9841h(j8);
                    } else {
                        qa6Var.m9842i();
                    }
                    ea6 ea6Var2 = z76VarM3212y2.f35837a.f26515g;
                    oa6.m9016l(ea6Var2);
                    ea6Var2.mo5038t();
                    long j9 = z76VarM3212y2.f35844h;
                    if (j9 != j6) {
                        j8 = j9;
                    }
                    if (j8 != j6) {
                        qa6Var.m9839c0(j8);
                    } else {
                        qa6Var.m9840d0();
                    }
                    z76VarM3212y2.m13427h(qa6Var.m9832V());
                    ea6 ea6Var3 = z76VarM3212y2.f35837a.f26515g;
                    oa6.m9016l(ea6Var3);
                    ea6Var3.mo5038t();
                    int i24 = (int) z76VarM3212y2.f35823F;
                    qa6Var.m11054c();
                    ((ua6) qa6Var.f31181b).m11471i1(i24);
                    ea6 ea6Var4 = z76VarM3212y2.f35837a.f26515g;
                    oa6.m9016l(ea6Var4);
                    ea6Var4.mo5038t();
                    qa6Var.m9857x((int) z76VarM3212y2.f35843g);
                    z76VarM3212y2.m13412L(((ua6) qa6Var.f31181b).m11445Z1());
                    z76VarM3212y2.m13413M(((ua6) qa6Var.f31181b).m11451b2());
                    String strM13440u = z76VarM3212y2.m13440u();
                    if (strM13440u != null) {
                        qa6Var.m9816F(strM13440u);
                    } else {
                        qa6Var.m9817G();
                    }
                    m9952f0().m3214z0(z76VarM3212y2, false);
                }
                if (qa6Var.m9832V() > 0) {
                    oa6Var.getClass();
                    n66 n66VarM8642G = m9951e0().m8642G(((ua6) p86Var.f27459b).m11487o());
                    if (n66VarM8642G != null && n66VarM8642G.m8556o()) {
                        long jM8557p = n66VarM8642G.m8557p();
                        qa6Var.m11054c();
                        ((ua6) qa6Var.f31181b).m11416P0(jM8557p);
                    } else if (((ua6) p86Var.f27459b).m11379D().isEmpty()) {
                        qa6Var.m11054c();
                        ((ua6) qa6Var.f31181b).m11416P0(-1L);
                    } else {
                        mo9019b().f16838m.m12505b(d76.m4401y(((ua6) p86Var.f27459b).m11487o()), "Did not find measurement config or missing version info. appId");
                    }
                    m9952f0().m3165D0((ua6) qa6Var.m11056e(), z8);
                }
                m9952f0().m3172K((ArrayList) p86Var.f27460c);
                m9952f0().m3173L(strM11487o7);
                m9952f0().m3195j0();
                z = true;
            }
            m9952f0().m3196k0();
            return z;
        } catch (Throwable th) {
            m9952f0().m3196k0();
            throw th;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m9933H(qa6 qa6Var, long j, boolean z) throws Throwable {
        an6 an6Var;
        String str = true != z ? "_lte" : "_se";
        ar5 ar5Var = this.f28593c;
        m9925S(ar5Var);
        an6 an6VarM3202q0 = ar5Var.m3202q0(qa6Var.m9848o(), str);
        if (an6VarM3202q0 != null) {
            Object obj = an6VarM3202q0.f14649e;
            String strM9848o = qa6Var.m9848o();
            mo9022e().getClass();
            an6Var = new an6(strM9848o, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        } else {
            String strM9848o2 = qa6Var.m9848o();
            mo9022e().getClass();
            an6Var = new an6(strM9848o2, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
        }
        ob6 ob6VarM9471z = pb6.m9471z();
        ob6VarM9471z.m11054c();
        ((pb6) ob6VarM9471z.f31181b).m9473B(str);
        mo9022e().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ob6VarM9471z.m11054c();
        ((pb6) ob6VarM9471z.f31181b).m9472A(jCurrentTimeMillis);
        Object obj2 = an6Var.f14649e;
        long jLongValue = ((Long) obj2).longValue();
        ob6VarM9471z.m11054c();
        ((pb6) ob6VarM9471z.f31181b).m9476E(jLongValue);
        pb6 pb6Var = (pb6) ob6VarM9471z.m11056e();
        int iM9778l0 = q76.m9778l0(str, qa6Var);
        if (iM9778l0 >= 0) {
            qa6Var.m11054c();
            ((ua6) qa6Var.f31181b).m11449b0(iM9778l0, pb6Var);
        } else {
            qa6Var.m11054c();
            ((ua6) qa6Var.f31181b).m11452c0(pb6Var);
        }
        if (j > 0) {
            ar5 ar5Var2 = this.f28593c;
            m9925S(ar5Var2);
            ar5Var2.m3201p0(an6Var);
            mo9019b().f16831L.m12506c("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", obj2);
        }
    }

    /* JADX INFO: renamed from: I */
    public final boolean m9934I(l96 l96Var, l96 l96Var2) {
        y42.m12849V("_e".equals(l96Var.m7880l()));
        m9958i0();
        x96 x96VarM9761C = q76.m9761C("_sc", (m96) l96Var.m11056e());
        String strM12549r = x96VarM9761C == null ? null : x96VarM9761C.m12549r();
        m9958i0();
        x96 x96VarM9761C2 = q76.m9761C("_pc", (m96) l96Var2.m11056e());
        String strM12549r2 = x96VarM9761C2 != null ? x96VarM9761C2.m12549r() : null;
        if (strM12549r2 == null || !strM12549r2.equals(strM12549r)) {
            return false;
        }
        y42.m12849V("_e".equals(l96Var.m7880l()));
        m9958i0();
        x96 x96VarM9761C3 = q76.m9761C("_et", (m96) l96Var.m11056e());
        if (x96VarM9761C3 == null || !x96VarM9761C3.m12550s() || x96VarM9761C3.m12551t() <= 0) {
            return true;
        }
        long jM12551t = x96VarM9761C3.m12551t();
        m9958i0();
        x96 x96VarM9761C4 = q76.m9761C("_et", (m96) l96Var2.m11056e());
        if (x96VarM9761C4 != null && x96VarM9761C4.m12551t() > 0) {
            jM12551t += x96VarM9761C4.m12551t();
        }
        m9958i0();
        q76.m9759A(l96Var2, "_et", Long.valueOf(jM12551t));
        m9958i0();
        q76.m9759A(l96Var, "_fr", 1L);
        return true;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m9935J() {
        mo9020c().mo5038t();
        m9962k0();
        ar5 ar5Var = this.f28593c;
        m9925S(ar5Var);
        if (ar5Var.m3178Q("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        ar5 ar5Var2 = this.f28593c;
        m9925S(ar5Var2);
        return !TextUtils.isEmpty(ar5Var2.m3162C());
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0376  */
    /* JADX WARN: Code duplicated, block: B:114:0x0398  */
    /* JADX WARN: Code duplicated, block: B:16:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x01df  */
    /* JADX WARN: Code duplicated, block: B:64:0x0205  */
    /* JADX WARN: Code duplicated, block: B:67:0x0223  */
    /* JADX WARN: Code duplicated, block: B:70:0x0270  */
    /* JADX WARN: Code duplicated, block: B:73:0x0280  */
    /* JADX WARN: Code duplicated, block: B:76:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:78:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:82:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:84:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:99:0x0344  */
    /* JADX INFO: renamed from: L */
    public final void m9936L() {
        boolean z;
        long jMax;
        long jMax2;
        int i;
        q76 q76Var;
        e86 e86VarM9954g0;
        qm6 qm6Var;
        long jM8623a;
        long jMax3;
        long jCurrentTimeMillis;
        fl6 fl6Var;
        d76 d76Var;
        Context context;
        JobInfo jobInfoBuild;
        JobScheduler jobScheduler;
        Method method;
        int iIntValue;
        kk6 kk6Var;
        kk6 kk6Var2;
        q76 q76Var2 = this.f28597g;
        mo9020c().mo5038t();
        m9962k0();
        if (this.f28605o > 0) {
            mo9022e().getClass();
            long jAbs = 3600000 - Math.abs(SystemClock.elapsedRealtime() - this.f28605o);
            if (jAbs > 0) {
                mo9019b().f16831L.m12505b(Long.valueOf(jAbs), "Upload has been suspended. Will update scheduling later in approximately ms");
                m9954g0().m4963b();
                fl6 fl6Var2 = this.f28595e;
                m9925S(fl6Var2);
                fl6Var2.m5735y();
                return;
            }
            this.f28605o = 0L;
        }
        if (!this.f28602l.m9025h() || !m9935J()) {
            mo9019b().f16831L.m12504a("Nothing to upload or uploading impossible");
            m9954g0().m4963b();
            fl6 fl6Var3 = this.f28595e;
            m9925S(fl6Var3);
            fl6Var3.m5735y();
            return;
        }
        mo9022e().getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        m9950d0();
        long jMax4 = Math.max(0L, ((Long) e56.f17745O.m4379a(null)).longValue());
        ar5 ar5Var = this.f28593c;
        m9925S(ar5Var);
        if (ar5Var.m3178Q("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
            z = true;
        } else {
            ar5 ar5Var2 = this.f28593c;
            m9925S(ar5Var2);
            if (ar5Var2.m3178Q("select count(1) > 0 from queue where has_realtime = 1", null) != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            String strM9234y = m9950d0().m9234y("debug.firebase.analytics.app");
            if (TextUtils.isEmpty(strM9234y) || ".none.".equals(strM9234y)) {
                m9950d0();
                jMax = Math.max(0L, ((Long) e56.f17733I.m4379a(null)).longValue());
            } else {
                m9950d0();
                jMax = Math.max(0L, ((Long) e56.f17735J.m4379a(null)).longValue());
            }
        } else {
            m9950d0();
            jMax = Math.max(0L, ((Long) e56.f17731H.m4379a(null)).longValue());
        }
        long jM8623a2 = this.f28599i.f29366l.m8623a();
        long jM8623a3 = this.f28599i.f29367m.m8623a();
        ar5 ar5Var3 = this.f28593c;
        m9925S(ar5Var3);
        long jM3179R = ar5Var3.m3179R("select max(bundle_end_timestamp) from queue", null, 0L);
        ar5 ar5Var4 = this.f28593c;
        m9925S(ar5Var4);
        long jMax5 = Math.max(jM3179R, ar5Var4.m3179R("select max(timestamp) from raw_events", null, 0L));
        if (jMax5 != 0) {
            long jAbs2 = jCurrentTimeMillis2 - Math.abs(jMax5 - jCurrentTimeMillis2);
            long jAbs3 = jCurrentTimeMillis2 - Math.abs(jM8623a2 - jCurrentTimeMillis2);
            long jAbs4 = jCurrentTimeMillis2 - Math.abs(jM8623a3 - jCurrentTimeMillis2);
            long jMin = jMax4 + jAbs2;
            long jMax6 = Math.max(jAbs3, jAbs4);
            if (z && jMax6 > 0) {
                jMin = Math.min(jAbs2, jMax6) + jMax;
            }
            m9925S(q76Var2);
            jMax2 = !q76Var2.m9795h0(jMax6, jMax) ? jMax6 + jMax : jMin;
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i2 = 0;
                while (true) {
                    m9950d0();
                    i = 0;
                    if (i2 >= Math.min(20, Math.max(0, ((Integer) e56.f17749Q.m4379a(null)).intValue()))) {
                        jMax2 = 0;
                        break;
                    }
                    m9950d0();
                    jMax2 += Math.max(0L, ((Long) e56.f17747P.m4379a(null)).longValue()) * (1 << i2);
                    if (jMax2 > jAbs4) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (jMax2 == 0) {
                mo9019b().f16831L.m12504a("Next upload time is 0");
                m9954g0().m4963b();
                fl6 fl6Var4 = this.f28595e;
                m9925S(fl6Var4);
                fl6Var4.m5735y();
                return;
            }
            q76Var = this.f28592b;
            m9925S(q76Var);
            if (q76Var.m9785O()) {
                mo9019b().f16831L.m12504a("No network");
                e86VarM9954g0 = m9954g0();
                qm6Var = (qm6) e86VarM9954g0.f17899d;
                qm6Var.m9962k0();
                qm6Var.mo9020c().mo5038t();
                if (!e86VarM9954g0.f17897b) {
                    qm6Var.f28602l.f26509a.registerReceiver(e86VarM9954g0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    q76 q76Var3 = qm6Var.f28592b;
                    m9925S(q76Var3);
                    e86VarM9954g0.f17898c = q76Var3.m9785O();
                    qm6Var.mo9019b().f16831L.m12505b(Boolean.valueOf(e86VarM9954g0.f17898c), "Registering connectivity change receiver. Network connected");
                    e86VarM9954g0.f17897b = true;
                }
                fl6 fl6Var5 = this.f28595e;
                m9925S(fl6Var5);
                fl6Var5.m5735y();
                return;
            }
            jM8623a = this.f28599i.f29365k.m8623a();
            m9950d0();
            jMax3 = Math.max(0L, ((Long) e56.f17729G.m4379a(null)).longValue());
            m9925S(q76Var2);
            if (!q76Var2.m9795h0(jM8623a, jMax3)) {
                jMax2 = Math.max(jMax2, jM8623a + jMax3);
            }
            m9954g0().m4963b();
            mo9022e().getClass();
            jCurrentTimeMillis = jMax2 - System.currentTimeMillis();
            if (jCurrentTimeMillis <= 0) {
                m9950d0();
                jCurrentTimeMillis = Math.max(0L, ((Long) e56.f17737K.m4379a(null)).longValue());
                n86 n86Var = this.f28599i.f29366l;
                mo9022e().getClass();
                n86Var.m8624b(System.currentTimeMillis());
            }
            mo9019b().f16831L.m12505b(Long.valueOf(jCurrentTimeMillis), "Upload scheduled in approximately ms");
            fl6Var = this.f28595e;
            m9925S(fl6Var);
            fl6Var.m10368u();
            oa6 oa6Var = (oa6) fl6Var.f36084a;
            oa6Var.getClass();
            d76Var = oa6Var.f26514f;
            context = oa6Var.f26509a;
            if (!dn6.m4573k0(context)) {
                oa6.m9016l(d76Var);
                d76Var.f16842q.m12504a("Receiver not registered/enabled");
            }
            if (!dn6.m4567N(context)) {
                oa6.m9016l(d76Var);
                d76Var.f16842q.m12504a("Service not registered/enabled");
            }
            fl6Var.m5735y();
            oa6.m9016l(d76Var);
            d76Var.f16831L.m12505b(Long.valueOf(jCurrentTimeMillis), "Scheduling upload, millis");
            oa6Var.f26519k.getClass();
            SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis < Math.max(0L, ((Long) e56.f17739L.m4379a(null)).longValue())) {
                kk6Var = fl6Var.f19106i;
                if (kk6Var == null) {
                    kk6 kk6Var3 = new kk6(fl6Var, fl6Var.f19870f.f28602l, (byte) 1);
                    fl6Var.f19106i = kk6Var3;
                    kk6Var = kk6Var3;
                }
                if (kk6Var.f21720c == 0) {
                    kk6Var2 = fl6Var.f19106i;
                    if (kk6Var2 == null) {
                        kk6 kk6Var4 = new kk6(fl6Var, fl6Var.f19870f.f28602l, (byte) 1);
                        fl6Var.f19106i = kk6Var4;
                        kk6Var2 = kk6Var4;
                    }
                    kk6Var2.m6923b(jCurrentTimeMillis);
                }
            }
            ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
            int iM5734A = fl6Var.m5734A();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            jobInfoBuild = new JobInfo.Builder(iM5734A, componentName).setMinimumLatency(jCurrentTimeMillis).setOverrideDeadline(jCurrentTimeMillis + jCurrentTimeMillis).setExtras(persistableBundle).build();
            Method method2 = gw5.f20156a;
            jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            jobScheduler.getClass();
            method = gw5.f20156a;
            if (method != null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
                jobScheduler.schedule(jobInfoBuild);
            }
            Method method3 = gw5.f20157b;
            if (method3 != null) {
                try {
                    Integer num = (Integer) method3.invoke(UserHandle.class, null);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = i;
                    }
                } catch (IllegalAccessException | InvocationTargetException e) {
                    if (Log.isLoggable("JobSchedulerCompat", 6)) {
                        Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                    }
                }
            } else {
                iIntValue = i;
            }
            try {
                return;
            } catch (IllegalAccessException | InvocationTargetException e2) {
                Log.e("UploadAlarm", "error calling scheduleAsPackage", e2);
                jobScheduler.schedule(jobInfoBuild);
                return;
            }
        }
        jMax2 = 0;
        i = 0;
        if (jMax2 == 0) {
            mo9019b().f16831L.m12504a("Next upload time is 0");
            m9954g0().m4963b();
            fl6 fl6Var6 = this.f28595e;
            m9925S(fl6Var6);
            fl6Var6.m5735y();
            return;
        }
        q76Var = this.f28592b;
        m9925S(q76Var);
        if (q76Var.m9785O()) {
            mo9019b().f16831L.m12504a("No network");
            e86VarM9954g0 = m9954g0();
            qm6Var = (qm6) e86VarM9954g0.f17899d;
            qm6Var.m9962k0();
            qm6Var.mo9020c().mo5038t();
            if (!e86VarM9954g0.f17897b) {
                qm6Var.f28602l.f26509a.registerReceiver(e86VarM9954g0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                q76 q76Var4 = qm6Var.f28592b;
                m9925S(q76Var4);
                e86VarM9954g0.f17898c = q76Var4.m9785O();
                qm6Var.mo9019b().f16831L.m12505b(Boolean.valueOf(e86VarM9954g0.f17898c), "Registering connectivity change receiver. Network connected");
                e86VarM9954g0.f17897b = true;
            }
            fl6 fl6Var7 = this.f28595e;
            m9925S(fl6Var7);
            fl6Var7.m5735y();
            return;
        }
        jM8623a = this.f28599i.f29365k.m8623a();
        m9950d0();
        jMax3 = Math.max(0L, ((Long) e56.f17729G.m4379a(null)).longValue());
        m9925S(q76Var2);
        if (!q76Var2.m9795h0(jM8623a, jMax3)) {
            jMax2 = Math.max(jMax2, jM8623a + jMax3);
        }
        m9954g0().m4963b();
        mo9022e().getClass();
        jCurrentTimeMillis = jMax2 - System.currentTimeMillis();
        if (jCurrentTimeMillis <= 0) {
            m9950d0();
            jCurrentTimeMillis = Math.max(0L, ((Long) e56.f17737K.m4379a(null)).longValue());
            n86 n86Var2 = this.f28599i.f29366l;
            mo9022e().getClass();
            n86Var2.m8624b(System.currentTimeMillis());
        }
        mo9019b().f16831L.m12505b(Long.valueOf(jCurrentTimeMillis), "Upload scheduled in approximately ms");
        fl6Var = this.f28595e;
        m9925S(fl6Var);
        fl6Var.m10368u();
        oa6 oa6Var2 = (oa6) fl6Var.f36084a;
        oa6Var2.getClass();
        d76Var = oa6Var2.f26514f;
        context = oa6Var2.f26509a;
        if (!dn6.m4573k0(context)) {
            oa6.m9016l(d76Var);
            d76Var.f16842q.m12504a("Receiver not registered/enabled");
        }
        if (!dn6.m4567N(context)) {
            oa6.m9016l(d76Var);
            d76Var.f16842q.m12504a("Service not registered/enabled");
        }
        fl6Var.m5735y();
        oa6.m9016l(d76Var);
        d76Var.f16831L.m12505b(Long.valueOf(jCurrentTimeMillis), "Scheduling upload, millis");
        oa6Var2.f26519k.getClass();
        SystemClock.elapsedRealtime();
        if (jCurrentTimeMillis < Math.max(0L, ((Long) e56.f17739L.m4379a(null)).longValue())) {
            kk6Var = fl6Var.f19106i;
            if (kk6Var == null) {
                kk6 kk6Var5 = new kk6(fl6Var, fl6Var.f19870f.f28602l, (byte) 1);
                fl6Var.f19106i = kk6Var5;
                kk6Var = kk6Var5;
            }
            if (kk6Var.f21720c == 0) {
                kk6Var2 = fl6Var.f19106i;
                if (kk6Var2 == null) {
                    kk6 kk6Var6 = new kk6(fl6Var, fl6Var.f19870f.f28602l, (byte) 1);
                    fl6Var.f19106i = kk6Var6;
                    kk6Var2 = kk6Var6;
                }
                kk6Var2.m6923b(jCurrentTimeMillis);
            }
        }
        ComponentName componentName2 = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iM5734A2 = fl6Var.m5734A();
        PersistableBundle persistableBundle2 = new PersistableBundle();
        persistableBundle2.putString("action", "com.google.android.gms.measurement.UPLOAD");
        jobInfoBuild = new JobInfo.Builder(iM5734A2, componentName2).setMinimumLatency(jCurrentTimeMillis).setOverrideDeadline(jCurrentTimeMillis + jCurrentTimeMillis).setExtras(persistableBundle2).build();
        Method method4 = gw5.f20156a;
        jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.getClass();
        method = gw5.f20156a;
        if (method != null) {
        }
        jobScheduler.schedule(jobInfoBuild);
    }

    /* JADX INFO: renamed from: M */
    public final void m9937M() {
        mo9020c().mo5038t();
        if (this.f28610t || this.f28611u || this.f28612v) {
            mo9019b().f16831L.m12507d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f28610t), Boolean.valueOf(this.f28611u), Boolean.valueOf(this.f28612v));
            return;
        }
        mo9019b().f16831L.m12504a("Stopping uploading service(s)");
        ArrayList arrayList = this.f28606p;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        ArrayList arrayList2 = this.f28606p;
        y42.m12854a0(arrayList2);
        arrayList2.clear();
    }

    /* JADX INFO: renamed from: N */
    public final Boolean m9938N(z76 z76Var) {
        try {
            long jM13416P = z76Var.m13416P();
            oa6 oa6Var = this.f28602l;
            if (jM13416P != -2147483648L) {
                if (z76Var.m13416P() == r35.m10189a(oa6Var.f26509a).m12998b(0, z76Var.m13404D()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = r35.m10189a(oa6Var.f26509a).m12998b(0, z76Var.m13404D()).versionName;
                String strM13414N = z76Var.m13414N();
                if (strM13414N != null && strM13414N.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: O */
    public final cp6 m9939O(String str) {
        ar5 ar5Var = this.f28593c;
        m9925S(ar5Var);
        z76 z76VarM3212y0 = ar5Var.m3212y0(str);
        if (z76VarM3212y0 != null) {
            oa6 oa6Var = z76VarM3212y0.f35837a;
            if (!TextUtils.isEmpty(z76VarM3212y0.m13414N())) {
                Boolean boolM9938N = m9938N(z76VarM3212y0);
                if (boolM9938N != null && !boolM9938N.booleanValue()) {
                    mo9019b().f16835j.m12505b(d76.m4401y(str), "App version does not match; dropping. appId");
                    return null;
                }
                String strM13407G = z76VarM3212y0.m13407G();
                String strM13414N = z76VarM3212y0.m13414N();
                long jM13416P = z76VarM3212y0.m13416P();
                ea6 ea6Var = oa6Var.f26515g;
                oa6.m9016l(ea6Var);
                ea6Var.mo5038t();
                String str2 = z76VarM3212y0.f35848l;
                ea6 ea6Var2 = oa6Var.f26515g;
                oa6.m9016l(ea6Var2);
                ea6Var2.mo5038t();
                long j = z76VarM3212y0.f35849m;
                ea6 ea6Var3 = oa6Var.f26515g;
                oa6.m9016l(ea6Var3);
                ea6Var3.mo5038t();
                long j2 = z76VarM3212y0.f35850n;
                ea6 ea6Var4 = oa6Var.f26515g;
                oa6.m9016l(ea6Var4);
                ea6Var4.mo5038t();
                boolean z = z76VarM3212y0.f35851o;
                String strM13410J = z76VarM3212y0.m13410J();
                ea6 ea6Var5 = oa6Var.f26515g;
                oa6.m9016l(ea6Var5);
                ea6Var5.mo5038t();
                boolean z2 = z76VarM3212y0.f35852p;
                Boolean boolM13442w = z76VarM3212y0.m13442w();
                long jM13421b = z76VarM3212y0.m13421b();
                ea6 ea6Var6 = oa6Var.f26515g;
                oa6.m9016l(ea6Var6);
                ea6Var6.mo5038t();
                ArrayList arrayList = z76VarM3212y0.f35855s;
                String strM12659g = m9947a(str).m12659g();
                boolean zM13444y = z76VarM3212y0.m13444y();
                ea6 ea6Var7 = oa6Var.f26515g;
                oa6.m9016l(ea6Var7);
                ea6Var7.mo5038t();
                long j3 = z76VarM3212y0.f35858v;
                int i = m9947a(str).f34161b;
                String str3 = m9968n0(str).f25172b;
                ea6 ea6Var8 = oa6Var.f26515g;
                oa6.m9016l(ea6Var8);
                ea6Var8.mo5038t();
                int i2 = z76VarM3212y0.f35860x;
                ea6 ea6Var9 = oa6Var.f26515g;
                oa6.m9016l(ea6Var9);
                ea6Var9.mo5038t();
                return new cp6(str, strM13407G, strM13414N, jM13416P, str2, j, j2, null, z, false, strM13410J, 0L, 0, z2, false, boolM13442w, jM13421b, arrayList, strM12659g, "", null, zM13444y, j3, i, str3, i2, z76VarM3212y0.f35819B, z76VarM3212y0.m13403C(), z76VarM3212y0.m13438s(), 0L, z76VarM3212y0.m13439t());
            }
        }
        mo9019b().f16842q.m12505b(str, "No app data available; dropping");
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m9940P(String str, String str2) throws Throwable {
        ar5 ar5Var = this.f28593c;
        m9925S(ar5Var);
        fs5 fs5VarM3182U = ar5Var.m3182U("events", str, str2);
        return fs5VarM3182U == null || fs5VarM3182U.f19256c < 1;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    /* JADX INFO: renamed from: U */
    public final void m9941U(xm6 xm6Var, cp6 cp6Var) {
        fs5 fs5VarM3182U;
        long jLongValue;
        mo9020c().mo5038t();
        m9962k0();
        boolean zM9923Q = m9923Q(cp6Var);
        String str = cp6Var.f16349d;
        if (zM9923Q) {
            if (!cp6Var.f16356k) {
                m9948a0(cp6Var);
                return;
            }
            dn6 dn6VarM9960j0 = m9960j0();
            String str2 = xm6Var.f34428e;
            int iM4579A0 = dn6VarM9960j0.m4579A0(str2);
            bt5 bt5Var = this.f28590J;
            if (iM4579A0 != 0) {
                m9960j0();
                m9950d0();
                String strM4577z = dn6.m4577z(str2, true, 24);
                int length = str2 != null ? str2.length() : 0;
                m9960j0();
                dn6.m4564K(bt5Var, cp6Var.f16349d, iM4579A0, "_ev", strM4577z, length);
                return;
            }
            int iM4590H = m9960j0().m4590H(xm6Var.m12714f(), str2);
            if (iM4590H != 0) {
                m9960j0();
                m9950d0();
                String strM4577z2 = dn6.m4577z(str2, true, 24);
                Object objM12714f = xm6Var.m12714f();
                int length2 = (objM12714f == null || !((objM12714f instanceof String) || (objM12714f instanceof CharSequence))) ? 0 : objM12714f.toString().length();
                m9960j0();
                dn6.m4564K(bt5Var, cp6Var.f16349d, iM4590H, "_ev", strM4577z2, length2);
                return;
            }
            Object objM4591I = m9960j0().m4591I(xm6Var.m12714f(), str2);
            if (objM4591I != null) {
                String str3 = "_sid";
                if ("_sid".equals(str2)) {
                    long j = xm6Var.f34429f;
                    String str4 = xm6Var.f34432i;
                    y42.m12854a0(str);
                    ar5 ar5Var = this.f28593c;
                    m9925S(ar5Var);
                    an6 an6VarM3202q0 = ar5Var.m3202q0(str, "_sno");
                    if (an6VarM3202q0 != null) {
                        Object obj = an6VarM3202q0.f14649e;
                        if (obj instanceof Long) {
                            jLongValue = ((Long) obj).longValue();
                        } else {
                            if (an6VarM3202q0 != null) {
                                mo9019b().f16838m.m12505b(an6VarM3202q0.f14649e, "Retrieved last session number from database does not contain a valid (long) value");
                            }
                            ar5 ar5Var2 = this.f28593c;
                            m9925S(ar5Var2);
                            fs5VarM3182U = ar5Var2.m3182U("events", str, "_s");
                            if (fs5VarM3182U != null) {
                                x66 x66Var = mo9019b().f16831L;
                                long j2 = fs5VarM3182U.f19256c;
                                x66Var.m12505b(Long.valueOf(j2), "Backfill the session number. Last used session number");
                                jLongValue = j2;
                            } else {
                                jLongValue = 0;
                            }
                        }
                    } else {
                        if (an6VarM3202q0 != null) {
                            mo9019b().f16838m.m12505b(an6VarM3202q0.f14649e, "Retrieved last session number from database does not contain a valid (long) value");
                        }
                        ar5 ar5Var3 = this.f28593c;
                        m9925S(ar5Var3);
                        fs5VarM3182U = ar5Var3.m3182U("events", str, "_s");
                        if (fs5VarM3182U != null) {
                            x66 x66Var2 = mo9019b().f16831L;
                            long j3 = fs5VarM3182U.f19256c;
                            x66Var2.m12505b(Long.valueOf(j3), "Backfill the session number. Last used session number");
                            jLongValue = j3;
                        } else {
                            jLongValue = 0;
                        }
                    }
                    m9941U(new xm6(j, Long.valueOf(jLongValue + 1), "_sno", str4), cp6Var);
                } else {
                    str3 = "_sid";
                }
                y42.m12854a0(str);
                String str5 = xm6Var.f34432i;
                y42.m12854a0(str5);
                an6 an6Var = new an6(str, str5, str2, xm6Var.f34429f, objM4591I);
                x66 x66Var3 = mo9019b().f16831L;
                oa6 oa6Var = this.f28602l;
                p66 p66Var = oa6Var.f26518j;
                String str6 = an6Var.f14647c;
                x66Var3.m12506c("Setting user property", p66Var.m9368c(str6), objM4591I);
                ar5 ar5Var4 = this.f28593c;
                m9925S(ar5Var4);
                ar5Var4.m3194i0();
                try {
                    boolean zEquals = "_id".equals(str6);
                    Object obj2 = an6Var.f14649e;
                    if (zEquals) {
                        ar5 ar5Var5 = this.f28593c;
                        m9925S(ar5Var5);
                        an6 an6VarM3202q1 = ar5Var5.m3202q0(str, "_id");
                        if (an6VarM3202q1 != null && !obj2.equals(an6VarM3202q1.f14649e)) {
                            ar5 ar5Var6 = this.f28593c;
                            m9925S(ar5Var6);
                            ar5Var6.m3200o0(str, "_lair");
                        }
                    }
                    m9948a0(cp6Var);
                    ar5 ar5Var7 = this.f28593c;
                    m9925S(ar5Var7);
                    boolean zM3201p0 = ar5Var7.m3201p0(an6Var);
                    if (str3.equals(str2)) {
                        q76 q76Var = this.f28597g;
                        m9925S(q76Var);
                        String str7 = cp6Var.f16369x;
                        long jM9796i0 = TextUtils.isEmpty(str7) ? 0L : q76Var.m9796i0(str7.getBytes(Charset.forName("UTF-8")));
                        ar5 ar5Var8 = this.f28593c;
                        m9925S(ar5Var8);
                        z76 z76VarM3212y0 = ar5Var8.m3212y0(str);
                        if (z76VarM3212y0 != null) {
                            z76VarM3212y0.m13401A(jM9796i0);
                            if (z76VarM3212y0.m13434o()) {
                                ar5 ar5Var9 = this.f28593c;
                                m9925S(ar5Var9);
                                ar5Var9.m3214z0(z76VarM3212y0, false);
                            }
                        }
                    }
                    ar5 ar5Var10 = this.f28593c;
                    m9925S(ar5Var10);
                    ar5Var10.m3195j0();
                    if (!zM3201p0) {
                        mo9019b().f16835j.m12506c("Too many unique user properties are set. Ignoring user property", oa6Var.f26518j.m9368c(str6), obj2);
                        m9960j0();
                        dn6.m4564K(bt5Var, str, 9, null, null, 0);
                    }
                } finally {
                    ar5 ar5Var11 = this.f28593c;
                    m9925S(ar5Var11);
                    ar5Var11.m3196k0();
                }
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m9942V(String str, cp6 cp6Var) {
        mo9020c().mo5038t();
        m9962k0();
        boolean zM9923Q = m9923Q(cp6Var);
        String str2 = cp6Var.f16349d;
        if (zM9923Q) {
            if (!cp6Var.f16356k) {
                m9948a0(cp6Var);
                return;
            }
            Boolean boolM9926T = m9926T(cp6Var);
            if ("_npa".equals(str) && boolM9926T != null) {
                mo9019b().f16842q.m12504a("Falling back to manifest metadata value for ad personalization");
                mo9022e().getClass();
                m9941U(new xm6(System.currentTimeMillis(), Long.valueOf(true != boolM9926T.booleanValue() ? 0L : 1L), "_npa", "auto"), cp6Var);
                return;
            }
            x66 x66Var = mo9019b().f16842q;
            oa6 oa6Var = this.f28602l;
            x66Var.m12505b(oa6Var.f26518j.m9368c(str), "Removing user property");
            ar5 ar5Var = this.f28593c;
            m9925S(ar5Var);
            ar5Var.m3194i0();
            try {
                m9948a0(cp6Var);
                if ("_id".equals(str)) {
                    ar5 ar5Var2 = this.f28593c;
                    m9925S(ar5Var2);
                    y42.m12854a0(str2);
                    ar5Var2.m3200o0(str2, "_lair");
                }
                ar5 ar5Var3 = this.f28593c;
                m9925S(ar5Var3);
                y42.m12854a0(str2);
                ar5Var3.m3200o0(str2, str);
                ar5 ar5Var4 = this.f28593c;
                m9925S(ar5Var4);
                ar5Var4.m3195j0();
                mo9019b().f16842q.m12505b(oa6Var.f26518j.m9368c(str), "User property removed");
            } finally {
                ar5 ar5Var5 = this.f28593c;
                m9925S(ar5Var5);
                ar5Var5.m3196k0();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x029f A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0122, B:56:0x0139, B:59:0x014e, B:62:0x0172, B:65:0x017d, B:67:0x0193, B:105:0x0273, B:107:0x029f, B:108:0x02a2, B:110:0x02c1, B:152:0x0399, B:153:0x039c, B:161:0x0426, B:113:0x02d7, B:118:0x02f6, B:120:0x02fe, B:122:0x0306, B:126:0x0319, B:131:0x0338, B:135:0x0344, B:138:0x035b, B:143:0x037a, B:145:0x0382, B:147:0x038a, B:149:0x0390, B:141:0x0368, B:129:0x032a, B:116:0x02e4, B:69:0x01a2, B:71:0x01d3, B:72:0x01de, B:74:0x01e5, B:76:0x01eb, B:78:0x01f5, B:80:0x01fb, B:82:0x0201, B:84:0x0207, B:85:0x020c, B:87:0x021e, B:89:0x0224, B:95:0x0234, B:101:0x023e, B:102:0x024f, B:103:0x025b, B:104:0x0267, B:154:0x03b5, B:156:0x03e8, B:157:0x03eb, B:158:0x0403, B:160:0x040a, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x02c1 A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0122, B:56:0x0139, B:59:0x014e, B:62:0x0172, B:65:0x017d, B:67:0x0193, B:105:0x0273, B:107:0x029f, B:108:0x02a2, B:110:0x02c1, B:152:0x0399, B:153:0x039c, B:161:0x0426, B:113:0x02d7, B:118:0x02f6, B:120:0x02fe, B:122:0x0306, B:126:0x0319, B:131:0x0338, B:135:0x0344, B:138:0x035b, B:143:0x037a, B:145:0x0382, B:147:0x038a, B:149:0x0390, B:141:0x0368, B:129:0x032a, B:116:0x02e4, B:69:0x01a2, B:71:0x01d3, B:72:0x01de, B:74:0x01e5, B:76:0x01eb, B:78:0x01f5, B:80:0x01fb, B:82:0x0201, B:84:0x0207, B:85:0x020c, B:87:0x021e, B:89:0x0224, B:95:0x0234, B:101:0x023e, B:102:0x024f, B:103:0x025b, B:104:0x0267, B:154:0x03b5, B:156:0x03e8, B:157:0x03eb, B:158:0x0403, B:160:0x040a, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x02f6 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0122, B:56:0x0139, B:59:0x014e, B:62:0x0172, B:65:0x017d, B:67:0x0193, B:105:0x0273, B:107:0x029f, B:108:0x02a2, B:110:0x02c1, B:152:0x0399, B:153:0x039c, B:161:0x0426, B:113:0x02d7, B:118:0x02f6, B:120:0x02fe, B:122:0x0306, B:126:0x0319, B:131:0x0338, B:135:0x0344, B:138:0x035b, B:143:0x037a, B:145:0x0382, B:147:0x038a, B:149:0x0390, B:141:0x0368, B:129:0x032a, B:116:0x02e4, B:69:0x01a2, B:71:0x01d3, B:72:0x01de, B:74:0x01e5, B:76:0x01eb, B:78:0x01f5, B:80:0x01fb, B:82:0x0201, B:84:0x0207, B:85:0x020c, B:87:0x021e, B:89:0x0224, B:95:0x0234, B:101:0x023e, B:102:0x024f, B:103:0x025b, B:104:0x0267, B:154:0x03b5, B:156:0x03e8, B:157:0x03eb, B:158:0x0403, B:160:0x040a, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x02fe A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0122, B:56:0x0139, B:59:0x014e, B:62:0x0172, B:65:0x017d, B:67:0x0193, B:105:0x0273, B:107:0x029f, B:108:0x02a2, B:110:0x02c1, B:152:0x0399, B:153:0x039c, B:161:0x0426, B:113:0x02d7, B:118:0x02f6, B:120:0x02fe, B:122:0x0306, B:126:0x0319, B:131:0x0338, B:135:0x0344, B:138:0x035b, B:143:0x037a, B:145:0x0382, B:147:0x038a, B:149:0x0390, B:141:0x0368, B:129:0x032a, B:116:0x02e4, B:69:0x01a2, B:71:0x01d3, B:72:0x01de, B:74:0x01e5, B:76:0x01eb, B:78:0x01f5, B:80:0x01fb, B:82:0x0201, B:84:0x0207, B:85:0x020c, B:87:0x021e, B:89:0x0224, B:95:0x0234, B:101:0x023e, B:102:0x024f, B:103:0x025b, B:104:0x0267, B:154:0x03b5, B:156:0x03e8, B:157:0x03eb, B:158:0x0403, B:160:0x040a, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0306 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0122, B:56:0x0139, B:59:0x014e, B:62:0x0172, B:65:0x017d, B:67:0x0193, B:105:0x0273, B:107:0x029f, B:108:0x02a2, B:110:0x02c1, B:152:0x0399, B:153:0x039c, B:161:0x0426, B:113:0x02d7, B:118:0x02f6, B:120:0x02fe, B:122:0x0306, B:126:0x0319, B:131:0x0338, B:135:0x0344, B:138:0x035b, B:143:0x037a, B:145:0x0382, B:147:0x038a, B:149:0x0390, B:141:0x0368, B:129:0x032a, B:116:0x02e4, B:69:0x01a2, B:71:0x01d3, B:72:0x01de, B:74:0x01e5, B:76:0x01eb, B:78:0x01f5, B:80:0x01fb, B:82:0x0201, B:84:0x0207, B:85:0x020c, B:87:0x021e, B:89:0x0224, B:95:0x0234, B:101:0x023e, B:102:0x024f, B:103:0x025b, B:104:0x0267, B:154:0x03b5, B:156:0x03e8, B:157:0x03eb, B:158:0x0403, B:160:0x040a, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0313  */
    /* JADX WARN: Code duplicated, block: B:126:0x0319 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0122, B:56:0x0139, B:59:0x014e, B:62:0x0172, B:65:0x017d, B:67:0x0193, B:105:0x0273, B:107:0x029f, B:108:0x02a2, B:110:0x02c1, B:152:0x0399, B:153:0x039c, B:161:0x0426, B:113:0x02d7, B:118:0x02f6, B:120:0x02fe, B:122:0x0306, B:126:0x0319, B:131:0x0338, B:135:0x0344, B:138:0x035b, B:143:0x037a, B:145:0x0382, B:147:0x038a, B:149:0x0390, B:141:0x0368, B:129:0x032a, B:116:0x02e4, B:69:0x01a2, B:71:0x01d3, B:72:0x01de, B:74:0x01e5, B:76:0x01eb, B:78:0x01f5, B:80:0x01fb, B:82:0x0201, B:84:0x0207, B:85:0x020c, B:87:0x021e, B:89:0x0224, B:95:0x0234, B:101:0x023e, B:102:0x024f, B:103:0x025b, B:104:0x0267, B:154:0x03b5, B:156:0x03e8, B:157:0x03eb, B:158:0x0403, B:160:0x040a, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0324  */
    /* JADX WARN: Code duplicated, block: B:129:0x032a A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0122, B:56:0x0139, B:59:0x014e, B:62:0x0172, B:65:0x017d, B:67:0x0193, B:105:0x0273, B:107:0x029f, B:108:0x02a2, B:110:0x02c1, B:152:0x0399, B:153:0x039c, B:161:0x0426, B:113:0x02d7, B:118:0x02f6, B:120:0x02fe, B:122:0x0306, B:126:0x0319, B:131:0x0338, B:135:0x0344, B:138:0x035b, B:143:0x037a, B:145:0x0382, B:147:0x038a, B:149:0x0390, B:141:0x0368, B:129:0x032a, B:116:0x02e4, B:69:0x01a2, B:71:0x01d3, B:72:0x01de, B:74:0x01e5, B:76:0x01eb, B:78:0x01f5, B:80:0x01fb, B:82:0x0201, B:84:0x0207, B:85:0x020c, B:87:0x021e, B:89:0x0224, B:95:0x0234, B:101:0x023e, B:102:0x024f, B:103:0x025b, B:104:0x0267, B:154:0x03b5, B:156:0x03e8, B:157:0x03eb, B:158:0x0403, B:160:0x040a, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0332  */
    /* JADX WARN: Code duplicated, block: B:133:0x033f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0342  */
    /* JADX WARN: Code duplicated, block: B:137:0x0357  */
    /* JADX WARN: Code duplicated, block: B:143:0x037a A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0122, B:56:0x0139, B:59:0x014e, B:62:0x0172, B:65:0x017d, B:67:0x0193, B:105:0x0273, B:107:0x029f, B:108:0x02a2, B:110:0x02c1, B:152:0x0399, B:153:0x039c, B:161:0x0426, B:113:0x02d7, B:118:0x02f6, B:120:0x02fe, B:122:0x0306, B:126:0x0319, B:131:0x0338, B:135:0x0344, B:138:0x035b, B:143:0x037a, B:145:0x0382, B:147:0x038a, B:149:0x0390, B:141:0x0368, B:129:0x032a, B:116:0x02e4, B:69:0x01a2, B:71:0x01d3, B:72:0x01de, B:74:0x01e5, B:76:0x01eb, B:78:0x01f5, B:80:0x01fb, B:82:0x0201, B:84:0x0207, B:85:0x020c, B:87:0x021e, B:89:0x0224, B:95:0x0234, B:101:0x023e, B:102:0x024f, B:103:0x025b, B:104:0x0267, B:154:0x03b5, B:156:0x03e8, B:157:0x03eb, B:158:0x0403, B:160:0x040a, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0382 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0122, B:56:0x0139, B:59:0x014e, B:62:0x0172, B:65:0x017d, B:67:0x0193, B:105:0x0273, B:107:0x029f, B:108:0x02a2, B:110:0x02c1, B:152:0x0399, B:153:0x039c, B:161:0x0426, B:113:0x02d7, B:118:0x02f6, B:120:0x02fe, B:122:0x0306, B:126:0x0319, B:131:0x0338, B:135:0x0344, B:138:0x035b, B:143:0x037a, B:145:0x0382, B:147:0x038a, B:149:0x0390, B:141:0x0368, B:129:0x032a, B:116:0x02e4, B:69:0x01a2, B:71:0x01d3, B:72:0x01de, B:74:0x01e5, B:76:0x01eb, B:78:0x01f5, B:80:0x01fb, B:82:0x0201, B:84:0x0207, B:85:0x020c, B:87:0x021e, B:89:0x0224, B:95:0x0234, B:101:0x023e, B:102:0x024f, B:103:0x025b, B:104:0x0267, B:154:0x03b5, B:156:0x03e8, B:157:0x03eb, B:158:0x0403, B:160:0x040a, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0388  */
    /* JADX WARN: Code duplicated, block: B:149:0x0390 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0122, B:56:0x0139, B:59:0x014e, B:62:0x0172, B:65:0x017d, B:67:0x0193, B:105:0x0273, B:107:0x029f, B:108:0x02a2, B:110:0x02c1, B:152:0x0399, B:153:0x039c, B:161:0x0426, B:113:0x02d7, B:118:0x02f6, B:120:0x02fe, B:122:0x0306, B:126:0x0319, B:131:0x0338, B:135:0x0344, B:138:0x035b, B:143:0x037a, B:145:0x0382, B:147:0x038a, B:149:0x0390, B:141:0x0368, B:129:0x032a, B:116:0x02e4, B:69:0x01a2, B:71:0x01d3, B:72:0x01de, B:74:0x01e5, B:76:0x01eb, B:78:0x01f5, B:80:0x01fb, B:82:0x0201, B:84:0x0207, B:85:0x020c, B:87:0x021e, B:89:0x0224, B:95:0x0234, B:101:0x023e, B:102:0x024f, B:103:0x025b, B:104:0x0267, B:154:0x03b5, B:156:0x03e8, B:157:0x03eb, B:158:0x0403, B:160:0x040a, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0399 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0122, B:56:0x0139, B:59:0x014e, B:62:0x0172, B:65:0x017d, B:67:0x0193, B:105:0x0273, B:107:0x029f, B:108:0x02a2, B:110:0x02c1, B:152:0x0399, B:153:0x039c, B:161:0x0426, B:113:0x02d7, B:118:0x02f6, B:120:0x02fe, B:122:0x0306, B:126:0x0319, B:131:0x0338, B:135:0x0344, B:138:0x035b, B:143:0x037a, B:145:0x0382, B:147:0x038a, B:149:0x0390, B:141:0x0368, B:129:0x032a, B:116:0x02e4, B:69:0x01a2, B:71:0x01d3, B:72:0x01de, B:74:0x01e5, B:76:0x01eb, B:78:0x01f5, B:80:0x01fb, B:82:0x0201, B:84:0x0207, B:85:0x020c, B:87:0x021e, B:89:0x0224, B:95:0x0234, B:101:0x023e, B:102:0x024f, B:103:0x025b, B:104:0x0267, B:154:0x03b5, B:156:0x03e8, B:157:0x03eb, B:158:0x0403, B:160:0x040a, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x03b5 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0122, B:56:0x0139, B:59:0x014e, B:62:0x0172, B:65:0x017d, B:67:0x0193, B:105:0x0273, B:107:0x029f, B:108:0x02a2, B:110:0x02c1, B:152:0x0399, B:153:0x039c, B:161:0x0426, B:113:0x02d7, B:118:0x02f6, B:120:0x02fe, B:122:0x0306, B:126:0x0319, B:131:0x0338, B:135:0x0344, B:138:0x035b, B:143:0x037a, B:145:0x0382, B:147:0x038a, B:149:0x0390, B:141:0x0368, B:129:0x032a, B:116:0x02e4, B:69:0x01a2, B:71:0x01d3, B:72:0x01de, B:74:0x01e5, B:76:0x01eb, B:78:0x01f5, B:80:0x01fb, B:82:0x0201, B:84:0x0207, B:85:0x020c, B:87:0x021e, B:89:0x0224, B:95:0x0234, B:101:0x023e, B:102:0x024f, B:103:0x025b, B:104:0x0267, B:154:0x03b5, B:156:0x03e8, B:157:0x03eb, B:158:0x0403, B:160:0x040a, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x03e8 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0122, B:56:0x0139, B:59:0x014e, B:62:0x0172, B:65:0x017d, B:67:0x0193, B:105:0x0273, B:107:0x029f, B:108:0x02a2, B:110:0x02c1, B:152:0x0399, B:153:0x039c, B:161:0x0426, B:113:0x02d7, B:118:0x02f6, B:120:0x02fe, B:122:0x0306, B:126:0x0319, B:131:0x0338, B:135:0x0344, B:138:0x035b, B:143:0x037a, B:145:0x0382, B:147:0x038a, B:149:0x0390, B:141:0x0368, B:129:0x032a, B:116:0x02e4, B:69:0x01a2, B:71:0x01d3, B:72:0x01de, B:74:0x01e5, B:76:0x01eb, B:78:0x01f5, B:80:0x01fb, B:82:0x0201, B:84:0x0207, B:85:0x020c, B:87:0x021e, B:89:0x0224, B:95:0x0234, B:101:0x023e, B:102:0x024f, B:103:0x025b, B:104:0x0267, B:154:0x03b5, B:156:0x03e8, B:157:0x03eb, B:158:0x0403, B:160:0x040a, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0403 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0122, B:56:0x0139, B:59:0x014e, B:62:0x0172, B:65:0x017d, B:67:0x0193, B:105:0x0273, B:107:0x029f, B:108:0x02a2, B:110:0x02c1, B:152:0x0399, B:153:0x039c, B:161:0x0426, B:113:0x02d7, B:118:0x02f6, B:120:0x02fe, B:122:0x0306, B:126:0x0319, B:131:0x0338, B:135:0x0344, B:138:0x035b, B:143:0x037a, B:145:0x0382, B:147:0x038a, B:149:0x0390, B:141:0x0368, B:129:0x032a, B:116:0x02e4, B:69:0x01a2, B:71:0x01d3, B:72:0x01de, B:74:0x01e5, B:76:0x01eb, B:78:0x01f5, B:80:0x01fb, B:82:0x0201, B:84:0x0207, B:85:0x020c, B:87:0x021e, B:89:0x0224, B:95:0x0234, B:101:0x023e, B:102:0x024f, B:103:0x025b, B:104:0x0267, B:154:0x03b5, B:156:0x03e8, B:157:0x03eb, B:158:0x0403, B:160:0x040a, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x040a A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0122, B:56:0x0139, B:59:0x014e, B:62:0x0172, B:65:0x017d, B:67:0x0193, B:105:0x0273, B:107:0x029f, B:108:0x02a2, B:110:0x02c1, B:152:0x0399, B:153:0x039c, B:161:0x0426, B:113:0x02d7, B:118:0x02f6, B:120:0x02fe, B:122:0x0306, B:126:0x0319, B:131:0x0338, B:135:0x0344, B:138:0x035b, B:143:0x037a, B:145:0x0382, B:147:0x038a, B:149:0x0390, B:141:0x0368, B:129:0x032a, B:116:0x02e4, B:69:0x01a2, B:71:0x01d3, B:72:0x01de, B:74:0x01e5, B:76:0x01eb, B:78:0x01f5, B:80:0x01fb, B:82:0x0201, B:84:0x0207, B:85:0x020c, B:87:0x021e, B:89:0x0224, B:95:0x0234, B:101:0x023e, B:102:0x024f, B:103:0x025b, B:104:0x0267, B:154:0x03b5, B:156:0x03e8, B:157:0x03eb, B:158:0x0403, B:160:0x040a, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x02d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x010c A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0122, B:56:0x0139, B:59:0x014e, B:62:0x0172, B:65:0x017d, B:67:0x0193, B:105:0x0273, B:107:0x029f, B:108:0x02a2, B:110:0x02c1, B:152:0x0399, B:153:0x039c, B:161:0x0426, B:113:0x02d7, B:118:0x02f6, B:120:0x02fe, B:122:0x0306, B:126:0x0319, B:131:0x0338, B:135:0x0344, B:138:0x035b, B:143:0x037a, B:145:0x0382, B:147:0x038a, B:149:0x0390, B:141:0x0368, B:129:0x032a, B:116:0x02e4, B:69:0x01a2, B:71:0x01d3, B:72:0x01de, B:74:0x01e5, B:76:0x01eb, B:78:0x01f5, B:80:0x01fb, B:82:0x0201, B:84:0x0207, B:85:0x020c, B:87:0x021e, B:89:0x0224, B:95:0x0234, B:101:0x023e, B:102:0x024f, B:103:0x025b, B:104:0x0267, B:154:0x03b5, B:156:0x03e8, B:157:0x03eb, B:158:0x0403, B:160:0x040a, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0116 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0122, B:56:0x0139, B:59:0x014e, B:62:0x0172, B:65:0x017d, B:67:0x0193, B:105:0x0273, B:107:0x029f, B:108:0x02a2, B:110:0x02c1, B:152:0x0399, B:153:0x039c, B:161:0x0426, B:113:0x02d7, B:118:0x02f6, B:120:0x02fe, B:122:0x0306, B:126:0x0319, B:131:0x0338, B:135:0x0344, B:138:0x035b, B:143:0x037a, B:145:0x0382, B:147:0x038a, B:149:0x0390, B:141:0x0368, B:129:0x032a, B:116:0x02e4, B:69:0x01a2, B:71:0x01d3, B:72:0x01de, B:74:0x01e5, B:76:0x01eb, B:78:0x01f5, B:80:0x01fb, B:82:0x0201, B:84:0x0207, B:85:0x020c, B:87:0x021e, B:89:0x0224, B:95:0x0234, B:101:0x023e, B:102:0x024f, B:103:0x025b, B:104:0x0267, B:154:0x03b5, B:156:0x03e8, B:157:0x03eb, B:158:0x0403, B:160:0x040a, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0122 A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0122, B:56:0x0139, B:59:0x014e, B:62:0x0172, B:65:0x017d, B:67:0x0193, B:105:0x0273, B:107:0x029f, B:108:0x02a2, B:110:0x02c1, B:152:0x0399, B:153:0x039c, B:161:0x0426, B:113:0x02d7, B:118:0x02f6, B:120:0x02fe, B:122:0x0306, B:126:0x0319, B:131:0x0338, B:135:0x0344, B:138:0x035b, B:143:0x037a, B:145:0x0382, B:147:0x038a, B:149:0x0390, B:141:0x0368, B:129:0x032a, B:116:0x02e4, B:69:0x01a2, B:71:0x01d3, B:72:0x01de, B:74:0x01e5, B:76:0x01eb, B:78:0x01f5, B:80:0x01fb, B:82:0x0201, B:84:0x0207, B:85:0x020c, B:87:0x021e, B:89:0x0224, B:95:0x0234, B:101:0x023e, B:102:0x024f, B:103:0x025b, B:104:0x0267, B:154:0x03b5, B:156:0x03e8, B:157:0x03eb, B:158:0x0403, B:160:0x040a, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x012d A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0122, B:56:0x0139, B:59:0x014e, B:62:0x0172, B:65:0x017d, B:67:0x0193, B:105:0x0273, B:107:0x029f, B:108:0x02a2, B:110:0x02c1, B:152:0x0399, B:153:0x039c, B:161:0x0426, B:113:0x02d7, B:118:0x02f6, B:120:0x02fe, B:122:0x0306, B:126:0x0319, B:131:0x0338, B:135:0x0344, B:138:0x035b, B:143:0x037a, B:145:0x0382, B:147:0x038a, B:149:0x0390, B:141:0x0368, B:129:0x032a, B:116:0x02e4, B:69:0x01a2, B:71:0x01d3, B:72:0x01de, B:74:0x01e5, B:76:0x01eb, B:78:0x01f5, B:80:0x01fb, B:82:0x0201, B:84:0x0207, B:85:0x020c, B:87:0x021e, B:89:0x0224, B:95:0x0234, B:101:0x023e, B:102:0x024f, B:103:0x025b, B:104:0x0267, B:154:0x03b5, B:156:0x03e8, B:157:0x03eb, B:158:0x0403, B:160:0x040a, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0139 A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0122, B:56:0x0139, B:59:0x014e, B:62:0x0172, B:65:0x017d, B:67:0x0193, B:105:0x0273, B:107:0x029f, B:108:0x02a2, B:110:0x02c1, B:152:0x0399, B:153:0x039c, B:161:0x0426, B:113:0x02d7, B:118:0x02f6, B:120:0x02fe, B:122:0x0306, B:126:0x0319, B:131:0x0338, B:135:0x0344, B:138:0x035b, B:143:0x037a, B:145:0x0382, B:147:0x038a, B:149:0x0390, B:141:0x0368, B:129:0x032a, B:116:0x02e4, B:69:0x01a2, B:71:0x01d3, B:72:0x01de, B:74:0x01e5, B:76:0x01eb, B:78:0x01f5, B:80:0x01fb, B:82:0x0201, B:84:0x0207, B:85:0x020c, B:87:0x021e, B:89:0x0224, B:95:0x0234, B:101:0x023e, B:102:0x024f, B:103:0x025b, B:104:0x0267, B:154:0x03b5, B:156:0x03e8, B:157:0x03eb, B:158:0x0403, B:160:0x040a, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x014e A[Catch: all -> 0x00c4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0122, B:56:0x0139, B:59:0x014e, B:62:0x0172, B:65:0x017d, B:67:0x0193, B:105:0x0273, B:107:0x029f, B:108:0x02a2, B:110:0x02c1, B:152:0x0399, B:153:0x039c, B:161:0x0426, B:113:0x02d7, B:118:0x02f6, B:120:0x02fe, B:122:0x0306, B:126:0x0319, B:131:0x0338, B:135:0x0344, B:138:0x035b, B:143:0x037a, B:145:0x0382, B:147:0x038a, B:149:0x0390, B:141:0x0368, B:129:0x032a, B:116:0x02e4, B:69:0x01a2, B:71:0x01d3, B:72:0x01de, B:74:0x01e5, B:76:0x01eb, B:78:0x01f5, B:80:0x01fb, B:82:0x0201, B:84:0x0207, B:85:0x020c, B:87:0x021e, B:89:0x0224, B:95:0x0234, B:101:0x023e, B:102:0x024f, B:103:0x025b, B:104:0x0267, B:154:0x03b5, B:156:0x03e8, B:157:0x03eb, B:158:0x0403, B:160:0x040a, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:170:0x00a4, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0178  */
    /* JADX INFO: renamed from: W */
    public final void m9943W(cp6 cp6Var) throws Throwable {
        long j;
        long j2;
        ar5 ar5Var;
        fs5 fs5VarM3182U;
        boolean z;
        long j3;
        long j4;
        Bundle bundle;
        long j5;
        oa6 oa6Var;
        oa6 oa6Var2;
        Bundle bundle2;
        long jM3170I;
        oa6 oa6Var3;
        PackageInfo packageInfoM12998b;
        cp6 cp6Var2;
        Bundle bundle3;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfoM12997a;
        long j6;
        long j7;
        long j8;
        boolean z2;
        long j9;
        oa6 oa6Var4 = this.f28602l;
        mo9020c().mo5038t();
        m9962k0();
        y42.m12854a0(cp6Var);
        boolean z3 = cp6Var.f16363r;
        String str = cp6Var.f16349d;
        y42.m12851X(str);
        if (m9923Q(cp6Var)) {
            ar5 ar5Var2 = this.f28593c;
            m9925S(ar5Var2);
            z76 z76VarM3212y0 = ar5Var2.m3212y0(str);
            if (z76VarM3212y0 != null && TextUtils.isEmpty(z76VarM3212y0.m13407G()) && !TextUtils.isEmpty(cp6Var.f16350e)) {
                z76VarM3212y0.m13425f(0L);
                ar5 ar5Var3 = this.f28593c;
                m9925S(ar5Var3);
                ar5Var3.m3214z0(z76VarM3212y0, false);
                n96 n96Var = this.f28591a;
                m9925S(n96Var);
                n96Var.mo5038t();
                n96Var.f25585l.remove(str);
            }
            if (!cp6Var.f16356k) {
                m9948a0(cp6Var);
                return;
            }
            long jCurrentTimeMillis = cp6Var.f16360o;
            if (jCurrentTimeMillis == 0) {
                mo9022e().getClass();
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            long j10 = jCurrentTimeMillis;
            int i = cp6Var.f16361p;
            if (i != 0 && i != 1) {
                mo9019b().f16838m.m12506c("Incorrect app type, assuming installed app. appId, appType", d76.m4401y(str), Integer.valueOf(i));
                i = 0;
            }
            ar5 ar5Var4 = this.f28593c;
            m9925S(ar5Var4);
            ar5Var4.m3194i0();
            try {
                ar5 ar5Var5 = this.f28593c;
                m9925S(ar5Var5);
                an6 an6VarM3202q0 = ar5Var5.m3202q0(str, "_npa");
                Boolean boolM9926T = m9926T(cp6Var);
                if (an6VarM3202q0 != null) {
                    j = 1;
                    if (!"auto".equals(an6VarM3202q0.f14646b)) {
                        j2 = j10;
                    }
                    if (m9950d0().m9225E(null, e56.f17777c1)) {
                        m9946Z(cp6Var, cp6Var.f16347G);
                        j2 = j2;
                    } else {
                        m9946Z(cp6Var, j2);
                    }
                    m9948a0(cp6Var);
                    ar5Var = this.f28593c;
                    if (i == 0) {
                        m9925S(ar5Var);
                        fs5VarM3182U = ar5Var.m3182U("events", str, "_f");
                        z = false;
                    } else {
                        m9925S(ar5Var);
                        fs5VarM3182U = ar5Var.m3182U("events", str, "_v");
                        z = true;
                    }
                    if (fs5VarM3182U == null) {
                        j4 = ((j2 / 3600000) + j) * 3600000;
                        if (z) {
                            Long lValueOf = Long.valueOf(j4);
                            long j11 = j2;
                            m9941U(new xm6(j11, lValueOf, "_fvt", "auto"), cp6Var);
                            mo9020c().mo5038t();
                            m9962k0();
                            bundle = new Bundle();
                            bundle.putLong("_c", 1L);
                            bundle.putLong("_r", 1L);
                            bundle.putLong("_et", 1L);
                            if (z3) {
                                bundle.putLong("_dac", 1L);
                            }
                            m9957i(new ys5("_v", new os5(bundle), "auto", j11), cp6Var);
                        } else {
                            Long lValueOf2 = Long.valueOf(j4);
                            j5 = j2;
                            m9941U(new xm6(j5, lValueOf2, "_fot", "auto"), cp6Var);
                            mo9020c().mo5038t();
                            y86 y86Var = this.f28601k;
                            y42.m12854a0(y86Var);
                            oa6Var = y86Var.f35029b;
                            if (str != null || str.isEmpty()) {
                                oa6Var2 = oa6Var4;
                                d76 d76Var = oa6Var.f26514f;
                                oa6.m9016l(d76Var);
                                d76Var.f16839n.m12504a("Install Referrer Reporter was called with invalid app package name");
                            } else {
                                ea6 ea6Var = oa6Var.f26515g;
                                Context context = oa6Var.f26509a;
                                d76 d76Var2 = oa6Var.f26514f;
                                oa6.m9016l(ea6Var);
                                ea6Var.mo5038t();
                                if (y86Var.m13049a()) {
                                    v86 v86Var = new v86();
                                    v86Var.f32468b = y86Var;
                                    v86Var.f32467a = str;
                                    VarHandle.storeStoreFence();
                                    ea6 ea6Var2 = oa6Var.f26515g;
                                    oa6.m9016l(ea6Var2);
                                    ea6Var2.mo5038t();
                                    Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                    oa6Var2 = oa6Var4;
                                    intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                    PackageManager packageManager = context.getPackageManager();
                                    if (packageManager == null) {
                                        oa6.m9016l(d76Var2);
                                        d76Var2.f16839n.m12504a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                    } else {
                                        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                                            oa6.m9016l(d76Var2);
                                            d76Var2.f16841p.m12504a("Play Service for fetching Install Referrer is unavailable on device");
                                        } else {
                                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                                            if (serviceInfo != null) {
                                                String str2 = serviceInfo.packageName;
                                                if (serviceInfo.name != null && "com.android.vending".equals(str2) && y86Var.m13049a()) {
                                                    try {
                                                        try {
                                                            boolean zM3134E = ar3.m3128s().m3134E(context, context.getClass().getName(), new Intent(intent), v86Var, 1, null);
                                                            try {
                                                                oa6.m9016l(d76Var2);
                                                                d76Var2.f16831L.m12505b(zM3134E ? "available" : "not available", "Install Referrer Service is");
                                                            } catch (RuntimeException e) {
                                                                e = e;
                                                                d76 d76Var3 = oa6Var.f26514f;
                                                                oa6.m9016l(d76Var3);
                                                                d76Var3.f16835j.m12505b(e.getMessage(), "Exception occurred while binding to Install Referrer Service");
                                                            }
                                                        } catch (RuntimeException e2) {
                                                            e = e2;
                                                        }
                                                    } catch (RuntimeException e3) {
                                                        e = e3;
                                                    }
                                                } else {
                                                    oa6.m9016l(d76Var2);
                                                    d76Var2.f16838m.m12504a("Play Store version 8.3.73 or higher required for Install Referrer");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    oa6.m9016l(d76Var2);
                                    d76Var2.f16841p.m12504a("Install Referrer Reporter is not available");
                                    oa6Var2 = oa6Var4;
                                }
                            }
                            mo9020c().mo5038t();
                            m9962k0();
                            bundle2 = new Bundle();
                            long j12 = j;
                            bundle2.putLong("_c", j12);
                            bundle2.putLong("_r", j12);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong("_et", 1L);
                            if (z3) {
                                bundle2.putLong("_dac", 1L);
                            }
                            y42.m12854a0(str);
                            ar5 ar5Var6 = this.f28593c;
                            m9925S(ar5Var6);
                            y42.m12851X(str);
                            ar5Var6.mo5038t();
                            ar5Var6.m10368u();
                            jM3170I = ar5Var6.m3170I(str);
                            oa6Var3 = oa6Var2;
                            if (oa6Var3.f26509a.getPackageManager() == null) {
                                mo9019b().f16835j.m12505b(d76.m4401y(str), "PackageManager is null, first open report might be inaccurate. appId");
                                cp6Var2 = cp6Var;
                                bundle3 = bundle2;
                            } else {
                                try {
                                    packageInfoM12998b = r35.m10189a(oa6Var3.f26509a).m12998b(0, str);
                                } catch (PackageManager.NameNotFoundException e4) {
                                    mo9019b().f16835j.m12506c("Package info is null, first open report might be inaccurate. appId", d76.m4401y(str), e4);
                                    packageInfoM12998b = null;
                                }
                                if (packageInfoM12998b != null) {
                                    j7 = packageInfoM12998b.firstInstallTime;
                                    if (j7 != 0) {
                                        if (j7 != packageInfoM12998b.lastUpdateTime) {
                                            applicationInfo = null;
                                            if (m9950d0().m9225E(null, e56.f17734I0)) {
                                                bundle3 = bundle2;
                                                bundle3.putLong("_uwa", 1L);
                                            } else if (jM3170I == 0) {
                                                bundle3 = bundle2;
                                                bundle3.putLong("_uwa", 1L);
                                                z2 = false;
                                                j8 = 0;
                                            } else {
                                                bundle3 = bundle2;
                                            }
                                            j8 = jM3170I;
                                            z2 = false;
                                        } else {
                                            bundle3 = bundle2;
                                            applicationInfo = null;
                                            j8 = jM3170I;
                                            z2 = true;
                                        }
                                        if (true != z2) {
                                            j9 = 0;
                                        } else {
                                            j9 = 1;
                                        }
                                        xm6 xm6Var = new xm6(j5, Long.valueOf(j9), "_fi", "auto");
                                        cp6Var2 = cp6Var;
                                        m9941U(xm6Var, cp6Var2);
                                        jM3170I = j8;
                                    } else {
                                        cp6Var2 = cp6Var;
                                        bundle3 = bundle2;
                                        applicationInfo = null;
                                    }
                                } else {
                                    cp6Var2 = cp6Var;
                                    bundle3 = bundle2;
                                    applicationInfo = null;
                                }
                                try {
                                    applicationInfoM12997a = r35.m10189a(oa6Var3.f26509a).m12997a(0, str);
                                } catch (PackageManager.NameNotFoundException e5) {
                                    mo9019b().f16835j.m12506c("Application info is null, first open report might be inaccurate. appId", d76.m4401y(str), e5);
                                    applicationInfoM12997a = applicationInfo;
                                }
                                if (applicationInfoM12997a != null) {
                                    if ((applicationInfoM12997a.flags & 1) != 0) {
                                        j6 = 1;
                                        bundle3.putLong("_sys", 1L);
                                    } else {
                                        j6 = 1;
                                    }
                                    if ((applicationInfoM12997a.flags & 128) != 0) {
                                        bundle3.putLong("_sysu", j6);
                                    }
                                }
                            }
                            if (jM3170I >= 0) {
                                bundle3.putLong("_pfo", jM3170I);
                            }
                            m9957i(new ys5("_f", new os5(bundle3), "auto", j5), cp6Var2);
                        }
                    } else {
                        j3 = j2;
                        if (cp6Var.f16357l) {
                            m9957i(new ys5("_cd", new os5(new Bundle()), "auto", j3), cp6Var);
                        }
                    }
                    ar5 ar5Var7 = this.f28593c;
                    m9925S(ar5Var7);
                    ar5Var7.m3195j0();
                    ar5 ar5Var8 = this.f28593c;
                    m9925S(ar5Var8);
                    ar5Var8.m3196k0();
                }
                j = 1;
                if (boolM9926T != null) {
                    xm6 xm6Var2 = new xm6(j10, Long.valueOf(true != boolM9926T.booleanValue() ? 0L : j), "_npa", "auto");
                    j2 = j10;
                    if (an6VarM3202q0 == null || !an6VarM3202q0.f14649e.equals(xm6Var2.f34430g)) {
                        m9941U(xm6Var2, cp6Var);
                    }
                } else {
                    j2 = j10;
                    if (an6VarM3202q0 != null) {
                        m9942V("_npa", cp6Var);
                    }
                }
                if (m9950d0().m9225E(null, e56.f17777c1)) {
                    m9946Z(cp6Var, cp6Var.f16347G);
                    j2 = j2;
                } else {
                    m9946Z(cp6Var, j2);
                }
                m9948a0(cp6Var);
                ar5Var = this.f28593c;
                if (i == 0) {
                    m9925S(ar5Var);
                    fs5VarM3182U = ar5Var.m3182U("events", str, "_f");
                    z = false;
                } else {
                    m9925S(ar5Var);
                    fs5VarM3182U = ar5Var.m3182U("events", str, "_v");
                    z = true;
                }
                if (fs5VarM3182U == null) {
                    j4 = ((j2 / 3600000) + j) * 3600000;
                    if (z) {
                        Long lValueOf3 = Long.valueOf(j4);
                        j5 = j2;
                        m9941U(new xm6(j5, lValueOf3, "_fot", "auto"), cp6Var);
                        mo9020c().mo5038t();
                        y86 y86Var2 = this.f28601k;
                        y42.m12854a0(y86Var2);
                        oa6Var = y86Var2.f35029b;
                        if (str != null) {
                            oa6Var2 = oa6Var4;
                            d76 d76Var4 = oa6Var.f26514f;
                            oa6.m9016l(d76Var4);
                            d76Var4.f16839n.m12504a("Install Referrer Reporter was called with invalid app package name");
                        } else {
                            oa6Var2 = oa6Var4;
                            d76 d76Var5 = oa6Var.f26514f;
                            oa6.m9016l(d76Var5);
                            d76Var5.f16839n.m12504a("Install Referrer Reporter was called with invalid app package name");
                        }
                        mo9020c().mo5038t();
                        m9962k0();
                        bundle2 = new Bundle();
                        long j13 = j;
                        bundle2.putLong("_c", j13);
                        bundle2.putLong("_r", j13);
                        bundle2.putLong("_uwa", 0L);
                        bundle2.putLong("_pfo", 0L);
                        bundle2.putLong("_sys", 0L);
                        bundle2.putLong("_sysu", 0L);
                        bundle2.putLong("_et", 1L);
                        if (z3) {
                            bundle2.putLong("_dac", 1L);
                        }
                        y42.m12854a0(str);
                        ar5 ar5Var9 = this.f28593c;
                        m9925S(ar5Var9);
                        y42.m12851X(str);
                        ar5Var9.mo5038t();
                        ar5Var9.m10368u();
                        jM3170I = ar5Var9.m3170I(str);
                        oa6Var3 = oa6Var2;
                        if (oa6Var3.f26509a.getPackageManager() == null) {
                            mo9019b().f16835j.m12505b(d76.m4401y(str), "PackageManager is null, first open report might be inaccurate. appId");
                            cp6Var2 = cp6Var;
                            bundle3 = bundle2;
                        } else {
                            packageInfoM12998b = r35.m10189a(oa6Var3.f26509a).m12998b(0, str);
                            if (packageInfoM12998b != null) {
                                j7 = packageInfoM12998b.firstInstallTime;
                                if (j7 != 0) {
                                    if (j7 != packageInfoM12998b.lastUpdateTime) {
                                        applicationInfo = null;
                                        if (m9950d0().m9225E(null, e56.f17734I0)) {
                                            bundle3 = bundle2;
                                            bundle3.putLong("_uwa", 1L);
                                        } else if (jM3170I == 0) {
                                            bundle3 = bundle2;
                                            bundle3.putLong("_uwa", 1L);
                                            z2 = false;
                                            j8 = 0;
                                        } else {
                                            bundle3 = bundle2;
                                        }
                                        j8 = jM3170I;
                                        z2 = false;
                                    } else {
                                        bundle3 = bundle2;
                                        applicationInfo = null;
                                        j8 = jM3170I;
                                        z2 = true;
                                    }
                                    if (true != z2) {
                                        j9 = 0;
                                    } else {
                                        j9 = 1;
                                    }
                                    xm6 xm6Var3 = new xm6(j5, Long.valueOf(j9), "_fi", "auto");
                                    cp6Var2 = cp6Var;
                                    m9941U(xm6Var3, cp6Var2);
                                    jM3170I = j8;
                                } else {
                                    cp6Var2 = cp6Var;
                                    bundle3 = bundle2;
                                    applicationInfo = null;
                                }
                            } else {
                                cp6Var2 = cp6Var;
                                bundle3 = bundle2;
                                applicationInfo = null;
                            }
                            applicationInfoM12997a = r35.m10189a(oa6Var3.f26509a).m12997a(0, str);
                            if (applicationInfoM12997a != null) {
                                if ((applicationInfoM12997a.flags & 1) != 0) {
                                    j6 = 1;
                                    bundle3.putLong("_sys", 1L);
                                } else {
                                    j6 = 1;
                                }
                                if ((applicationInfoM12997a.flags & 128) != 0) {
                                    bundle3.putLong("_sysu", j6);
                                }
                            }
                        }
                        if (jM3170I >= 0) {
                            bundle3.putLong("_pfo", jM3170I);
                        }
                        m9957i(new ys5("_f", new os5(bundle3), "auto", j5), cp6Var2);
                    } else {
                        Long lValueOf4 = Long.valueOf(j4);
                        long j14 = j2;
                        m9941U(new xm6(j14, lValueOf4, "_fvt", "auto"), cp6Var);
                        mo9020c().mo5038t();
                        m9962k0();
                        bundle = new Bundle();
                        bundle.putLong("_c", 1L);
                        bundle.putLong("_r", 1L);
                        bundle.putLong("_et", 1L);
                        if (z3) {
                            bundle.putLong("_dac", 1L);
                        }
                        m9957i(new ys5("_v", new os5(bundle), "auto", j14), cp6Var);
                    }
                } else {
                    j3 = j2;
                    if (cp6Var.f16357l) {
                        m9957i(new ys5("_cd", new os5(new Bundle()), "auto", j3), cp6Var);
                    }
                }
                ar5 ar5Var10 = this.f28593c;
                m9925S(ar5Var10);
                ar5Var10.m3195j0();
                ar5 ar5Var11 = this.f28593c;
                m9925S(ar5Var11);
                ar5Var11.m3196k0();
            } catch (Throwable th) {
                ar5 ar5Var12 = this.f28593c;
                m9925S(ar5Var12);
                ar5Var12.m3196k0();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m9944X(yo5 yo5Var, cp6 cp6Var) {
        ys5 ys5Var;
        y42.m12851X(yo5Var.f35432d);
        y42.m12854a0(yo5Var.f35433e);
        y42.m12854a0(yo5Var.f35434f);
        y42.m12851X(yo5Var.f35434f.f34428e);
        mo9020c().mo5038t();
        m9962k0();
        if (m9923Q(cp6Var)) {
            if (!cp6Var.f16356k) {
                m9948a0(cp6Var);
                return;
            }
            yo5 yo5Var2 = new yo5(yo5Var);
            boolean z = false;
            yo5Var2.f35436h = false;
            ar5 ar5Var = this.f28593c;
            m9925S(ar5Var);
            ar5Var.m3194i0();
            try {
                ar5 ar5Var2 = this.f28593c;
                m9925S(ar5Var2);
                String str = yo5Var2.f35432d;
                y42.m12854a0(str);
                yo5 yo5VarM3206u0 = ar5Var2.m3206u0(str, yo5Var2.f35434f.f34428e);
                oa6 oa6Var = this.f28602l;
                if (yo5VarM3206u0 != null && !yo5VarM3206u0.f35433e.equals(yo5Var2.f35433e)) {
                    mo9019b().f16838m.m12507d("Updating a conditional user property with different origin. name, origin, origin (from DB)", oa6Var.f26518j.m9368c(yo5Var2.f35434f.f34428e), yo5Var2.f35433e, yo5VarM3206u0.f35433e);
                }
                if (yo5VarM3206u0 != null && yo5VarM3206u0.f35436h) {
                    yo5Var2.f35433e = yo5VarM3206u0.f35433e;
                    yo5Var2.f35435g = yo5VarM3206u0.f35435g;
                    yo5Var2.f35439k = yo5VarM3206u0.f35439k;
                    yo5Var2.f35437i = yo5VarM3206u0.f35437i;
                    yo5Var2.f35440l = yo5VarM3206u0.f35440l;
                    yo5Var2.f35436h = true;
                    xm6 xm6Var = yo5Var2.f35434f;
                    yo5Var2.f35434f = new xm6(yo5VarM3206u0.f35434f.f34429f, xm6Var.m12714f(), xm6Var.f34428e, yo5VarM3206u0.f35434f.f34432i);
                } else if (TextUtils.isEmpty(yo5Var2.f35437i)) {
                    xm6 xm6Var2 = yo5Var2.f35434f;
                    yo5Var2.f35434f = new xm6(yo5Var2.f35435g, xm6Var2.m12714f(), xm6Var2.f34428e, yo5Var2.f35434f.f34432i);
                    yo5Var2.f35436h = true;
                    z = true;
                }
                if (yo5Var2.f35436h) {
                    xm6 xm6Var3 = yo5Var2.f35434f;
                    String str2 = yo5Var2.f35432d;
                    y42.m12854a0(str2);
                    String str3 = yo5Var2.f35433e;
                    String str4 = xm6Var3.f34428e;
                    long j = xm6Var3.f34429f;
                    Object objM12714f = xm6Var3.m12714f();
                    y42.m12854a0(objM12714f);
                    an6 an6Var = new an6(str2, str3, str4, j, objM12714f);
                    Object obj = an6Var.f14649e;
                    String str5 = an6Var.f14647c;
                    ar5 ar5Var3 = this.f28593c;
                    m9925S(ar5Var3);
                    if (ar5Var3.m3201p0(an6Var)) {
                        mo9019b().f16842q.m12507d("User property updated immediately", yo5Var2.f35432d, oa6Var.f26518j.m9368c(str5), obj);
                    } else {
                        mo9019b().f16835j.m12507d("(2)Too many active user properties, ignoring", d76.m4401y(yo5Var2.f35432d), oa6Var.f26518j.m9368c(str5), obj);
                    }
                    if (z && (ys5Var = yo5Var2.f35440l) != null) {
                        m9963l(new ys5(ys5Var, yo5Var2.f35435g), cp6Var);
                    }
                }
                ar5 ar5Var4 = this.f28593c;
                m9925S(ar5Var4);
                if (ar5Var4.m3205t0(yo5Var2)) {
                    mo9019b().f16842q.m12507d("Conditional property added", yo5Var2.f35432d, oa6Var.f26518j.m9368c(yo5Var2.f35434f.f34428e), yo5Var2.f35434f.m12714f());
                } else {
                    mo9019b().f16835j.m12507d("Too many conditional properties, ignoring", d76.m4401y(yo5Var2.f35432d), oa6Var.f26518j.m9368c(yo5Var2.f35434f.f34428e), yo5Var2.f35434f.m12714f());
                }
                ar5 ar5Var5 = this.f28593c;
                m9925S(ar5Var5);
                ar5Var5.m3195j0();
            } finally {
                ar5 ar5Var6 = this.f28593c;
                m9925S(ar5Var6);
                ar5Var6.m3196k0();
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m9945Y(yo5 yo5Var, cp6 cp6Var) {
        y42.m12851X(yo5Var.f35432d);
        y42.m12854a0(yo5Var.f35434f);
        y42.m12851X(yo5Var.f35434f.f34428e);
        mo9020c().mo5038t();
        m9962k0();
        if (m9923Q(cp6Var)) {
            if (!cp6Var.f16356k) {
                m9948a0(cp6Var);
                return;
            }
            ar5 ar5Var = this.f28593c;
            m9925S(ar5Var);
            ar5Var.m3194i0();
            try {
                m9948a0(cp6Var);
                String str = yo5Var.f35432d;
                y42.m12854a0(str);
                ar5 ar5Var2 = this.f28593c;
                m9925S(ar5Var2);
                yo5 yo5VarM3206u0 = ar5Var2.m3206u0(str, yo5Var.f35434f.f34428e);
                oa6 oa6Var = this.f28602l;
                if (yo5VarM3206u0 != null) {
                    mo9019b().f16842q.m12506c("Removing conditional user property", yo5Var.f35432d, oa6Var.f26518j.m9368c(yo5Var.f35434f.f34428e));
                    ar5 ar5Var3 = this.f28593c;
                    m9925S(ar5Var3);
                    ar5Var3.m3207v0(str, yo5Var.f35434f.f34428e);
                    if (yo5VarM3206u0.f35436h) {
                        ar5 ar5Var4 = this.f28593c;
                        m9925S(ar5Var4);
                        ar5Var4.m3200o0(str, yo5Var.f35434f.f34428e);
                    }
                    ys5 ys5Var = yo5Var.f35442n;
                    if (ys5Var != null) {
                        os5 os5Var = ys5Var.f35505e;
                        ys5 ys5VarM4598W = m9960j0().m4598W(ys5Var.f35504d, os5Var != null ? os5Var.m9261d() : null, yo5VarM3206u0.f35433e, ys5Var.f35507g, true);
                        y42.m12854a0(ys5VarM4598W);
                        m9963l(ys5VarM4598W, cp6Var);
                    }
                } else {
                    mo9019b().f16838m.m12506c("Conditional user property doesn't exist", d76.m4401y(yo5Var.f35432d), oa6Var.f26518j.m9368c(yo5Var.f35434f.f34428e));
                }
                ar5 ar5Var5 = this.f28593c;
                m9925S(ar5Var5);
                ar5Var5.m3195j0();
            } finally {
                ar5 ar5Var6 = this.f28593c;
                m9925S(ar5Var6);
                ar5Var6.m3196k0();
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m9946Z(cp6 cp6Var, long j) throws Throwable {
        ar5 ar5Var = this.f28593c;
        m9925S(ar5Var);
        String str = cp6Var.f16349d;
        y42.m12854a0(str);
        z76 z76VarM3212y0 = ar5Var.m3212y0(str);
        if (z76VarM3212y0 != null) {
            m9960j0();
            String str2 = cp6Var.f16350e;
            String strM13407G = z76VarM3212y0.m13407G();
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean zIsEmpty2 = TextUtils.isEmpty(strM13407G);
            if (!zIsEmpty && !zIsEmpty2) {
                y42.m12854a0(str2);
                if (!str2.equals(strM13407G)) {
                    mo9019b().f16838m.m12505b(d76.m4401y(z76VarM3212y0.m13404D()), "New GMP App Id passed in. Removing cached database data. appId");
                    ar5 ar5Var2 = this.f28593c;
                    m9925S(ar5Var2);
                    oa6 oa6Var = (oa6) ar5Var2.f36084a;
                    String strM13404D = z76VarM3212y0.m13404D();
                    ar5Var2.m10368u();
                    ar5Var2.mo5038t();
                    y42.m12851X(strM13404D);
                    try {
                        SQLiteDatabase sQLiteDatabaseM3197l0 = ar5Var2.m3197l0();
                        String[] strArr = {strM13404D};
                        int iDelete = sQLiteDatabaseM3197l0.delete("events", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("trigger_uris", "app_id=?", strArr);
                        if (oa6Var.f26512d.m9225E(null, e56.f17795i1)) {
                            iDelete += sQLiteDatabaseM3197l0.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (iDelete > 0) {
                            d76 d76Var = oa6Var.f26514f;
                            oa6.m9016l(d76Var);
                            d76Var.f16831L.m12506c("Deleted application data. app, records", strM13404D, Integer.valueOf(iDelete));
                        }
                    } catch (SQLiteException e) {
                        d76 d76Var2 = oa6Var.f26514f;
                        oa6.m9016l(d76Var2);
                        d76Var2.f16835j.m12506c("Error deleting application data. appId, error", d76.m4401y(strM13404D), e);
                    }
                    z76VarM3212y0 = null;
                }
            }
        }
        if (z76VarM3212y0 != null) {
            boolean z = (z76VarM3212y0.m13416P() == -2147483648L || z76VarM3212y0.m13416P() == cp6Var.f16358m) ? false : true;
            String strM13414N = z76VarM3212y0.m13414N();
            if (z || ((z76VarM3212y0.m13416P() != -2147483648L || strM13414N == null || strM13414N.equals(cp6Var.f16351f)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", strM13414N);
                ys5 ys5Var = new ys5("_au", new os5(bundle), "auto", j);
                if (m9950d0().m9225E(null, e56.f17780d1)) {
                    m9957i(ys5Var, cp6Var);
                } else {
                    m9959j(ys5Var, cp6Var);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final xc6 m9947a(String str) throws Throwable {
        xc6 xc6Var = xc6.f34159c;
        mo9020c().mo5038t();
        m9962k0();
        HashMap map = this.f28582B;
        xc6 xc6VarM3177P = (xc6) map.get(str);
        if (xc6VarM3177P == null) {
            ar5 ar5Var = this.f28593c;
            m9925S(ar5Var);
            xc6VarM3177P = ar5Var.m3177P(str);
            if (xc6VarM3177P == null) {
                xc6VarM3177P = xc6.f34159c;
            }
            mo9020c().mo5038t();
            m9962k0();
            map.put(str, xc6VarM3177P);
            ar5 ar5Var2 = this.f28593c;
            m9925S(ar5Var2);
            ar5Var2.m3188b0(str, xc6VarM3177P);
        }
        return xc6VarM3177P;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x029a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x029d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:103:0x029e  */
    /* JADX WARN: Code duplicated, block: B:46:0x012d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0155  */
    /* JADX WARN: Code duplicated, block: B:56:0x0160  */
    /* JADX WARN: Code duplicated, block: B:59:0x016b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0177  */
    /* JADX WARN: Code duplicated, block: B:65:0x018c  */
    /* JADX WARN: Code duplicated, block: B:68:0x019d  */
    /* JADX WARN: Code duplicated, block: B:69:0x019f  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:75:0x0207  */
    /* JADX WARN: Code duplicated, block: B:78:0x021a  */
    /* JADX WARN: Code duplicated, block: B:79:0x021c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0232  */
    /* JADX WARN: Code duplicated, block: B:83:0x0234  */
    /* JADX WARN: Code duplicated, block: B:86:0x0249  */
    /* JADX WARN: Code duplicated, block: B:88:0x0259  */
    /* JADX WARN: Code duplicated, block: B:89:0x025b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0276  */
    /* JADX WARN: Code duplicated, block: B:94:0x0278  */
    /* JADX WARN: Code duplicated, block: B:97:0x028e  */
    /* JADX INFO: renamed from: a0 */
    public final z76 m9948a0(cp6 cp6Var) throws Throwable {
        boolean z;
        oa6 oa6Var;
        String str;
        long j;
        String str2;
        String str3;
        String str4;
        boolean z2;
        cn6 cn6Var;
        boolean z3;
        boolean z4;
        String str5;
        boolean z5;
        String str6;
        boolean z6;
        int i;
        boolean z7;
        mo9020c().mo5038t();
        m9962k0();
        y42.m12854a0(cp6Var);
        boolean z8 = cp6Var.f16362q;
        String str7 = cp6Var.f16349d;
        y42.m12851X(str7);
        String str8 = cp6Var.f16368w;
        if (!str8.isEmpty()) {
            this.f28584D.put(str7, new km6(this, str8));
        }
        ar5 ar5Var = this.f28593c;
        m9925S(ar5Var);
        z76 z76VarM3212y0 = ar5Var.m3212y0(str7);
        xc6 xc6VarM12661j = m9947a(str7).m12661j(xc6.m12653c(100, cp6Var.f16367v));
        vc6 vc6Var = vc6.AD_STORAGE;
        String strM10348z = xc6VarM12661j.m12660i(vc6Var) ? this.f28599i.m10348z(str7, z8) : "";
        boolean z9 = true;
        vc6 vc6Var2 = vc6.ANALYTICS_STORAGE;
        if (z76VarM3212y0 != null) {
            oa6 oa6Var2 = z76VarM3212y0.f35837a;
            if (xc6VarM12661j.m12660i(vc6Var) && strM10348z != null) {
                ea6 ea6Var = oa6Var2.f26515g;
                oa6.m9016l(ea6Var);
                ea6Var.mo5038t();
                if (!strM10348z.equals(z76VarM3212y0.f35841e)) {
                    ea6 ea6Var2 = oa6Var2.f26515g;
                    oa6.m9016l(ea6Var2);
                    ea6Var2.mo5038t();
                    boolean zIsEmpty = TextUtils.isEmpty(z76VarM3212y0.f35841e);
                    z76VarM3212y0.m13409I(strM10348z);
                    if (z8) {
                        rj6 rj6Var = this.f28599i;
                        rj6Var.getClass();
                        if (!"00000000-0000-0000-0000-000000000000".equals((xc6VarM12661j.m12660i(vc6Var) ? rj6Var.m10347y(str7) : new Pair("", Boolean.FALSE)).first) && !zIsEmpty) {
                            if (xc6VarM12661j.m12660i(vc6Var2)) {
                                z76VarM3212y0.m13406F(m9969o(xc6VarM12661j));
                                z = false;
                            } else {
                                z = true;
                            }
                            ar5 ar5Var2 = this.f28593c;
                            m9925S(ar5Var2);
                            if (ar5Var2.m3202q0(str7, "_id") != null) {
                                ar5 ar5Var3 = this.f28593c;
                                m9925S(ar5Var3);
                                if (ar5Var3.m3202q0(str7, "_lair") == null) {
                                    mo9022e().getClass();
                                    an6 an6Var = new an6(str7, "auto", "_lair", System.currentTimeMillis(), 1L);
                                    ar5 ar5Var4 = this.f28593c;
                                    m9925S(ar5Var4);
                                    ar5Var4.m3201p0(an6Var);
                                }
                            }
                        }
                    }
                    if (TextUtils.isEmpty(z76VarM3212y0.m13405E()) && xc6VarM12661j.m12660i(vc6Var2)) {
                        z76VarM3212y0.m13406F(m9969o(xc6VarM12661j));
                    }
                } else if (TextUtils.isEmpty(z76VarM3212y0.m13405E())) {
                    z76VarM3212y0.m13406F(m9969o(xc6VarM12661j));
                }
            } else if (TextUtils.isEmpty(z76VarM3212y0.m13405E()) && xc6VarM12661j.m12660i(vc6Var2)) {
                z76VarM3212y0.m13406F(m9969o(xc6VarM12661j));
            }
            oa6Var = z76VarM3212y0.f35837a;
            z76VarM3212y0.m13408H(cp6Var.f16350e);
            str = cp6Var.f16359n;
            if (!TextUtils.isEmpty(str)) {
                z76VarM3212y0.m13411K(str);
            }
            j = cp6Var.f16353h;
            if (j != 0) {
                z76VarM3212y0.m13419S(j);
            }
            str2 = cp6Var.f16351f;
            if (!TextUtils.isEmpty(str2)) {
                z76VarM3212y0.m13415O(str2);
            }
            z76VarM3212y0.m13417Q(cp6Var.f16358m);
            str3 = cp6Var.f16352g;
            if (str3 != null) {
                z76VarM3212y0.m13418R(str3);
            }
            z76VarM3212y0.m13420a(cp6Var.f16354i);
            z76VarM3212y0.m13423d(cp6Var.f16356k);
            str4 = cp6Var.f16355j;
            if (!TextUtils.isEmpty(str4)) {
                z76VarM3212y0.m13441v(str4);
            }
            ea6 ea6Var3 = oa6Var.f26515g;
            oa6.m9016l(ea6Var3);
            ea6Var3.mo5038t();
            boolean z10 = z76VarM3212y0.f35834Q;
            if (z76VarM3212y0.f35852p != z8) {
                z2 = true;
            } else {
                z2 = false;
            }
            z76VarM3212y0.f35834Q = z10 | z2;
            z76VarM3212y0.f35852p = z8;
            Boolean bool = cp6Var.f16364s;
            ea6 ea6Var4 = oa6Var.f26515g;
            oa6.m9016l(ea6Var4);
            ea6Var4.mo5038t();
            z76VarM3212y0.f35834Q |= !Objects.equals(z76VarM3212y0.f35853q, bool);
            z76VarM3212y0.f35853q = bool;
            z76VarM3212y0.m13422c(cp6Var.f16365t);
            String str9 = cp6Var.f16369x;
            ea6 ea6Var5 = oa6Var.f26515g;
            oa6.m9016l(ea6Var5);
            ea6Var5.mo5038t();
            z76VarM3212y0.f35834Q |= !Objects.equals(z76VarM3212y0.f35856t, str9);
            z76VarM3212y0.f35856t = str9;
            cn6Var = cn6.f16165b;
            if (m9950d0().m9225E(null, e56.f17740L0)) {
                z76VarM3212y0.m13443x(cp6Var.f16366u);
            } else {
                if (m9950d0().m9225E(null, e56.f17738K0)) {
                    z76VarM3212y0.m13443x(null);
                }
            }
            z3 = cp6Var.f16370y;
            ea6 ea6Var6 = oa6Var.f26515g;
            oa6.m9016l(ea6Var6);
            ea6Var6.mo5038t();
            boolean z11 = z76VarM3212y0.f35834Q;
            if (z76VarM3212y0.f35857u != z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            z76VarM3212y0.f35834Q = z11 | z4;
            z76VarM3212y0.f35857u = z3;
            str5 = cp6Var.f16345E;
            ea6 ea6Var7 = oa6Var.f26515g;
            oa6.m9016l(ea6Var7);
            ea6Var7.mo5038t();
            boolean z12 = z76VarM3212y0.f35834Q;
            if (z76VarM3212y0.f35820C != str5) {
                z5 = true;
            } else {
                z5 = false;
            }
            z76VarM3212y0.f35834Q = z12 | z5;
            z76VarM3212y0.f35820C = str5;
            ho6.m6466a();
            if (m9950d0().m9225E(null, e56.f17748P0)) {
                i = cp6Var.f16343C;
                ea6 ea6Var8 = oa6Var.f26515g;
                oa6.m9016l(ea6Var8);
                ea6Var8.mo5038t();
                boolean z13 = z76VarM3212y0.f35834Q;
                if (z76VarM3212y0.f35860x != i) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z76VarM3212y0.f35834Q = z13 | z7;
                z76VarM3212y0.f35860x = i;
            }
            z76VarM3212y0.m13445z(cp6Var.f16371z);
            str6 = cp6Var.f16346F;
            ea6 ea6Var9 = oa6Var.f26515g;
            oa6.m9016l(ea6Var9);
            ea6Var9.mo5038t();
            boolean z14 = z76VarM3212y0.f35834Q;
            if (z76VarM3212y0.f35824G != str6) {
                z6 = true;
            } else {
                z6 = false;
            }
            z76VarM3212y0.f35834Q = z14 | z6;
            z76VarM3212y0.f35824G = str6;
            int i2 = cp6Var.f16348H;
            ea6 ea6Var10 = oa6Var.f26515g;
            oa6.m9016l(ea6Var10);
            ea6Var10.mo5038t();
            z76VarM3212y0.f35834Q |= z76VarM3212y0.f35826I != i2;
            z76VarM3212y0.f35826I = i2;
            if (!z76VarM3212y0.m13434o()) {
                z9 = z;
            } else if (!z) {
                return z76VarM3212y0;
            }
            ar5 ar5Var5 = this.f28593c;
            m9925S(ar5Var5);
            ar5Var5.m3214z0(z76VarM3212y0, z9);
            return z76VarM3212y0;
        }
        z76VarM3212y0 = new z76(this.f28602l, str7);
        if (xc6VarM12661j.m12660i(vc6Var2)) {
            z76VarM3212y0.m13406F(m9969o(xc6VarM12661j));
        }
        if (xc6VarM12661j.m12660i(vc6Var)) {
            z76VarM3212y0.m13409I(strM10348z);
        }
        z = false;
        oa6Var = z76VarM3212y0.f35837a;
        z76VarM3212y0.m13408H(cp6Var.f16350e);
        str = cp6Var.f16359n;
        if (!TextUtils.isEmpty(str)) {
            z76VarM3212y0.m13411K(str);
        }
        j = cp6Var.f16353h;
        if (j != 0) {
            z76VarM3212y0.m13419S(j);
        }
        str2 = cp6Var.f16351f;
        if (!TextUtils.isEmpty(str2)) {
            z76VarM3212y0.m13415O(str2);
        }
        z76VarM3212y0.m13417Q(cp6Var.f16358m);
        str3 = cp6Var.f16352g;
        if (str3 != null) {
            z76VarM3212y0.m13418R(str3);
        }
        z76VarM3212y0.m13420a(cp6Var.f16354i);
        z76VarM3212y0.m13423d(cp6Var.f16356k);
        str4 = cp6Var.f16355j;
        if (!TextUtils.isEmpty(str4)) {
            z76VarM3212y0.m13441v(str4);
        }
        ea6 ea6Var11 = oa6Var.f26515g;
        oa6.m9016l(ea6Var11);
        ea6Var11.mo5038t();
        boolean z15 = z76VarM3212y0.f35834Q;
        if (z76VarM3212y0.f35852p != z8) {
            z2 = true;
        } else {
            z2 = false;
        }
        z76VarM3212y0.f35834Q = z15 | z2;
        z76VarM3212y0.f35852p = z8;
        Boolean bool2 = cp6Var.f16364s;
        ea6 ea6Var12 = oa6Var.f26515g;
        oa6.m9016l(ea6Var12);
        ea6Var12.mo5038t();
        z76VarM3212y0.f35834Q |= !Objects.equals(z76VarM3212y0.f35853q, bool2);
        z76VarM3212y0.f35853q = bool2;
        z76VarM3212y0.m13422c(cp6Var.f16365t);
        String str10 = cp6Var.f16369x;
        ea6 ea6Var13 = oa6Var.f26515g;
        oa6.m9016l(ea6Var13);
        ea6Var13.mo5038t();
        z76VarM3212y0.f35834Q |= !Objects.equals(z76VarM3212y0.f35856t, str10);
        z76VarM3212y0.f35856t = str10;
        cn6Var = cn6.f16165b;
        if (m9950d0().m9225E(null, e56.f17740L0)) {
            z76VarM3212y0.m13443x(cp6Var.f16366u);
        } else {
            if (m9950d0().m9225E(null, e56.f17738K0)) {
                z76VarM3212y0.m13443x(null);
            }
        }
        z3 = cp6Var.f16370y;
        ea6 ea6Var14 = oa6Var.f26515g;
        oa6.m9016l(ea6Var14);
        ea6Var14.mo5038t();
        boolean z16 = z76VarM3212y0.f35834Q;
        if (z76VarM3212y0.f35857u != z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        z76VarM3212y0.f35834Q = z16 | z4;
        z76VarM3212y0.f35857u = z3;
        str5 = cp6Var.f16345E;
        ea6 ea6Var15 = oa6Var.f26515g;
        oa6.m9016l(ea6Var15);
        ea6Var15.mo5038t();
        boolean z17 = z76VarM3212y0.f35834Q;
        if (z76VarM3212y0.f35820C != str5) {
            z5 = true;
        } else {
            z5 = false;
        }
        z76VarM3212y0.f35834Q = z17 | z5;
        z76VarM3212y0.f35820C = str5;
        ho6.m6466a();
        if (m9950d0().m9225E(null, e56.f17748P0)) {
            i = cp6Var.f16343C;
            ea6 ea6Var16 = oa6Var.f26515g;
            oa6.m9016l(ea6Var16);
            ea6Var16.mo5038t();
            boolean z18 = z76VarM3212y0.f35834Q;
            if (z76VarM3212y0.f35860x != i) {
                z7 = true;
            } else {
                z7 = false;
            }
            z76VarM3212y0.f35834Q = z18 | z7;
            z76VarM3212y0.f35860x = i;
        }
        z76VarM3212y0.m13445z(cp6Var.f16371z);
        str6 = cp6Var.f16346F;
        ea6 ea6Var17 = oa6Var.f26515g;
        oa6.m9016l(ea6Var17);
        ea6Var17.mo5038t();
        boolean z19 = z76VarM3212y0.f35834Q;
        if (z76VarM3212y0.f35824G != str6) {
            z6 = true;
        } else {
            z6 = false;
        }
        z76VarM3212y0.f35834Q = z19 | z6;
        z76VarM3212y0.f35824G = str6;
        int i3 = cp6Var.f16348H;
        ea6 ea6Var18 = oa6Var.f26515g;
        oa6.m9016l(ea6Var18);
        ea6Var18.mo5038t();
        z76VarM3212y0.f35834Q |= z76VarM3212y0.f35826I != i3;
        z76VarM3212y0.f35826I = i3;
        if (!z76VarM3212y0.m13434o()) {
            z9 = z;
        } else if (!z) {
            return z76VarM3212y0;
        }
        ar5 ar5Var6 = this.f28593c;
        m9925S(ar5Var6);
        ar5Var6.m3214z0(z76VarM3212y0, z9);
        return z76VarM3212y0;
    }

    @Override // p000.oc6
    /* JADX INFO: renamed from: b */
    public final d76 mo9019b() {
        oa6 oa6Var = this.f28602l;
        y42.m12854a0(oa6Var);
        d76 d76Var = oa6Var.f26514f;
        oa6.m9016l(d76Var);
        return d76Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX INFO: renamed from: b0 */
    public final List m9949b0(Bundle bundle, cp6 cp6Var) {
        int[] iArr;
        mo9020c().mo5038t();
        ho6.m6466a();
        op5 op5VarM9950d0 = m9950d0();
        String str = cp6Var.f16349d;
        if (!op5VarM9950d0.m9225E(str, e56.f17748P0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    mo9019b().f16835j.m12504a("Uri sources and timestamps do not match");
                } else {
                    int i = 0;
                    while (i < intArray.length) {
                        ar5 ar5Var = this.f28593c;
                        m9925S(ar5Var);
                        oa6 oa6Var = (oa6) ar5Var.f36084a;
                        int i2 = intArray[i];
                        long j = longArray[i];
                        y42.m12851X(str);
                        ar5Var.mo5038t();
                        ar5Var.m10368u();
                        try {
                            iArr = intArray;
                            try {
                                int iDelete = ar5Var.m3197l0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                                d76 d76Var = oa6Var.f26514f;
                                oa6.m9016l(d76Var);
                                x66 x66Var = d76Var.f16831L;
                                StringBuilder sb = new StringBuilder(String.valueOf(iDelete).length() + 46);
                                sb.append("Pruned ");
                                sb.append(iDelete);
                                sb.append(" trigger URIs. appId, source, timestamp");
                                x66Var.m12507d(sb.toString(), str, Integer.valueOf(i2), Long.valueOf(j));
                            } catch (SQLiteException e) {
                                e = e;
                                d76 d76Var2 = oa6Var.f26514f;
                                oa6.m9016l(d76Var2);
                                d76Var2.f16835j.m12506c("Error pruning trigger URIs. appId", d76.m4401y(str), e);
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            iArr = intArray;
                        }
                        i++;
                        intArray = iArr;
                    }
                }
            }
        }
        ar5 ar5Var2 = this.f28593c;
        m9925S(ar5Var2);
        String str2 = cp6Var.f16349d;
        y42.m12851X(str2);
        ar5Var2.mo5038t();
        ar5Var2.m10368u();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = ar5Var2.m3197l0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new cl6(cursorQuery.getInt(2), cursorQuery.getLong(1), string));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e3) {
                d76 d76Var3 = ((oa6) ar5Var2.f36084a).f26514f;
                oa6.m9016l(d76Var3);
                d76Var3.f16835j.m12506c("Error querying trigger uris. appId", d76.m4401y(str2), e3);
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    @Override // p000.oc6
    /* JADX INFO: renamed from: c */
    public final ea6 mo9020c() {
        oa6 oa6Var = this.f28602l;
        y42.m12854a0(oa6Var);
        ea6 ea6Var = oa6Var.f26515g;
        oa6.m9016l(ea6Var);
        return ea6Var;
    }

    @Override // p000.oc6
    /* JADX INFO: renamed from: d */
    public final Context mo9021d() {
        return this.f28602l.f26509a;
    }

    /* JADX INFO: renamed from: d0 */
    public final op5 m9950d0() {
        oa6 oa6Var = this.f28602l;
        y42.m12854a0(oa6Var);
        return oa6Var.f26512d;
    }

    @Override // p000.oc6
    /* JADX INFO: renamed from: e */
    public final ia5 mo9022e() {
        oa6 oa6Var = this.f28602l;
        y42.m12854a0(oa6Var);
        return oa6Var.f26519k;
    }

    /* JADX INFO: renamed from: e0 */
    public final n96 m9951e0() {
        n96 n96Var = this.f28591a;
        m9925S(n96Var);
        return n96Var;
    }

    @Override // p000.oc6
    /* JADX INFO: renamed from: f */
    public final yj5 mo9023f() {
        return this.f28602l.f26511c;
    }

    /* JADX INFO: renamed from: f0 */
    public final ar5 m9952f0() {
        ar5 ar5Var = this.f28593c;
        m9925S(ar5Var);
        return ar5Var;
    }

    /* JADX INFO: renamed from: g */
    public final long m9953g() {
        mo9022e().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        rj6 rj6Var = this.f28599i;
        rj6Var.m10368u();
        rj6Var.mo5038t();
        n86 n86Var = rj6Var.f29368n;
        long jM8623a = n86Var.m8623a();
        if (jM8623a == 0) {
            dn6 dn6Var = ((oa6) rj6Var.f36084a).f26517i;
            oa6.m9014j(dn6Var);
            jM8623a = ((long) dn6Var.m4614s0().nextInt(86400000)) + 1;
            n86Var.m8624b(jM8623a);
        }
        return ((((jCurrentTimeMillis + jM8623a) / 1000) / 60) / 60) / 24;
    }

    /* JADX INFO: renamed from: g0 */
    public final e86 m9954g0() {
        e86 e86Var = this.f28594d;
        if (e86Var != null) {
            return e86Var;
        }
        C1077qn.m9989o("Network broadcast receiver not created");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m9955h(String str, ys5 ys5Var) {
        ar5 ar5Var = this.f28593c;
        m9925S(ar5Var);
        z76 z76VarM3212y0 = ar5Var.m3212y0(str);
        if (z76VarM3212y0 != null) {
            oa6 oa6Var = z76VarM3212y0.f35837a;
            if (!TextUtils.isEmpty(z76VarM3212y0.m13414N())) {
                Boolean boolM9938N = m9938N(z76VarM3212y0);
                if (boolM9938N == null) {
                    if (!"_ui".equals(ys5Var.f35504d)) {
                        mo9019b().f16838m.m12505b(d76.m4401y(str), "Could not find package. appId");
                    }
                } else if (!boolM9938N.booleanValue()) {
                    mo9019b().f16835j.m12505b(d76.m4401y(str), "App version does not match; dropping event. appId");
                    return;
                }
                String strM13407G = z76VarM3212y0.m13407G();
                String strM13414N = z76VarM3212y0.m13414N();
                long jM13416P = z76VarM3212y0.m13416P();
                ea6 ea6Var = oa6Var.f26515g;
                oa6.m9016l(ea6Var);
                ea6Var.mo5038t();
                String str2 = z76VarM3212y0.f35848l;
                ea6 ea6Var2 = oa6Var.f26515g;
                oa6.m9016l(ea6Var2);
                ea6Var2.mo5038t();
                long j = z76VarM3212y0.f35849m;
                ea6 ea6Var3 = oa6Var.f26515g;
                oa6.m9016l(ea6Var3);
                ea6Var3.mo5038t();
                long j2 = z76VarM3212y0.f35850n;
                ea6 ea6Var4 = oa6Var.f26515g;
                oa6.m9016l(ea6Var4);
                ea6Var4.mo5038t();
                boolean z = z76VarM3212y0.f35851o;
                String strM13410J = z76VarM3212y0.m13410J();
                ea6 ea6Var5 = oa6Var.f26515g;
                oa6.m9016l(ea6Var5);
                ea6Var5.mo5038t();
                boolean z2 = z76VarM3212y0.f35852p;
                Boolean boolM13442w = z76VarM3212y0.m13442w();
                long jM13421b = z76VarM3212y0.m13421b();
                ea6 ea6Var6 = oa6Var.f26515g;
                oa6.m9016l(ea6Var6);
                ea6Var6.mo5038t();
                ArrayList arrayList = z76VarM3212y0.f35855s;
                String strM12659g = m9947a(str).m12659g();
                boolean zM13444y = z76VarM3212y0.m13444y();
                ea6 ea6Var7 = oa6Var.f26515g;
                oa6.m9016l(ea6Var7);
                ea6Var7.mo5038t();
                long j3 = z76VarM3212y0.f35858v;
                int i = m9947a(str).f34161b;
                String str3 = m9968n0(str).f25172b;
                ea6 ea6Var8 = oa6Var.f26515g;
                oa6.m9016l(ea6Var8);
                ea6Var8.mo5038t();
                int i2 = z76VarM3212y0.f35860x;
                ea6 ea6Var9 = oa6Var.f26515g;
                oa6.m9016l(ea6Var9);
                ea6Var9.mo5038t();
                m9957i(ys5Var, new cp6(str, strM13407G, strM13414N, jM13416P, str2, j, j2, null, z, false, strM13410J, 0L, 0, z2, false, boolM13442w, jM13421b, arrayList, strM12659g, "", null, zM13444y, j3, i, str3, i2, z76VarM3212y0.f35819B, z76VarM3212y0.m13403C(), z76VarM3212y0.m13438s(), 0L, z76VarM3212y0.m13439t()));
                return;
            }
        }
        mo9019b().f16842q.m12505b(str, "No app data available; dropping event");
    }

    /* JADX INFO: renamed from: h0 */
    public final vn5 m9956h0() {
        vn5 vn5Var = this.f28596f;
        m9925S(vn5Var);
        return vn5Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:40:0x010d  */
    /* JADX WARN: Code duplicated, block: B:47:? A[SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0080: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:129), block:B:18:0x0080 */
    /* JADX INFO: renamed from: i */
    public final void m9957i(ys5 ys5Var, cp6 cp6Var) throws Throwable {
        Throwable th;
        Cursor cursorRawQuery;
        Cursor cursor;
        Bundle bundleM9760B;
        ys5 ys5VarM5913c;
        os5 os5Var;
        String string;
        String str = cp6Var.f16349d;
        y42.m12851X(str);
        g76 g76VarM5911a = g76.m5911a(ys5Var);
        Bundle bundle = (Bundle) g76VarM5911a.f19646e;
        dn6 dn6VarM9960j0 = m9960j0();
        ar5 ar5Var = this.f28593c;
        m9925S(ar5Var);
        oa6 oa6Var = (oa6) ar5Var.f36084a;
        ar5Var.mo5038t();
        ar5Var.m10368u();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = ar5Var.m3197l0().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        try {
                            m96 m96Var = (m96) ((l96) q76.m9777k0(m96.m8235y(), cursorRawQuery.getBlob(0))).m11056e();
                            ar5Var.f19870f.m9958i0();
                            bundleM9760B = q76.m9760B(m96Var.m8244o());
                            cursorRawQuery.close();
                        } catch (IOException e) {
                            d76 d76Var = oa6Var.f26514f;
                            oa6.m9016l(d76Var);
                            d76Var.f16835j.m12506c("Failed to retrieve default event parameters. appId", d76.m4401y(str), e);
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            bundleM9760B = null;
                        }
                        dn6VarM9960j0.m4587F(bundle, bundleM9760B);
                        dn6 dn6VarM9960j1 = m9960j0();
                        op5 op5VarM9950d0 = m9950d0();
                        op5VarM9950d0.getClass();
                        dn6VarM9960j1.m4584D(g76VarM5911a, Math.max(Math.min(op5VarM9950d0.m9223C(str, e56.f17763X), 100), 25));
                        ys5VarM5913c = g76VarM5911a.m5913c();
                        if (!m9950d0().m9225E(null, e56.f17789g1) && "_cmp".equals(ys5VarM5913c.f35504d)) {
                            os5Var = ys5VarM5913c.f35505e;
                            if ("referrer API v2".equals(os5Var.f27065d.getString("_cis"))) {
                                string = os5Var.f27065d.getString("gclid");
                                if (!TextUtils.isEmpty(string)) {
                                    m9941U(new xm6(ys5VarM5913c.f35507g, string, "_lgclid", "auto"), cp6Var);
                                }
                            }
                        }
                        m9959j(ys5VarM5913c, cp6Var);
                    }
                    d76 d76Var2 = oa6Var.f26514f;
                    oa6.m9016l(d76Var2);
                    d76Var2.f16831L.m12504a("Default event parameters not found");
                } catch (SQLiteException e2) {
                    e = e2;
                    d76 d76Var3 = oa6Var.f26514f;
                    oa6.m9016l(d76Var3);
                    d76Var3.f16835j.m12505b(e, "Error selecting default event parameters");
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursorRawQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            bundleM9760B = null;
            dn6VarM9960j0.m4587F(bundle, bundleM9760B);
            dn6 dn6VarM9960j2 = m9960j0();
            op5 op5VarM9950d1 = m9950d0();
            op5VarM9950d1.getClass();
            dn6VarM9960j2.m4584D(g76VarM5911a, Math.max(Math.min(op5VarM9950d1.m9223C(str, e56.f17763X), 100), 25));
            ys5VarM5913c = g76VarM5911a.m5913c();
            if (!m9950d0().m9225E(null, e56.f17789g1)) {
                os5Var = ys5VarM5913c.f35505e;
                if ("referrer API v2".equals(os5Var.f27065d.getString("_cis"))) {
                    string = os5Var.f27065d.getString("gclid");
                    if (!TextUtils.isEmpty(string)) {
                        m9941U(new xm6(ys5VarM5913c.f35507g, string, "_lgclid", "auto"), cp6Var);
                    }
                }
            }
            m9959j(ys5VarM5913c, cp6Var);
        } catch (Throwable th3) {
            th = th3;
            cursor2 = cursor;
            if (cursor2 != null) {
                throw th;
            }
            cursor2.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final q76 m9958i0() {
        q76 q76Var = this.f28597g;
        m9925S(q76Var);
        return q76Var;
    }

    /* JADX INFO: renamed from: j */
    public final void m9959j(ys5 ys5Var, cp6 cp6Var) {
        ys5 ys5Var2;
        List listM3210x0;
        oa6 oa6Var;
        List listM3210x1;
        List<yo5> listM3210x2;
        String str;
        y42.m12854a0(cp6Var);
        String str2 = cp6Var.f16349d;
        y42.m12851X(str2);
        mo9020c().mo5038t();
        m9962k0();
        long j = ys5Var.f35507g;
        g76 g76VarM5911a = g76.m5911a(ys5Var);
        mo9020c().mo5038t();
        dn6.m4574l0((this.f28586F == null || (str = this.f28587G) == null || !str.equals(str2)) ? null : this.f28586F, (Bundle) g76VarM5911a.f19646e, false);
        ys5 ys5VarM5913c = g76VarM5911a.m5913c();
        m9958i0();
        if (TextUtils.isEmpty(cp6Var.f16350e)) {
            return;
        }
        if (!cp6Var.f16356k) {
            m9948a0(cp6Var);
            return;
        }
        List list = cp6Var.f16366u;
        if (list != null) {
            String str3 = ys5VarM5913c.f35504d;
            if (!list.contains(str3)) {
                mo9019b().f16842q.m12507d("Dropping non-safelisted event. appId, event name, origin", str2, ys5VarM5913c.f35504d, ys5VarM5913c.f35506f);
                return;
            } else {
                Bundle bundleM9261d = ys5VarM5913c.f35505e.m9261d();
                bundleM9261d.putLong("ga_safelisted", 1L);
                ys5Var2 = new ys5(str3, new os5(bundleM9261d), ys5VarM5913c.f35506f, ys5VarM5913c.f35507g);
            }
        } else {
            ys5Var2 = ys5VarM5913c;
        }
        ar5 ar5Var = this.f28593c;
        m9925S(ar5Var);
        ar5Var.m3194i0();
        try {
            String str4 = ys5Var2.f35504d;
            if ("_s".equals(str4)) {
                ar5 ar5Var2 = this.f28593c;
                m9925S(ar5Var2);
                if (!ar5Var2.m3171J(str2, "_s") && ys5Var2.f35505e.f27065d.getLong("_sid") != 0) {
                    ar5 ar5Var3 = this.f28593c;
                    m9925S(ar5Var3);
                    if (ar5Var3.m3171J(str2, "_f")) {
                        ar5 ar5Var4 = this.f28593c;
                        m9925S(ar5Var4);
                        ar5Var4.m3176O(str2, null, "_sid", m9961k(str2, ys5Var2));
                    } else {
                        ar5 ar5Var5 = this.f28593c;
                        m9925S(ar5Var5);
                        if (ar5Var5.m3171J(str2, "_v")) {
                            ar5 ar5Var6 = this.f28593c;
                            m9925S(ar5Var6);
                            ar5Var6.m3176O(str2, null, "_sid", m9961k(str2, ys5Var2));
                        } else {
                            ar5 ar5Var7 = this.f28593c;
                            m9925S(ar5Var7);
                            mo9022e().getClass();
                            ar5Var7.m3176O(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", m9961k(str2, ys5Var2));
                        }
                    }
                }
            }
            ar5 ar5Var8 = this.f28593c;
            m9925S(ar5Var8);
            y42.m12851X(str2);
            ar5Var8.mo5038t();
            ar5Var8.m10368u();
            if (j < 0) {
                d76 d76Var = ((oa6) ar5Var8.f36084a).f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16838m.m12506c("Invalid time querying timed out conditional properties", d76.m4401y(str2), Long.valueOf(j));
                listM3210x0 = Collections.EMPTY_LIST;
            } else {
                listM3210x0 = ar5Var8.m3210x0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            }
            Iterator it = listM3210x0.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                oa6Var = this.f28602l;
                if (!zHasNext) {
                    break;
                }
                yo5 yo5Var = (yo5) it.next();
                if (yo5Var != null) {
                    mo9019b().f16831L.m12507d("User property timed out", yo5Var.f35432d, oa6Var.f26518j.m9368c(yo5Var.f35434f.f34428e), yo5Var.f35434f.m12714f());
                    ys5 ys5Var3 = yo5Var.f35438j;
                    if (ys5Var3 != null) {
                        m9963l(new ys5(ys5Var3, j), cp6Var);
                    }
                    ar5 ar5Var9 = this.f28593c;
                    m9925S(ar5Var9);
                    ar5Var9.m3207v0(str2, yo5Var.f35434f.f34428e);
                }
            }
            ar5 ar5Var10 = this.f28593c;
            m9925S(ar5Var10);
            y42.m12851X(str2);
            ar5Var10.mo5038t();
            ar5Var10.m10368u();
            if (j < 0) {
                d76 d76Var2 = ((oa6) ar5Var10.f36084a).f26514f;
                oa6.m9016l(d76Var2);
                d76Var2.f16838m.m12506c("Invalid time querying expired conditional properties", d76.m4401y(str2), Long.valueOf(j));
                listM3210x1 = Collections.EMPTY_LIST;
            } else {
                listM3210x1 = ar5Var10.m3210x0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
            }
            ArrayList arrayList = new ArrayList(listM3210x1.size());
            Iterator it2 = listM3210x1.iterator();
            while (it2.hasNext()) {
                yo5 yo5Var2 = (yo5) it2.next();
                if (yo5Var2 != null) {
                    Iterator it3 = it2;
                    mo9019b().f16831L.m12507d("User property expired", yo5Var2.f35432d, oa6Var.f26518j.m9368c(yo5Var2.f35434f.f34428e), yo5Var2.f35434f.m12714f());
                    ar5 ar5Var11 = this.f28593c;
                    m9925S(ar5Var11);
                    ar5Var11.m3200o0(str2, yo5Var2.f35434f.f34428e);
                    ys5 ys5Var4 = yo5Var2.f35442n;
                    if (ys5Var4 != null) {
                        arrayList.add(ys5Var4);
                    }
                    ar5 ar5Var12 = this.f28593c;
                    m9925S(ar5Var12);
                    ar5Var12.m3207v0(str2, yo5Var2.f35434f.f34428e);
                    it2 = it3;
                }
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                m9963l(new ys5((ys5) obj, j), cp6Var);
            }
            ar5 ar5Var13 = this.f28593c;
            m9925S(ar5Var13);
            y42.m12851X(str2);
            y42.m12851X(str4);
            ar5Var13.mo5038t();
            ar5Var13.m10368u();
            if (j < 0) {
                oa6 oa6Var2 = (oa6) ar5Var13.f36084a;
                d76 d76Var3 = oa6Var2.f26514f;
                oa6.m9016l(d76Var3);
                d76Var3.f16838m.m12507d("Invalid time querying triggered conditional properties", d76.m4401y(str2), oa6Var2.f26518j.m9366a(str4), Long.valueOf(j));
                listM3210x2 = Collections.EMPTY_LIST;
            } else {
                listM3210x2 = ar5Var13.m3210x0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
            }
            ArrayList arrayList2 = new ArrayList(listM3210x2.size());
            for (yo5 yo5Var3 : listM3210x2) {
                if (yo5Var3 != null) {
                    xm6 xm6Var = yo5Var3.f35434f;
                    String str5 = yo5Var3.f35432d;
                    y42.m12854a0(str5);
                    String str6 = yo5Var3.f35433e;
                    String str7 = xm6Var.f34428e;
                    Object objM12714f = xm6Var.m12714f();
                    y42.m12854a0(objM12714f);
                    an6 an6Var = new an6(str5, str6, str7, j, objM12714f);
                    Object obj2 = an6Var.f14649e;
                    String str8 = an6Var.f14647c;
                    ar5 ar5Var14 = this.f28593c;
                    m9925S(ar5Var14);
                    if (ar5Var14.m3201p0(an6Var)) {
                        mo9019b().f16831L.m12507d("User property triggered", yo5Var3.f35432d, oa6Var.f26518j.m9368c(str8), obj2);
                    } else {
                        mo9019b().f16835j.m12507d("Too many active user properties, ignoring", d76.m4401y(yo5Var3.f35432d), oa6Var.f26518j.m9368c(str8), obj2);
                    }
                    ys5 ys5Var5 = yo5Var3.f35440l;
                    if (ys5Var5 != null) {
                        arrayList2.add(ys5Var5);
                    }
                    yo5Var3.f35434f = new xm6(an6Var);
                    yo5Var3.f35436h = true;
                    ar5 ar5Var15 = this.f28593c;
                    m9925S(ar5Var15);
                    ar5Var15.m3205t0(yo5Var3);
                }
            }
            m9963l(ys5Var2, cp6Var);
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj3 = arrayList2.get(i2);
                i2++;
                m9963l(new ys5((ys5) obj3, j), cp6Var);
            }
            ar5 ar5Var16 = this.f28593c;
            m9925S(ar5Var16);
            ar5Var16.m3195j0();
        } finally {
            ar5 ar5Var17 = this.f28593c;
            m9925S(ar5Var17);
            ar5Var17.m3196k0();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final dn6 m9960j0() {
        oa6 oa6Var = this.f28602l;
        y42.m12854a0(oa6Var);
        dn6 dn6Var = oa6Var.f26517i;
        oa6.m9014j(dn6Var);
        return dn6Var;
    }

    /* JADX INFO: renamed from: k */
    public final Bundle m9961k(String str, ys5 ys5Var) throws Throwable {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", ys5Var.f35505e.f27065d.getLong("_sid"));
        ar5 ar5Var = this.f28593c;
        m9925S(ar5Var);
        an6 an6VarM3202q0 = ar5Var.m3202q0(str, "_sno");
        if (an6VarM3202q0 != null) {
            Object obj = an6VarM3202q0.f14649e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m9962k0() {
        if (this.f28603m.get()) {
            return;
        }
        C1077qn.m9989o("UploadController is not initialized");
    }

    /* JADX WARN: Code duplicated, block: B:104:0x03d5 A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x03db A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x03f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x03fb A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0413 A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0419 A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x044d A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x046b  */
    /* JADX WARN: Code duplicated, block: B:121:0x046f A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x04aa A[Catch: all -> 0x01e8, TRY_ENTER, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x04c6 A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x04d6 A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x04ea A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x0567 A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x05a7 A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x05cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x063e A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x0678 A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0681 A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0687  */
    /* JADX WARN: Code duplicated, block: B:177:0x068f A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x0695  */
    /* JADX WARN: Code duplicated, block: B:181:0x069d A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:185:0x06ac A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:190:0x06c3 A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:195:0x06fe A[Catch: all -> 0x01e8, TRY_ENTER, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x0707 A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x0718  */
    /* JADX WARN: Code duplicated, block: B:204:0x0726  */
    /* JADX WARN: Code duplicated, block: B:205:0x0728  */
    /* JADX WARN: Code duplicated, block: B:208:0x0730  */
    /* JADX WARN: Code duplicated, block: B:209:0x0732 A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x073c  */
    /* JADX WARN: Code duplicated, block: B:212:0x073e  */
    /* JADX WARN: Code duplicated, block: B:215:0x074a  */
    /* JADX WARN: Code duplicated, block: B:216:0x074c  */
    /* JADX WARN: Code duplicated, block: B:219:0x0758  */
    /* JADX WARN: Code duplicated, block: B:220:0x075a  */
    /* JADX WARN: Code duplicated, block: B:223:0x0766  */
    /* JADX WARN: Code duplicated, block: B:224:0x0768  */
    /* JADX WARN: Code duplicated, block: B:227:0x0774  */
    /* JADX WARN: Code duplicated, block: B:228:0x0776  */
    /* JADX WARN: Code duplicated, block: B:231:0x0780  */
    /* JADX WARN: Code duplicated, block: B:232:0x0782  */
    /* JADX WARN: Code duplicated, block: B:235:0x078e  */
    /* JADX WARN: Code duplicated, block: B:236:0x0790  */
    /* JADX WARN: Code duplicated, block: B:238:0x079e  */
    /* JADX WARN: Code duplicated, block: B:241:0x07a4 A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x07ce A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x07d1 A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:247:0x07d7 A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:249:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:271:0x0874 A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:274:0x0884 A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:277:0x089b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:305:0x0955  */
    /* JADX WARN: Code duplicated, block: B:308:0x099b A[Catch: all -> 0x092d, TryCatch #9 {all -> 0x092d, blocks: (B:278:0x089d, B:280:0x08a8, B:282:0x08b6, B:284:0x08c0, B:287:0x08d4, B:289:0x08de, B:291:0x08ea, B:293:0x08f4, B:295:0x0902, B:297:0x091a, B:301:0x0935, B:303:0x0943, B:304:0x094c, B:306:0x0958, B:308:0x099b, B:311:0x09a6, B:312:0x09b0, B:313:0x09b1, B:315:0x09bb, B:281:0x08ad), top: B:404:0x089d }] */
    /* JADX WARN: Code duplicated, block: B:310:0x09a5  */
    /* JADX WARN: Code duplicated, block: B:311:0x09a6 A[Catch: all -> 0x092d, TryCatch #9 {all -> 0x092d, blocks: (B:278:0x089d, B:280:0x08a8, B:282:0x08b6, B:284:0x08c0, B:287:0x08d4, B:289:0x08de, B:291:0x08ea, B:293:0x08f4, B:295:0x0902, B:297:0x091a, B:301:0x0935, B:303:0x0943, B:304:0x094c, B:306:0x0958, B:308:0x099b, B:311:0x09a6, B:312:0x09b0, B:313:0x09b1, B:315:0x09bb, B:281:0x08ad), top: B:404:0x089d }] */
    /* JADX WARN: Code duplicated, block: B:315:0x09bb A[Catch: all -> 0x092d, TRY_LEAVE, TryCatch #9 {all -> 0x092d, blocks: (B:278:0x089d, B:280:0x08a8, B:282:0x08b6, B:284:0x08c0, B:287:0x08d4, B:289:0x08de, B:291:0x08ea, B:293:0x08f4, B:295:0x0902, B:297:0x091a, B:301:0x0935, B:303:0x0943, B:304:0x094c, B:306:0x0958, B:308:0x099b, B:311:0x09a6, B:312:0x09b0, B:313:0x09b1, B:315:0x09bb, B:281:0x08ad), top: B:404:0x089d }] */
    /* JADX WARN: Code duplicated, block: B:319:0x09d9 A[Catch: all -> 0x09e7, TryCatch #5 {all -> 0x09e7, blocks: (B:317:0x09c2, B:319:0x09d9, B:323:0x09ea, B:325:0x0a22, B:327:0x0a2a, B:329:0x0a34, B:330:0x0a3e, B:332:0x0a48, B:333:0x0a52, B:334:0x0a5b, B:336:0x0a61, B:338:0x0aab, B:340:0x0abd, B:344:0x0adc, B:346:0x0aec, B:343:0x0acc, B:350:0x0aff, B:351:0x0b41, B:352:0x0b4c, B:353:0x0b61, B:355:0x0b67, B:364:0x0bae, B:365:0x0bf6, B:367:0x0c07, B:381:0x0c66, B:372:0x0c1f, B:373:0x0c22, B:358:0x0b75, B:360:0x0b9b, B:378:0x0c3b, B:379:0x0c52, B:380:0x0c53), top: B:397:0x09c2, inners: #2, #8 }] */
    /* JADX WARN: Code duplicated, block: B:324:0x0a1f  */
    /* JADX WARN: Code duplicated, block: B:327:0x0a2a A[Catch: all -> 0x09e7, TryCatch #5 {all -> 0x09e7, blocks: (B:317:0x09c2, B:319:0x09d9, B:323:0x09ea, B:325:0x0a22, B:327:0x0a2a, B:329:0x0a34, B:330:0x0a3e, B:332:0x0a48, B:333:0x0a52, B:334:0x0a5b, B:336:0x0a61, B:338:0x0aab, B:340:0x0abd, B:344:0x0adc, B:346:0x0aec, B:343:0x0acc, B:350:0x0aff, B:351:0x0b41, B:352:0x0b4c, B:353:0x0b61, B:355:0x0b67, B:364:0x0bae, B:365:0x0bf6, B:367:0x0c07, B:381:0x0c66, B:372:0x0c1f, B:373:0x0c22, B:358:0x0b75, B:360:0x0b9b, B:378:0x0c3b, B:379:0x0c52, B:380:0x0c53), top: B:397:0x09c2, inners: #2, #8 }] */
    /* JADX WARN: Code duplicated, block: B:332:0x0a48 A[Catch: all -> 0x09e7, TryCatch #5 {all -> 0x09e7, blocks: (B:317:0x09c2, B:319:0x09d9, B:323:0x09ea, B:325:0x0a22, B:327:0x0a2a, B:329:0x0a34, B:330:0x0a3e, B:332:0x0a48, B:333:0x0a52, B:334:0x0a5b, B:336:0x0a61, B:338:0x0aab, B:340:0x0abd, B:344:0x0adc, B:346:0x0aec, B:343:0x0acc, B:350:0x0aff, B:351:0x0b41, B:352:0x0b4c, B:353:0x0b61, B:355:0x0b67, B:364:0x0bae, B:365:0x0bf6, B:367:0x0c07, B:381:0x0c66, B:372:0x0c1f, B:373:0x0c22, B:358:0x0b75, B:360:0x0b9b, B:378:0x0c3b, B:379:0x0c52, B:380:0x0c53), top: B:397:0x09c2, inners: #2, #8 }] */
    /* JADX WARN: Code duplicated, block: B:336:0x0a61 A[Catch: all -> 0x09e7, TryCatch #5 {all -> 0x09e7, blocks: (B:317:0x09c2, B:319:0x09d9, B:323:0x09ea, B:325:0x0a22, B:327:0x0a2a, B:329:0x0a34, B:330:0x0a3e, B:332:0x0a48, B:333:0x0a52, B:334:0x0a5b, B:336:0x0a61, B:338:0x0aab, B:340:0x0abd, B:344:0x0adc, B:346:0x0aec, B:343:0x0acc, B:350:0x0aff, B:351:0x0b41, B:352:0x0b4c, B:353:0x0b61, B:355:0x0b67, B:364:0x0bae, B:365:0x0bf6, B:367:0x0c07, B:381:0x0c66, B:372:0x0c1f, B:373:0x0c22, B:358:0x0b75, B:360:0x0b9b, B:378:0x0c3b, B:379:0x0c52, B:380:0x0c53), top: B:397:0x09c2, inners: #2, #8 }] */
    /* JADX WARN: Code duplicated, block: B:338:0x0aab A[Catch: all -> 0x09e7, TryCatch #5 {all -> 0x09e7, blocks: (B:317:0x09c2, B:319:0x09d9, B:323:0x09ea, B:325:0x0a22, B:327:0x0a2a, B:329:0x0a34, B:330:0x0a3e, B:332:0x0a48, B:333:0x0a52, B:334:0x0a5b, B:336:0x0a61, B:338:0x0aab, B:340:0x0abd, B:344:0x0adc, B:346:0x0aec, B:343:0x0acc, B:350:0x0aff, B:351:0x0b41, B:352:0x0b4c, B:353:0x0b61, B:355:0x0b67, B:364:0x0bae, B:365:0x0bf6, B:367:0x0c07, B:381:0x0c66, B:372:0x0c1f, B:373:0x0c22, B:358:0x0b75, B:360:0x0b9b, B:378:0x0c3b, B:379:0x0c52, B:380:0x0c53), top: B:397:0x09c2, inners: #2, #8 }] */
    /* JADX WARN: Code duplicated, block: B:340:0x0abd A[Catch: all -> 0x09e7, TryCatch #5 {all -> 0x09e7, blocks: (B:317:0x09c2, B:319:0x09d9, B:323:0x09ea, B:325:0x0a22, B:327:0x0a2a, B:329:0x0a34, B:330:0x0a3e, B:332:0x0a48, B:333:0x0a52, B:334:0x0a5b, B:336:0x0a61, B:338:0x0aab, B:340:0x0abd, B:344:0x0adc, B:346:0x0aec, B:343:0x0acc, B:350:0x0aff, B:351:0x0b41, B:352:0x0b4c, B:353:0x0b61, B:355:0x0b67, B:364:0x0bae, B:365:0x0bf6, B:367:0x0c07, B:381:0x0c66, B:372:0x0c1f, B:373:0x0c22, B:358:0x0b75, B:360:0x0b9b, B:378:0x0c3b, B:379:0x0c52, B:380:0x0c53), top: B:397:0x09c2, inners: #2, #8 }] */
    /* JADX WARN: Code duplicated, block: B:342:0x0ac7  */
    /* JADX WARN: Code duplicated, block: B:343:0x0acc A[Catch: all -> 0x09e7, TryCatch #5 {all -> 0x09e7, blocks: (B:317:0x09c2, B:319:0x09d9, B:323:0x09ea, B:325:0x0a22, B:327:0x0a2a, B:329:0x0a34, B:330:0x0a3e, B:332:0x0a48, B:333:0x0a52, B:334:0x0a5b, B:336:0x0a61, B:338:0x0aab, B:340:0x0abd, B:344:0x0adc, B:346:0x0aec, B:343:0x0acc, B:350:0x0aff, B:351:0x0b41, B:352:0x0b4c, B:353:0x0b61, B:355:0x0b67, B:364:0x0bae, B:365:0x0bf6, B:367:0x0c07, B:381:0x0c66, B:372:0x0c1f, B:373:0x0c22, B:358:0x0b75, B:360:0x0b9b, B:378:0x0c3b, B:379:0x0c52, B:380:0x0c53), top: B:397:0x09c2, inners: #2, #8 }] */
    /* JADX WARN: Code duplicated, block: B:346:0x0aec A[Catch: all -> 0x09e7, TRY_LEAVE, TryCatch #5 {all -> 0x09e7, blocks: (B:317:0x09c2, B:319:0x09d9, B:323:0x09ea, B:325:0x0a22, B:327:0x0a2a, B:329:0x0a34, B:330:0x0a3e, B:332:0x0a48, B:333:0x0a52, B:334:0x0a5b, B:336:0x0a61, B:338:0x0aab, B:340:0x0abd, B:344:0x0adc, B:346:0x0aec, B:343:0x0acc, B:350:0x0aff, B:351:0x0b41, B:352:0x0b4c, B:353:0x0b61, B:355:0x0b67, B:364:0x0bae, B:365:0x0bf6, B:367:0x0c07, B:381:0x0c66, B:372:0x0c1f, B:373:0x0c22, B:358:0x0b75, B:360:0x0b9b, B:378:0x0c3b, B:379:0x0c52, B:380:0x0c53), top: B:397:0x09c2, inners: #2, #8 }] */
    /* JADX WARN: Code duplicated, block: B:348:0x0af7  */
    /* JADX WARN: Code duplicated, block: B:355:0x0b67 A[Catch: all -> 0x09e7, TryCatch #5 {all -> 0x09e7, blocks: (B:317:0x09c2, B:319:0x09d9, B:323:0x09ea, B:325:0x0a22, B:327:0x0a2a, B:329:0x0a34, B:330:0x0a3e, B:332:0x0a48, B:333:0x0a52, B:334:0x0a5b, B:336:0x0a61, B:338:0x0aab, B:340:0x0abd, B:344:0x0adc, B:346:0x0aec, B:343:0x0acc, B:350:0x0aff, B:351:0x0b41, B:352:0x0b4c, B:353:0x0b61, B:355:0x0b67, B:364:0x0bae, B:365:0x0bf6, B:367:0x0c07, B:381:0x0c66, B:372:0x0c1f, B:373:0x0c22, B:358:0x0b75, B:360:0x0b9b, B:378:0x0c3b, B:379:0x0c52, B:380:0x0c53), top: B:397:0x09c2, inners: #2, #8 }] */
    /* JADX WARN: Code duplicated, block: B:360:0x0b9b A[Catch: all -> 0x09e7, TryCatch #5 {all -> 0x09e7, blocks: (B:317:0x09c2, B:319:0x09d9, B:323:0x09ea, B:325:0x0a22, B:327:0x0a2a, B:329:0x0a34, B:330:0x0a3e, B:332:0x0a48, B:333:0x0a52, B:334:0x0a5b, B:336:0x0a61, B:338:0x0aab, B:340:0x0abd, B:344:0x0adc, B:346:0x0aec, B:343:0x0acc, B:350:0x0aff, B:351:0x0b41, B:352:0x0b4c, B:353:0x0b61, B:355:0x0b67, B:364:0x0bae, B:365:0x0bf6, B:367:0x0c07, B:381:0x0c66, B:372:0x0c1f, B:373:0x0c22, B:358:0x0b75, B:360:0x0b9b, B:378:0x0c3b, B:379:0x0c52, B:380:0x0c53), top: B:397:0x09c2, inners: #2, #8 }] */
    /* JADX WARN: Code duplicated, block: B:367:0x0c07 A[Catch: all -> 0x09e7, SQLiteException -> 0x0c1b, TRY_LEAVE, TryCatch #8 {SQLiteException -> 0x0c1b, blocks: (B:365:0x0bf6, B:367:0x0c07), top: B:402:0x0bf6, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:371:0x0c1d  */
    /* JADX WARN: Code duplicated, block: B:400:0x0502 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x0af9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x0b75 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x0b73 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:? A[LOOP:3: B:353:0x0b61->B:421:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x0391 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x037d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0331 A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x036e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0371 A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0383 A[Catch: all -> 0x01e8, TryCatch #6 {all -> 0x01e8, blocks: (B:37:0x01c9, B:40:0x01d6, B:42:0x01de, B:48:0x01ec, B:93:0x0361, B:102:0x0397, B:104:0x03d5, B:106:0x03db, B:107:0x03f0, B:109:0x03fb, B:111:0x0413, B:113:0x0419, B:114:0x042e, B:117:0x044d, B:121:0x046f, B:122:0x0484, B:123:0x048d, B:126:0x04aa, B:127:0x04be, B:129:0x04c6, B:131:0x04d0, B:133:0x04d6, B:134:0x04dd, B:136:0x04ea, B:138:0x04f2, B:140:0x04fa, B:142:0x0502, B:143:0x050e, B:144:0x051b, B:146:0x0543, B:155:0x0567, B:156:0x057a, B:158:0x05a7, B:161:0x05d1, B:165:0x061d, B:168:0x064b, B:170:0x0678, B:171:0x067b, B:173:0x0681, B:175:0x0689, B:177:0x068f, B:179:0x0697, B:181:0x069d, B:185:0x06ac, B:188:0x06ba, B:190:0x06c3, B:192:0x06cf, B:195:0x06fe, B:197:0x0707, B:201:0x071c, B:206:0x0729, B:241:0x07a4, B:242:0x07ab, B:244:0x07ce, B:247:0x07d7, B:251:0x07e4, B:252:0x0800, B:254:0x0806, B:256:0x0820, B:258:0x082c, B:260:0x0839, B:267:0x086a, B:271:0x0874, B:272:0x0877, B:274:0x0884, B:275:0x0887, B:286:0x08cb, B:265:0x0858, B:245:0x07d1, B:209:0x0732, B:213:0x073f, B:217:0x074d, B:221:0x075b, B:225:0x0769, B:229:0x0777, B:233:0x0783, B:237:0x0791, B:167:0x063e, B:152:0x054e, B:96:0x0371, B:97:0x037d, B:99:0x0383, B:101:0x0391, B:56:0x020c, B:59:0x021a, B:61:0x022f, B:67:0x0247, B:72:0x0275, B:74:0x027b, B:76:0x0289, B:78:0x0297, B:81:0x02a0, B:89:0x0327, B:91:0x0331, B:83:0x02cd, B:84:0x02e6, B:88:0x030c, B:87:0x02f9, B:70:0x0253, B:71:0x026f), top: B:399:0x01c9, inners: #0, #4 }] */
    /* JADX INFO: renamed from: l */
    public final void m9963l(ys5 ys5Var, cp6 cp6Var) throws Throwable {
        qm6 qm6Var;
        String str;
        String str2;
        String str3;
        long jRound;
        String str4;
        ar5 ar5VarM9952f0;
        int iM9223C;
        an6 an6Var;
        an6 an6Var2;
        bt5 bt5Var;
        boolean zM4576t0;
        boolean zEquals;
        Iterator<String> it;
        long length;
        Object objM9258a;
        String str5;
        oq5 oq5VarM3161B0;
        long jIntValue;
        String str6;
        Bundle bundleM9261d;
        ar5 ar5VarM9952f1;
        String str7;
        long jDelete;
        oa6 oa6Var;
        cs5 cs5Var;
        String str8;
        fs5 fs5VarM3182U;
        fs5 fs5VarM5801a;
        cs5 cs5Var2;
        qa6 qa6VarM11368T;
        String str9;
        String str10;
        String str11;
        long j;
        String str12;
        String str13;
        String str14;
        xc6 xc6VarM12661j;
        boolean zM9225E;
        vc6 vc6Var;
        long j2;
        hd6 hd6VarM6361a;
        Map mapM6363b;
        String str15;
        String str16;
        ArrayList arrayList;
        xc6 xc6VarM12661j2;
        z76 z76VarM3212y0;
        int i;
        List listM3203r0;
        int i2;
        ar5 ar5VarM9952f2;
        ar5 ar5VarM9952f3;
        cs5 cs5Var3;
        Iterator<String> it2;
        boolean zM8646K;
        int i3;
        String str17;
        ContentValues contentValues;
        String str18;
        q76 q76VarM9958i0;
        long jM9796i0;
        z76 z76VarM3212y1;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        long jM3174M;
        op5 op5VarM9950d0;
        d56 d56Var;
        bt5 bt5Var2;
        Object obj;
        an6 an6VarM3202q0;
        Object obj2;
        long jMax;
        long jIntValue2;
        String str19 = "raw_events";
        y42.m12854a0(cp6Var);
        boolean z9 = cp6Var.f16362q;
        long j4 = cp6Var.f16365t;
        long j5 = cp6Var.f16354i;
        String str20 = cp6Var.f16367v;
        long j6 = cp6Var.f16353h;
        long j7 = cp6Var.f16358m;
        String str21 = cp6Var.f16369x;
        String str22 = cp6Var.f16351f;
        String str23 = cp6Var.f16352g;
        long j8 = j5;
        boolean z10 = cp6Var.f16356k;
        String str24 = cp6Var.f16349d;
        y42.m12851X(str24);
        long jNanoTime = System.nanoTime();
        mo9020c().mo5038t();
        m9962k0();
        m9958i0();
        String str25 = cp6Var.f16350e;
        if (TextUtils.isEmpty(str25)) {
            return;
        }
        if (!z10) {
            m9948a0(cp6Var);
            return;
        }
        n96 n96VarM9951e0 = m9951e0();
        String str26 = ys5Var.f35504d;
        boolean zM8645J = n96VarM9951e0.m8645J(str24, str26);
        oa6 oa6Var2 = this.f28602l;
        bt5 bt5Var3 = this.f28590J;
        if (zM8645J) {
            mo9019b().f16838m.m12506c("Dropping blocked event. appId", d76.m4401y(str24), oa6Var2.f26518j.m9366a(str26));
            if (!"1".equals(m9951e0().mo7575a(str24, "measurement.upload.blacklist_internal")) && !"1".equals(m9951e0().mo7575a(str24, "measurement.upload.blacklist_public"))) {
                if ("_err".equals(str26)) {
                    return;
                }
                m9960j0();
                dn6.m4564K(bt5Var3, str24, 11, "_ev", str26, 0);
                return;
            }
            z76 z76VarM3212y2 = m9952f0().m3212y0(str24);
            if (z76VarM3212y2 != null) {
                oa6 oa6Var3 = z76VarM3212y2.f35837a;
                ea6 ea6Var = oa6Var3.f26515g;
                oa6.m9016l(ea6Var);
                ea6Var.mo5038t();
                long j9 = z76VarM3212y2.f35836S;
                ea6 ea6Var2 = oa6Var3.f26515g;
                oa6.m9016l(ea6Var2);
                ea6Var2.mo5038t();
                long jMax2 = Math.max(j9, z76VarM3212y2.f35835R);
                mo9022e().getClass();
                long jAbs = Math.abs(System.currentTimeMillis() - jMax2);
                m9950d0();
                if (jAbs > ((Long) e56.f17743N.m4379a(null)).longValue()) {
                    mo9019b().f16842q.m12504a("Fetching config for blocked app");
                    m9981y(z76VarM3212y2);
                    return;
                }
                return;
            }
            return;
        }
        g76 g76VarM5911a = g76.m5911a(ys5Var);
        dn6 dn6VarM9960j0 = m9960j0();
        op5 op5VarM9950d1 = m9950d0();
        op5VarM9950d1.getClass();
        dn6VarM9960j0.m4584D(g76VarM5911a, Math.max(Math.min(op5VarM9950d1.m9223C(str24, e56.f17763X), 100), 25));
        int iMax = Math.max(Math.min(m9950d0().m9223C(str24, e56.f17788g0), 35), 10);
        Bundle bundle = (Bundle) g76VarM5911a.f19646e;
        Iterator it3 = new TreeSet(bundle.keySet()).iterator();
        while (it3.hasNext()) {
            String str27 = (String) it3.next();
            Iterator it4 = it3;
            if ("items".equals(str27)) {
                m9960j0().m4585E(bundle.getParcelableArray(str27), iMax);
            }
            it3 = it4;
        }
        ys5 ys5VarM5913c = g76VarM5911a.m5913c();
        os5 os5Var = ys5VarM5913c.f35505e;
        String str28 = ys5VarM5913c.f35504d;
        if (Log.isLoggable(mo9019b().m4402A(), 2)) {
            mo9019b().f16831L.m12505b(oa6Var2.f26518j.m9369d(ys5VarM5913c), "Logging event");
        }
        m9952f0().m3194i0();
        try {
            m9948a0(cp6Var);
            boolean z11 = "ecommerce_purchase".equals(str28) || "purchase".equals(str28) || "refund".equals(str28);
            if (!"_iap".equals(str28)) {
                if (z11) {
                    z11 = true;
                } else {
                    str2 = str23;
                    str3 = "events";
                    str19 = "raw_events";
                    str4 = str24;
                    str = str22;
                }
                bt5Var = bt5Var3;
                zM4576t0 = dn6.m4576t0(str28);
                zEquals = "_err".equals(str28);
                m9960j0();
                if (os5Var == null) {
                    length = 0;
                } else {
                    it = os5Var.f27065d.keySet().iterator();
                    length = 0;
                    while (it.hasNext()) {
                        objM9258a = os5Var.m9258a(it.next());
                        if (objM9258a instanceof Parcelable[]) {
                            length += (long) ((Parcelable[]) objM9258a).length;
                        }
                    }
                }
                str5 = str4;
                oq5VarM3161B0 = m9952f0().m3161B0(m9953g(), str5, length + 1, true, zM4576t0, false, zEquals, false, false, false);
                long j10 = oq5VarM3161B0.f26968b;
                m9950d0();
                jIntValue = j10 - ((long) ((Integer) e56.f17801l.m4379a(null)).intValue());
                if (jIntValue <= 0) {
                    if (zM4576t0) {
                        long j11 = oq5VarM3161B0.f26967a;
                        m9950d0();
                        jIntValue2 = j11 - ((long) ((Integer) e56.f17805n.m4379a(null)).intValue());
                        if (jIntValue2 > 0) {
                            if (jIntValue2 % 1000 == 1) {
                                mo9019b().f16835j.m12506c("Data loss. Too many public events logged. appId, count", d76.m4401y(str5), Long.valueOf(oq5VarM3161B0.f26967a));
                            }
                            m9960j0();
                            dn6.m4564K(bt5Var, str5, 16, "_ev", ys5VarM5913c.f35504d, 0);
                            m9952f0().m3195j0();
                        }
                    }
                    str6 = str5;
                    if (zEquals) {
                        jMax = oq5VarM3161B0.f26970d - ((long) Math.max(0, Math.min(1000000, m9950d0().m9223C(str6, e56.f17803m))));
                        if (jMax > 0) {
                            if (jMax == 1) {
                                mo9019b().f16835j.m12506c("Too many error events logged. appId, count", d76.m4401y(str6), Long.valueOf(oq5VarM3161B0.f26970d));
                            }
                            m9952f0().m3195j0();
                        }
                    }
                    bundleM9261d = os5Var.m9261d();
                    dn6 dn6VarM9960j1 = m9960j0();
                    String str29 = ys5VarM5913c.f35506f;
                    dn6VarM9960j1.m4592J(bundleM9261d, "_o", str29);
                    if (m9960j0().m4596U(str6, cp6Var.f16345E)) {
                        m9960j0().m4592J(bundleM9261d, "_dbg", 1L);
                        m9960j0().m4592J(bundleM9261d, "_r", 1L);
                    }
                    if ("_s".equals(str28) && (an6VarM3202q0 = m9952f0().m3202q0(str6, "_sno")) != null) {
                        obj2 = an6VarM3202q0.f14649e;
                        if (obj2 instanceof Long) {
                            m9960j0().m4592J(bundleM9261d, "_sno", obj2);
                        }
                    }
                    if (m9950d0().m9225E(null, e56.f17764X0) && Objects.equals(str29, "am") && str28.equals("_ai")) {
                        obj = bundleM9261d.get("value");
                        if (obj instanceof String) {
                            try {
                                double d = Double.parseDouble((String) obj);
                                bundleM9261d.remove("value");
                                bundleM9261d.putDouble("value", d);
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                    ar5VarM9952f1 = m9952f0();
                    y42.m12851X(str6);
                    ar5VarM9952f1.mo5038t();
                    ar5VarM9952f1.m10368u();
                    try {
                        str7 = str19;
                        try {
                            jDelete = ar5VarM9952f1.m3197l0().delete(str7, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((oa6) ar5VarM9952f1.f36084a).f26512d.m9223C(str6, e56.f17811q))))});
                        } catch (SQLiteException e) {
                            e = e;
                            ((oa6) ar5VarM9952f1.f36084a).mo9019b().f16835j.m12506c("Error deleting over the limit events. appId", d76.m4401y(str6), e);
                            jDelete = 0;
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        str7 = str19;
                    }
                    if (jDelete > 0) {
                        mo9019b().f16838m.m12506c("Data lost. Too many events stored on disk, deleted. appId", d76.m4401y(str6), Long.valueOf(jDelete));
                    }
                    oa6Var = this.f28602l;
                    cs5Var = new cs5(oa6Var, ys5VarM5913c.f35506f, str6, ys5VarM5913c.f35504d, ys5VarM5913c.f35507g, 0L, bundleM9261d);
                    ar5 ar5VarM9952f4 = m9952f0();
                    str8 = cs5Var.f16433b;
                    String str30 = str3;
                    fs5VarM3182U = ar5VarM9952f4.m3182U(str30, str6, str8);
                    if (fs5VarM3182U == null) {
                        jM3174M = m9952f0().m3174M(str6);
                        op5VarM9950d0 = m9950d0();
                        op5VarM9950d0.getClass();
                        d56Var = e56.f17761W;
                        bt5Var2 = bt5Var;
                        if (jM3174M >= Math.max(Math.min(op5VarM9950d0.m9223C(str6, d56Var), 2000), 500) || !zM4576t0) {
                            bt5Var = bt5Var2;
                            fs5VarM5801a = new fs5(str6, str8, 0L, 0L, 0L, cs5Var.f16435d, 0L, null, null, null, null);
                            str6 = str6;
                        } else {
                            x66 x66Var = mo9019b().f16835j;
                            z66 z66VarM4401y = d76.m4401y(str6);
                            String strM9366a = oa6Var.f26518j.m9366a(str8);
                            op5 op5VarM9950d2 = m9950d0();
                            op5VarM9950d2.getClass();
                            x66Var.m12507d("Too many event names used, ignoring event. appId, name, supported count", z66VarM4401y, strM9366a, Integer.valueOf(Math.max(Math.min(op5VarM9950d2.m9223C(str6, d56Var), 2000), 500)));
                            m9960j0();
                            dn6.m4564K(bt5Var2, str6, 8, null, null, 0);
                        }
                    } else {
                        cs5Var = cs5Var.m4166a(oa6Var, fs5VarM3182U.f19259f);
                        fs5VarM5801a = fs5VarM3182U.m5801a(cs5Var.f16435d);
                    }
                    cs5Var2 = cs5Var;
                    m9952f0().m3183V(str30, fs5VarM5801a);
                    mo9020c().mo5038t();
                    m9962k0();
                    String str31 = cs5Var2.f16432a;
                    y42.m12851X(str31);
                    y42.m12849V(str31.equals(str6));
                    qa6VarM11368T = ua6.m11368T();
                    qa6VarM11368T.m9858y();
                    qa6VarM11368T.m9843j();
                    if (!TextUtils.isEmpty(str6)) {
                        qa6VarM11368T.m9849p(str6);
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str9 = str2;
                    } else {
                        str9 = str2;
                        qa6VarM11368T.m9847n(str9);
                    }
                    if (TextUtils.isEmpty(str)) {
                        str10 = str;
                    } else {
                        str10 = str;
                        qa6VarM11368T.m9850q(str10);
                    }
                    if (TextUtils.isEmpty(str21)) {
                        str11 = str21;
                    } else {
                        str11 = str21;
                        qa6VarM11368T.m9828R(str11);
                    }
                    if (j7 != -2147483648L) {
                        j = j7;
                        qa6VarM11368T.m9822L((int) j);
                    } else {
                        j = j7;
                    }
                    str12 = str11;
                    qa6VarM11368T.m9851r(j6);
                    if (TextUtils.isEmpty(str25)) {
                        str13 = str25;
                    } else {
                        str13 = str25;
                        qa6VarM11368T.m9818H(str13);
                    }
                    y42.m12854a0(str6);
                    str14 = str9;
                    xc6VarM12661j = m9947a(str6).m12661j(xc6.m12653c(100, str20));
                    qa6VarM11368T.m9827Q(xc6VarM12661j.m12658f());
                    ho6.m6466a();
                    zM9225E = m9950d0().m9225E(str6, e56.f17748P0);
                    vc6Var = vc6.AD_STORAGE;
                    if (zM9225E) {
                        m9960j0();
                        if (dn6.m4568Q(str6)) {
                            qa6VarM11368T.m9859z(cp6Var.f16343C);
                            j2 = j;
                            j3 = cp6Var.f16344D;
                            if (!xc6VarM12661j.m12660i(vc6Var) && j3 != 0) {
                                j3 = (j3 & (-2)) | 32;
                            }
                            if (j3 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            qa6VarM11368T.m9830T(z);
                            if (j3 != 0) {
                                l86 l86VarM8989v = o86.m8989v();
                                if ((j3 & 1) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                l86VarM8989v.m7866h(z2);
                                if ((j3 & 2) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                l86VarM8989v.m7867i(z3);
                                if ((j3 & 4) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                l86VarM8989v.m7868j(z4);
                                if ((j3 & 8) != 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                l86VarM8989v.m7869k(z5);
                                if ((j3 & 16) != 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                l86VarM8989v.m7870l(z6);
                                if ((j3 & 32) != 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                l86VarM8989v.m7871m(z7);
                                if ((j3 & 64) != 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                l86VarM8989v.m7872n(z8);
                                qa6VarM11368T.m9811A((o86) l86VarM8989v.m11056e());
                            }
                        } else {
                            j2 = j;
                        }
                    } else {
                        j2 = j;
                    }
                    if (j8 != 0) {
                        qa6VarM11368T.m9856w(j8);
                        j8 = j8;
                    }
                    qa6VarM11368T.m9825O(j4);
                    q76 q76VarM9958i1 = m9958i0();
                    hd6VarM6361a = hd6.m6361a(q76VarM9958i1.f19870f.f28602l.mo9021d().getContentResolver(), he6.m6365a(), p62.f27399b);
                    if (hd6VarM6361a == null) {
                        mapM6363b = Collections.EMPTY_MAP;
                    } else {
                        mapM6363b = hd6VarM6361a.m6363b();
                    }
                    if (mapM6363b == null && !mapM6363b.isEmpty()) {
                        arrayList = new ArrayList();
                        str15 = str10;
                        int iIntValue = ((Integer) e56.f17785f0.m4379a(null)).intValue();
                        Iterator it5 = mapM6363b.entrySet().iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                str16 = str13;
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it5.next();
                            Iterator it6 = it5;
                            str16 = str13;
                            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                try {
                                    int i4 = Integer.parseInt((String) entry.getValue());
                                    if (i4 != 0) {
                                        arrayList.add(Integer.valueOf(i4));
                                        if (arrayList.size() >= iIntValue) {
                                            ((oa6) q76VarM9958i1.f36084a).mo9019b().f16838m.m12505b(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                                            break;
                                        }
                                        continue;
                                    } else {
                                        continue;
                                    }
                                } catch (NumberFormatException e3) {
                                    ((oa6) q76VarM9958i1.f36084a).mo9019b().f16838m.m12505b(e3, "Experiment ID NumberFormatException");
                                }
                            }
                            it5 = it6;
                            str13 = str16;
                        }
                        if (!arrayList.isEmpty()) {
                            if (arrayList != null) {
                                qa6VarM11368T.m9824N(arrayList);
                            }
                            if (m9950d0().m9225E(null, e56.f17774b1)) {
                                qa6VarM11368T.m9814D();
                            }
                            xc6VarM12661j2 = m9947a(str6).m12661j(xc6.m12653c(100, str20));
                            if (xc6VarM12661j2.m12660i(vc6Var) || !z9) {
                                oa6Var2 = oa6Var2;
                                cs5Var2 = cs5Var2;
                            } else {
                                try {
                                    rj6 rj6Var = this.f28599i;
                                    rj6Var.getClass();
                                    Pair pairM10347y = xc6VarM12661j2.m12660i(vc6Var) ? rj6Var.m10347y(str6) : new Pair("", Boolean.FALSE);
                                    if (TextUtils.isEmpty((CharSequence) pairM10347y.first)) {
                                        oa6Var2 = oa6Var2;
                                        cs5Var2 = cs5Var2;
                                    } else {
                                        qa6VarM11368T.m9853t((String) pairM10347y.first);
                                        Object obj3 = pairM10347y.second;
                                        if (obj3 != null) {
                                            qa6VarM11368T.m9854u(((Boolean) obj3).booleanValue());
                                        }
                                        if (cs5Var2.f16433b.equals("_fx") || ((String) pairM10347y.first).equals("00000000-0000-0000-0000-000000000000") || (z76VarM3212y1 = m9952f0().m3212y0(str6)) == null) {
                                            oa6Var2 = oa6Var2;
                                            cs5Var2 = cs5Var2;
                                        } else {
                                            ea6 ea6Var3 = z76VarM3212y1.f35837a.f26515g;
                                            oa6.m9016l(ea6Var3);
                                            ea6Var3.mo5038t();
                                            if (z76VarM3212y1.f35861y) {
                                                m9977u(str6, false, null, null);
                                                Bundle bundle2 = new Bundle();
                                                ea6 ea6Var4 = z76VarM3212y1.f35837a.f26515g;
                                                oa6.m9016l(ea6Var4);
                                                ea6Var4.mo5038t();
                                                Long l = z76VarM3212y1.f35862z;
                                                if (l != null) {
                                                    bundle2.putLong("_pfo", Math.max(0L, l.longValue()));
                                                }
                                                ea6 ea6Var5 = z76VarM3212y1.f35837a.f26515g;
                                                oa6.m9016l(ea6Var5);
                                                ea6Var5.mo5038t();
                                                Long l2 = z76VarM3212y1.f35818A;
                                                if (l2 != null) {
                                                    bundle2.putLong("_uwa", l2.longValue());
                                                }
                                                bundle2.putLong("_r", 1L);
                                                bt5Var.mo3640a(str6, "_fx", bundle2);
                                            } else {
                                                oa6Var2 = oa6Var2;
                                                cs5Var2 = cs5Var2;
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    qm6Var = this;
                                }
                            }
                            oa6Var2.m9028o().m7955v();
                            String str32 = Build.MODEL;
                            qa6VarM11368T.m9844k();
                            oa6Var2.m9028o().m7955v();
                            String str33 = Build.VERSION.RELEASE;
                            qa6VarM11368T.m11054c();
                            ((ua6) qa6VarM11368T.f31181b).m11485n0(str33);
                            qa6VarM11368T.m9846m((int) oa6Var2.m9028o().m13228y());
                            qa6VarM11368T.m9845l(oa6Var2.m9028o().m13229z());
                            qa6VarM11368T.m9829S(cp6Var.f16371z);
                            if (oa6Var2.m9018a()) {
                                qa6VarM11368T.m9848o();
                                if (!TextUtils.isEmpty(null)) {
                                    qa6VarM11368T.m11054c();
                                    ((ua6) qa6VarM11368T.f31181b).m11419Q0(null);
                                    throw null;
                                }
                            }
                            z76VarM3212y0 = m9952f0().m3212y0(str6);
                            if (z76VarM3212y0 == null) {
                                z76VarM3212y0 = new z76(oa6Var2, str6);
                                qm6Var = this;
                                try {
                                    z76VarM3212y0.m13406F(qm6Var.m9969o(xc6VarM12661j2));
                                    z76VarM3212y0.m13411K(cp6Var.f16359n);
                                    z76VarM3212y0.m13408H(str16);
                                    if (xc6VarM12661j2.m12660i(vc6Var)) {
                                        z76VarM3212y0.m13409I(qm6Var.f28599i.m10348z(str6, z9));
                                    }
                                    z76VarM3212y0.m13424e(0L);
                                    z76VarM3212y0.m13412L(0L);
                                    z76VarM3212y0.m13413M(0L);
                                    z76VarM3212y0.m13415O(str15);
                                    z76VarM3212y0.m13417Q(j2);
                                    z76VarM3212y0.m13418R(str14);
                                    z76VarM3212y0.m13419S(j6);
                                    z76VarM3212y0.m13420a(j8);
                                    z76VarM3212y0.m13423d(z10);
                                    z76VarM3212y0.m13422c(j4);
                                    i = 0;
                                    qm6Var.m9952f0().m3214z0(z76VarM3212y0, false);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } else {
                                i = 0;
                                qm6Var = this;
                            }
                            if (xc6VarM12661j2.m12660i(vc6.ANALYTICS_STORAGE) && !TextUtils.isEmpty(z76VarM3212y0.m13405E())) {
                                String strM13405E = z76VarM3212y0.m13405E();
                                y42.m12854a0(strM13405E);
                                qa6VarM11368T.m9855v(strM13405E);
                            }
                            if (!TextUtils.isEmpty(z76VarM3212y0.m13410J())) {
                                String strM13410J = z76VarM3212y0.m13410J();
                                y42.m12854a0(strM13410J);
                                qa6VarM11368T.m9821K(strM13410J);
                            }
                            listM3203r0 = qm6Var.m9952f0().m3203r0(str6);
                            i2 = i;
                            while (i2 < listM3203r0.size()) {
                                ob6 ob6VarM9471z = pb6.m9471z();
                                String str34 = ((an6) listM3203r0.get(i2)).f14647c;
                                ob6VarM9471z.m11054c();
                                ((pb6) ob6VarM9471z.f31181b).m9473B(str34);
                                long j12 = ((an6) listM3203r0.get(i2)).f14648d;
                                ob6VarM9471z.m11054c();
                                ((pb6) ob6VarM9471z.f31181b).m9472A(j12);
                                qm6Var.m9958i0().m9787W(ob6VarM9471z, ((an6) listM3203r0.get(i2)).f14649e);
                                qa6VarM11368T.m9837a0(ob6VarM9471z);
                                if ("_sid".equals(((an6) listM3203r0.get(i2)).f14647c)) {
                                    ea6 ea6Var6 = z76VarM3212y0.f35837a.f26515g;
                                    oa6.m9016l(ea6Var6);
                                    ea6Var6.mo5038t();
                                    if (z76VarM3212y0.f35859w != 0) {
                                        q76VarM9958i0 = qm6Var.m9958i0();
                                        if (TextUtils.isEmpty(str12)) {
                                            str18 = str12;
                                            jM9796i0 = 0;
                                        } else {
                                            str18 = str12;
                                            jM9796i0 = q76VarM9958i0.m9796i0(str18.getBytes(Charset.forName("UTF-8")));
                                        }
                                        ea6 ea6Var7 = z76VarM3212y0.f35837a.f26515g;
                                        oa6.m9016l(ea6Var7);
                                        ea6Var7.mo5038t();
                                        if (jM9796i0 != z76VarM3212y0.f35859w) {
                                            qa6VarM11368T.m11054c();
                                            ((ua6) qa6VarM11368T.f31181b).m11441Y0();
                                        }
                                    } else {
                                        str18 = str12;
                                    }
                                } else {
                                    str18 = str12;
                                }
                                i2++;
                                str12 = str18;
                            }
                            try {
                                ar5VarM9952f2 = qm6Var.m9952f0();
                                ua6 ua6Var = (ua6) qa6VarM11368T.m11056e();
                                ar5VarM9952f2.mo5038t();
                                ar5VarM9952f2.m10368u();
                                y42.m12851X(ua6Var.m11487o());
                                byte[] bArrM5118a = ua6Var.m5118a();
                                long jM9796i1 = ar5VarM9952f2.f19870f.m9958i0().m9796i0(bArrM5118a);
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("app_id", ua6Var.m11487o());
                                contentValues2.put("metadata_fingerprint", Long.valueOf(jM9796i1));
                                contentValues2.put("metadata", bArrM5118a);
                                try {
                                    ar5VarM9952f2.m3197l0().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                    ar5VarM9952f3 = qm6Var.m9952f0();
                                    cs5Var3 = cs5Var2;
                                    os5 os5Var2 = cs5Var3.f16437f;
                                    Objects.requireNonNull(os5Var2);
                                    it2 = os5Var2.f27065d.keySet().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            n96 n96VarM9951e1 = qm6Var.m9951e0();
                                            String str35 = cs5Var3.f16432a;
                                            zM8646K = n96VarM9951e1.m8646K(str35, cs5Var3.f16433b);
                                            oq5 oq5VarM3159A0 = qm6Var.m9952f0().m3159A0(qm6Var.m9953g(), str35, false, false, false, false);
                                            if (zM8646K || oq5VarM3159A0.f26971e >= qm6Var.m9950d0().m9223C(str35, e56.f17809p)) {
                                                i3 = i;
                                                break;
                                            }
                                        } else if ("_r".equals(it2.next())) {
                                        }
                                        i3 = 1;
                                        break;
                                    }
                                    ar5VarM9952f3.mo5038t();
                                    ar5VarM9952f3.m10368u();
                                    str17 = cs5Var3.f16432a;
                                    y42.m12851X(str17);
                                    byte[] bArrM5118a2 = ar5VarM9952f3.f19870f.m9958i0().m9790Z(cs5Var3).m5118a();
                                    contentValues = new ContentValues();
                                    contentValues.put("app_id", str17);
                                    contentValues.put("name", cs5Var3.f16433b);
                                    contentValues.put("timestamp", Long.valueOf(cs5Var3.f16435d));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(jM9796i1));
                                    contentValues.put("data", bArrM5118a2);
                                    contentValues.put("realtime", Integer.valueOf(i3));
                                    try {
                                        if (ar5VarM9952f3.m3197l0().insert(str7, null, contentValues) == -1) {
                                            ((oa6) ar5VarM9952f3.f36084a).mo9019b().f16835j.m12505b(d76.m4401y(str17), "Failed to insert raw event (got -1). appId");
                                        } else {
                                            qm6Var.f28605o = 0L;
                                        }
                                    } catch (SQLiteException e4) {
                                        ((oa6) ar5VarM9952f3.f36084a).mo9019b().f16835j.m12506c("Error storing raw event. appId", d76.m4401y(cs5Var3.f16432a), e4);
                                    }
                                    qm6Var.m9952f0().m3195j0();
                                    qm6Var.m9952f0().m3196k0();
                                    qm6Var.m9936L();
                                    qm6Var.mo9019b().f16831L.m12505b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                    return;
                                } catch (SQLiteException e5) {
                                    ((oa6) ar5VarM9952f2.f36084a).mo9019b().f16835j.m12506c("Error storing raw event metadata. appId", d76.m4401y(ua6Var.m11487o()), e5);
                                    throw e5;
                                }
                            } catch (IOException e6) {
                                qm6Var.mo9019b().f16835j.m12506c("Data loss. Failed to insert raw event metadata. appId", d76.m4401y(qa6VarM11368T.m9848o()), e6);
                            }
                        }
                        qm6Var.m9952f0().m3196k0();
                        throw th;
                    }
                    str15 = str10;
                    str16 = str13;
                    arrayList = null;
                    if (arrayList != null) {
                        qa6VarM11368T.m9824N(arrayList);
                    }
                    if (m9950d0().m9225E(null, e56.f17774b1)) {
                        qa6VarM11368T.m9814D();
                    }
                    xc6VarM12661j2 = m9947a(str6).m12661j(xc6.m12653c(100, str20));
                    if (xc6VarM12661j2.m12660i(vc6Var)) {
                        oa6Var2 = oa6Var2;
                        cs5Var2 = cs5Var2;
                        oa6Var2.m9028o().m7955v();
                        String str36 = Build.MODEL;
                        qa6VarM11368T.m9844k();
                        oa6Var2.m9028o().m7955v();
                        String str37 = Build.VERSION.RELEASE;
                        qa6VarM11368T.m11054c();
                        ((ua6) qa6VarM11368T.f31181b).m11485n0(str37);
                        qa6VarM11368T.m9846m((int) oa6Var2.m9028o().m13228y());
                        qa6VarM11368T.m9845l(oa6Var2.m9028o().m13229z());
                        qa6VarM11368T.m9829S(cp6Var.f16371z);
                        if (oa6Var2.m9018a()) {
                            qa6VarM11368T.m9848o();
                            if (!TextUtils.isEmpty(null)) {
                                qa6VarM11368T.m11054c();
                                ((ua6) qa6VarM11368T.f31181b).m11419Q0(null);
                                throw null;
                            }
                        }
                        z76VarM3212y0 = m9952f0().m3212y0(str6);
                        if (z76VarM3212y0 == null) {
                            z76VarM3212y0 = new z76(oa6Var2, str6);
                            qm6Var = this;
                            z76VarM3212y0.m13406F(qm6Var.m9969o(xc6VarM12661j2));
                            z76VarM3212y0.m13411K(cp6Var.f16359n);
                            z76VarM3212y0.m13408H(str16);
                            if (xc6VarM12661j2.m12660i(vc6Var)) {
                                z76VarM3212y0.m13409I(qm6Var.f28599i.m10348z(str6, z9));
                            }
                            z76VarM3212y0.m13424e(0L);
                            z76VarM3212y0.m13412L(0L);
                            z76VarM3212y0.m13413M(0L);
                            z76VarM3212y0.m13415O(str15);
                            z76VarM3212y0.m13417Q(j2);
                            z76VarM3212y0.m13418R(str14);
                            z76VarM3212y0.m13419S(j6);
                            z76VarM3212y0.m13420a(j8);
                            z76VarM3212y0.m13423d(z10);
                            z76VarM3212y0.m13422c(j4);
                            i = 0;
                            qm6Var.m9952f0().m3214z0(z76VarM3212y0, false);
                        } else {
                            i = 0;
                            qm6Var = this;
                        }
                        if (xc6VarM12661j2.m12660i(vc6.ANALYTICS_STORAGE)) {
                            String strM13405E2 = z76VarM3212y0.m13405E();
                            y42.m12854a0(strM13405E2);
                            qa6VarM11368T.m9855v(strM13405E2);
                        }
                        if (!TextUtils.isEmpty(z76VarM3212y0.m13410J())) {
                            String strM13410J2 = z76VarM3212y0.m13410J();
                            y42.m12854a0(strM13410J2);
                            qa6VarM11368T.m9821K(strM13410J2);
                        }
                        listM3203r0 = qm6Var.m9952f0().m3203r0(str6);
                        i2 = i;
                        while (i2 < listM3203r0.size()) {
                            ob6 ob6VarM9471z2 = pb6.m9471z();
                            String str38 = ((an6) listM3203r0.get(i2)).f14647c;
                            ob6VarM9471z2.m11054c();
                            ((pb6) ob6VarM9471z2.f31181b).m9473B(str38);
                            long j13 = ((an6) listM3203r0.get(i2)).f14648d;
                            ob6VarM9471z2.m11054c();
                            ((pb6) ob6VarM9471z2.f31181b).m9472A(j13);
                            qm6Var.m9958i0().m9787W(ob6VarM9471z2, ((an6) listM3203r0.get(i2)).f14649e);
                            qa6VarM11368T.m9837a0(ob6VarM9471z2);
                            if ("_sid".equals(((an6) listM3203r0.get(i2)).f14647c)) {
                                ea6 ea6Var8 = z76VarM3212y0.f35837a.f26515g;
                                oa6.m9016l(ea6Var8);
                                ea6Var8.mo5038t();
                                if (z76VarM3212y0.f35859w != 0) {
                                    q76VarM9958i0 = qm6Var.m9958i0();
                                    if (TextUtils.isEmpty(str12)) {
                                        str18 = str12;
                                        jM9796i0 = 0;
                                    } else {
                                        str18 = str12;
                                        jM9796i0 = q76VarM9958i0.m9796i0(str18.getBytes(Charset.forName("UTF-8")));
                                    }
                                    ea6 ea6Var9 = z76VarM3212y0.f35837a.f26515g;
                                    oa6.m9016l(ea6Var9);
                                    ea6Var9.mo5038t();
                                    if (jM9796i0 != z76VarM3212y0.f35859w) {
                                        qa6VarM11368T.m11054c();
                                        ((ua6) qa6VarM11368T.f31181b).m11441Y0();
                                    }
                                } else {
                                    str18 = str12;
                                }
                            } else {
                                str18 = str12;
                            }
                            i2++;
                            str12 = str18;
                        }
                        ar5VarM9952f2 = qm6Var.m9952f0();
                        ua6 ua6Var2 = (ua6) qa6VarM11368T.m11056e();
                        ar5VarM9952f2.mo5038t();
                        ar5VarM9952f2.m10368u();
                        y42.m12851X(ua6Var2.m11487o());
                        byte[] bArrM5118a3 = ua6Var2.m5118a();
                        long jM9796i2 = ar5VarM9952f2.f19870f.m9958i0().m9796i0(bArrM5118a3);
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("app_id", ua6Var2.m11487o());
                        contentValues3.put("metadata_fingerprint", Long.valueOf(jM9796i2));
                        contentValues3.put("metadata", bArrM5118a3);
                        ar5VarM9952f2.m3197l0().insertWithOnConflict("raw_events_metadata", null, contentValues3, 4);
                        ar5VarM9952f3 = qm6Var.m9952f0();
                        cs5Var3 = cs5Var2;
                        os5 os5Var3 = cs5Var3.f16437f;
                        Objects.requireNonNull(os5Var3);
                        it2 = os5Var3.f27065d.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                n96 n96VarM9951e2 = qm6Var.m9951e0();
                                String str39 = cs5Var3.f16432a;
                                zM8646K = n96VarM9951e2.m8646K(str39, cs5Var3.f16433b);
                                oq5 oq5VarM3159A1 = qm6Var.m9952f0().m3159A0(qm6Var.m9953g(), str39, false, false, false, false);
                                if (zM8646K) {
                                }
                                i3 = i;
                                break;
                            }
                            if ("_r".equals(it2.next())) {
                            }
                            i3 = 1;
                            break;
                        }
                        ar5VarM9952f3.mo5038t();
                        ar5VarM9952f3.m10368u();
                        str17 = cs5Var3.f16432a;
                        y42.m12851X(str17);
                        byte[] bArrM5118a4 = ar5VarM9952f3.f19870f.m9958i0().m9790Z(cs5Var3).m5118a();
                        contentValues = new ContentValues();
                        contentValues.put("app_id", str17);
                        contentValues.put("name", cs5Var3.f16433b);
                        contentValues.put("timestamp", Long.valueOf(cs5Var3.f16435d));
                        contentValues.put("metadata_fingerprint", Long.valueOf(jM9796i2));
                        contentValues.put("data", bArrM5118a4);
                        contentValues.put("realtime", Integer.valueOf(i3));
                        if (ar5VarM9952f3.m3197l0().insert(str7, null, contentValues) == -1) {
                            ((oa6) ar5VarM9952f3.f36084a).mo9019b().f16835j.m12505b(d76.m4401y(str17), "Failed to insert raw event (got -1). appId");
                        } else {
                            qm6Var.f28605o = 0L;
                        }
                        qm6Var.m9952f0().m3195j0();
                        qm6Var.m9952f0().m3196k0();
                        qm6Var.m9936L();
                        qm6Var.mo9019b().f16831L.m12505b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                        return;
                    }
                    oa6Var2 = oa6Var2;
                    cs5Var2 = cs5Var2;
                    oa6Var2.m9028o().m7955v();
                    String str310 = Build.MODEL;
                    qa6VarM11368T.m9844k();
                    oa6Var2.m9028o().m7955v();
                    String str311 = Build.VERSION.RELEASE;
                    qa6VarM11368T.m11054c();
                    ((ua6) qa6VarM11368T.f31181b).m11485n0(str311);
                    qa6VarM11368T.m9846m((int) oa6Var2.m9028o().m13228y());
                    qa6VarM11368T.m9845l(oa6Var2.m9028o().m13229z());
                    qa6VarM11368T.m9829S(cp6Var.f16371z);
                    if (oa6Var2.m9018a()) {
                        qa6VarM11368T.m9848o();
                        if (!TextUtils.isEmpty(null)) {
                            qa6VarM11368T.m11054c();
                            ((ua6) qa6VarM11368T.f31181b).m11419Q0(null);
                            throw null;
                        }
                    }
                    z76VarM3212y0 = m9952f0().m3212y0(str6);
                    if (z76VarM3212y0 == null) {
                        z76VarM3212y0 = new z76(oa6Var2, str6);
                        qm6Var = this;
                        z76VarM3212y0.m13406F(qm6Var.m9969o(xc6VarM12661j2));
                        z76VarM3212y0.m13411K(cp6Var.f16359n);
                        z76VarM3212y0.m13408H(str16);
                        if (xc6VarM12661j2.m12660i(vc6Var)) {
                            z76VarM3212y0.m13409I(qm6Var.f28599i.m10348z(str6, z9));
                        }
                        z76VarM3212y0.m13424e(0L);
                        z76VarM3212y0.m13412L(0L);
                        z76VarM3212y0.m13413M(0L);
                        z76VarM3212y0.m13415O(str15);
                        z76VarM3212y0.m13417Q(j2);
                        z76VarM3212y0.m13418R(str14);
                        z76VarM3212y0.m13419S(j6);
                        z76VarM3212y0.m13420a(j8);
                        z76VarM3212y0.m13423d(z10);
                        z76VarM3212y0.m13422c(j4);
                        i = 0;
                        qm6Var.m9952f0().m3214z0(z76VarM3212y0, false);
                    } else {
                        i = 0;
                        qm6Var = this;
                    }
                    if (xc6VarM12661j2.m12660i(vc6.ANALYTICS_STORAGE)) {
                        String strM13405E3 = z76VarM3212y0.m13405E();
                        y42.m12854a0(strM13405E3);
                        qa6VarM11368T.m9855v(strM13405E3);
                    }
                    if (!TextUtils.isEmpty(z76VarM3212y0.m13410J())) {
                        String strM13410J3 = z76VarM3212y0.m13410J();
                        y42.m12854a0(strM13410J3);
                        qa6VarM11368T.m9821K(strM13410J3);
                    }
                    listM3203r0 = qm6Var.m9952f0().m3203r0(str6);
                    i2 = i;
                    while (i2 < listM3203r0.size()) {
                        ob6 ob6VarM9471z3 = pb6.m9471z();
                        String str312 = ((an6) listM3203r0.get(i2)).f14647c;
                        ob6VarM9471z3.m11054c();
                        ((pb6) ob6VarM9471z3.f31181b).m9473B(str312);
                        long j14 = ((an6) listM3203r0.get(i2)).f14648d;
                        ob6VarM9471z3.m11054c();
                        ((pb6) ob6VarM9471z3.f31181b).m9472A(j14);
                        qm6Var.m9958i0().m9787W(ob6VarM9471z3, ((an6) listM3203r0.get(i2)).f14649e);
                        qa6VarM11368T.m9837a0(ob6VarM9471z3);
                        if ("_sid".equals(((an6) listM3203r0.get(i2)).f14647c)) {
                            ea6 ea6Var10 = z76VarM3212y0.f35837a.f26515g;
                            oa6.m9016l(ea6Var10);
                            ea6Var10.mo5038t();
                            if (z76VarM3212y0.f35859w != 0) {
                                q76VarM9958i0 = qm6Var.m9958i0();
                                if (TextUtils.isEmpty(str12)) {
                                    str18 = str12;
                                    jM9796i0 = 0;
                                } else {
                                    str18 = str12;
                                    jM9796i0 = q76VarM9958i0.m9796i0(str18.getBytes(Charset.forName("UTF-8")));
                                }
                                ea6 ea6Var11 = z76VarM3212y0.f35837a.f26515g;
                                oa6.m9016l(ea6Var11);
                                ea6Var11.mo5038t();
                                if (jM9796i0 != z76VarM3212y0.f35859w) {
                                    qa6VarM11368T.m11054c();
                                    ((ua6) qa6VarM11368T.f31181b).m11441Y0();
                                }
                            } else {
                                str18 = str12;
                            }
                        } else {
                            str18 = str12;
                        }
                        i2++;
                        str12 = str18;
                    }
                    ar5VarM9952f2 = qm6Var.m9952f0();
                    ua6 ua6Var3 = (ua6) qa6VarM11368T.m11056e();
                    ar5VarM9952f2.mo5038t();
                    ar5VarM9952f2.m10368u();
                    y42.m12851X(ua6Var3.m11487o());
                    byte[] bArrM5118a5 = ua6Var3.m5118a();
                    long jM9796i3 = ar5VarM9952f2.f19870f.m9958i0().m9796i0(bArrM5118a5);
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("app_id", ua6Var3.m11487o());
                    contentValues4.put("metadata_fingerprint", Long.valueOf(jM9796i3));
                    contentValues4.put("metadata", bArrM5118a5);
                    ar5VarM9952f2.m3197l0().insertWithOnConflict("raw_events_metadata", null, contentValues4, 4);
                    ar5VarM9952f3 = qm6Var.m9952f0();
                    cs5Var3 = cs5Var2;
                    os5 os5Var4 = cs5Var3.f16437f;
                    Objects.requireNonNull(os5Var4);
                    it2 = os5Var4.f27065d.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            n96 n96VarM9951e3 = qm6Var.m9951e0();
                            String str313 = cs5Var3.f16432a;
                            zM8646K = n96VarM9951e3.m8646K(str313, cs5Var3.f16433b);
                            oq5 oq5VarM3159A2 = qm6Var.m9952f0().m3159A0(qm6Var.m9953g(), str313, false, false, false, false);
                            if (zM8646K) {
                            }
                            i3 = i;
                            break;
                        }
                        if ("_r".equals(it2.next())) {
                        }
                        i3 = 1;
                        break;
                    }
                    ar5VarM9952f3.mo5038t();
                    ar5VarM9952f3.m10368u();
                    str17 = cs5Var3.f16432a;
                    y42.m12851X(str17);
                    byte[] bArrM5118a6 = ar5VarM9952f3.f19870f.m9958i0().m9790Z(cs5Var3).m5118a();
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str17);
                    contentValues.put("name", cs5Var3.f16433b);
                    contentValues.put("timestamp", Long.valueOf(cs5Var3.f16435d));
                    contentValues.put("metadata_fingerprint", Long.valueOf(jM9796i3));
                    contentValues.put("data", bArrM5118a6);
                    contentValues.put("realtime", Integer.valueOf(i3));
                    if (ar5VarM9952f3.m3197l0().insert(str7, null, contentValues) == -1) {
                        ((oa6) ar5VarM9952f3.f36084a).mo9019b().f16835j.m12505b(d76.m4401y(str17), "Failed to insert raw event (got -1). appId");
                    } else {
                        qm6Var.f28605o = 0L;
                    }
                    qm6Var.m9952f0().m3195j0();
                    qm6Var.m9952f0().m3196k0();
                    qm6Var.m9936L();
                    qm6Var.mo9019b().f16831L.m12505b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                    return;
                    qm6Var.m9952f0().m3196k0();
                    throw th;
                }
                if (jIntValue % 1000 == 1) {
                    mo9019b().f16835j.m12506c("Data loss. Too many events logged. appId, count", d76.m4401y(str5), Long.valueOf(oq5VarM3161B0.f26968b));
                }
                m9952f0().m3195j0();
                m9952f0().m3196k0();
            }
            str = str22;
            str2 = str23;
            String strM9260c = os5Var.m9260c();
            str3 = "events";
            Bundle bundle3 = os5Var.f27065d;
            if (z11) {
                double dDoubleValue = os5Var.m9259b().doubleValue() * 1000000.0d;
                if (dDoubleValue == 0.0d) {
                    dDoubleValue = bundle3.getLong("value") * 1000000.0d;
                }
                if (dDoubleValue > 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d) {
                    mo9019b().f16838m.m12506c("Data lost. Currency value is too big. appId", d76.m4401y(str24), Double.valueOf(dDoubleValue));
                    m9952f0().m3195j0();
                } else {
                    jRound = Math.round(dDoubleValue);
                    if ("refund".equals(str28)) {
                        jRound = -jRound;
                    }
                }
                m9952f0().m3196k0();
            }
            str19 = "raw_events";
            jRound = bundle3.getLong("value");
            if (!TextUtils.isEmpty(strM9260c)) {
                String upperCase = strM9260c.toUpperCase(Locale.US);
                if (upperCase.matches("[A-Z]{3}")) {
                    String strConcat = "_ltv_".concat(upperCase);
                    an6 an6VarM3202q1 = m9952f0().m3202q0(str24, strConcat);
                    try {
                        if (an6VarM3202q1 != null) {
                            Object obj4 = an6VarM3202q1.f14649e;
                            if (obj4 instanceof Long) {
                                long jLongValue = ((Long) obj4).longValue();
                                String str40 = ys5VarM5913c.f35506f;
                                mo9022e().getClass();
                                an6Var = new an6(str24, str40, strConcat, System.currentTimeMillis(), Long.valueOf(jLongValue + jRound));
                                str4 = str24;
                            }
                            an6Var2 = an6Var;
                            if (!m9952f0().m3201p0(an6Var2)) {
                                mo9019b().f16835j.m12507d("Too many unique user properties are set. Ignoring user property. appId", d76.m4401y(str4), oa6Var2.f26518j.m9368c(an6Var2.f14647c), an6Var2.f14649e);
                                m9960j0();
                                dn6.m4564K(bt5Var3, str4, 9, null, null, 0);
                                bt5Var = bt5Var3;
                            }
                            zM4576t0 = dn6.m4576t0(str28);
                            zEquals = "_err".equals(str28);
                            m9960j0();
                            if (os5Var == null) {
                                length = 0;
                            } else {
                                it = os5Var.f27065d.keySet().iterator();
                                length = 0;
                                while (it.hasNext()) {
                                    objM9258a = os5Var.m9258a(it.next());
                                    if (objM9258a instanceof Parcelable[]) {
                                        length += (long) ((Parcelable[]) objM9258a).length;
                                    }
                                }
                            }
                            str5 = str4;
                            oq5VarM3161B0 = m9952f0().m3161B0(m9953g(), str5, length + 1, true, zM4576t0, false, zEquals, false, false, false);
                            long j15 = oq5VarM3161B0.f26968b;
                            m9950d0();
                            jIntValue = j15 - ((long) ((Integer) e56.f17801l.m4379a(null)).intValue());
                            if (jIntValue <= 0) {
                                if (zM4576t0) {
                                    long j16 = oq5VarM3161B0.f26967a;
                                    m9950d0();
                                    jIntValue2 = j16 - ((long) ((Integer) e56.f17805n.m4379a(null)).intValue());
                                    if (jIntValue2 > 0) {
                                        if (jIntValue2 % 1000 == 1) {
                                            mo9019b().f16835j.m12506c("Data loss. Too many public events logged. appId, count", d76.m4401y(str5), Long.valueOf(oq5VarM3161B0.f26967a));
                                        }
                                        m9960j0();
                                        dn6.m4564K(bt5Var, str5, 16, "_ev", ys5VarM5913c.f35504d, 0);
                                        m9952f0().m3195j0();
                                    }
                                }
                                str6 = str5;
                                if (zEquals) {
                                    jMax = oq5VarM3161B0.f26970d - ((long) Math.max(0, Math.min(1000000, m9950d0().m9223C(str6, e56.f17803m))));
                                    if (jMax > 0) {
                                        if (jMax == 1) {
                                            mo9019b().f16835j.m12506c("Too many error events logged. appId, count", d76.m4401y(str6), Long.valueOf(oq5VarM3161B0.f26970d));
                                        }
                                        m9952f0().m3195j0();
                                    }
                                }
                                bundleM9261d = os5Var.m9261d();
                                dn6 dn6VarM9960j2 = m9960j0();
                                String str210 = ys5VarM5913c.f35506f;
                                dn6VarM9960j2.m4592J(bundleM9261d, "_o", str210);
                                if (m9960j0().m4596U(str6, cp6Var.f16345E)) {
                                    m9960j0().m4592J(bundleM9261d, "_dbg", 1L);
                                    m9960j0().m4592J(bundleM9261d, "_r", 1L);
                                }
                                if ("_s".equals(str28)) {
                                    obj2 = an6VarM3202q0.f14649e;
                                    if (obj2 instanceof Long) {
                                        m9960j0().m4592J(bundleM9261d, "_sno", obj2);
                                    }
                                }
                                if (m9950d0().m9225E(null, e56.f17764X0)) {
                                    obj = bundleM9261d.get("value");
                                    if (obj instanceof String) {
                                        double d2 = Double.parseDouble((String) obj);
                                        bundleM9261d.remove("value");
                                        bundleM9261d.putDouble("value", d2);
                                    }
                                }
                                ar5VarM9952f1 = m9952f0();
                                y42.m12851X(str6);
                                ar5VarM9952f1.mo5038t();
                                ar5VarM9952f1.m10368u();
                                str7 = str19;
                                jDelete = ar5VarM9952f1.m3197l0().delete(str7, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((oa6) ar5VarM9952f1.f36084a).f26512d.m9223C(str6, e56.f17811q))))});
                                if (jDelete > 0) {
                                    mo9019b().f16838m.m12506c("Data lost. Too many events stored on disk, deleted. appId", d76.m4401y(str6), Long.valueOf(jDelete));
                                }
                                oa6Var = this.f28602l;
                                cs5Var = new cs5(oa6Var, ys5VarM5913c.f35506f, str6, ys5VarM5913c.f35504d, ys5VarM5913c.f35507g, 0L, bundleM9261d);
                                ar5 ar5VarM9952f5 = m9952f0();
                                str8 = cs5Var.f16433b;
                                String str314 = str3;
                                fs5VarM3182U = ar5VarM9952f5.m3182U(str314, str6, str8);
                                if (fs5VarM3182U == null) {
                                    jM3174M = m9952f0().m3174M(str6);
                                    op5VarM9950d0 = m9950d0();
                                    op5VarM9950d0.getClass();
                                    d56Var = e56.f17761W;
                                    bt5Var2 = bt5Var;
                                    if (jM3174M >= Math.max(Math.min(op5VarM9950d0.m9223C(str6, d56Var), 2000), 500)) {
                                    }
                                    bt5Var = bt5Var2;
                                    fs5VarM5801a = new fs5(str6, str8, 0L, 0L, 0L, cs5Var.f16435d, 0L, null, null, null, null);
                                    str6 = str6;
                                } else {
                                    cs5Var = cs5Var.m4166a(oa6Var, fs5VarM3182U.f19259f);
                                    fs5VarM5801a = fs5VarM3182U.m5801a(cs5Var.f16435d);
                                }
                                cs5Var2 = cs5Var;
                                m9952f0().m3183V(str314, fs5VarM5801a);
                                mo9020c().mo5038t();
                                m9962k0();
                                String str315 = cs5Var2.f16432a;
                                y42.m12851X(str315);
                                y42.m12849V(str315.equals(str6));
                                qa6VarM11368T = ua6.m11368T();
                                qa6VarM11368T.m9858y();
                                qa6VarM11368T.m9843j();
                                if (!TextUtils.isEmpty(str6)) {
                                    qa6VarM11368T.m9849p(str6);
                                }
                                if (TextUtils.isEmpty(str2)) {
                                    str9 = str2;
                                    qa6VarM11368T.m9847n(str9);
                                } else {
                                    str9 = str2;
                                }
                                if (TextUtils.isEmpty(str)) {
                                    str10 = str;
                                    qa6VarM11368T.m9850q(str10);
                                } else {
                                    str10 = str;
                                }
                                if (TextUtils.isEmpty(str21)) {
                                    str11 = str21;
                                    qa6VarM11368T.m9828R(str11);
                                } else {
                                    str11 = str21;
                                }
                                if (j7 != -2147483648L) {
                                    j = j7;
                                    qa6VarM11368T.m9822L((int) j);
                                } else {
                                    j = j7;
                                }
                                str12 = str11;
                                qa6VarM11368T.m9851r(j6);
                                if (TextUtils.isEmpty(str25)) {
                                    str13 = str25;
                                    qa6VarM11368T.m9818H(str13);
                                } else {
                                    str13 = str25;
                                }
                                y42.m12854a0(str6);
                                str14 = str9;
                                xc6VarM12661j = m9947a(str6).m12661j(xc6.m12653c(100, str20));
                                qa6VarM11368T.m9827Q(xc6VarM12661j.m12658f());
                                ho6.m6466a();
                                zM9225E = m9950d0().m9225E(str6, e56.f17748P0);
                                vc6Var = vc6.AD_STORAGE;
                                if (zM9225E) {
                                    m9960j0();
                                    if (dn6.m4568Q(str6)) {
                                        qa6VarM11368T.m9859z(cp6Var.f16343C);
                                        j2 = j;
                                        j3 = cp6Var.f16344D;
                                        if (!xc6VarM12661j.m12660i(vc6Var)) {
                                            j3 = (j3 & (-2)) | 32;
                                        }
                                        if (j3 == 1) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        qa6VarM11368T.m9830T(z);
                                        if (j3 != 0) {
                                            l86 l86VarM8989v2 = o86.m8989v();
                                            if ((j3 & 1) != 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            l86VarM8989v2.m7866h(z2);
                                            if ((j3 & 2) != 0) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            l86VarM8989v2.m7867i(z3);
                                            if ((j3 & 4) != 0) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            l86VarM8989v2.m7868j(z4);
                                            if ((j3 & 8) != 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            l86VarM8989v2.m7869k(z5);
                                            if ((j3 & 16) != 0) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            l86VarM8989v2.m7870l(z6);
                                            if ((j3 & 32) != 0) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            l86VarM8989v2.m7871m(z7);
                                            if ((j3 & 64) != 0) {
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            l86VarM8989v2.m7872n(z8);
                                            qa6VarM11368T.m9811A((o86) l86VarM8989v2.m11056e());
                                        }
                                    } else {
                                        j2 = j;
                                    }
                                } else {
                                    j2 = j;
                                }
                                if (j8 != 0) {
                                    qa6VarM11368T.m9856w(j8);
                                    j8 = j8;
                                }
                                qa6VarM11368T.m9825O(j4);
                                q76 q76VarM9958i2 = m9958i0();
                                hd6VarM6361a = hd6.m6361a(q76VarM9958i2.f19870f.f28602l.mo9021d().getContentResolver(), he6.m6365a(), p62.f27399b);
                                if (hd6VarM6361a == null) {
                                    mapM6363b = Collections.EMPTY_MAP;
                                } else {
                                    mapM6363b = hd6VarM6361a.m6363b();
                                }
                                if (mapM6363b == null) {
                                    str15 = str10;
                                    str16 = str13;
                                    arrayList = null;
                                } else {
                                    str15 = str10;
                                    str16 = str13;
                                    arrayList = null;
                                }
                                if (arrayList != null) {
                                    qa6VarM11368T.m9824N(arrayList);
                                }
                                if (m9950d0().m9225E(null, e56.f17774b1)) {
                                    qa6VarM11368T.m9814D();
                                }
                                xc6VarM12661j2 = m9947a(str6).m12661j(xc6.m12653c(100, str20));
                                if (xc6VarM12661j2.m12660i(vc6Var)) {
                                    oa6Var2 = oa6Var2;
                                    cs5Var2 = cs5Var2;
                                    oa6Var2.m9028o().m7955v();
                                    String str316 = Build.MODEL;
                                    qa6VarM11368T.m9844k();
                                    oa6Var2.m9028o().m7955v();
                                    String str317 = Build.VERSION.RELEASE;
                                    qa6VarM11368T.m11054c();
                                    ((ua6) qa6VarM11368T.f31181b).m11485n0(str317);
                                    qa6VarM11368T.m9846m((int) oa6Var2.m9028o().m13228y());
                                    qa6VarM11368T.m9845l(oa6Var2.m9028o().m13229z());
                                    qa6VarM11368T.m9829S(cp6Var.f16371z);
                                    if (oa6Var2.m9018a()) {
                                        qa6VarM11368T.m9848o();
                                        if (!TextUtils.isEmpty(null)) {
                                            qa6VarM11368T.m11054c();
                                            ((ua6) qa6VarM11368T.f31181b).m11419Q0(null);
                                            throw null;
                                        }
                                    }
                                    z76VarM3212y0 = m9952f0().m3212y0(str6);
                                    if (z76VarM3212y0 == null) {
                                        z76VarM3212y0 = new z76(oa6Var2, str6);
                                        qm6Var = this;
                                        z76VarM3212y0.m13406F(qm6Var.m9969o(xc6VarM12661j2));
                                        z76VarM3212y0.m13411K(cp6Var.f16359n);
                                        z76VarM3212y0.m13408H(str16);
                                        if (xc6VarM12661j2.m12660i(vc6Var)) {
                                            z76VarM3212y0.m13409I(qm6Var.f28599i.m10348z(str6, z9));
                                        }
                                        z76VarM3212y0.m13424e(0L);
                                        z76VarM3212y0.m13412L(0L);
                                        z76VarM3212y0.m13413M(0L);
                                        z76VarM3212y0.m13415O(str15);
                                        z76VarM3212y0.m13417Q(j2);
                                        z76VarM3212y0.m13418R(str14);
                                        z76VarM3212y0.m13419S(j6);
                                        z76VarM3212y0.m13420a(j8);
                                        z76VarM3212y0.m13423d(z10);
                                        z76VarM3212y0.m13422c(j4);
                                        i = 0;
                                        qm6Var.m9952f0().m3214z0(z76VarM3212y0, false);
                                    } else {
                                        i = 0;
                                        qm6Var = this;
                                    }
                                    if (xc6VarM12661j2.m12660i(vc6.ANALYTICS_STORAGE)) {
                                        String strM13405E4 = z76VarM3212y0.m13405E();
                                        y42.m12854a0(strM13405E4);
                                        qa6VarM11368T.m9855v(strM13405E4);
                                    }
                                    if (!TextUtils.isEmpty(z76VarM3212y0.m13410J())) {
                                        String strM13410J4 = z76VarM3212y0.m13410J();
                                        y42.m12854a0(strM13410J4);
                                        qa6VarM11368T.m9821K(strM13410J4);
                                    }
                                    listM3203r0 = qm6Var.m9952f0().m3203r0(str6);
                                    i2 = i;
                                    while (i2 < listM3203r0.size()) {
                                        ob6 ob6VarM9471z4 = pb6.m9471z();
                                        String str318 = ((an6) listM3203r0.get(i2)).f14647c;
                                        ob6VarM9471z4.m11054c();
                                        ((pb6) ob6VarM9471z4.f31181b).m9473B(str318);
                                        long j17 = ((an6) listM3203r0.get(i2)).f14648d;
                                        ob6VarM9471z4.m11054c();
                                        ((pb6) ob6VarM9471z4.f31181b).m9472A(j17);
                                        qm6Var.m9958i0().m9787W(ob6VarM9471z4, ((an6) listM3203r0.get(i2)).f14649e);
                                        qa6VarM11368T.m9837a0(ob6VarM9471z4);
                                        if ("_sid".equals(((an6) listM3203r0.get(i2)).f14647c)) {
                                            ea6 ea6Var12 = z76VarM3212y0.f35837a.f26515g;
                                            oa6.m9016l(ea6Var12);
                                            ea6Var12.mo5038t();
                                            if (z76VarM3212y0.f35859w != 0) {
                                                q76VarM9958i0 = qm6Var.m9958i0();
                                                if (TextUtils.isEmpty(str12)) {
                                                    str18 = str12;
                                                    jM9796i0 = 0;
                                                } else {
                                                    str18 = str12;
                                                    jM9796i0 = q76VarM9958i0.m9796i0(str18.getBytes(Charset.forName("UTF-8")));
                                                }
                                                ea6 ea6Var13 = z76VarM3212y0.f35837a.f26515g;
                                                oa6.m9016l(ea6Var13);
                                                ea6Var13.mo5038t();
                                                if (jM9796i0 != z76VarM3212y0.f35859w) {
                                                    qa6VarM11368T.m11054c();
                                                    ((ua6) qa6VarM11368T.f31181b).m11441Y0();
                                                }
                                            } else {
                                                str18 = str12;
                                            }
                                        } else {
                                            str18 = str12;
                                        }
                                        i2++;
                                        str12 = str18;
                                    }
                                    ar5VarM9952f2 = qm6Var.m9952f0();
                                    ua6 ua6Var4 = (ua6) qa6VarM11368T.m11056e();
                                    ar5VarM9952f2.mo5038t();
                                    ar5VarM9952f2.m10368u();
                                    y42.m12851X(ua6Var4.m11487o());
                                    byte[] bArrM5118a7 = ua6Var4.m5118a();
                                    long jM9796i4 = ar5VarM9952f2.f19870f.m9958i0().m9796i0(bArrM5118a7);
                                    ContentValues contentValues5 = new ContentValues();
                                    contentValues5.put("app_id", ua6Var4.m11487o());
                                    contentValues5.put("metadata_fingerprint", Long.valueOf(jM9796i4));
                                    contentValues5.put("metadata", bArrM5118a7);
                                    ar5VarM9952f2.m3197l0().insertWithOnConflict("raw_events_metadata", null, contentValues5, 4);
                                    ar5VarM9952f3 = qm6Var.m9952f0();
                                    cs5Var3 = cs5Var2;
                                    os5 os5Var5 = cs5Var3.f16437f;
                                    Objects.requireNonNull(os5Var5);
                                    it2 = os5Var5.f27065d.keySet().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            n96 n96VarM9951e4 = qm6Var.m9951e0();
                                            String str319 = cs5Var3.f16432a;
                                            zM8646K = n96VarM9951e4.m8646K(str319, cs5Var3.f16433b);
                                            oq5 oq5VarM3159A3 = qm6Var.m9952f0().m3159A0(qm6Var.m9953g(), str319, false, false, false, false);
                                            if (zM8646K) {
                                            }
                                            i3 = i;
                                            break;
                                        }
                                        if ("_r".equals(it2.next())) {
                                        }
                                        i3 = 1;
                                        break;
                                    }
                                    ar5VarM9952f3.mo5038t();
                                    ar5VarM9952f3.m10368u();
                                    str17 = cs5Var3.f16432a;
                                    y42.m12851X(str17);
                                    byte[] bArrM5118a8 = ar5VarM9952f3.f19870f.m9958i0().m9790Z(cs5Var3).m5118a();
                                    contentValues = new ContentValues();
                                    contentValues.put("app_id", str17);
                                    contentValues.put("name", cs5Var3.f16433b);
                                    contentValues.put("timestamp", Long.valueOf(cs5Var3.f16435d));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(jM9796i4));
                                    contentValues.put("data", bArrM5118a8);
                                    contentValues.put("realtime", Integer.valueOf(i3));
                                    if (ar5VarM9952f3.m3197l0().insert(str7, null, contentValues) == -1) {
                                        ((oa6) ar5VarM9952f3.f36084a).mo9019b().f16835j.m12505b(d76.m4401y(str17), "Failed to insert raw event (got -1). appId");
                                    } else {
                                        qm6Var.f28605o = 0L;
                                    }
                                    qm6Var.m9952f0().m3195j0();
                                    qm6Var.m9952f0().m3196k0();
                                    qm6Var.m9936L();
                                    qm6Var.mo9019b().f16831L.m12505b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                    return;
                                }
                                oa6Var2 = oa6Var2;
                                cs5Var2 = cs5Var2;
                                oa6Var2.m9028o().m7955v();
                                String str3110 = Build.MODEL;
                                qa6VarM11368T.m9844k();
                                oa6Var2.m9028o().m7955v();
                                String str3111 = Build.VERSION.RELEASE;
                                qa6VarM11368T.m11054c();
                                ((ua6) qa6VarM11368T.f31181b).m11485n0(str3111);
                                qa6VarM11368T.m9846m((int) oa6Var2.m9028o().m13228y());
                                qa6VarM11368T.m9845l(oa6Var2.m9028o().m13229z());
                                qa6VarM11368T.m9829S(cp6Var.f16371z);
                                if (oa6Var2.m9018a()) {
                                    qa6VarM11368T.m9848o();
                                    if (!TextUtils.isEmpty(null)) {
                                        qa6VarM11368T.m11054c();
                                        ((ua6) qa6VarM11368T.f31181b).m11419Q0(null);
                                        throw null;
                                    }
                                }
                                z76VarM3212y0 = m9952f0().m3212y0(str6);
                                if (z76VarM3212y0 == null) {
                                    z76VarM3212y0 = new z76(oa6Var2, str6);
                                    qm6Var = this;
                                    z76VarM3212y0.m13406F(qm6Var.m9969o(xc6VarM12661j2));
                                    z76VarM3212y0.m13411K(cp6Var.f16359n);
                                    z76VarM3212y0.m13408H(str16);
                                    if (xc6VarM12661j2.m12660i(vc6Var)) {
                                        z76VarM3212y0.m13409I(qm6Var.f28599i.m10348z(str6, z9));
                                    }
                                    z76VarM3212y0.m13424e(0L);
                                    z76VarM3212y0.m13412L(0L);
                                    z76VarM3212y0.m13413M(0L);
                                    z76VarM3212y0.m13415O(str15);
                                    z76VarM3212y0.m13417Q(j2);
                                    z76VarM3212y0.m13418R(str14);
                                    z76VarM3212y0.m13419S(j6);
                                    z76VarM3212y0.m13420a(j8);
                                    z76VarM3212y0.m13423d(z10);
                                    z76VarM3212y0.m13422c(j4);
                                    i = 0;
                                    qm6Var.m9952f0().m3214z0(z76VarM3212y0, false);
                                } else {
                                    i = 0;
                                    qm6Var = this;
                                }
                                if (xc6VarM12661j2.m12660i(vc6.ANALYTICS_STORAGE)) {
                                    String strM13405E5 = z76VarM3212y0.m13405E();
                                    y42.m12854a0(strM13405E5);
                                    qa6VarM11368T.m9855v(strM13405E5);
                                }
                                if (!TextUtils.isEmpty(z76VarM3212y0.m13410J())) {
                                    String strM13410J5 = z76VarM3212y0.m13410J();
                                    y42.m12854a0(strM13410J5);
                                    qa6VarM11368T.m9821K(strM13410J5);
                                }
                                listM3203r0 = qm6Var.m9952f0().m3203r0(str6);
                                i2 = i;
                                while (i2 < listM3203r0.size()) {
                                    ob6 ob6VarM9471z5 = pb6.m9471z();
                                    String str3112 = ((an6) listM3203r0.get(i2)).f14647c;
                                    ob6VarM9471z5.m11054c();
                                    ((pb6) ob6VarM9471z5.f31181b).m9473B(str3112);
                                    long j18 = ((an6) listM3203r0.get(i2)).f14648d;
                                    ob6VarM9471z5.m11054c();
                                    ((pb6) ob6VarM9471z5.f31181b).m9472A(j18);
                                    qm6Var.m9958i0().m9787W(ob6VarM9471z5, ((an6) listM3203r0.get(i2)).f14649e);
                                    qa6VarM11368T.m9837a0(ob6VarM9471z5);
                                    if ("_sid".equals(((an6) listM3203r0.get(i2)).f14647c)) {
                                        ea6 ea6Var14 = z76VarM3212y0.f35837a.f26515g;
                                        oa6.m9016l(ea6Var14);
                                        ea6Var14.mo5038t();
                                        if (z76VarM3212y0.f35859w != 0) {
                                            q76VarM9958i0 = qm6Var.m9958i0();
                                            if (TextUtils.isEmpty(str12)) {
                                                str18 = str12;
                                                jM9796i0 = 0;
                                            } else {
                                                str18 = str12;
                                                jM9796i0 = q76VarM9958i0.m9796i0(str18.getBytes(Charset.forName("UTF-8")));
                                            }
                                            ea6 ea6Var15 = z76VarM3212y0.f35837a.f26515g;
                                            oa6.m9016l(ea6Var15);
                                            ea6Var15.mo5038t();
                                            if (jM9796i0 != z76VarM3212y0.f35859w) {
                                                qa6VarM11368T.m11054c();
                                                ((ua6) qa6VarM11368T.f31181b).m11441Y0();
                                            }
                                        } else {
                                            str18 = str12;
                                        }
                                    } else {
                                        str18 = str12;
                                    }
                                    i2++;
                                    str12 = str18;
                                }
                                ar5VarM9952f2 = qm6Var.m9952f0();
                                ua6 ua6Var5 = (ua6) qa6VarM11368T.m11056e();
                                ar5VarM9952f2.mo5038t();
                                ar5VarM9952f2.m10368u();
                                y42.m12851X(ua6Var5.m11487o());
                                byte[] bArrM5118a9 = ua6Var5.m5118a();
                                long jM9796i5 = ar5VarM9952f2.f19870f.m9958i0().m9796i0(bArrM5118a9);
                                ContentValues contentValues6 = new ContentValues();
                                contentValues6.put("app_id", ua6Var5.m11487o());
                                contentValues6.put("metadata_fingerprint", Long.valueOf(jM9796i5));
                                contentValues6.put("metadata", bArrM5118a9);
                                ar5VarM9952f2.m3197l0().insertWithOnConflict("raw_events_metadata", null, contentValues6, 4);
                                ar5VarM9952f3 = qm6Var.m9952f0();
                                cs5Var3 = cs5Var2;
                                os5 os5Var6 = cs5Var3.f16437f;
                                Objects.requireNonNull(os5Var6);
                                it2 = os5Var6.f27065d.keySet().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        n96 n96VarM9951e5 = qm6Var.m9951e0();
                                        String str3113 = cs5Var3.f16432a;
                                        zM8646K = n96VarM9951e5.m8646K(str3113, cs5Var3.f16433b);
                                        oq5 oq5VarM3159A4 = qm6Var.m9952f0().m3159A0(qm6Var.m9953g(), str3113, false, false, false, false);
                                        if (zM8646K) {
                                        }
                                        i3 = i;
                                        break;
                                    }
                                    if ("_r".equals(it2.next())) {
                                    }
                                    i3 = 1;
                                    break;
                                }
                                ar5VarM9952f3.mo5038t();
                                ar5VarM9952f3.m10368u();
                                str17 = cs5Var3.f16432a;
                                y42.m12851X(str17);
                                byte[] bArrM5118a10 = ar5VarM9952f3.f19870f.m9958i0().m9790Z(cs5Var3).m5118a();
                                contentValues = new ContentValues();
                                contentValues.put("app_id", str17);
                                contentValues.put("name", cs5Var3.f16433b);
                                contentValues.put("timestamp", Long.valueOf(cs5Var3.f16435d));
                                contentValues.put("metadata_fingerprint", Long.valueOf(jM9796i5));
                                contentValues.put("data", bArrM5118a10);
                                contentValues.put("realtime", Integer.valueOf(i3));
                                if (ar5VarM9952f3.m3197l0().insert(str7, null, contentValues) == -1) {
                                    ((oa6) ar5VarM9952f3.f36084a).mo9019b().f16835j.m12505b(d76.m4401y(str17), "Failed to insert raw event (got -1). appId");
                                } else {
                                    qm6Var.f28605o = 0L;
                                }
                                qm6Var.m9952f0().m3195j0();
                                qm6Var.m9952f0().m3196k0();
                                qm6Var.m9936L();
                                qm6Var.mo9019b().f16831L.m12505b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                return;
                                qm6Var.m9952f0().m3196k0();
                                throw th;
                            }
                            if (jIntValue % 1000 == 1) {
                                mo9019b().f16835j.m12506c("Data loss. Too many events logged. appId, count", d76.m4401y(str5), Long.valueOf(oq5VarM3161B0.f26968b));
                            }
                            m9952f0().m3195j0();
                            m9952f0().m3196k0();
                        }
                        ar5VarM9952f0.m3197l0().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str24, str24, String.valueOf(iM9223C)});
                    } catch (SQLiteException e7) {
                        ((oa6) ar5VarM9952f0.f36084a).mo9019b().f16835j.m12506c("Error pruning currencies. appId", d76.m4401y(str24), e7);
                    }
                    ar5VarM9952f0 = m9952f0();
                    iM9223C = m9950d0().m9223C(str24, e56.f17755T) - 1;
                    y42.m12851X(str24);
                    ar5VarM9952f0.mo5038t();
                    ar5VarM9952f0.m10368u();
                    String str41 = ys5VarM5913c.f35506f;
                    mo9022e().getClass();
                    str4 = str24;
                    an6Var = new an6(str4, str41, strConcat, System.currentTimeMillis(), Long.valueOf(jRound));
                    an6Var2 = an6Var;
                    if (!m9952f0().m3201p0(an6Var2)) {
                        mo9019b().f16835j.m12507d("Too many unique user properties are set. Ignoring user property. appId", d76.m4401y(str4), oa6Var2.f26518j.m9368c(an6Var2.f14647c), an6Var2.f14649e);
                        m9960j0();
                        dn6.m4564K(bt5Var3, str4, 9, null, null, 0);
                        bt5Var = bt5Var3;
                    }
                    zM4576t0 = dn6.m4576t0(str28);
                    zEquals = "_err".equals(str28);
                    m9960j0();
                    if (os5Var == null) {
                        length = 0;
                    } else {
                        it = os5Var.f27065d.keySet().iterator();
                        length = 0;
                        while (it.hasNext()) {
                            objM9258a = os5Var.m9258a(it.next());
                            if (objM9258a instanceof Parcelable[]) {
                                length += (long) ((Parcelable[]) objM9258a).length;
                            }
                        }
                    }
                    str5 = str4;
                    oq5VarM3161B0 = m9952f0().m3161B0(m9953g(), str5, length + 1, true, zM4576t0, false, zEquals, false, false, false);
                    long j19 = oq5VarM3161B0.f26968b;
                    m9950d0();
                    jIntValue = j19 - ((long) ((Integer) e56.f17801l.m4379a(null)).intValue());
                    if (jIntValue <= 0) {
                        if (zM4576t0) {
                            long j110 = oq5VarM3161B0.f26967a;
                            m9950d0();
                            jIntValue2 = j110 - ((long) ((Integer) e56.f17805n.m4379a(null)).intValue());
                            if (jIntValue2 > 0) {
                                if (jIntValue2 % 1000 == 1) {
                                    mo9019b().f16835j.m12506c("Data loss. Too many public events logged. appId, count", d76.m4401y(str5), Long.valueOf(oq5VarM3161B0.f26967a));
                                }
                                m9960j0();
                                dn6.m4564K(bt5Var, str5, 16, "_ev", ys5VarM5913c.f35504d, 0);
                                m9952f0().m3195j0();
                            }
                        }
                        str6 = str5;
                        if (zEquals) {
                            jMax = oq5VarM3161B0.f26970d - ((long) Math.max(0, Math.min(1000000, m9950d0().m9223C(str6, e56.f17803m))));
                            if (jMax > 0) {
                                if (jMax == 1) {
                                    mo9019b().f16835j.m12506c("Too many error events logged. appId, count", d76.m4401y(str6), Long.valueOf(oq5VarM3161B0.f26970d));
                                }
                                m9952f0().m3195j0();
                            }
                        }
                        bundleM9261d = os5Var.m9261d();
                        dn6 dn6VarM9960j3 = m9960j0();
                        String str211 = ys5VarM5913c.f35506f;
                        dn6VarM9960j3.m4592J(bundleM9261d, "_o", str211);
                        if (m9960j0().m4596U(str6, cp6Var.f16345E)) {
                            m9960j0().m4592J(bundleM9261d, "_dbg", 1L);
                            m9960j0().m4592J(bundleM9261d, "_r", 1L);
                        }
                        if ("_s".equals(str28)) {
                            obj2 = an6VarM3202q0.f14649e;
                            if (obj2 instanceof Long) {
                                m9960j0().m4592J(bundleM9261d, "_sno", obj2);
                            }
                        }
                        if (m9950d0().m9225E(null, e56.f17764X0)) {
                            obj = bundleM9261d.get("value");
                            if (obj instanceof String) {
                                double d3 = Double.parseDouble((String) obj);
                                bundleM9261d.remove("value");
                                bundleM9261d.putDouble("value", d3);
                            }
                        }
                        ar5VarM9952f1 = m9952f0();
                        y42.m12851X(str6);
                        ar5VarM9952f1.mo5038t();
                        ar5VarM9952f1.m10368u();
                        str7 = str19;
                        jDelete = ar5VarM9952f1.m3197l0().delete(str7, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((oa6) ar5VarM9952f1.f36084a).f26512d.m9223C(str6, e56.f17811q))))});
                        if (jDelete > 0) {
                            mo9019b().f16838m.m12506c("Data lost. Too many events stored on disk, deleted. appId", d76.m4401y(str6), Long.valueOf(jDelete));
                        }
                        oa6Var = this.f28602l;
                        cs5Var = new cs5(oa6Var, ys5VarM5913c.f35506f, str6, ys5VarM5913c.f35504d, ys5VarM5913c.f35507g, 0L, bundleM9261d);
                        ar5 ar5VarM9952f6 = m9952f0();
                        str8 = cs5Var.f16433b;
                        String str3114 = str3;
                        fs5VarM3182U = ar5VarM9952f6.m3182U(str3114, str6, str8);
                        if (fs5VarM3182U == null) {
                            jM3174M = m9952f0().m3174M(str6);
                            op5VarM9950d0 = m9950d0();
                            op5VarM9950d0.getClass();
                            d56Var = e56.f17761W;
                            bt5Var2 = bt5Var;
                            if (jM3174M >= Math.max(Math.min(op5VarM9950d0.m9223C(str6, d56Var), 2000), 500)) {
                            }
                            bt5Var = bt5Var2;
                            fs5VarM5801a = new fs5(str6, str8, 0L, 0L, 0L, cs5Var.f16435d, 0L, null, null, null, null);
                            str6 = str6;
                        } else {
                            cs5Var = cs5Var.m4166a(oa6Var, fs5VarM3182U.f19259f);
                            fs5VarM5801a = fs5VarM3182U.m5801a(cs5Var.f16435d);
                        }
                        cs5Var2 = cs5Var;
                        m9952f0().m3183V(str3114, fs5VarM5801a);
                        mo9020c().mo5038t();
                        m9962k0();
                        String str3115 = cs5Var2.f16432a;
                        y42.m12851X(str3115);
                        y42.m12849V(str3115.equals(str6));
                        qa6VarM11368T = ua6.m11368T();
                        qa6VarM11368T.m9858y();
                        qa6VarM11368T.m9843j();
                        if (!TextUtils.isEmpty(str6)) {
                            qa6VarM11368T.m9849p(str6);
                        }
                        if (TextUtils.isEmpty(str2)) {
                            str9 = str2;
                            qa6VarM11368T.m9847n(str9);
                        } else {
                            str9 = str2;
                        }
                        if (TextUtils.isEmpty(str)) {
                            str10 = str;
                            qa6VarM11368T.m9850q(str10);
                        } else {
                            str10 = str;
                        }
                        if (TextUtils.isEmpty(str21)) {
                            str11 = str21;
                            qa6VarM11368T.m9828R(str11);
                        } else {
                            str11 = str21;
                        }
                        if (j7 != -2147483648L) {
                            j = j7;
                            qa6VarM11368T.m9822L((int) j);
                        } else {
                            j = j7;
                        }
                        str12 = str11;
                        qa6VarM11368T.m9851r(j6);
                        if (TextUtils.isEmpty(str25)) {
                            str13 = str25;
                            qa6VarM11368T.m9818H(str13);
                        } else {
                            str13 = str25;
                        }
                        y42.m12854a0(str6);
                        str14 = str9;
                        xc6VarM12661j = m9947a(str6).m12661j(xc6.m12653c(100, str20));
                        qa6VarM11368T.m9827Q(xc6VarM12661j.m12658f());
                        ho6.m6466a();
                        zM9225E = m9950d0().m9225E(str6, e56.f17748P0);
                        vc6Var = vc6.AD_STORAGE;
                        if (zM9225E) {
                            m9960j0();
                            if (dn6.m4568Q(str6)) {
                                qa6VarM11368T.m9859z(cp6Var.f16343C);
                                j2 = j;
                                j3 = cp6Var.f16344D;
                                if (!xc6VarM12661j.m12660i(vc6Var)) {
                                    j3 = (j3 & (-2)) | 32;
                                }
                                if (j3 == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                qa6VarM11368T.m9830T(z);
                                if (j3 != 0) {
                                    l86 l86VarM8989v3 = o86.m8989v();
                                    if ((j3 & 1) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    l86VarM8989v3.m7866h(z2);
                                    if ((j3 & 2) != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    l86VarM8989v3.m7867i(z3);
                                    if ((j3 & 4) != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    l86VarM8989v3.m7868j(z4);
                                    if ((j3 & 8) != 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    l86VarM8989v3.m7869k(z5);
                                    if ((j3 & 16) != 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    l86VarM8989v3.m7870l(z6);
                                    if ((j3 & 32) != 0) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    l86VarM8989v3.m7871m(z7);
                                    if ((j3 & 64) != 0) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    l86VarM8989v3.m7872n(z8);
                                    qa6VarM11368T.m9811A((o86) l86VarM8989v3.m11056e());
                                }
                            } else {
                                j2 = j;
                            }
                        } else {
                            j2 = j;
                        }
                        if (j8 != 0) {
                            qa6VarM11368T.m9856w(j8);
                            j8 = j8;
                        }
                        qa6VarM11368T.m9825O(j4);
                        q76 q76VarM9958i3 = m9958i0();
                        hd6VarM6361a = hd6.m6361a(q76VarM9958i3.f19870f.f28602l.mo9021d().getContentResolver(), he6.m6365a(), p62.f27399b);
                        if (hd6VarM6361a == null) {
                            mapM6363b = Collections.EMPTY_MAP;
                        } else {
                            mapM6363b = hd6VarM6361a.m6363b();
                        }
                        if (mapM6363b == null) {
                            str15 = str10;
                            str16 = str13;
                            arrayList = null;
                        } else {
                            str15 = str10;
                            str16 = str13;
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            qa6VarM11368T.m9824N(arrayList);
                        }
                        if (m9950d0().m9225E(null, e56.f17774b1)) {
                            qa6VarM11368T.m9814D();
                        }
                        xc6VarM12661j2 = m9947a(str6).m12661j(xc6.m12653c(100, str20));
                        if (xc6VarM12661j2.m12660i(vc6Var)) {
                            oa6Var2 = oa6Var2;
                            cs5Var2 = cs5Var2;
                            oa6Var2.m9028o().m7955v();
                            String str3116 = Build.MODEL;
                            qa6VarM11368T.m9844k();
                            oa6Var2.m9028o().m7955v();
                            String str3117 = Build.VERSION.RELEASE;
                            qa6VarM11368T.m11054c();
                            ((ua6) qa6VarM11368T.f31181b).m11485n0(str3117);
                            qa6VarM11368T.m9846m((int) oa6Var2.m9028o().m13228y());
                            qa6VarM11368T.m9845l(oa6Var2.m9028o().m13229z());
                            qa6VarM11368T.m9829S(cp6Var.f16371z);
                            if (oa6Var2.m9018a()) {
                                qa6VarM11368T.m9848o();
                                if (!TextUtils.isEmpty(null)) {
                                    qa6VarM11368T.m11054c();
                                    ((ua6) qa6VarM11368T.f31181b).m11419Q0(null);
                                    throw null;
                                }
                            }
                            z76VarM3212y0 = m9952f0().m3212y0(str6);
                            if (z76VarM3212y0 == null) {
                                z76VarM3212y0 = new z76(oa6Var2, str6);
                                qm6Var = this;
                                z76VarM3212y0.m13406F(qm6Var.m9969o(xc6VarM12661j2));
                                z76VarM3212y0.m13411K(cp6Var.f16359n);
                                z76VarM3212y0.m13408H(str16);
                                if (xc6VarM12661j2.m12660i(vc6Var)) {
                                    z76VarM3212y0.m13409I(qm6Var.f28599i.m10348z(str6, z9));
                                }
                                z76VarM3212y0.m13424e(0L);
                                z76VarM3212y0.m13412L(0L);
                                z76VarM3212y0.m13413M(0L);
                                z76VarM3212y0.m13415O(str15);
                                z76VarM3212y0.m13417Q(j2);
                                z76VarM3212y0.m13418R(str14);
                                z76VarM3212y0.m13419S(j6);
                                z76VarM3212y0.m13420a(j8);
                                z76VarM3212y0.m13423d(z10);
                                z76VarM3212y0.m13422c(j4);
                                i = 0;
                                qm6Var.m9952f0().m3214z0(z76VarM3212y0, false);
                            } else {
                                i = 0;
                                qm6Var = this;
                            }
                            if (xc6VarM12661j2.m12660i(vc6.ANALYTICS_STORAGE)) {
                                String strM13405E6 = z76VarM3212y0.m13405E();
                                y42.m12854a0(strM13405E6);
                                qa6VarM11368T.m9855v(strM13405E6);
                            }
                            if (!TextUtils.isEmpty(z76VarM3212y0.m13410J())) {
                                String strM13410J6 = z76VarM3212y0.m13410J();
                                y42.m12854a0(strM13410J6);
                                qa6VarM11368T.m9821K(strM13410J6);
                            }
                            listM3203r0 = qm6Var.m9952f0().m3203r0(str6);
                            i2 = i;
                            while (i2 < listM3203r0.size()) {
                                ob6 ob6VarM9471z6 = pb6.m9471z();
                                String str3118 = ((an6) listM3203r0.get(i2)).f14647c;
                                ob6VarM9471z6.m11054c();
                                ((pb6) ob6VarM9471z6.f31181b).m9473B(str3118);
                                long j111 = ((an6) listM3203r0.get(i2)).f14648d;
                                ob6VarM9471z6.m11054c();
                                ((pb6) ob6VarM9471z6.f31181b).m9472A(j111);
                                qm6Var.m9958i0().m9787W(ob6VarM9471z6, ((an6) listM3203r0.get(i2)).f14649e);
                                qa6VarM11368T.m9837a0(ob6VarM9471z6);
                                if ("_sid".equals(((an6) listM3203r0.get(i2)).f14647c)) {
                                    ea6 ea6Var16 = z76VarM3212y0.f35837a.f26515g;
                                    oa6.m9016l(ea6Var16);
                                    ea6Var16.mo5038t();
                                    if (z76VarM3212y0.f35859w != 0) {
                                        q76VarM9958i0 = qm6Var.m9958i0();
                                        if (TextUtils.isEmpty(str12)) {
                                            str18 = str12;
                                            jM9796i0 = 0;
                                        } else {
                                            str18 = str12;
                                            jM9796i0 = q76VarM9958i0.m9796i0(str18.getBytes(Charset.forName("UTF-8")));
                                        }
                                        ea6 ea6Var17 = z76VarM3212y0.f35837a.f26515g;
                                        oa6.m9016l(ea6Var17);
                                        ea6Var17.mo5038t();
                                        if (jM9796i0 != z76VarM3212y0.f35859w) {
                                            qa6VarM11368T.m11054c();
                                            ((ua6) qa6VarM11368T.f31181b).m11441Y0();
                                        }
                                    } else {
                                        str18 = str12;
                                    }
                                } else {
                                    str18 = str12;
                                }
                                i2++;
                                str12 = str18;
                            }
                            ar5VarM9952f2 = qm6Var.m9952f0();
                            ua6 ua6Var6 = (ua6) qa6VarM11368T.m11056e();
                            ar5VarM9952f2.mo5038t();
                            ar5VarM9952f2.m10368u();
                            y42.m12851X(ua6Var6.m11487o());
                            byte[] bArrM5118a11 = ua6Var6.m5118a();
                            long jM9796i6 = ar5VarM9952f2.f19870f.m9958i0().m9796i0(bArrM5118a11);
                            ContentValues contentValues7 = new ContentValues();
                            contentValues7.put("app_id", ua6Var6.m11487o());
                            contentValues7.put("metadata_fingerprint", Long.valueOf(jM9796i6));
                            contentValues7.put("metadata", bArrM5118a11);
                            ar5VarM9952f2.m3197l0().insertWithOnConflict("raw_events_metadata", null, contentValues7, 4);
                            ar5VarM9952f3 = qm6Var.m9952f0();
                            cs5Var3 = cs5Var2;
                            os5 os5Var7 = cs5Var3.f16437f;
                            Objects.requireNonNull(os5Var7);
                            it2 = os5Var7.f27065d.keySet().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    n96 n96VarM9951e6 = qm6Var.m9951e0();
                                    String str3119 = cs5Var3.f16432a;
                                    zM8646K = n96VarM9951e6.m8646K(str3119, cs5Var3.f16433b);
                                    oq5 oq5VarM3159A5 = qm6Var.m9952f0().m3159A0(qm6Var.m9953g(), str3119, false, false, false, false);
                                    if (zM8646K) {
                                    }
                                    i3 = i;
                                    break;
                                }
                                if ("_r".equals(it2.next())) {
                                }
                                i3 = 1;
                                break;
                            }
                            ar5VarM9952f3.mo5038t();
                            ar5VarM9952f3.m10368u();
                            str17 = cs5Var3.f16432a;
                            y42.m12851X(str17);
                            byte[] bArrM5118a12 = ar5VarM9952f3.f19870f.m9958i0().m9790Z(cs5Var3).m5118a();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str17);
                            contentValues.put("name", cs5Var3.f16433b);
                            contentValues.put("timestamp", Long.valueOf(cs5Var3.f16435d));
                            contentValues.put("metadata_fingerprint", Long.valueOf(jM9796i6));
                            contentValues.put("data", bArrM5118a12);
                            contentValues.put("realtime", Integer.valueOf(i3));
                            if (ar5VarM9952f3.m3197l0().insert(str7, null, contentValues) == -1) {
                                ((oa6) ar5VarM9952f3.f36084a).mo9019b().f16835j.m12505b(d76.m4401y(str17), "Failed to insert raw event (got -1). appId");
                            } else {
                                qm6Var.f28605o = 0L;
                            }
                            qm6Var.m9952f0().m3195j0();
                            qm6Var.m9952f0().m3196k0();
                            qm6Var.m9936L();
                            qm6Var.mo9019b().f16831L.m12505b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                            return;
                        }
                        oa6Var2 = oa6Var2;
                        cs5Var2 = cs5Var2;
                        oa6Var2.m9028o().m7955v();
                        String str31110 = Build.MODEL;
                        qa6VarM11368T.m9844k();
                        oa6Var2.m9028o().m7955v();
                        String str31111 = Build.VERSION.RELEASE;
                        qa6VarM11368T.m11054c();
                        ((ua6) qa6VarM11368T.f31181b).m11485n0(str31111);
                        qa6VarM11368T.m9846m((int) oa6Var2.m9028o().m13228y());
                        qa6VarM11368T.m9845l(oa6Var2.m9028o().m13229z());
                        qa6VarM11368T.m9829S(cp6Var.f16371z);
                        if (oa6Var2.m9018a()) {
                            qa6VarM11368T.m9848o();
                            if (!TextUtils.isEmpty(null)) {
                                qa6VarM11368T.m11054c();
                                ((ua6) qa6VarM11368T.f31181b).m11419Q0(null);
                                throw null;
                            }
                        }
                        z76VarM3212y0 = m9952f0().m3212y0(str6);
                        if (z76VarM3212y0 == null) {
                            z76VarM3212y0 = new z76(oa6Var2, str6);
                            qm6Var = this;
                            z76VarM3212y0.m13406F(qm6Var.m9969o(xc6VarM12661j2));
                            z76VarM3212y0.m13411K(cp6Var.f16359n);
                            z76VarM3212y0.m13408H(str16);
                            if (xc6VarM12661j2.m12660i(vc6Var)) {
                                z76VarM3212y0.m13409I(qm6Var.f28599i.m10348z(str6, z9));
                            }
                            z76VarM3212y0.m13424e(0L);
                            z76VarM3212y0.m13412L(0L);
                            z76VarM3212y0.m13413M(0L);
                            z76VarM3212y0.m13415O(str15);
                            z76VarM3212y0.m13417Q(j2);
                            z76VarM3212y0.m13418R(str14);
                            z76VarM3212y0.m13419S(j6);
                            z76VarM3212y0.m13420a(j8);
                            z76VarM3212y0.m13423d(z10);
                            z76VarM3212y0.m13422c(j4);
                            i = 0;
                            qm6Var.m9952f0().m3214z0(z76VarM3212y0, false);
                        } else {
                            i = 0;
                            qm6Var = this;
                        }
                        if (xc6VarM12661j2.m12660i(vc6.ANALYTICS_STORAGE)) {
                            String strM13405E7 = z76VarM3212y0.m13405E();
                            y42.m12854a0(strM13405E7);
                            qa6VarM11368T.m9855v(strM13405E7);
                        }
                        if (!TextUtils.isEmpty(z76VarM3212y0.m13410J())) {
                            String strM13410J7 = z76VarM3212y0.m13410J();
                            y42.m12854a0(strM13410J7);
                            qa6VarM11368T.m9821K(strM13410J7);
                        }
                        listM3203r0 = qm6Var.m9952f0().m3203r0(str6);
                        i2 = i;
                        while (i2 < listM3203r0.size()) {
                            ob6 ob6VarM9471z7 = pb6.m9471z();
                            String str31112 = ((an6) listM3203r0.get(i2)).f14647c;
                            ob6VarM9471z7.m11054c();
                            ((pb6) ob6VarM9471z7.f31181b).m9473B(str31112);
                            long j112 = ((an6) listM3203r0.get(i2)).f14648d;
                            ob6VarM9471z7.m11054c();
                            ((pb6) ob6VarM9471z7.f31181b).m9472A(j112);
                            qm6Var.m9958i0().m9787W(ob6VarM9471z7, ((an6) listM3203r0.get(i2)).f14649e);
                            qa6VarM11368T.m9837a0(ob6VarM9471z7);
                            if ("_sid".equals(((an6) listM3203r0.get(i2)).f14647c)) {
                                ea6 ea6Var18 = z76VarM3212y0.f35837a.f26515g;
                                oa6.m9016l(ea6Var18);
                                ea6Var18.mo5038t();
                                if (z76VarM3212y0.f35859w != 0) {
                                    q76VarM9958i0 = qm6Var.m9958i0();
                                    if (TextUtils.isEmpty(str12)) {
                                        str18 = str12;
                                        jM9796i0 = 0;
                                    } else {
                                        str18 = str12;
                                        jM9796i0 = q76VarM9958i0.m9796i0(str18.getBytes(Charset.forName("UTF-8")));
                                    }
                                    ea6 ea6Var19 = z76VarM3212y0.f35837a.f26515g;
                                    oa6.m9016l(ea6Var19);
                                    ea6Var19.mo5038t();
                                    if (jM9796i0 != z76VarM3212y0.f35859w) {
                                        qa6VarM11368T.m11054c();
                                        ((ua6) qa6VarM11368T.f31181b).m11441Y0();
                                    }
                                } else {
                                    str18 = str12;
                                }
                            } else {
                                str18 = str12;
                            }
                            i2++;
                            str12 = str18;
                        }
                        ar5VarM9952f2 = qm6Var.m9952f0();
                        ua6 ua6Var7 = (ua6) qa6VarM11368T.m11056e();
                        ar5VarM9952f2.mo5038t();
                        ar5VarM9952f2.m10368u();
                        y42.m12851X(ua6Var7.m11487o());
                        byte[] bArrM5118a13 = ua6Var7.m5118a();
                        long jM9796i7 = ar5VarM9952f2.f19870f.m9958i0().m9796i0(bArrM5118a13);
                        ContentValues contentValues8 = new ContentValues();
                        contentValues8.put("app_id", ua6Var7.m11487o());
                        contentValues8.put("metadata_fingerprint", Long.valueOf(jM9796i7));
                        contentValues8.put("metadata", bArrM5118a13);
                        ar5VarM9952f2.m3197l0().insertWithOnConflict("raw_events_metadata", null, contentValues8, 4);
                        ar5VarM9952f3 = qm6Var.m9952f0();
                        cs5Var3 = cs5Var2;
                        os5 os5Var8 = cs5Var3.f16437f;
                        Objects.requireNonNull(os5Var8);
                        it2 = os5Var8.f27065d.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                n96 n96VarM9951e7 = qm6Var.m9951e0();
                                String str31113 = cs5Var3.f16432a;
                                zM8646K = n96VarM9951e7.m8646K(str31113, cs5Var3.f16433b);
                                oq5 oq5VarM3159A6 = qm6Var.m9952f0().m3159A0(qm6Var.m9953g(), str31113, false, false, false, false);
                                if (zM8646K) {
                                }
                                i3 = i;
                                break;
                            }
                            if ("_r".equals(it2.next())) {
                            }
                            i3 = 1;
                            break;
                        }
                        ar5VarM9952f3.mo5038t();
                        ar5VarM9952f3.m10368u();
                        str17 = cs5Var3.f16432a;
                        y42.m12851X(str17);
                        byte[] bArrM5118a14 = ar5VarM9952f3.f19870f.m9958i0().m9790Z(cs5Var3).m5118a();
                        contentValues = new ContentValues();
                        contentValues.put("app_id", str17);
                        contentValues.put("name", cs5Var3.f16433b);
                        contentValues.put("timestamp", Long.valueOf(cs5Var3.f16435d));
                        contentValues.put("metadata_fingerprint", Long.valueOf(jM9796i7));
                        contentValues.put("data", bArrM5118a14);
                        contentValues.put("realtime", Integer.valueOf(i3));
                        if (ar5VarM9952f3.m3197l0().insert(str7, null, contentValues) == -1) {
                            ((oa6) ar5VarM9952f3.f36084a).mo9019b().f16835j.m12505b(d76.m4401y(str17), "Failed to insert raw event (got -1). appId");
                        } else {
                            qm6Var.f28605o = 0L;
                        }
                        qm6Var.m9952f0().m3195j0();
                        qm6Var.m9952f0().m3196k0();
                        qm6Var.m9936L();
                        qm6Var.mo9019b().f16831L.m12505b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                        return;
                        qm6Var.m9952f0().m3196k0();
                        throw th;
                    }
                    if (jIntValue % 1000 == 1) {
                        mo9019b().f16835j.m12506c("Data loss. Too many events logged. appId, count", d76.m4401y(str5), Long.valueOf(oq5VarM3161B0.f26968b));
                    }
                    m9952f0().m3195j0();
                    m9952f0().m3196k0();
                }
                bt5Var = bt5Var3;
                zM4576t0 = dn6.m4576t0(str28);
                zEquals = "_err".equals(str28);
                m9960j0();
                if (os5Var == null) {
                    length = 0;
                } else {
                    it = os5Var.f27065d.keySet().iterator();
                    length = 0;
                    while (it.hasNext()) {
                        objM9258a = os5Var.m9258a(it.next());
                        if (objM9258a instanceof Parcelable[]) {
                            length += (long) ((Parcelable[]) objM9258a).length;
                        }
                    }
                }
                str5 = str4;
                oq5VarM3161B0 = m9952f0().m3161B0(m9953g(), str5, length + 1, true, zM4576t0, false, zEquals, false, false, false);
                long j113 = oq5VarM3161B0.f26968b;
                m9950d0();
                jIntValue = j113 - ((long) ((Integer) e56.f17801l.m4379a(null)).intValue());
                if (jIntValue <= 0) {
                    if (zM4576t0) {
                        long j114 = oq5VarM3161B0.f26967a;
                        m9950d0();
                        jIntValue2 = j114 - ((long) ((Integer) e56.f17805n.m4379a(null)).intValue());
                        if (jIntValue2 > 0) {
                            if (jIntValue2 % 1000 == 1) {
                                mo9019b().f16835j.m12506c("Data loss. Too many public events logged. appId, count", d76.m4401y(str5), Long.valueOf(oq5VarM3161B0.f26967a));
                            }
                            m9960j0();
                            dn6.m4564K(bt5Var, str5, 16, "_ev", ys5VarM5913c.f35504d, 0);
                            m9952f0().m3195j0();
                        }
                    }
                    str6 = str5;
                    if (zEquals) {
                        jMax = oq5VarM3161B0.f26970d - ((long) Math.max(0, Math.min(1000000, m9950d0().m9223C(str6, e56.f17803m))));
                        if (jMax > 0) {
                            if (jMax == 1) {
                                mo9019b().f16835j.m12506c("Too many error events logged. appId, count", d76.m4401y(str6), Long.valueOf(oq5VarM3161B0.f26970d));
                            }
                            m9952f0().m3195j0();
                        }
                    }
                    bundleM9261d = os5Var.m9261d();
                    dn6 dn6VarM9960j4 = m9960j0();
                    String str212 = ys5VarM5913c.f35506f;
                    dn6VarM9960j4.m4592J(bundleM9261d, "_o", str212);
                    if (m9960j0().m4596U(str6, cp6Var.f16345E)) {
                        m9960j0().m4592J(bundleM9261d, "_dbg", 1L);
                        m9960j0().m4592J(bundleM9261d, "_r", 1L);
                    }
                    if ("_s".equals(str28)) {
                        obj2 = an6VarM3202q0.f14649e;
                        if (obj2 instanceof Long) {
                            m9960j0().m4592J(bundleM9261d, "_sno", obj2);
                        }
                    }
                    if (m9950d0().m9225E(null, e56.f17764X0)) {
                        obj = bundleM9261d.get("value");
                        if (obj instanceof String) {
                            double d4 = Double.parseDouble((String) obj);
                            bundleM9261d.remove("value");
                            bundleM9261d.putDouble("value", d4);
                        }
                    }
                    ar5VarM9952f1 = m9952f0();
                    y42.m12851X(str6);
                    ar5VarM9952f1.mo5038t();
                    ar5VarM9952f1.m10368u();
                    str7 = str19;
                    jDelete = ar5VarM9952f1.m3197l0().delete(str7, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((oa6) ar5VarM9952f1.f36084a).f26512d.m9223C(str6, e56.f17811q))))});
                    if (jDelete > 0) {
                        mo9019b().f16838m.m12506c("Data lost. Too many events stored on disk, deleted. appId", d76.m4401y(str6), Long.valueOf(jDelete));
                    }
                    oa6Var = this.f28602l;
                    cs5Var = new cs5(oa6Var, ys5VarM5913c.f35506f, str6, ys5VarM5913c.f35504d, ys5VarM5913c.f35507g, 0L, bundleM9261d);
                    ar5 ar5VarM9952f7 = m9952f0();
                    str8 = cs5Var.f16433b;
                    String str31114 = str3;
                    fs5VarM3182U = ar5VarM9952f7.m3182U(str31114, str6, str8);
                    if (fs5VarM3182U == null) {
                        jM3174M = m9952f0().m3174M(str6);
                        op5VarM9950d0 = m9950d0();
                        op5VarM9950d0.getClass();
                        d56Var = e56.f17761W;
                        bt5Var2 = bt5Var;
                        if (jM3174M >= Math.max(Math.min(op5VarM9950d0.m9223C(str6, d56Var), 2000), 500)) {
                        }
                        bt5Var = bt5Var2;
                        fs5VarM5801a = new fs5(str6, str8, 0L, 0L, 0L, cs5Var.f16435d, 0L, null, null, null, null);
                        str6 = str6;
                    } else {
                        cs5Var = cs5Var.m4166a(oa6Var, fs5VarM3182U.f19259f);
                        fs5VarM5801a = fs5VarM3182U.m5801a(cs5Var.f16435d);
                    }
                    cs5Var2 = cs5Var;
                    m9952f0().m3183V(str31114, fs5VarM5801a);
                    mo9020c().mo5038t();
                    m9962k0();
                    String str31115 = cs5Var2.f16432a;
                    y42.m12851X(str31115);
                    y42.m12849V(str31115.equals(str6));
                    qa6VarM11368T = ua6.m11368T();
                    qa6VarM11368T.m9858y();
                    qa6VarM11368T.m9843j();
                    if (!TextUtils.isEmpty(str6)) {
                        qa6VarM11368T.m9849p(str6);
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str9 = str2;
                        qa6VarM11368T.m9847n(str9);
                    } else {
                        str9 = str2;
                    }
                    if (TextUtils.isEmpty(str)) {
                        str10 = str;
                        qa6VarM11368T.m9850q(str10);
                    } else {
                        str10 = str;
                    }
                    if (TextUtils.isEmpty(str21)) {
                        str11 = str21;
                        qa6VarM11368T.m9828R(str11);
                    } else {
                        str11 = str21;
                    }
                    if (j7 != -2147483648L) {
                        j = j7;
                        qa6VarM11368T.m9822L((int) j);
                    } else {
                        j = j7;
                    }
                    str12 = str11;
                    qa6VarM11368T.m9851r(j6);
                    if (TextUtils.isEmpty(str25)) {
                        str13 = str25;
                        qa6VarM11368T.m9818H(str13);
                    } else {
                        str13 = str25;
                    }
                    y42.m12854a0(str6);
                    str14 = str9;
                    xc6VarM12661j = m9947a(str6).m12661j(xc6.m12653c(100, str20));
                    qa6VarM11368T.m9827Q(xc6VarM12661j.m12658f());
                    ho6.m6466a();
                    zM9225E = m9950d0().m9225E(str6, e56.f17748P0);
                    vc6Var = vc6.AD_STORAGE;
                    if (zM9225E) {
                        m9960j0();
                        if (dn6.m4568Q(str6)) {
                            qa6VarM11368T.m9859z(cp6Var.f16343C);
                            j2 = j;
                            j3 = cp6Var.f16344D;
                            if (!xc6VarM12661j.m12660i(vc6Var)) {
                                j3 = (j3 & (-2)) | 32;
                            }
                            if (j3 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            qa6VarM11368T.m9830T(z);
                            if (j3 != 0) {
                                l86 l86VarM8989v4 = o86.m8989v();
                                if ((j3 & 1) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                l86VarM8989v4.m7866h(z2);
                                if ((j3 & 2) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                l86VarM8989v4.m7867i(z3);
                                if ((j3 & 4) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                l86VarM8989v4.m7868j(z4);
                                if ((j3 & 8) != 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                l86VarM8989v4.m7869k(z5);
                                if ((j3 & 16) != 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                l86VarM8989v4.m7870l(z6);
                                if ((j3 & 32) != 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                l86VarM8989v4.m7871m(z7);
                                if ((j3 & 64) != 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                l86VarM8989v4.m7872n(z8);
                                qa6VarM11368T.m9811A((o86) l86VarM8989v4.m11056e());
                            }
                        } else {
                            j2 = j;
                        }
                    } else {
                        j2 = j;
                    }
                    if (j8 != 0) {
                        qa6VarM11368T.m9856w(j8);
                        j8 = j8;
                    }
                    qa6VarM11368T.m9825O(j4);
                    q76 q76VarM9958i4 = m9958i0();
                    hd6VarM6361a = hd6.m6361a(q76VarM9958i4.f19870f.f28602l.mo9021d().getContentResolver(), he6.m6365a(), p62.f27399b);
                    if (hd6VarM6361a == null) {
                        mapM6363b = Collections.EMPTY_MAP;
                    } else {
                        mapM6363b = hd6VarM6361a.m6363b();
                    }
                    if (mapM6363b == null) {
                        str15 = str10;
                        str16 = str13;
                        arrayList = null;
                    } else {
                        str15 = str10;
                        str16 = str13;
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        qa6VarM11368T.m9824N(arrayList);
                    }
                    if (m9950d0().m9225E(null, e56.f17774b1)) {
                        qa6VarM11368T.m9814D();
                    }
                    xc6VarM12661j2 = m9947a(str6).m12661j(xc6.m12653c(100, str20));
                    if (xc6VarM12661j2.m12660i(vc6Var)) {
                        oa6Var2 = oa6Var2;
                        cs5Var2 = cs5Var2;
                        oa6Var2.m9028o().m7955v();
                        String str31116 = Build.MODEL;
                        qa6VarM11368T.m9844k();
                        oa6Var2.m9028o().m7955v();
                        String str31117 = Build.VERSION.RELEASE;
                        qa6VarM11368T.m11054c();
                        ((ua6) qa6VarM11368T.f31181b).m11485n0(str31117);
                        qa6VarM11368T.m9846m((int) oa6Var2.m9028o().m13228y());
                        qa6VarM11368T.m9845l(oa6Var2.m9028o().m13229z());
                        qa6VarM11368T.m9829S(cp6Var.f16371z);
                        if (oa6Var2.m9018a()) {
                            qa6VarM11368T.m9848o();
                            if (!TextUtils.isEmpty(null)) {
                                qa6VarM11368T.m11054c();
                                ((ua6) qa6VarM11368T.f31181b).m11419Q0(null);
                                throw null;
                            }
                        }
                        z76VarM3212y0 = m9952f0().m3212y0(str6);
                        if (z76VarM3212y0 == null) {
                            z76VarM3212y0 = new z76(oa6Var2, str6);
                            qm6Var = this;
                            z76VarM3212y0.m13406F(qm6Var.m9969o(xc6VarM12661j2));
                            z76VarM3212y0.m13411K(cp6Var.f16359n);
                            z76VarM3212y0.m13408H(str16);
                            if (xc6VarM12661j2.m12660i(vc6Var)) {
                                z76VarM3212y0.m13409I(qm6Var.f28599i.m10348z(str6, z9));
                            }
                            z76VarM3212y0.m13424e(0L);
                            z76VarM3212y0.m13412L(0L);
                            z76VarM3212y0.m13413M(0L);
                            z76VarM3212y0.m13415O(str15);
                            z76VarM3212y0.m13417Q(j2);
                            z76VarM3212y0.m13418R(str14);
                            z76VarM3212y0.m13419S(j6);
                            z76VarM3212y0.m13420a(j8);
                            z76VarM3212y0.m13423d(z10);
                            z76VarM3212y0.m13422c(j4);
                            i = 0;
                            qm6Var.m9952f0().m3214z0(z76VarM3212y0, false);
                        } else {
                            i = 0;
                            qm6Var = this;
                        }
                        if (xc6VarM12661j2.m12660i(vc6.ANALYTICS_STORAGE)) {
                            String strM13405E8 = z76VarM3212y0.m13405E();
                            y42.m12854a0(strM13405E8);
                            qa6VarM11368T.m9855v(strM13405E8);
                        }
                        if (!TextUtils.isEmpty(z76VarM3212y0.m13410J())) {
                            String strM13410J8 = z76VarM3212y0.m13410J();
                            y42.m12854a0(strM13410J8);
                            qa6VarM11368T.m9821K(strM13410J8);
                        }
                        listM3203r0 = qm6Var.m9952f0().m3203r0(str6);
                        i2 = i;
                        while (i2 < listM3203r0.size()) {
                            ob6 ob6VarM9471z8 = pb6.m9471z();
                            String str31118 = ((an6) listM3203r0.get(i2)).f14647c;
                            ob6VarM9471z8.m11054c();
                            ((pb6) ob6VarM9471z8.f31181b).m9473B(str31118);
                            long j115 = ((an6) listM3203r0.get(i2)).f14648d;
                            ob6VarM9471z8.m11054c();
                            ((pb6) ob6VarM9471z8.f31181b).m9472A(j115);
                            qm6Var.m9958i0().m9787W(ob6VarM9471z8, ((an6) listM3203r0.get(i2)).f14649e);
                            qa6VarM11368T.m9837a0(ob6VarM9471z8);
                            if ("_sid".equals(((an6) listM3203r0.get(i2)).f14647c)) {
                                ea6 ea6Var110 = z76VarM3212y0.f35837a.f26515g;
                                oa6.m9016l(ea6Var110);
                                ea6Var110.mo5038t();
                                if (z76VarM3212y0.f35859w != 0) {
                                    q76VarM9958i0 = qm6Var.m9958i0();
                                    if (TextUtils.isEmpty(str12)) {
                                        str18 = str12;
                                        jM9796i0 = 0;
                                    } else {
                                        str18 = str12;
                                        jM9796i0 = q76VarM9958i0.m9796i0(str18.getBytes(Charset.forName("UTF-8")));
                                    }
                                    ea6 ea6Var111 = z76VarM3212y0.f35837a.f26515g;
                                    oa6.m9016l(ea6Var111);
                                    ea6Var111.mo5038t();
                                    if (jM9796i0 != z76VarM3212y0.f35859w) {
                                        qa6VarM11368T.m11054c();
                                        ((ua6) qa6VarM11368T.f31181b).m11441Y0();
                                    }
                                } else {
                                    str18 = str12;
                                }
                            } else {
                                str18 = str12;
                            }
                            i2++;
                            str12 = str18;
                        }
                        ar5VarM9952f2 = qm6Var.m9952f0();
                        ua6 ua6Var8 = (ua6) qa6VarM11368T.m11056e();
                        ar5VarM9952f2.mo5038t();
                        ar5VarM9952f2.m10368u();
                        y42.m12851X(ua6Var8.m11487o());
                        byte[] bArrM5118a15 = ua6Var8.m5118a();
                        long jM9796i8 = ar5VarM9952f2.f19870f.m9958i0().m9796i0(bArrM5118a15);
                        ContentValues contentValues9 = new ContentValues();
                        contentValues9.put("app_id", ua6Var8.m11487o());
                        contentValues9.put("metadata_fingerprint", Long.valueOf(jM9796i8));
                        contentValues9.put("metadata", bArrM5118a15);
                        ar5VarM9952f2.m3197l0().insertWithOnConflict("raw_events_metadata", null, contentValues9, 4);
                        ar5VarM9952f3 = qm6Var.m9952f0();
                        cs5Var3 = cs5Var2;
                        os5 os5Var9 = cs5Var3.f16437f;
                        Objects.requireNonNull(os5Var9);
                        it2 = os5Var9.f27065d.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                n96 n96VarM9951e8 = qm6Var.m9951e0();
                                String str31119 = cs5Var3.f16432a;
                                zM8646K = n96VarM9951e8.m8646K(str31119, cs5Var3.f16433b);
                                oq5 oq5VarM3159A7 = qm6Var.m9952f0().m3159A0(qm6Var.m9953g(), str31119, false, false, false, false);
                                if (zM8646K) {
                                }
                                i3 = i;
                                break;
                            }
                            if ("_r".equals(it2.next())) {
                            }
                            i3 = 1;
                            break;
                        }
                        ar5VarM9952f3.mo5038t();
                        ar5VarM9952f3.m10368u();
                        str17 = cs5Var3.f16432a;
                        y42.m12851X(str17);
                        byte[] bArrM5118a16 = ar5VarM9952f3.f19870f.m9958i0().m9790Z(cs5Var3).m5118a();
                        contentValues = new ContentValues();
                        contentValues.put("app_id", str17);
                        contentValues.put("name", cs5Var3.f16433b);
                        contentValues.put("timestamp", Long.valueOf(cs5Var3.f16435d));
                        contentValues.put("metadata_fingerprint", Long.valueOf(jM9796i8));
                        contentValues.put("data", bArrM5118a16);
                        contentValues.put("realtime", Integer.valueOf(i3));
                        if (ar5VarM9952f3.m3197l0().insert(str7, null, contentValues) == -1) {
                            ((oa6) ar5VarM9952f3.f36084a).mo9019b().f16835j.m12505b(d76.m4401y(str17), "Failed to insert raw event (got -1). appId");
                        } else {
                            qm6Var.f28605o = 0L;
                        }
                        qm6Var.m9952f0().m3195j0();
                        qm6Var.m9952f0().m3196k0();
                        qm6Var.m9936L();
                        qm6Var.mo9019b().f16831L.m12505b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                        return;
                    }
                    oa6Var2 = oa6Var2;
                    cs5Var2 = cs5Var2;
                    oa6Var2.m9028o().m7955v();
                    String str311110 = Build.MODEL;
                    qa6VarM11368T.m9844k();
                    oa6Var2.m9028o().m7955v();
                    String str311111 = Build.VERSION.RELEASE;
                    qa6VarM11368T.m11054c();
                    ((ua6) qa6VarM11368T.f31181b).m11485n0(str311111);
                    qa6VarM11368T.m9846m((int) oa6Var2.m9028o().m13228y());
                    qa6VarM11368T.m9845l(oa6Var2.m9028o().m13229z());
                    qa6VarM11368T.m9829S(cp6Var.f16371z);
                    if (oa6Var2.m9018a()) {
                        qa6VarM11368T.m9848o();
                        if (!TextUtils.isEmpty(null)) {
                            qa6VarM11368T.m11054c();
                            ((ua6) qa6VarM11368T.f31181b).m11419Q0(null);
                            throw null;
                        }
                    }
                    z76VarM3212y0 = m9952f0().m3212y0(str6);
                    if (z76VarM3212y0 == null) {
                        z76VarM3212y0 = new z76(oa6Var2, str6);
                        qm6Var = this;
                        z76VarM3212y0.m13406F(qm6Var.m9969o(xc6VarM12661j2));
                        z76VarM3212y0.m13411K(cp6Var.f16359n);
                        z76VarM3212y0.m13408H(str16);
                        if (xc6VarM12661j2.m12660i(vc6Var)) {
                            z76VarM3212y0.m13409I(qm6Var.f28599i.m10348z(str6, z9));
                        }
                        z76VarM3212y0.m13424e(0L);
                        z76VarM3212y0.m13412L(0L);
                        z76VarM3212y0.m13413M(0L);
                        z76VarM3212y0.m13415O(str15);
                        z76VarM3212y0.m13417Q(j2);
                        z76VarM3212y0.m13418R(str14);
                        z76VarM3212y0.m13419S(j6);
                        z76VarM3212y0.m13420a(j8);
                        z76VarM3212y0.m13423d(z10);
                        z76VarM3212y0.m13422c(j4);
                        i = 0;
                        qm6Var.m9952f0().m3214z0(z76VarM3212y0, false);
                    } else {
                        i = 0;
                        qm6Var = this;
                    }
                    if (xc6VarM12661j2.m12660i(vc6.ANALYTICS_STORAGE)) {
                        String strM13405E9 = z76VarM3212y0.m13405E();
                        y42.m12854a0(strM13405E9);
                        qa6VarM11368T.m9855v(strM13405E9);
                    }
                    if (!TextUtils.isEmpty(z76VarM3212y0.m13410J())) {
                        String strM13410J9 = z76VarM3212y0.m13410J();
                        y42.m12854a0(strM13410J9);
                        qa6VarM11368T.m9821K(strM13410J9);
                    }
                    listM3203r0 = qm6Var.m9952f0().m3203r0(str6);
                    i2 = i;
                    while (i2 < listM3203r0.size()) {
                        ob6 ob6VarM9471z9 = pb6.m9471z();
                        String str311112 = ((an6) listM3203r0.get(i2)).f14647c;
                        ob6VarM9471z9.m11054c();
                        ((pb6) ob6VarM9471z9.f31181b).m9473B(str311112);
                        long j116 = ((an6) listM3203r0.get(i2)).f14648d;
                        ob6VarM9471z9.m11054c();
                        ((pb6) ob6VarM9471z9.f31181b).m9472A(j116);
                        qm6Var.m9958i0().m9787W(ob6VarM9471z9, ((an6) listM3203r0.get(i2)).f14649e);
                        qa6VarM11368T.m9837a0(ob6VarM9471z9);
                        if ("_sid".equals(((an6) listM3203r0.get(i2)).f14647c)) {
                            ea6 ea6Var112 = z76VarM3212y0.f35837a.f26515g;
                            oa6.m9016l(ea6Var112);
                            ea6Var112.mo5038t();
                            if (z76VarM3212y0.f35859w != 0) {
                                q76VarM9958i0 = qm6Var.m9958i0();
                                if (TextUtils.isEmpty(str12)) {
                                    str18 = str12;
                                    jM9796i0 = 0;
                                } else {
                                    str18 = str12;
                                    jM9796i0 = q76VarM9958i0.m9796i0(str18.getBytes(Charset.forName("UTF-8")));
                                }
                                ea6 ea6Var113 = z76VarM3212y0.f35837a.f26515g;
                                oa6.m9016l(ea6Var113);
                                ea6Var113.mo5038t();
                                if (jM9796i0 != z76VarM3212y0.f35859w) {
                                    qa6VarM11368T.m11054c();
                                    ((ua6) qa6VarM11368T.f31181b).m11441Y0();
                                }
                            } else {
                                str18 = str12;
                            }
                        } else {
                            str18 = str12;
                        }
                        i2++;
                        str12 = str18;
                    }
                    ar5VarM9952f2 = qm6Var.m9952f0();
                    ua6 ua6Var9 = (ua6) qa6VarM11368T.m11056e();
                    ar5VarM9952f2.mo5038t();
                    ar5VarM9952f2.m10368u();
                    y42.m12851X(ua6Var9.m11487o());
                    byte[] bArrM5118a17 = ua6Var9.m5118a();
                    long jM9796i9 = ar5VarM9952f2.f19870f.m9958i0().m9796i0(bArrM5118a17);
                    ContentValues contentValues10 = new ContentValues();
                    contentValues10.put("app_id", ua6Var9.m11487o());
                    contentValues10.put("metadata_fingerprint", Long.valueOf(jM9796i9));
                    contentValues10.put("metadata", bArrM5118a17);
                    ar5VarM9952f2.m3197l0().insertWithOnConflict("raw_events_metadata", null, contentValues10, 4);
                    ar5VarM9952f3 = qm6Var.m9952f0();
                    cs5Var3 = cs5Var2;
                    os5 os5Var10 = cs5Var3.f16437f;
                    Objects.requireNonNull(os5Var10);
                    it2 = os5Var10.f27065d.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            n96 n96VarM9951e9 = qm6Var.m9951e0();
                            String str311113 = cs5Var3.f16432a;
                            zM8646K = n96VarM9951e9.m8646K(str311113, cs5Var3.f16433b);
                            oq5 oq5VarM3159A8 = qm6Var.m9952f0().m3159A0(qm6Var.m9953g(), str311113, false, false, false, false);
                            if (zM8646K) {
                            }
                            i3 = i;
                            break;
                        }
                        if ("_r".equals(it2.next())) {
                        }
                        i3 = 1;
                        break;
                    }
                    ar5VarM9952f3.mo5038t();
                    ar5VarM9952f3.m10368u();
                    str17 = cs5Var3.f16432a;
                    y42.m12851X(str17);
                    byte[] bArrM5118a18 = ar5VarM9952f3.f19870f.m9958i0().m9790Z(cs5Var3).m5118a();
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str17);
                    contentValues.put("name", cs5Var3.f16433b);
                    contentValues.put("timestamp", Long.valueOf(cs5Var3.f16435d));
                    contentValues.put("metadata_fingerprint", Long.valueOf(jM9796i9));
                    contentValues.put("data", bArrM5118a18);
                    contentValues.put("realtime", Integer.valueOf(i3));
                    if (ar5VarM9952f3.m3197l0().insert(str7, null, contentValues) == -1) {
                        ((oa6) ar5VarM9952f3.f36084a).mo9019b().f16835j.m12505b(d76.m4401y(str17), "Failed to insert raw event (got -1). appId");
                    } else {
                        qm6Var.f28605o = 0L;
                    }
                    qm6Var.m9952f0().m3195j0();
                    qm6Var.m9952f0().m3196k0();
                    qm6Var.m9936L();
                    qm6Var.mo9019b().f16831L.m12505b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                    return;
                    qm6Var.m9952f0().m3196k0();
                    throw th;
                }
                if (jIntValue % 1000 == 1) {
                    mo9019b().f16835j.m12506c("Data loss. Too many events logged. appId, count", d76.m4401y(str5), Long.valueOf(oq5VarM3161B0.f26968b));
                }
                m9952f0().m3195j0();
                m9952f0().m3196k0();
            }
            str4 = str24;
            bt5Var = bt5Var3;
            zM4576t0 = dn6.m4576t0(str28);
            zEquals = "_err".equals(str28);
            m9960j0();
            if (os5Var == null) {
                length = 0;
            } else {
                it = os5Var.f27065d.keySet().iterator();
                length = 0;
                while (it.hasNext()) {
                    objM9258a = os5Var.m9258a(it.next());
                    if (objM9258a instanceof Parcelable[]) {
                        length += (long) ((Parcelable[]) objM9258a).length;
                    }
                }
            }
            str5 = str4;
            oq5VarM3161B0 = m9952f0().m3161B0(m9953g(), str5, length + 1, true, zM4576t0, false, zEquals, false, false, false);
            long j117 = oq5VarM3161B0.f26968b;
            m9950d0();
            jIntValue = j117 - ((long) ((Integer) e56.f17801l.m4379a(null)).intValue());
            if (jIntValue <= 0) {
                if (zM4576t0) {
                    long j118 = oq5VarM3161B0.f26967a;
                    m9950d0();
                    jIntValue2 = j118 - ((long) ((Integer) e56.f17805n.m4379a(null)).intValue());
                    if (jIntValue2 > 0) {
                        if (jIntValue2 % 1000 == 1) {
                            mo9019b().f16835j.m12506c("Data loss. Too many public events logged. appId, count", d76.m4401y(str5), Long.valueOf(oq5VarM3161B0.f26967a));
                        }
                        m9960j0();
                        dn6.m4564K(bt5Var, str5, 16, "_ev", ys5VarM5913c.f35504d, 0);
                        m9952f0().m3195j0();
                    }
                }
                str6 = str5;
                if (zEquals) {
                    jMax = oq5VarM3161B0.f26970d - ((long) Math.max(0, Math.min(1000000, m9950d0().m9223C(str6, e56.f17803m))));
                    if (jMax > 0) {
                        if (jMax == 1) {
                            mo9019b().f16835j.m12506c("Too many error events logged. appId, count", d76.m4401y(str6), Long.valueOf(oq5VarM3161B0.f26970d));
                        }
                        m9952f0().m3195j0();
                    }
                }
                bundleM9261d = os5Var.m9261d();
                dn6 dn6VarM9960j5 = m9960j0();
                String str213 = ys5VarM5913c.f35506f;
                dn6VarM9960j5.m4592J(bundleM9261d, "_o", str213);
                if (m9960j0().m4596U(str6, cp6Var.f16345E)) {
                    m9960j0().m4592J(bundleM9261d, "_dbg", 1L);
                    m9960j0().m4592J(bundleM9261d, "_r", 1L);
                }
                if ("_s".equals(str28)) {
                    obj2 = an6VarM3202q0.f14649e;
                    if (obj2 instanceof Long) {
                        m9960j0().m4592J(bundleM9261d, "_sno", obj2);
                    }
                }
                if (m9950d0().m9225E(null, e56.f17764X0)) {
                    obj = bundleM9261d.get("value");
                    if (obj instanceof String) {
                        double d5 = Double.parseDouble((String) obj);
                        bundleM9261d.remove("value");
                        bundleM9261d.putDouble("value", d5);
                    }
                }
                ar5VarM9952f1 = m9952f0();
                y42.m12851X(str6);
                ar5VarM9952f1.mo5038t();
                ar5VarM9952f1.m10368u();
                str7 = str19;
                jDelete = ar5VarM9952f1.m3197l0().delete(str7, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((oa6) ar5VarM9952f1.f36084a).f26512d.m9223C(str6, e56.f17811q))))});
                if (jDelete > 0) {
                    mo9019b().f16838m.m12506c("Data lost. Too many events stored on disk, deleted. appId", d76.m4401y(str6), Long.valueOf(jDelete));
                }
                oa6Var = this.f28602l;
                cs5Var = new cs5(oa6Var, ys5VarM5913c.f35506f, str6, ys5VarM5913c.f35504d, ys5VarM5913c.f35507g, 0L, bundleM9261d);
                ar5 ar5VarM9952f8 = m9952f0();
                str8 = cs5Var.f16433b;
                String str311114 = str3;
                fs5VarM3182U = ar5VarM9952f8.m3182U(str311114, str6, str8);
                if (fs5VarM3182U == null) {
                    jM3174M = m9952f0().m3174M(str6);
                    op5VarM9950d0 = m9950d0();
                    op5VarM9950d0.getClass();
                    d56Var = e56.f17761W;
                    bt5Var2 = bt5Var;
                    if (jM3174M >= Math.max(Math.min(op5VarM9950d0.m9223C(str6, d56Var), 2000), 500)) {
                    }
                    bt5Var = bt5Var2;
                    fs5VarM5801a = new fs5(str6, str8, 0L, 0L, 0L, cs5Var.f16435d, 0L, null, null, null, null);
                    str6 = str6;
                } else {
                    cs5Var = cs5Var.m4166a(oa6Var, fs5VarM3182U.f19259f);
                    fs5VarM5801a = fs5VarM3182U.m5801a(cs5Var.f16435d);
                }
                cs5Var2 = cs5Var;
                m9952f0().m3183V(str311114, fs5VarM5801a);
                mo9020c().mo5038t();
                m9962k0();
                String str311115 = cs5Var2.f16432a;
                y42.m12851X(str311115);
                y42.m12849V(str311115.equals(str6));
                qa6VarM11368T = ua6.m11368T();
                qa6VarM11368T.m9858y();
                qa6VarM11368T.m9843j();
                if (!TextUtils.isEmpty(str6)) {
                    qa6VarM11368T.m9849p(str6);
                }
                if (TextUtils.isEmpty(str2)) {
                    str9 = str2;
                    qa6VarM11368T.m9847n(str9);
                } else {
                    str9 = str2;
                }
                if (TextUtils.isEmpty(str)) {
                    str10 = str;
                    qa6VarM11368T.m9850q(str10);
                } else {
                    str10 = str;
                }
                if (TextUtils.isEmpty(str21)) {
                    str11 = str21;
                    qa6VarM11368T.m9828R(str11);
                } else {
                    str11 = str21;
                }
                if (j7 != -2147483648L) {
                    j = j7;
                    qa6VarM11368T.m9822L((int) j);
                } else {
                    j = j7;
                }
                str12 = str11;
                qa6VarM11368T.m9851r(j6);
                if (TextUtils.isEmpty(str25)) {
                    str13 = str25;
                    qa6VarM11368T.m9818H(str13);
                } else {
                    str13 = str25;
                }
                y42.m12854a0(str6);
                str14 = str9;
                xc6VarM12661j = m9947a(str6).m12661j(xc6.m12653c(100, str20));
                qa6VarM11368T.m9827Q(xc6VarM12661j.m12658f());
                ho6.m6466a();
                zM9225E = m9950d0().m9225E(str6, e56.f17748P0);
                vc6Var = vc6.AD_STORAGE;
                if (zM9225E) {
                    m9960j0();
                    if (dn6.m4568Q(str6)) {
                        qa6VarM11368T.m9859z(cp6Var.f16343C);
                        j2 = j;
                        j3 = cp6Var.f16344D;
                        if (!xc6VarM12661j.m12660i(vc6Var)) {
                            j3 = (j3 & (-2)) | 32;
                        }
                        if (j3 == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        qa6VarM11368T.m9830T(z);
                        if (j3 != 0) {
                            l86 l86VarM8989v5 = o86.m8989v();
                            if ((j3 & 1) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            l86VarM8989v5.m7866h(z2);
                            if ((j3 & 2) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            l86VarM8989v5.m7867i(z3);
                            if ((j3 & 4) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            l86VarM8989v5.m7868j(z4);
                            if ((j3 & 8) != 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            l86VarM8989v5.m7869k(z5);
                            if ((j3 & 16) != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            l86VarM8989v5.m7870l(z6);
                            if ((j3 & 32) != 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            l86VarM8989v5.m7871m(z7);
                            if ((j3 & 64) != 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            l86VarM8989v5.m7872n(z8);
                            qa6VarM11368T.m9811A((o86) l86VarM8989v5.m11056e());
                        }
                    } else {
                        j2 = j;
                    }
                } else {
                    j2 = j;
                }
                if (j8 != 0) {
                    qa6VarM11368T.m9856w(j8);
                    j8 = j8;
                }
                qa6VarM11368T.m9825O(j4);
                q76 q76VarM9958i5 = m9958i0();
                hd6VarM6361a = hd6.m6361a(q76VarM9958i5.f19870f.f28602l.mo9021d().getContentResolver(), he6.m6365a(), p62.f27399b);
                if (hd6VarM6361a == null) {
                    mapM6363b = Collections.EMPTY_MAP;
                } else {
                    mapM6363b = hd6VarM6361a.m6363b();
                }
                if (mapM6363b == null) {
                    str15 = str10;
                    str16 = str13;
                    arrayList = null;
                } else {
                    str15 = str10;
                    str16 = str13;
                    arrayList = null;
                }
                if (arrayList != null) {
                    qa6VarM11368T.m9824N(arrayList);
                }
                if (m9950d0().m9225E(null, e56.f17774b1)) {
                    qa6VarM11368T.m9814D();
                }
                xc6VarM12661j2 = m9947a(str6).m12661j(xc6.m12653c(100, str20));
                if (xc6VarM12661j2.m12660i(vc6Var)) {
                    oa6Var2 = oa6Var2;
                    cs5Var2 = cs5Var2;
                    oa6Var2.m9028o().m7955v();
                    String str311116 = Build.MODEL;
                    qa6VarM11368T.m9844k();
                    oa6Var2.m9028o().m7955v();
                    String str311117 = Build.VERSION.RELEASE;
                    qa6VarM11368T.m11054c();
                    ((ua6) qa6VarM11368T.f31181b).m11485n0(str311117);
                    qa6VarM11368T.m9846m((int) oa6Var2.m9028o().m13228y());
                    qa6VarM11368T.m9845l(oa6Var2.m9028o().m13229z());
                    qa6VarM11368T.m9829S(cp6Var.f16371z);
                    if (oa6Var2.m9018a()) {
                        qa6VarM11368T.m9848o();
                        if (!TextUtils.isEmpty(null)) {
                            qa6VarM11368T.m11054c();
                            ((ua6) qa6VarM11368T.f31181b).m11419Q0(null);
                            throw null;
                        }
                    }
                    z76VarM3212y0 = m9952f0().m3212y0(str6);
                    if (z76VarM3212y0 == null) {
                        z76VarM3212y0 = new z76(oa6Var2, str6);
                        qm6Var = this;
                        z76VarM3212y0.m13406F(qm6Var.m9969o(xc6VarM12661j2));
                        z76VarM3212y0.m13411K(cp6Var.f16359n);
                        z76VarM3212y0.m13408H(str16);
                        if (xc6VarM12661j2.m12660i(vc6Var)) {
                            z76VarM3212y0.m13409I(qm6Var.f28599i.m10348z(str6, z9));
                        }
                        z76VarM3212y0.m13424e(0L);
                        z76VarM3212y0.m13412L(0L);
                        z76VarM3212y0.m13413M(0L);
                        z76VarM3212y0.m13415O(str15);
                        z76VarM3212y0.m13417Q(j2);
                        z76VarM3212y0.m13418R(str14);
                        z76VarM3212y0.m13419S(j6);
                        z76VarM3212y0.m13420a(j8);
                        z76VarM3212y0.m13423d(z10);
                        z76VarM3212y0.m13422c(j4);
                        i = 0;
                        qm6Var.m9952f0().m3214z0(z76VarM3212y0, false);
                    } else {
                        i = 0;
                        qm6Var = this;
                    }
                    if (xc6VarM12661j2.m12660i(vc6.ANALYTICS_STORAGE)) {
                        String strM13405E10 = z76VarM3212y0.m13405E();
                        y42.m12854a0(strM13405E10);
                        qa6VarM11368T.m9855v(strM13405E10);
                    }
                    if (!TextUtils.isEmpty(z76VarM3212y0.m13410J())) {
                        String strM13410J10 = z76VarM3212y0.m13410J();
                        y42.m12854a0(strM13410J10);
                        qa6VarM11368T.m9821K(strM13410J10);
                    }
                    listM3203r0 = qm6Var.m9952f0().m3203r0(str6);
                    i2 = i;
                    while (i2 < listM3203r0.size()) {
                        ob6 ob6VarM9471z10 = pb6.m9471z();
                        String str311118 = ((an6) listM3203r0.get(i2)).f14647c;
                        ob6VarM9471z10.m11054c();
                        ((pb6) ob6VarM9471z10.f31181b).m9473B(str311118);
                        long j119 = ((an6) listM3203r0.get(i2)).f14648d;
                        ob6VarM9471z10.m11054c();
                        ((pb6) ob6VarM9471z10.f31181b).m9472A(j119);
                        qm6Var.m9958i0().m9787W(ob6VarM9471z10, ((an6) listM3203r0.get(i2)).f14649e);
                        qa6VarM11368T.m9837a0(ob6VarM9471z10);
                        if ("_sid".equals(((an6) listM3203r0.get(i2)).f14647c)) {
                            ea6 ea6Var114 = z76VarM3212y0.f35837a.f26515g;
                            oa6.m9016l(ea6Var114);
                            ea6Var114.mo5038t();
                            if (z76VarM3212y0.f35859w != 0) {
                                q76VarM9958i0 = qm6Var.m9958i0();
                                if (TextUtils.isEmpty(str12)) {
                                    str18 = str12;
                                    jM9796i0 = 0;
                                } else {
                                    str18 = str12;
                                    jM9796i0 = q76VarM9958i0.m9796i0(str18.getBytes(Charset.forName("UTF-8")));
                                }
                                ea6 ea6Var115 = z76VarM3212y0.f35837a.f26515g;
                                oa6.m9016l(ea6Var115);
                                ea6Var115.mo5038t();
                                if (jM9796i0 != z76VarM3212y0.f35859w) {
                                    qa6VarM11368T.m11054c();
                                    ((ua6) qa6VarM11368T.f31181b).m11441Y0();
                                }
                            } else {
                                str18 = str12;
                            }
                        } else {
                            str18 = str12;
                        }
                        i2++;
                        str12 = str18;
                    }
                    ar5VarM9952f2 = qm6Var.m9952f0();
                    ua6 ua6Var10 = (ua6) qa6VarM11368T.m11056e();
                    ar5VarM9952f2.mo5038t();
                    ar5VarM9952f2.m10368u();
                    y42.m12851X(ua6Var10.m11487o());
                    byte[] bArrM5118a19 = ua6Var10.m5118a();
                    long jM9796i10 = ar5VarM9952f2.f19870f.m9958i0().m9796i0(bArrM5118a19);
                    ContentValues contentValues11 = new ContentValues();
                    contentValues11.put("app_id", ua6Var10.m11487o());
                    contentValues11.put("metadata_fingerprint", Long.valueOf(jM9796i10));
                    contentValues11.put("metadata", bArrM5118a19);
                    ar5VarM9952f2.m3197l0().insertWithOnConflict("raw_events_metadata", null, contentValues11, 4);
                    ar5VarM9952f3 = qm6Var.m9952f0();
                    cs5Var3 = cs5Var2;
                    os5 os5Var11 = cs5Var3.f16437f;
                    Objects.requireNonNull(os5Var11);
                    it2 = os5Var11.f27065d.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            n96 n96VarM9951e10 = qm6Var.m9951e0();
                            String str311119 = cs5Var3.f16432a;
                            zM8646K = n96VarM9951e10.m8646K(str311119, cs5Var3.f16433b);
                            oq5 oq5VarM3159A9 = qm6Var.m9952f0().m3159A0(qm6Var.m9953g(), str311119, false, false, false, false);
                            if (zM8646K) {
                            }
                            i3 = i;
                            break;
                        }
                        if ("_r".equals(it2.next())) {
                        }
                        i3 = 1;
                        break;
                    }
                    ar5VarM9952f3.mo5038t();
                    ar5VarM9952f3.m10368u();
                    str17 = cs5Var3.f16432a;
                    y42.m12851X(str17);
                    byte[] bArrM5118a110 = ar5VarM9952f3.f19870f.m9958i0().m9790Z(cs5Var3).m5118a();
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str17);
                    contentValues.put("name", cs5Var3.f16433b);
                    contentValues.put("timestamp", Long.valueOf(cs5Var3.f16435d));
                    contentValues.put("metadata_fingerprint", Long.valueOf(jM9796i10));
                    contentValues.put("data", bArrM5118a110);
                    contentValues.put("realtime", Integer.valueOf(i3));
                    if (ar5VarM9952f3.m3197l0().insert(str7, null, contentValues) == -1) {
                        ((oa6) ar5VarM9952f3.f36084a).mo9019b().f16835j.m12505b(d76.m4401y(str17), "Failed to insert raw event (got -1). appId");
                    } else {
                        qm6Var.f28605o = 0L;
                    }
                    qm6Var.m9952f0().m3195j0();
                    qm6Var.m9952f0().m3196k0();
                    qm6Var.m9936L();
                    qm6Var.mo9019b().f16831L.m12505b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                    return;
                }
                oa6Var2 = oa6Var2;
                cs5Var2 = cs5Var2;
                oa6Var2.m9028o().m7955v();
                String str3111110 = Build.MODEL;
                qa6VarM11368T.m9844k();
                oa6Var2.m9028o().m7955v();
                String str3111111 = Build.VERSION.RELEASE;
                qa6VarM11368T.m11054c();
                ((ua6) qa6VarM11368T.f31181b).m11485n0(str3111111);
                qa6VarM11368T.m9846m((int) oa6Var2.m9028o().m13228y());
                qa6VarM11368T.m9845l(oa6Var2.m9028o().m13229z());
                qa6VarM11368T.m9829S(cp6Var.f16371z);
                if (oa6Var2.m9018a()) {
                    qa6VarM11368T.m9848o();
                    if (!TextUtils.isEmpty(null)) {
                        qa6VarM11368T.m11054c();
                        ((ua6) qa6VarM11368T.f31181b).m11419Q0(null);
                        throw null;
                    }
                }
                z76VarM3212y0 = m9952f0().m3212y0(str6);
                if (z76VarM3212y0 == null) {
                    z76VarM3212y0 = new z76(oa6Var2, str6);
                    qm6Var = this;
                    z76VarM3212y0.m13406F(qm6Var.m9969o(xc6VarM12661j2));
                    z76VarM3212y0.m13411K(cp6Var.f16359n);
                    z76VarM3212y0.m13408H(str16);
                    if (xc6VarM12661j2.m12660i(vc6Var)) {
                        z76VarM3212y0.m13409I(qm6Var.f28599i.m10348z(str6, z9));
                    }
                    z76VarM3212y0.m13424e(0L);
                    z76VarM3212y0.m13412L(0L);
                    z76VarM3212y0.m13413M(0L);
                    z76VarM3212y0.m13415O(str15);
                    z76VarM3212y0.m13417Q(j2);
                    z76VarM3212y0.m13418R(str14);
                    z76VarM3212y0.m13419S(j6);
                    z76VarM3212y0.m13420a(j8);
                    z76VarM3212y0.m13423d(z10);
                    z76VarM3212y0.m13422c(j4);
                    i = 0;
                    qm6Var.m9952f0().m3214z0(z76VarM3212y0, false);
                } else {
                    i = 0;
                    qm6Var = this;
                }
                if (xc6VarM12661j2.m12660i(vc6.ANALYTICS_STORAGE)) {
                    String strM13405E11 = z76VarM3212y0.m13405E();
                    y42.m12854a0(strM13405E11);
                    qa6VarM11368T.m9855v(strM13405E11);
                }
                if (!TextUtils.isEmpty(z76VarM3212y0.m13410J())) {
                    String strM13410J11 = z76VarM3212y0.m13410J();
                    y42.m12854a0(strM13410J11);
                    qa6VarM11368T.m9821K(strM13410J11);
                }
                listM3203r0 = qm6Var.m9952f0().m3203r0(str6);
                i2 = i;
                while (i2 < listM3203r0.size()) {
                    ob6 ob6VarM9471z11 = pb6.m9471z();
                    String str3111112 = ((an6) listM3203r0.get(i2)).f14647c;
                    ob6VarM9471z11.m11054c();
                    ((pb6) ob6VarM9471z11.f31181b).m9473B(str3111112);
                    long j1110 = ((an6) listM3203r0.get(i2)).f14648d;
                    ob6VarM9471z11.m11054c();
                    ((pb6) ob6VarM9471z11.f31181b).m9472A(j1110);
                    qm6Var.m9958i0().m9787W(ob6VarM9471z11, ((an6) listM3203r0.get(i2)).f14649e);
                    qa6VarM11368T.m9837a0(ob6VarM9471z11);
                    if ("_sid".equals(((an6) listM3203r0.get(i2)).f14647c)) {
                        ea6 ea6Var116 = z76VarM3212y0.f35837a.f26515g;
                        oa6.m9016l(ea6Var116);
                        ea6Var116.mo5038t();
                        if (z76VarM3212y0.f35859w != 0) {
                            q76VarM9958i0 = qm6Var.m9958i0();
                            if (TextUtils.isEmpty(str12)) {
                                str18 = str12;
                                jM9796i0 = 0;
                            } else {
                                str18 = str12;
                                jM9796i0 = q76VarM9958i0.m9796i0(str18.getBytes(Charset.forName("UTF-8")));
                            }
                            ea6 ea6Var117 = z76VarM3212y0.f35837a.f26515g;
                            oa6.m9016l(ea6Var117);
                            ea6Var117.mo5038t();
                            if (jM9796i0 != z76VarM3212y0.f35859w) {
                                qa6VarM11368T.m11054c();
                                ((ua6) qa6VarM11368T.f31181b).m11441Y0();
                            }
                        } else {
                            str18 = str12;
                        }
                    } else {
                        str18 = str12;
                    }
                    i2++;
                    str12 = str18;
                }
                ar5VarM9952f2 = qm6Var.m9952f0();
                ua6 ua6Var11 = (ua6) qa6VarM11368T.m11056e();
                ar5VarM9952f2.mo5038t();
                ar5VarM9952f2.m10368u();
                y42.m12851X(ua6Var11.m11487o());
                byte[] bArrM5118a111 = ua6Var11.m5118a();
                long jM9796i11 = ar5VarM9952f2.f19870f.m9958i0().m9796i0(bArrM5118a111);
                ContentValues contentValues12 = new ContentValues();
                contentValues12.put("app_id", ua6Var11.m11487o());
                contentValues12.put("metadata_fingerprint", Long.valueOf(jM9796i11));
                contentValues12.put("metadata", bArrM5118a111);
                ar5VarM9952f2.m3197l0().insertWithOnConflict("raw_events_metadata", null, contentValues12, 4);
                ar5VarM9952f3 = qm6Var.m9952f0();
                cs5Var3 = cs5Var2;
                os5 os5Var12 = cs5Var3.f16437f;
                Objects.requireNonNull(os5Var12);
                it2 = os5Var12.f27065d.keySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        n96 n96VarM9951e11 = qm6Var.m9951e0();
                        String str3111113 = cs5Var3.f16432a;
                        zM8646K = n96VarM9951e11.m8646K(str3111113, cs5Var3.f16433b);
                        oq5 oq5VarM3159A10 = qm6Var.m9952f0().m3159A0(qm6Var.m9953g(), str3111113, false, false, false, false);
                        if (zM8646K) {
                        }
                        i3 = i;
                        break;
                    }
                    if ("_r".equals(it2.next())) {
                    }
                    i3 = 1;
                    break;
                }
                ar5VarM9952f3.mo5038t();
                ar5VarM9952f3.m10368u();
                str17 = cs5Var3.f16432a;
                y42.m12851X(str17);
                byte[] bArrM5118a112 = ar5VarM9952f3.f19870f.m9958i0().m9790Z(cs5Var3).m5118a();
                contentValues = new ContentValues();
                contentValues.put("app_id", str17);
                contentValues.put("name", cs5Var3.f16433b);
                contentValues.put("timestamp", Long.valueOf(cs5Var3.f16435d));
                contentValues.put("metadata_fingerprint", Long.valueOf(jM9796i11));
                contentValues.put("data", bArrM5118a112);
                contentValues.put("realtime", Integer.valueOf(i3));
                if (ar5VarM9952f3.m3197l0().insert(str7, null, contentValues) == -1) {
                    ((oa6) ar5VarM9952f3.f36084a).mo9019b().f16835j.m12505b(d76.m4401y(str17), "Failed to insert raw event (got -1). appId");
                } else {
                    qm6Var.f28605o = 0L;
                }
                qm6Var.m9952f0().m3195j0();
                qm6Var.m9952f0().m3196k0();
                qm6Var.m9936L();
                qm6Var.mo9019b().f16831L.m12505b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                return;
                qm6Var.m9952f0().m3196k0();
                throw th;
            }
            if (jIntValue % 1000 == 1) {
                mo9019b().f16835j.m12506c("Data loss. Too many events logged. appId, count", d76.m4401y(str5), Long.valueOf(oq5VarM3161B0.f26968b));
            }
            m9952f0().m3195j0();
            m9952f0().m3196k0();
        } catch (Throwable th3) {
            th = th3;
            qm6Var = this;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m9964l0(cp6 cp6Var) throws Throwable {
        mo9020c().mo5038t();
        m9962k0();
        String str = cp6Var.f16349d;
        y42.m12851X(str);
        xc6 xc6VarM12653c = xc6.m12653c(cp6Var.f16341A, cp6Var.f16367v);
        m9947a(str);
        mo9019b().f16831L.m12506c("Setting storage consent for package", str, xc6VarM12653c);
        mo9020c().mo5038t();
        m9962k0();
        this.f28582B.put(str, xc6VarM12653c);
        ar5 ar5Var = this.f28593c;
        m9925S(ar5Var);
        ar5Var.m3188b0(str, xc6VarM12653c);
    }

    /* JADX INFO: renamed from: m */
    public final void m9965m(z76 z76Var, qa6 qa6Var) throws Throwable {
        int i;
        w42 w42Var;
        pb6 pb6Var;
        String str;
        sp5 sp5Var;
        mo9020c().mo5038t();
        m9962k0();
        String strM11371A0 = ((ua6) qa6Var.f31181b).m11371A0();
        EnumMap enumMap = new EnumMap(vc6.class);
        int length = strM11371A0.length();
        int length2 = vc6.values().length;
        sp5 sp5Var2 = sp5.UNSET;
        int i2 = 0;
        if (length < length2 || strM11371A0.charAt(0) != '1') {
            i = 0;
            w42Var = new w42((byte) 29);
        } else {
            vc6[] vc6VarArrValues = vc6.values();
            int length3 = vc6VarArrValues.length;
            int i3 = 0;
            int i4 = 1;
            while (i3 < length3) {
                vc6 vc6Var = vc6VarArrValues[i3];
                int i5 = i4 + 1;
                char cCharAt = strM11371A0.charAt(i4);
                sp5[] sp5VarArrValues = sp5.values();
                int length4 = sp5VarArrValues.length;
                int i6 = i2;
                while (true) {
                    if (i6 >= length4) {
                        str = strM11371A0;
                        sp5Var = sp5Var2;
                        break;
                    }
                    sp5Var = sp5VarArrValues[i6];
                    str = strM11371A0;
                    if (sp5Var.f30486a == cCharAt) {
                        break;
                    }
                    i6++;
                    strM11371A0 = str;
                }
                enumMap.put(vc6Var, sp5Var);
                i3++;
                i4 = i5;
                strM11371A0 = str;
                i2 = 0;
            }
            i = 0;
            w42Var = new w42(false, (byte) 29);
            EnumMap enumMap2 = new EnumMap(vc6.class);
            w42Var.f33090b = enumMap2;
            enumMap2.putAll(enumMap);
            VarHandle.storeStoreFence();
        }
        String strM13404D = z76Var.m13404D();
        mo9020c().mo5038t();
        m9962k0();
        xc6 xc6VarM9947a = m9947a(strM13404D);
        EnumMap enumMap3 = xc6VarM9947a.f34160a;
        vc6 vc6Var2 = vc6.AD_STORAGE;
        rc6 rc6Var = (rc6) enumMap3.get(vc6Var2);
        rc6 rc6Var2 = rc6.UNINITIALIZED;
        if (rc6Var == null) {
            rc6Var = rc6Var2;
        }
        int i7 = xc6VarM9947a.f34161b;
        int iOrdinal = rc6Var.ordinal();
        sp5 sp5Var3 = sp5.REMOTE_ENFORCED_DEFAULT;
        sp5 sp5Var4 = sp5.FAILSAFE;
        if (iOrdinal == 1) {
            w42Var.m12095z(vc6Var2, sp5Var3);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            w42Var.m12094y(vc6Var2, i7);
        } else {
            w42Var.m12095z(vc6Var2, sp5Var4);
        }
        vc6 vc6Var3 = vc6.ANALYTICS_STORAGE;
        rc6 rc6Var3 = (rc6) enumMap3.get(vc6Var3);
        if (rc6Var3 != null) {
            rc6Var2 = rc6Var3;
        }
        int iOrdinal2 = rc6Var2.ordinal();
        if (iOrdinal2 == 1) {
            w42Var.m12095z(vc6Var3, sp5Var3);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            w42Var.m12094y(vc6Var3, i7);
        } else {
            w42Var.m12095z(vc6Var3, sp5Var4);
        }
        String strM13404D2 = z76Var.m13404D();
        mo9020c().mo5038t();
        m9962k0();
        mr5 mr5VarM9972p0 = m9972p0(strM13404D2, m9968n0(strM13404D2), m9947a(strM13404D2), w42Var);
        String str2 = mr5VarM9972p0.f25174d;
        Boolean bool = mr5VarM9972p0.f25173c;
        y42.m12854a0(bool);
        boolean zBooleanValue = bool.booleanValue();
        qa6Var.m11054c();
        ((ua6) qa6Var.f31181b).m11459e1(zBooleanValue);
        if (!TextUtils.isEmpty(str2)) {
            qa6Var.m11054c();
            ((ua6) qa6Var.f31181b).m11462f1(str2);
        }
        mo9020c().mo5038t();
        m9962k0();
        Iterator it = Collections.unmodifiableList(((ua6) qa6Var.f31181b).m11428T1()).iterator();
        do {
            if (!it.hasNext()) {
                pb6Var = null;
                break;
            }
            pb6Var = (pb6) it.next();
        } while (!"_npa".equals(pb6Var.m9482q()));
        if (pb6Var != null) {
            EnumMap enumMap4 = (EnumMap) w42Var.f33090b;
            vc6 vc6Var4 = vc6.AD_PERSONALIZATION;
            sp5 sp5Var5 = (sp5) enumMap4.get(vc6Var4);
            if (sp5Var5 == null) {
                sp5Var5 = sp5Var2;
            }
            if (sp5Var5 == sp5Var2) {
                ar5 ar5Var = this.f28593c;
                m9925S(ar5Var);
                an6 an6VarM3202q0 = ar5Var.m3202q0(z76Var.m13404D(), "_npa");
                sp5 sp5Var6 = sp5.MANIFEST;
                sp5 sp5Var7 = sp5.API;
                if (an6VarM3202q0 != null) {
                    String str3 = an6VarM3202q0.f14646b;
                    if ("tcf".equals(str3)) {
                        w42Var.m12095z(vc6Var4, sp5.TCF);
                    } else if ("app".equals(str3)) {
                        w42Var.m12095z(vc6Var4, sp5Var7);
                    } else {
                        w42Var.m12095z(vc6Var4, sp5Var6);
                    }
                } else {
                    Boolean boolM13442w = z76Var.m13442w();
                    if (boolM13442w == null || ((boolM13442w.booleanValue() && pb6Var.m9486u() != 1) || !(boolM13442w.booleanValue() || pb6Var.m9486u() == 0))) {
                        w42Var.m12095z(vc6Var4, sp5Var7);
                    } else {
                        w42Var.m12095z(vc6Var4, sp5Var6);
                    }
                }
            }
        } else {
            int iM9929D = m9929D(z76Var.m13404D(), w42Var);
            ob6 ob6VarM9471z = pb6.m9471z();
            ob6VarM9471z.m11054c();
            ((pb6) ob6VarM9471z.f31181b).m9473B("_npa");
            mo9022e().getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            ob6VarM9471z.m11054c();
            ((pb6) ob6VarM9471z.f31181b).m9472A(jCurrentTimeMillis);
            ob6VarM9471z.m11054c();
            ((pb6) ob6VarM9471z.f31181b).m9476E(iM9929D);
            pb6 pb6Var2 = (pb6) ob6VarM9471z.m11056e();
            qa6Var.m11054c();
            ((ua6) qa6Var.f31181b).m11452c0(pb6Var2);
            mo9019b().f16831L.m12506c("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(iM9929D));
        }
        String string = w42Var.toString();
        qa6Var.m11054c();
        ((ua6) qa6Var.f31181b).m11456d1(string);
        String strM13404D3 = z76Var.m13404D();
        n96 n96Var = this.f28591a;
        n96Var.mo5038t();
        n96Var.m8638A(strM13404D3);
        a66 a66VarM8651P = n96Var.m8651P(strM13404D3);
        int i8 = (a66VarM8651P == null || !a66VarM8651P.m109r() || a66VarM8651P.m110s()) ? 1 : i;
        List listM9831U = qa6Var.m9831U();
        for (int i9 = i; i9 < listM9831U.size(); i9++) {
            if ("_tcf".equals(((m96) listM9831U.get(i9)).m8247r())) {
                l96 l96Var = (l96) ((m96) listM9831U.get(i9)).m13569g();
                List listM7876h = l96Var.m7876h();
                for (int i10 = i; i10 < listM7876h.size(); i10++) {
                    if ("_tcfd".equals(((x96) listM7876h.get(i10)).m12547p())) {
                        String strM12549r = ((x96) listM7876h.get(i10)).m12549r();
                        if (i8 != 0 && strM12549r.length() > 4) {
                            char[] charArray = strM12549r.toCharArray();
                            int i11 = 1;
                            while (true) {
                                if (i11 >= 64) {
                                    i11 = i;
                                    break;
                                } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11)) {
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11 | 1);
                            strM12549r = String.valueOf(charArray);
                        }
                        u96 u96VarM12535A = x96.m12535A();
                        u96VarM12535A.m11305h("_tcfd");
                        u96VarM12535A.m11306i(strM12549r);
                        l96Var.m11054c();
                        ((m96) l96Var.f31181b).m8254z(i10, (x96) u96VarM12535A.m11056e());
                        break;
                    }
                }
                qa6Var.m9834X(i9, l96Var);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m9966m0(cp6 cp6Var) throws Throwable {
        mo9020c().mo5038t();
        m9962k0();
        String str = cp6Var.f16349d;
        y42.m12851X(str);
        mr5 mr5VarM8386b = mr5.m8386b(cp6Var.f16342B);
        mo9019b().f16831L.m12506c("Setting DMA consent for package", str, mr5VarM8386b);
        mo9020c().mo5038t();
        m9962k0();
        rc6 rc6VarM8388a = mr5.m8387c(100, m9970o0(str)).m8388a();
        this.f28583C.put(str, mr5VarM8386b);
        ar5 ar5Var = this.f28593c;
        m9925S(ar5Var);
        y42.m12854a0(str);
        y42.m12854a0(mr5VarM8386b);
        ar5Var.mo5038t();
        ar5Var.m10368u();
        xc6 xc6VarM3177P = ar5Var.m3177P(str);
        xc6 xc6Var = xc6.f34159c;
        if (xc6VarM3177P == xc6Var) {
            ar5Var.m3188b0(str, xc6Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", mr5VarM8386b.f25172b);
        ar5Var.m3181T(contentValues);
        rc6 rc6VarM8388a2 = mr5.m8387c(100, m9970o0(str)).m8388a();
        mo9020c().mo5038t();
        m9962k0();
        rc6 rc6Var = rc6.GRANTED;
        rc6 rc6Var2 = rc6.DENIED;
        boolean z = rc6VarM8388a == rc6Var2 && rc6VarM8388a2 == rc6Var;
        boolean z2 = rc6VarM8388a == rc6Var && rc6VarM8388a2 == rc6Var2;
        if (z || z2) {
            mo9019b().f16831L.m12505b(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            ar5 ar5Var2 = this.f28593c;
            m9925S(ar5Var2);
            if (ar5Var2.m3159A0(m9953g(), str, false, false, false, false).f26972f < m9950d0().m9223C(str, e56.f17804m0)) {
                bundle.putLong("_r", 1L);
                ar5 ar5Var3 = this.f28593c;
                m9925S(ar5Var3);
                mo9019b().f16831L.m12506c("_dcu realtime event count", str, Long.valueOf(ar5Var3.m3159A0(m9953g(), str, false, false, true, false).f26972f));
            }
            this.f28590J.mo3640a(str, "_dcu", bundle);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m9967n(z76 z76Var, qa6 qa6Var) {
        Serializable serializableM9766J;
        mo9020c().mo5038t();
        m9962k0();
        n76 n76VarM3893N = c86.m3893N();
        oa6 oa6Var = z76Var.f35837a;
        ea6 ea6Var = oa6Var.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        byte[] bArr = z76Var.f35825H;
        if (bArr != null) {
            try {
                n76VarM3893N = (n76) q76.m9777k0(n76VarM3893N, bArr);
            } catch (qi6 unused) {
                mo9019b().f16838m.m12505b(d76.m4401y(z76Var.m13404D()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        Iterator it = qa6Var.m9831U().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            m96 m96Var = (m96) it.next();
            if (m96Var.m8247r().equals("_cmp")) {
                x96 x96VarM9761C = q76.m9761C("gclid", m96Var);
                Serializable serializableM9766J2 = x96VarM9761C == null ? null : q76.m9766J(x96VarM9761C);
                if (serializableM9766J2 == null) {
                    serializableM9766J2 = "";
                }
                String str = (String) serializableM9766J2;
                x96 x96VarM9761C2 = q76.m9761C("gbraid", m96Var);
                Serializable serializableM9766J3 = x96VarM9761C2 == null ? null : q76.m9766J(x96VarM9761C2);
                if (serializableM9766J3 == null) {
                    serializableM9766J3 = "";
                }
                String str2 = (String) serializableM9766J3;
                x96 x96VarM9761C3 = q76.m9761C("gad_source", m96Var);
                Serializable serializableM9766J4 = x96VarM9761C3 == null ? null : q76.m9766J(x96VarM9761C3);
                String str3 = (String) (serializableM9766J4 != null ? serializableM9766J4 : "");
                String[] strArrSplit = ((String) e56.f17792h1.m4379a(null)).split(",");
                m9958i0();
                HashMap map = new HashMap();
                for (x96 x96Var : m96Var.m8244o()) {
                    if (Arrays.asList(strArrSplit).contains(x96Var.m12547p()) && (serializableM9766J = q76.m9766J(x96Var)) != null) {
                        map.put(x96Var.m12547p(), serializableM9766J);
                    }
                }
                if (!map.isEmpty()) {
                    x96 x96VarM9761C4 = q76.m9761C("click_timestamp", m96Var);
                    Serializable serializableM9766J5 = x96VarM9761C4 == null ? null : q76.m9766J(x96VarM9761C4);
                    long jLongValue = ((Long) (serializableM9766J5 != null ? serializableM9766J5 : 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = m96Var.m8249t();
                    }
                    x96 x96VarM9761C5 = q76.m9761C("_cis", m96Var);
                    if ("referrer API v2".equals(x96VarM9761C5 != null ? q76.m9766J(x96VarM9761C5) : null)) {
                        if (jLongValue > ((c86) n76VarM3893N.f31181b).m3907M()) {
                            if (str.isEmpty()) {
                                n76VarM3893N.m11054c();
                                ((c86) n76VarM3893N.f31181b).m3916p();
                            } else {
                                n76VarM3893N.m11054c();
                                ((c86) n76VarM3893N.f31181b).m3915o(str);
                            }
                            if (str2.isEmpty()) {
                                n76VarM3893N.m11054c();
                                ((c86) n76VarM3893N.f31181b).m3918r();
                            } else {
                                n76VarM3893N.m11054c();
                                ((c86) n76VarM3893N.f31181b).m3917q(str2);
                            }
                            if (str3.isEmpty()) {
                                n76VarM3893N.m11054c();
                                ((c86) n76VarM3893N.f31181b).m3920t();
                            } else {
                                n76VarM3893N.m11054c();
                                ((c86) n76VarM3893N.f31181b).m3919s(str3);
                            }
                            n76VarM3893N.m11054c();
                            ((c86) n76VarM3893N.f31181b).m3921u(jLongValue);
                            n76VarM3893N.m11054c();
                            ((c86) n76VarM3893N.f31181b).m3923w().clear();
                            HashMap mapM9930E = m9930E(m96Var);
                            n76VarM3893N.m11054c();
                            ((c86) n76VarM3893N.f31181b).m3923w().putAll(mapM9930E);
                        }
                    } else if (jLongValue > ((c86) n76VarM3893N.f31181b).m3899E()) {
                        if (str.isEmpty()) {
                            n76VarM3893N.m11054c();
                            ((c86) n76VarM3893N.f31181b).m3909Q();
                        } else {
                            n76VarM3893N.m11054c();
                            ((c86) n76VarM3893N.f31181b).m3908P(str);
                        }
                        if (str2.isEmpty()) {
                            n76VarM3893N.m11054c();
                            ((c86) n76VarM3893N.f31181b).m3911S();
                        } else {
                            n76VarM3893N.m11054c();
                            ((c86) n76VarM3893N.f31181b).m3910R(str2);
                        }
                        if (str3.isEmpty()) {
                            n76VarM3893N.m11054c();
                            ((c86) n76VarM3893N.f31181b).m3913U();
                        } else {
                            n76VarM3893N.m11054c();
                            ((c86) n76VarM3893N.f31181b).m3912T(str3);
                        }
                        n76VarM3893N.m11054c();
                        ((c86) n76VarM3893N.f31181b).m3914V(jLongValue);
                        n76VarM3893N.m11054c();
                        ((c86) n76VarM3893N.f31181b).m3922v().clear();
                        HashMap mapM9930E2 = m9930E(m96Var);
                        n76VarM3893N.m11054c();
                        ((c86) n76VarM3893N.f31181b).m3922v().putAll(mapM9930E2);
                    }
                }
            }
        }
        if (!((c86) n76VarM3893N.m11056e()).equals(c86.m3894O())) {
            c86 c86Var = (c86) n76VarM3893N.m11056e();
            qa6Var.m11054c();
            ((ua6) qa6Var.f31181b).m11474j1(c86Var);
        }
        byte[] bArrM5118a = ((c86) n76VarM3893N.m11056e()).m5118a();
        ea6 ea6Var2 = oa6Var.f26515g;
        oa6.m9016l(ea6Var2);
        ea6Var2.mo5038t();
        z76Var.f35834Q |= z76Var.f35825H != bArrM5118a;
        z76Var.f35825H = bArrM5118a;
        if (z76Var.m13434o()) {
            ar5 ar5Var = this.f28593c;
            m9925S(ar5Var);
            ar5Var.m3214z0(z76Var, false);
        }
        if (m9950d0().m9225E(null, e56.f17789g1)) {
            ar5 ar5Var2 = this.f28593c;
            m9925S(ar5Var2);
            ar5Var2.m3200o0(z76Var.m13404D(), "_lgclid");
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final mr5 m9968n0(String str) {
        mo9020c().mo5038t();
        m9962k0();
        HashMap map = this.f28583C;
        mr5 mr5Var = (mr5) map.get(str);
        if (mr5Var != null) {
            return mr5Var;
        }
        ar5 ar5Var = this.f28593c;
        m9925S(ar5Var);
        y42.m12854a0(str);
        ar5Var.mo5038t();
        ar5Var.m10368u();
        mr5 mr5VarM8386b = mr5.m8386b(ar5Var.m3180S("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        map.put(str, mr5VarM8386b);
        return mr5VarM8386b;
    }

    /* JADX INFO: renamed from: o */
    public final String m9969o(xc6 xc6Var) {
        if (!xc6Var.m12660i(vc6.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        m9960j0().m4614s0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX INFO: renamed from: o0 */
    public final Bundle m9970o0(String str) throws Throwable {
        mo9020c().mo5038t();
        m9962k0();
        n96 n96Var = this.f28591a;
        m9925S(n96Var);
        if (n96Var.m8651P(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        xc6 xc6VarM9947a = m9947a(str);
        Bundle bundle2 = new Bundle();
        Iterator it = xc6VarM9947a.f34160a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iOrdinal = ((rc6) entry.getValue()).ordinal();
            String str2 = iOrdinal != 2 ? iOrdinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((vc6) entry.getKey()).f32527a, str2);
            }
        }
        bundle.putAll(bundle2);
        mr5 mr5VarM9972p0 = m9972p0(str, m9968n0(str), xc6VarM9947a, new w42((byte) 29));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : mr5VarM9972p0.f25175e.entrySet()) {
            int iOrdinal2 = ((rc6) entry2.getValue()).ordinal();
            String str3 = iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((vc6) entry2.getKey()).f32527a, str3);
            }
        }
        Boolean bool = mr5VarM9972p0.f25173c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = mr5VarM9972p0.f25174d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        ar5 ar5Var = this.f28593c;
        m9925S(ar5Var);
        an6 an6VarM3202q0 = ar5Var.m3202q0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (an6VarM3202q0 != null ? an6VarM3202q0.f14649e.equals(1L) : m9929D(str, new w42((byte) 29))) ? "granted" : "denied");
        return bundle;
    }

    /* JADX INFO: renamed from: p */
    public final void m9971p(ArrayList arrayList) {
        y42.m12849V(!arrayList.isEmpty());
        if (this.f28615y != null) {
            mo9019b().f16835j.m12504a("Set uploading progress before finishing the previous upload");
        } else {
            this.f28615y = new ArrayList(arrayList);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final mr5 m9972p0(String str, mr5 mr5Var, xc6 xc6Var, w42 w42Var) {
        vc6 vc6VarM8637F;
        rc6 rc6VarM8652y;
        n96 n96Var = this.f28591a;
        m9925S(n96Var);
        a66 a66VarM8651P = n96Var.m8651P(str);
        int i = 90;
        rc6 rc6Var = rc6.DENIED;
        vc6 vc6Var = vc6.AD_USER_DATA;
        if (a66VarM8651P == null) {
            if (mr5Var.m8388a() == rc6Var) {
                i = mr5Var.f25171a;
                w42Var.m12094y(vc6Var, i);
            } else {
                w42Var.m12095z(vc6Var, sp5.FAILSAFE);
            }
            return new mr5(Boolean.FALSE, i, Boolean.TRUE, "-");
        }
        rc6 rc6VarM8388a = mr5Var.m8388a();
        rc6 rc6Var2 = rc6.GRANTED;
        if (rc6VarM8388a == rc6Var2 || rc6VarM8388a == rc6Var) {
            i = mr5Var.f25171a;
            w42Var.m12094y(vc6Var, i);
        } else {
            rc6 rc6Var3 = rc6.POLICY;
            rc6 rc6Var4 = rc6.UNINITIALIZED;
            if (rc6VarM8388a != rc6Var3 || (rc6VarM8652y = n96Var.m8652y(str, vc6Var)) == rc6Var4) {
                n96Var.mo5038t();
                n96Var.m8638A(str);
                a66 a66VarM8651P2 = n96Var.m8651P(str);
                if (a66VarM8651P2 != null) {
                    Iterator it = a66VarM8651P2.m107p().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            vc6VarM8637F = null;
                            break;
                        }
                        c56 c56Var = (c56) it.next();
                        if (vc6Var == n96.m8637F(c56Var.m3848o())) {
                            vc6VarM8637F = n96.m8637F(c56Var.m3849p());
                            break;
                        }
                    }
                } else {
                    vc6VarM8637F = null;
                    break;
                }
                EnumMap enumMap = xc6Var.f34160a;
                vc6 vc6Var2 = vc6.AD_STORAGE;
                rc6 rc6Var5 = (rc6) enumMap.get(vc6Var2);
                if (rc6Var5 != null) {
                    rc6Var4 = rc6Var5;
                }
                boolean z = rc6Var4 == rc6Var2 || rc6Var4 == rc6Var;
                if (vc6VarM8637F == vc6Var2 && z) {
                    w42Var.m12095z(vc6Var, sp5.REMOTE_DELEGATION);
                    rc6VarM8388a = rc6Var4;
                } else {
                    w42Var.m12095z(vc6Var, sp5.REMOTE_DEFAULT);
                    rc6VarM8388a = true != n96Var.m8650O(str, vc6Var) ? rc6Var : rc6Var2;
                }
            } else {
                w42Var.m12095z(vc6Var, sp5.REMOTE_ENFORCED_DEFAULT);
                rc6VarM8388a = rc6VarM8652y;
            }
        }
        n96Var.mo5038t();
        n96Var.m8638A(str);
        a66 a66VarM8651P3 = n96Var.m8651P(str);
        boolean z2 = a66VarM8651P3 == null || !a66VarM8651P3.m109r() || a66VarM8651P3.m110s();
        m9925S(n96Var);
        n96Var.mo5038t();
        n96Var.m8638A(str);
        TreeSet treeSet = new TreeSet();
        a66 a66VarM8651P4 = n96Var.m8651P(str);
        if (a66VarM8651P4 != null) {
            Iterator it2 = a66VarM8651P4.m108q().iterator();
            while (it2.hasNext()) {
                treeSet.add(((v56) it2.next()).m11752o());
            }
        }
        if (rc6VarM8388a == rc6Var || treeSet.isEmpty()) {
            return new mr5(Boolean.FALSE, i, Boolean.valueOf(z2), "-");
        }
        return new mr5(Boolean.TRUE, i, Boolean.valueOf(z2), z2 ? TextUtils.join("", treeSet) : "");
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01ab A[Catch: all -> 0x0028, TryCatch #4 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00a8, B:24:0x00ae, B:25:0x00b1, B:27:0x00ca, B:28:0x00df, B:30:0x00f0, B:32:0x00f6, B:35:0x010b, B:45:0x012a, B:47:0x012f, B:48:0x0132, B:49:0x0133, B:50:0x0138, B:55:0x017d, B:71:0x01a5, B:73:0x01ab, B:75:0x01b6, B:79:0x01c1, B:80:0x01c4, B:33:0x00fb, B:37:0x010f, B:42:0x0117), top: B:91:0x000e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01b6 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #4 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00a8, B:24:0x00ae, B:25:0x00b1, B:27:0x00ca, B:28:0x00df, B:30:0x00f0, B:32:0x00f6, B:35:0x010b, B:45:0x012a, B:47:0x012f, B:48:0x0132, B:49:0x0133, B:50:0x0138, B:55:0x017d, B:71:0x01a5, B:73:0x01ab, B:75:0x01b6, B:79:0x01c1, B:80:0x01c4, B:33:0x00fb, B:37:0x010f, B:42:0x0117), top: B:91:0x000e, inners: #1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [qm6] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: q */
    public final void m9973q() {
        SQLiteException e;
        z76 z76VarM3212y0;
        mo9020c().mo5038t();
        m9962k0();
        this.f28612v = true;
        try {
            oa6 oa6Var = this.f28602l;
            oa6Var.getClass();
            Boolean bool = oa6Var.m9027n().f26790i;
            if (bool == null) {
                mo9019b().f16838m.m12504a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                mo9019b().f16835j.m12504a("Upload called in the client side when service should be used");
            } else if (this.f28605o > 0) {
                m9936L();
            } else {
                mo9020c().mo5038t();
                if (this.f28615y != null) {
                    mo9019b().f16831L.m12504a("Uploading requested multiple times");
                } else {
                    q76 q76Var = this.f28592b;
                    m9925S(q76Var);
                    if (q76Var.m9785O()) {
                        mo9022e().getClass();
                        ?? CurrentTimeMillis = System.currentTimeMillis();
                        ?? r7 = 0;
                        cursorRawQuery = null;
                        Cursor cursorRawQuery = null;
                        string = null;
                        string = null;
                        String string = null;
                        int iM9223C = m9950d0().m9223C(null, e56.f17794i0);
                        m9950d0();
                        long jLongValue = CurrentTimeMillis - ((Long) e56.f17781e.m4379a(null)).longValue();
                        for (int i = 0; i < iM9223C && m9932G(null, jLongValue); i++) {
                        }
                        ho6.m6466a();
                        mo9020c().mo5038t();
                        m9931F();
                        long jM8623a = this.f28599i.f29366l.m8623a();
                        if (jM8623a != 0) {
                            mo9019b().f16842q.m12505b(Long.valueOf(Math.abs(CurrentTimeMillis - jM8623a)), "Uploading events. Elapsed time since last upload attempt (ms)");
                        }
                        ar5 ar5Var = this.f28593c;
                        m9925S(ar5Var);
                        String strM3162C = ar5Var.m3162C();
                        long j = -1;
                        if (TextUtils.isEmpty(strM3162C)) {
                            try {
                                this.f28581A = -1L;
                                ar5 ar5Var2 = this.f28593c;
                                m9925S(ar5Var2);
                                m9950d0();
                                long jLongValue2 = CurrentTimeMillis - ((Long) e56.f17781e.m4379a(null)).longValue();
                                ar5Var2.mo5038t();
                                ar5Var2.m10368u();
                                try {
                                    CurrentTimeMillis = ar5Var2.m3197l0().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jLongValue2)});
                                    try {
                                        if (CurrentTimeMillis.moveToFirst()) {
                                            string = CurrentTimeMillis.getString(0);
                                        } else {
                                            d76 d76Var = ((oa6) ar5Var2.f36084a).f26514f;
                                            oa6.m9016l(d76Var);
                                            d76Var.f16831L.m12504a("No expired configs for apps with pending events");
                                        }
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        d76 d76Var2 = ((oa6) ar5Var2.f36084a).f26514f;
                                        oa6.m9016l(d76Var2);
                                        d76Var2.f16835j.m12505b(e, "Error selecting expired configs");
                                        if (CurrentTimeMillis != 0) {
                                        }
                                        if (!TextUtils.isEmpty(string)) {
                                            ar5 ar5Var3 = this.f28593c;
                                            m9925S(ar5Var3);
                                            z76VarM3212y0 = ar5Var3.m3212y0(string);
                                            if (z76VarM3212y0 != null) {
                                                m9981y(z76VarM3212y0);
                                            }
                                        }
                                        this.f28612v = false;
                                        m9937M();
                                    }
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    CurrentTimeMillis = 0;
                                } catch (Throwable th) {
                                    th = th;
                                    if (r7 != 0) {
                                        r7.close();
                                    }
                                    throw th;
                                }
                                CurrentTimeMillis.close();
                                if (!TextUtils.isEmpty(string)) {
                                    ar5 ar5Var4 = this.f28593c;
                                    m9925S(ar5Var4);
                                    z76VarM3212y0 = ar5Var4.m3212y0(string);
                                    if (z76VarM3212y0 != null) {
                                        m9981y(z76VarM3212y0);
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r7 = CurrentTimeMillis;
                            }
                        } else {
                            if (this.f28581A == -1) {
                                ar5 ar5Var5 = this.f28593c;
                                m9925S(ar5Var5);
                                try {
                                    try {
                                        cursorRawQuery = ar5Var5.m3197l0().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        if (cursorRawQuery.moveToFirst()) {
                                            j = cursorRawQuery.getLong(0);
                                        }
                                    } catch (SQLiteException e4) {
                                        d76 d76Var3 = ((oa6) ar5Var5.f36084a).f26514f;
                                        oa6.m9016l(d76Var3);
                                        d76Var3.f16835j.m12505b(e4, "Error querying raw events");
                                        if (cursorRawQuery != null) {
                                        }
                                        this.f28581A = j;
                                        m9974r(strM3162C, CurrentTimeMillis);
                                        this.f28612v = false;
                                        m9937M();
                                    }
                                    cursorRawQuery.close();
                                    this.f28581A = j;
                                } catch (Throwable th3) {
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    throw th3;
                                }
                            }
                            m9974r(strM3162C, CurrentTimeMillis);
                        }
                    } else {
                        mo9019b().f16831L.m12504a("Network not connected, ignoring upload request");
                        m9936L();
                    }
                }
            }
            this.f28612v = false;
            m9937M();
        } catch (Throwable th4) {
            this.f28612v = false;
            m9937M();
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0229  */
    /* JADX WARN: Code duplicated, block: B:115:0x0242  */
    /* JADX WARN: Code duplicated, block: B:117:0x0252  */
    /* JADX WARN: Code duplicated, block: B:119:0x025e  */
    /* JADX WARN: Code duplicated, block: B:149:0x037e  */
    /* JADX WARN: Code duplicated, block: B:154:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:179:0x0458 A[LOOP:10: B:155:0x03d8->B:179:0x0458, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:17:0x006f A[PHI: r0 r11 r24
  0x006f: PHI (r0v114 java.util.List) = (r0v8 java.util.List), (r0v136 java.util.List) binds: [B:108:0x021d, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r11v47 android.database.Cursor) = (r11v5 android.database.Cursor), (r11v49 android.database.Cursor) binds: [B:108:0x021d, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r24v7 long) = (r24v2 long), (r24v8 long) binds: [B:108:0x021d, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:180:0x045e  */
    /* JADX WARN: Code duplicated, block: B:191:0x048e  */
    /* JADX WARN: Code duplicated, block: B:195:0x049c  */
    /* JADX WARN: Code duplicated, block: B:197:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:203:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:206:0x0505  */
    /* JADX WARN: Code duplicated, block: B:208:0x051e  */
    /* JADX WARN: Code duplicated, block: B:210:0x0521  */
    /* JADX WARN: Code duplicated, block: B:212:0x0527 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:213:0x0529  */
    /* JADX WARN: Code duplicated, block: B:214:0x052b  */
    /* JADX WARN: Code duplicated, block: B:215:0x052d  */
    /* JADX WARN: Code duplicated, block: B:216:0x052f  */
    /* JADX WARN: Code duplicated, block: B:217:0x0534  */
    /* JADX WARN: Code duplicated, block: B:220:0x0544  */
    /* JADX WARN: Code duplicated, block: B:222:0x0547  */
    /* JADX WARN: Code duplicated, block: B:223:0x0549  */
    /* JADX WARN: Code duplicated, block: B:228:0x0582  */
    /* JADX WARN: Code duplicated, block: B:230:0x0586  */
    /* JADX WARN: Code duplicated, block: B:234:0x058f  */
    /* JADX WARN: Code duplicated, block: B:237:0x059d  */
    /* JADX WARN: Code duplicated, block: B:240:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:245:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:248:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:251:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:255:0x05f3 A[EDGE_INSN: B:255:0x05f3->B:256:0x05f4 BREAK  A[LOOP:3: B:246:0x05c4->B:254:0x05f0]] */
    /* JADX WARN: Code duplicated, block: B:258:0x060f  */
    /* JADX WARN: Code duplicated, block: B:261:0x061b  */
    /* JADX WARN: Code duplicated, block: B:265:0x064a  */
    /* JADX WARN: Code duplicated, block: B:267:0x068b  */
    /* JADX WARN: Code duplicated, block: B:269:0x0697  */
    /* JADX WARN: Code duplicated, block: B:271:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:274:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:276:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:279:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:282:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:283:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:287:0x0714  */
    /* JADX WARN: Code duplicated, block: B:291:0x073c  */
    /* JADX WARN: Code duplicated, block: B:295:0x0751  */
    /* JADX WARN: Code duplicated, block: B:298:0x0764  */
    /* JADX WARN: Code duplicated, block: B:303:0x0782  */
    /* JADX WARN: Code duplicated, block: B:305:0x0798  */
    /* JADX WARN: Code duplicated, block: B:309:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:311:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:314:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:319:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:321:0x0807  */
    /* JADX WARN: Code duplicated, block: B:323:0x0818  */
    /* JADX WARN: Code duplicated, block: B:324:0x081a  */
    /* JADX WARN: Code duplicated, block: B:327:0x081f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:328:0x0821  */
    /* JADX WARN: Code duplicated, block: B:329:0x0823  */
    /* JADX WARN: Code duplicated, block: B:331:0x0827 A[PHI: r9
  0x0827: PHI (r9v8 boolean) = (r9v7 boolean), (r9v13 boolean) binds: [B:326:0x081d, B:328:0x0821] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:334:0x083b  */
    /* JADX WARN: Code duplicated, block: B:340:0x086b  */
    /* JADX WARN: Code duplicated, block: B:343:0x0883  */
    /* JADX WARN: Code duplicated, block: B:347:0x0899 A[LOOP:7: B:345:0x0893->B:347:0x0899, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:350:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:351:0x08da  */
    /* JADX WARN: Code duplicated, block: B:354:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:357:0x0926 A[LOOP:8: B:355:0x0920->B:357:0x0926, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:360:0x0977  */
    /* JADX WARN: Code duplicated, block: B:362:0x09c5  */
    /* JADX WARN: Code duplicated, block: B:364:0x09cd  */
    /* JADX WARN: Code duplicated, block: B:366:0x09da  */
    /* JADX WARN: Code duplicated, block: B:369:0x09e8  */
    /* JADX WARN: Code duplicated, block: B:371:0x09eb  */
    /* JADX WARN: Code duplicated, block: B:374:0x09f8 A[LOOP:9: B:372:0x09f2->B:374:0x09f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:377:0x0a3e  */
    /* JADX WARN: Code duplicated, block: B:379:0x0a60  */
    /* JADX WARN: Code duplicated, block: B:380:0x0a64  */
    /* JADX WARN: Code duplicated, block: B:381:0x0a74  */
    /* JADX WARN: Code duplicated, block: B:384:0x0a84  */
    /* JADX WARN: Code duplicated, block: B:386:0x0a93  */
    /* JADX WARN: Code duplicated, block: B:387:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:442:0x05bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:? A[LOOP:2: B:238:0x05a1->B:444:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x05f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x07ed A[EDGE_INSN: B:447:0x07ed->B:317:0x07ed BREAK  A[LOOP:4: B:263:0x0646->B:316:0x07df], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x07df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:0x0773 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x072e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x0746 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x0850 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x0847 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:? A[LOOP:6: B:332:0x0835->B:459:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x0419 A[EDGE_INSN: B:463:0x0419->B:168:0x0419 BREAK  A[LOOP:10: B:155:0x03d8->B:179:0x0458], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:0x054a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:485:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r33v0, types: [qm6] */
    /* JADX INFO: renamed from: r */
    public final void m9974r(String str, long j) throws Throwable {
        ?? r14;
        long j2;
        Cursor cursorQuery;
        List list;
        List<Pair> list2;
        wm6 wm6Var;
        d56 d56Var;
        boolean zM9225E;
        vc6 vc6Var;
        int i;
        List list3;
        xc6 xc6VarM9947a;
        vc6 vc6Var2;
        int i2;
        List listSubList;
        fa6 fa6VarM9446v;
        int size;
        ArrayList arrayList;
        int i3;
        boolean zM12660i;
        boolean zM12660i2;
        boolean zM9225E2;
        vl6 vl6Var;
        sl6 sl6VarM11932u;
        List list4;
        oa6 oa6Var;
        pa6 pa6Var;
        ArrayList arrayList2;
        ch6 ch6Var;
        boolean z;
        Iterator it;
        String string;
        fa6 fa6VarM9447w;
        String strM8643H;
        ArrayList arrayList3;
        Iterator it2;
        String strM5627h;
        pa6 pa6Var2;
        String str2;
        fa6 fa6Var;
        int i4;
        Intent intent;
        Context contextMo9021d;
        fa6 fa6VarM9446v2;
        String strM8643H2;
        boolean zIsEmpty;
        ch6 ch6Var2;
        ch6 ch6Var3;
        sl6 sl6Var;
        q76 q76Var;
        String strM9791a0;
        qa6 qa6Var;
        String strM11505u;
        int i5;
        ArrayList arrayList4;
        Iterator it3;
        int i6;
        Long lValueOf;
        Long lValueOf2;
        boolean z2;
        boolean z3;
        boolean z4;
        List list5;
        boolean z5;
        m96 m96Var;
        x96 x96VarM9761C;
        x96 x96VarM9761C2;
        nb6 nb6Var;
        Iterator it4;
        String strM11505u2;
        int i7;
        ua6 ua6Var;
        ua6 ua6Var2;
        List list6;
        boolean zIsEmpty2;
        ArrayList arrayList5;
        oa6 oa6Var2;
        ArrayList arrayList6;
        oa6 oa6Var3;
        Cursor cursor;
        Cursor cursorQuery2;
        List list7;
        Iterator it5;
        boolean z6;
        qa6 qa6Var2;
        a66 a66VarM8651P;
        ArrayList arrayList7;
        Iterator it6;
        int iM98o;
        Iterator it7;
        int i8;
        int i9;
        int iM100q;
        SQLiteDatabase sQLiteDatabaseM3197l0;
        long jCurrentTimeMillis;
        ar5 ar5Var;
        long jM9486u;
        long jM9486u2;
        String str3 = str;
        int iM9223C = m9950d0().m9223C(str3, e56.f17790h);
        int i10 = 0;
        int iMax = Math.max(0, m9950d0().m9223C(str3, e56.f17793i));
        ar5 ar5VarM9952f0 = m9952f0();
        oa6 oa6Var4 = (oa6) ar5VarM9952f0.f36084a;
        ar5VarM9952f0.mo5038t();
        ar5VarM9952f0.m10368u();
        int i11 = 1;
        y42.m12849V(iM9223C > 0);
        ?? r11 = iMax > 0 ? 1 : 0;
        y42.m12849V(r11);
        y42.m12851X(str3);
        try {
            try {
                try {
                    j2 = -1;
                    try {
                        cursorQuery = ar5VarM9952f0.m3197l0().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str3}, null, null, "rowid", String.valueOf(iM9223C));
                        try {
                            if (cursorQuery.moveToFirst()) {
                                ArrayList arrayList8 = new ArrayList();
                                int length = 0;
                                while (true) {
                                    long j3 = cursorQuery.getLong(i10);
                                    try {
                                        byte[] blob = cursorQuery.getBlob(i11);
                                        q76 q76VarM9958i0 = ar5VarM9952f0.f19870f.m9958i0();
                                        try {
                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            byte[] bArr = new byte[1024];
                                            ar5Var = ar5VarM9952f0;
                                            while (true) {
                                                try {
                                                    int i12 = gZIPInputStream.read(bArr);
                                                    if (i12 <= 0) {
                                                        break;
                                                    }
                                                    oa6Var4 = oa6Var4;
                                                    try {
                                                        byteArrayOutputStream.write(bArr, 0, i12);
                                                        oa6Var4 = oa6Var4;
                                                    } catch (IOException e) {
                                                        e = e;
                                                    }
                                                } catch (IOException e2) {
                                                    e = e2;
                                                    oa6Var4 = oa6Var4;
                                                }
                                                try {
                                                    ((oa6) q76VarM9958i0.f36084a).mo9019b().f16835j.m12505b(e, "Failed to ungzip content");
                                                    throw e;
                                                } catch (IOException e3) {
                                                    e = e3;
                                                    oa6Var4.mo9019b().f16835j.m12506c("Failed to unzip queued bundle. appId", d76.m4401y(str3), e);
                                                    try {
                                                        if (cursorQuery.moveToNext()) {
                                                            break;
                                                        } else {
                                                            break;
                                                        }
                                                        cursorQuery.close();
                                                        list2 = arrayList8;
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        oa6Var4.mo9019b().f16835j.m12506c("Error querying bundles. appId", d76.m4401y(str3), e);
                                                        list = Collections.EMPTY_LIST;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        list2 = list;
                                                    }
                                                    if (list2.isEmpty()) {
                                                        return;
                                                    }
                                                    wm6Var = wm6.f33509b;
                                                    op5 op5VarM9950d0 = m9950d0();
                                                    d56Var = e56.f17795i1;
                                                    zM9225E = op5VarM9950d0.m9225E(null, d56Var);
                                                    vc6Var = vc6.ANALYTICS_STORAGE;
                                                    if (zM9225E) {
                                                        if (!m9950d0().m9225E(null, d56Var)) {
                                                            i = 34;
                                                            list6 = list2;
                                                        } else if (m9947a(str).m12660i(vc6Var)) {
                                                            i = 34;
                                                            arrayList5 = new ArrayList(list2.size());
                                                            ar5 ar5VarM9952f1 = m9952f0();
                                                            oa6Var2 = (oa6) ar5VarM9952f1.f36084a;
                                                            y42.m12851X(str3);
                                                            ar5VarM9952f1.mo5038t();
                                                            ar5VarM9952f1.m10368u();
                                                            arrayList6 = new ArrayList();
                                                            sQLiteDatabaseM3197l0 = ar5VarM9952f1.m3197l0();
                                                            oa6Var2.mo9022e().getClass();
                                                            jCurrentTimeMillis = System.currentTimeMillis();
                                                            cursorQuery2 = sQLiteDatabaseM3197l0.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                oa6Var3 = oa6Var2;
                                                                while (true) {
                                                                    arrayList6.add((m96) ((l96) q76.m9777k0(m96.m8235y(), cursorQuery2.getBlob(0))).m11056e());
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        cursorQuery2 = cursorQuery2;
                                                                        arrayList6 = arrayList6;
                                                                    }
                                                                }
                                                                cursorQuery2.close();
                                                                int iDelete = sQLiteDatabaseM3197l0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                                                x66 x66Var = oa6Var3.mo9019b().f16831L;
                                                                StringBuilder sb = new StringBuilder(String.valueOf(iDelete).length() + 34);
                                                                sb.append("Pruned ");
                                                                sb.append(iDelete);
                                                                sb.append(" NO_DATA mode events. appId");
                                                                x66Var.m12505b(str3, sb.toString());
                                                            } else {
                                                                arrayList6 = arrayList6;
                                                                cursorQuery2.close();
                                                            }
                                                            list7 = arrayList6;
                                                            it5 = list2.iterator();
                                                            z6 = true;
                                                            while (it5.hasNext()) {
                                                                Pair pair = (Pair) it5.next();
                                                                qa6Var2 = (qa6) ((ua6) pair.first).m13569g();
                                                                if (z6) {
                                                                    List listM9831U = qa6Var2.m9831U();
                                                                    qa6Var2.m11054c();
                                                                    ((ua6) qa6Var2.f31181b).m11443Z();
                                                                    qa6Var2.m11054c();
                                                                    ((ua6) qa6Var2.f31181b).m11440Y(list7);
                                                                    qa6Var2.m11054c();
                                                                    ((ua6) qa6Var2.f31181b).m11440Y(listM9831U);
                                                                    z6 = false;
                                                                }
                                                                u86 u86VarM5618p = f96.m5618p();
                                                                a66VarM8651P = m9951e0().m8651P(str3);
                                                                arrayList7 = new ArrayList();
                                                                if (a66VarM8651P != null) {
                                                                    it6 = a66VarM8651P.m106o().iterator();
                                                                    while (it6.hasNext()) {
                                                                        a56 a56Var = (a56) it6.next();
                                                                        Iterator it8 = it5;
                                                                        a96 a96VarM3516o = b96.m3516o();
                                                                        boolean z7 = z6;
                                                                        iM98o = a56Var.m98o() - 1;
                                                                        List list8 = list7;
                                                                        if (iM98o != 1) {
                                                                            it7 = it6;
                                                                            i8 = 3;
                                                                            i9 = 2;
                                                                        } else if (iM98o != 2) {
                                                                            it7 = it6;
                                                                            i8 = 3;
                                                                            if (iM98o != 3) {
                                                                                i9 = 4;
                                                                            } else if (iM98o != 4) {
                                                                                i9 = 1;
                                                                            } else {
                                                                                i9 = 5;
                                                                            }
                                                                        } else {
                                                                            it7 = it6;
                                                                            i8 = 3;
                                                                            i9 = 3;
                                                                        }
                                                                        a96VarM3516o.m152h(i9);
                                                                        iM100q = a56Var.m100q() - 1;
                                                                        if (iM100q != 1) {
                                                                            i8 = 2;
                                                                        } else if (iM100q != 2) {
                                                                            i8 = 1;
                                                                        }
                                                                        a96VarM3516o.m153i(i8);
                                                                        arrayList7.add((b96) a96VarM3516o.m11056e());
                                                                        it5 = it8;
                                                                        list7 = list8;
                                                                        z6 = z7;
                                                                        it6 = it7;
                                                                    }
                                                                }
                                                                Iterator it9 = it5;
                                                                boolean z8 = z6;
                                                                List list9 = list7;
                                                                u86VarM5618p.m11303h(arrayList7);
                                                                qa6Var2.m9815E(u86VarM5618p);
                                                                arrayList5.add(Pair.create((ua6) qa6Var2.m11056e(), (Long) pair.second));
                                                                it5 = it9;
                                                                list7 = list9;
                                                                z6 = z8;
                                                            }
                                                            list6 = arrayList5;
                                                        } else {
                                                            i = 34;
                                                            arrayList5 = new ArrayList(list2.size());
                                                            ar5 ar5VarM9952f2 = m9952f0();
                                                            oa6Var2 = (oa6) ar5VarM9952f2.f36084a;
                                                            y42.m12851X(str3);
                                                            ar5VarM9952f2.mo5038t();
                                                            ar5VarM9952f2.m10368u();
                                                            arrayList6 = new ArrayList();
                                                            try {
                                                                try {
                                                                    sQLiteDatabaseM3197l0 = ar5VarM9952f2.m3197l0();
                                                                    oa6Var2.mo9022e().getClass();
                                                                    jCurrentTimeMillis = System.currentTimeMillis();
                                                                    cursorQuery2 = sQLiteDatabaseM3197l0.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                                                    try {
                                                                        try {
                                                                            if (cursorQuery2.moveToFirst()) {
                                                                                oa6Var3 = oa6Var2;
                                                                                while (true) {
                                                                                    try {
                                                                                        try {
                                                                                            arrayList6.add((m96) ((l96) q76.m9777k0(m96.m8235y(), cursorQuery2.getBlob(0))).m11056e());
                                                                                        } catch (qi6 e5) {
                                                                                            oa6Var3.mo9019b().f16840o.m12506c("Failed to parse stored NO_DATA mode event, appId", d76.m4401y(str3), e5);
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                                    break;
                                                                                                }
                                                                                                cursorQuery2 = cursorQuery2;
                                                                                                arrayList6 = arrayList6;
                                                                                            } catch (Throwable th) {
                                                                                                th = th;
                                                                                                cursor = cursorQuery2;
                                                                                                if (cursor != null) {
                                                                                                    cursor.close();
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                        } catch (SQLiteException e6) {
                                                                                            e = e6;
                                                                                            oa6Var3.mo9019b().f16835j.m12506c("Error flushing NO_DATA mode events. appId", d76.m4401y(str3), e);
                                                                                            list7 = Collections.EMPTY_LIST;
                                                                                            if (cursorQuery2 != null) {
                                                                                                cursorQuery2.close();
                                                                                            }
                                                                                        }
                                                                                    } catch (SQLiteException e7) {
                                                                                        e = e7;
                                                                                        cursorQuery2 = cursorQuery2;
                                                                                        oa6Var3.mo9019b().f16835j.m12506c("Error flushing NO_DATA mode events. appId", d76.m4401y(str3), e);
                                                                                        list7 = Collections.EMPTY_LIST;
                                                                                        if (cursorQuery2 != null) {
                                                                                            cursorQuery2.close();
                                                                                        }
                                                                                        it5 = list2.iterator();
                                                                                        z6 = true;
                                                                                        while (it5.hasNext()) {
                                                                                            Pair pair2 = (Pair) it5.next();
                                                                                            qa6Var2 = (qa6) ((ua6) pair2.first).m13569g();
                                                                                            if (z6) {
                                                                                                List listM9831U2 = qa6Var2.m9831U();
                                                                                                qa6Var2.m11054c();
                                                                                                ((ua6) qa6Var2.f31181b).m11443Z();
                                                                                                qa6Var2.m11054c();
                                                                                                ((ua6) qa6Var2.f31181b).m11440Y(list7);
                                                                                                qa6Var2.m11054c();
                                                                                                ((ua6) qa6Var2.f31181b).m11440Y(listM9831U2);
                                                                                                z6 = false;
                                                                                            }
                                                                                            u86 u86VarM5618p2 = f96.m5618p();
                                                                                            a66VarM8651P = m9951e0().m8651P(str3);
                                                                                            arrayList7 = new ArrayList();
                                                                                            if (a66VarM8651P != null) {
                                                                                                it6 = a66VarM8651P.m106o().iterator();
                                                                                                while (it6.hasNext()) {
                                                                                                    a56 a56Var2 = (a56) it6.next();
                                                                                                    Iterator it10 = it5;
                                                                                                    a96 a96VarM3516o2 = b96.m3516o();
                                                                                                    boolean z9 = z6;
                                                                                                    iM98o = a56Var2.m98o() - 1;
                                                                                                    List list10 = list7;
                                                                                                    if (iM98o != 1) {
                                                                                                        it7 = it6;
                                                                                                        i8 = 3;
                                                                                                        i9 = 2;
                                                                                                    } else if (iM98o != 2) {
                                                                                                        it7 = it6;
                                                                                                        i8 = 3;
                                                                                                        if (iM98o != 3) {
                                                                                                            i9 = 4;
                                                                                                        } else if (iM98o != 4) {
                                                                                                            i9 = 1;
                                                                                                        } else {
                                                                                                            i9 = 5;
                                                                                                        }
                                                                                                    } else {
                                                                                                        it7 = it6;
                                                                                                        i8 = 3;
                                                                                                        i9 = 3;
                                                                                                    }
                                                                                                    a96VarM3516o2.m152h(i9);
                                                                                                    iM100q = a56Var2.m100q() - 1;
                                                                                                    if (iM100q != 1) {
                                                                                                        i8 = 2;
                                                                                                    } else if (iM100q != 2) {
                                                                                                        i8 = 1;
                                                                                                    }
                                                                                                    a96VarM3516o2.m153i(i8);
                                                                                                    arrayList7.add((b96) a96VarM3516o2.m11056e());
                                                                                                    it5 = it10;
                                                                                                    list7 = list10;
                                                                                                    z6 = z9;
                                                                                                    it6 = it7;
                                                                                                }
                                                                                            }
                                                                                            Iterator it11 = it5;
                                                                                            boolean z10 = z6;
                                                                                            List list11 = list7;
                                                                                            u86VarM5618p2.m11303h(arrayList7);
                                                                                            qa6Var2.m9815E(u86VarM5618p2);
                                                                                            arrayList5.add(Pair.create((ua6) qa6Var2.m11056e(), (Long) pair2.second));
                                                                                            it5 = it11;
                                                                                            list7 = list11;
                                                                                            z6 = z10;
                                                                                        }
                                                                                        list6 = arrayList5;
                                                                                        zIsEmpty2 = list6.isEmpty();
                                                                                        list3 = list6;
                                                                                        if (zIsEmpty2) {
                                                                                            return;
                                                                                        }
                                                                                        xc6VarM9947a = m9947a(str);
                                                                                        vc6Var2 = vc6.AD_STORAGE;
                                                                                        if (xc6VarM9947a.m12660i(vc6Var2)) {
                                                                                            i2 = 0;
                                                                                            listSubList = list3;
                                                                                            break;
                                                                                        }
                                                                                        it4 = list3.iterator();
                                                                                        while (true) {
                                                                                            if (it4.hasNext()) {
                                                                                                strM11505u2 = null;
                                                                                                break;
                                                                                            }
                                                                                            ua6Var2 = (ua6) ((Pair) it4.next()).first;
                                                                                            if (!ua6Var2.m11505u().isEmpty()) {
                                                                                                strM11505u2 = ua6Var2.m11505u();
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        if (strM11505u2 != null) {
                                                                                            i2 = 0;
                                                                                            listSubList = list3;
                                                                                            break;
                                                                                        }
                                                                                        i7 = 0;
                                                                                        while (true) {
                                                                                            if (i7 < list3.size()) {
                                                                                                i2 = 0;
                                                                                                listSubList = list3;
                                                                                                break;
                                                                                            }
                                                                                            ua6Var = (ua6) ((Pair) list3.get(i7)).first;
                                                                                            if (!ua6Var.m11505u().isEmpty()) {
                                                                                                i2 = 0;
                                                                                                listSubList = list3.subList(0, i7);
                                                                                                break;
                                                                                            }
                                                                                            i7++;
                                                                                        }
                                                                                        fa6VarM9446v = pa6.m9446v();
                                                                                        size = listSubList.size();
                                                                                        arrayList = new ArrayList(listSubList.size());
                                                                                        if (m9950d0().m9231u(str3)) {
                                                                                            i3 = i2;
                                                                                        } else {
                                                                                            i3 = i2;
                                                                                        }
                                                                                        zM12660i = m9947a(str).m12660i(vc6Var2);
                                                                                        zM12660i2 = m9947a(str).m12660i(vc6Var);
                                                                                        zM9225E2 = m9950d0().m9225E(str3, e56.f17742M0);
                                                                                        vl6Var = this.f28600j;
                                                                                        sl6VarM11932u = vl6Var.m11932u(str3);
                                                                                        list4 = listSubList;
                                                                                        while (true) {
                                                                                            oa6Var = this.f28602l;
                                                                                            if (i2 < size) {
                                                                                                break;
                                                                                            }
                                                                                            qa6Var = (qa6) ((ua6) ((Pair) list4.get(i2)).first).m13569g();
                                                                                            int i13 = size;
                                                                                            arrayList.add((Long) ((Pair) list4.get(i2)).second);
                                                                                            m9950d0().m9235z();
                                                                                            qa6Var.m9852s();
                                                                                            qa6Var.m11054c();
                                                                                            ((ua6) qa6Var.f31181b).m11458e0(j);
                                                                                            oa6Var.getClass();
                                                                                            qa6Var.m9819I();
                                                                                            if (i3 == 0) {
                                                                                                qa6Var.m11054c();
                                                                                                ((ua6) qa6Var.f31181b).m11422R0();
                                                                                            }
                                                                                            if (!zM12660i) {
                                                                                                qa6Var.m11054c();
                                                                                                ((ua6) qa6Var.f31181b).m11519y1();
                                                                                                qa6Var.m11054c();
                                                                                                ((ua6) qa6Var.f31181b).m11372A1();
                                                                                            }
                                                                                            if (!zM12660i2) {
                                                                                                qa6Var.m11054c();
                                                                                                ((ua6) qa6Var.f31181b).m11378C1();
                                                                                            }
                                                                                            m9978v(str3, qa6Var);
                                                                                            if (!zM9225E2) {
                                                                                                qa6Var.m11054c();
                                                                                                ((ua6) qa6Var.f31181b).m11441Y0();
                                                                                            }
                                                                                            if (!zM12660i2) {
                                                                                                qa6Var.m11054c();
                                                                                                ((ua6) qa6Var.f31181b).m11402K1();
                                                                                            }
                                                                                            strM11505u = ((ua6) qa6Var.f31181b).m11505u();
                                                                                            if (TextUtils.isEmpty(strM11505u)) {
                                                                                                i5 = i3;
                                                                                            } else {
                                                                                                i5 = i3;
                                                                                                if (strM11505u.equals("00000000-0000-0000-0000-000000000000")) {
                                                                                                    i6 = i2;
                                                                                                    z4 = zM12660i2;
                                                                                                    list5 = list4;
                                                                                                    z5 = zM9225E2;
                                                                                                }
                                                                                                if (qa6Var.m9832V() != 0) {
                                                                                                    if (m9950d0().m9225E(str3, e56.f17722C0)) {
                                                                                                        qa6Var.m9826P(m9958i0().m9796i0(((ua6) qa6Var.m11056e()).m5118a()));
                                                                                                    }
                                                                                                    nb6Var = sl6VarM11932u.f30381d;
                                                                                                    if (nb6Var != null) {
                                                                                                        qa6Var.m9812B(nb6Var);
                                                                                                    }
                                                                                                    fa6VarM9446v.m11054c();
                                                                                                    ((pa6) fa6VarM9446v.f31181b).m9460y((ua6) qa6Var.m11056e());
                                                                                                }
                                                                                                i2 = i6 + 1;
                                                                                                i3 = i5;
                                                                                                size = i13;
                                                                                                list4 = list5;
                                                                                                zM12660i2 = z4;
                                                                                                zM9225E2 = z5;
                                                                                            }
                                                                                            arrayList4 = new ArrayList(qa6Var.m9831U());
                                                                                            it3 = arrayList4.iterator();
                                                                                            i6 = i2;
                                                                                            lValueOf = null;
                                                                                            lValueOf2 = null;
                                                                                            z2 = false;
                                                                                            z3 = false;
                                                                                            while (it3.hasNext()) {
                                                                                                zM12660i2 = zM12660i2;
                                                                                                m96Var = (m96) it3.next();
                                                                                                list4 = list4;
                                                                                                zM9225E2 = zM9225E2;
                                                                                                if ("_fx".equals(m96Var.m8247r())) {
                                                                                                    it3.remove();
                                                                                                    z2 = true;
                                                                                                } else if ("_f".equals(m96Var.m8247r())) {
                                                                                                    m9958i0();
                                                                                                    x96VarM9761C = q76.m9761C("_pfo", m96Var);
                                                                                                    if (x96VarM9761C != null) {
                                                                                                        lValueOf = Long.valueOf(x96VarM9761C.m12551t());
                                                                                                    }
                                                                                                    m9958i0();
                                                                                                    x96VarM9761C2 = q76.m9761C("_uwa", m96Var);
                                                                                                    if (x96VarM9761C2 != null) {
                                                                                                        lValueOf2 = Long.valueOf(x96VarM9761C2.m12551t());
                                                                                                    }
                                                                                                } else {
                                                                                                    list4 = list4;
                                                                                                    zM12660i2 = zM12660i2;
                                                                                                    zM9225E2 = zM9225E2;
                                                                                                }
                                                                                                z3 = true;
                                                                                            }
                                                                                            z4 = zM12660i2;
                                                                                            list5 = list4;
                                                                                            z5 = zM9225E2;
                                                                                            if (z2) {
                                                                                                qa6Var.m11054c();
                                                                                                ((ua6) qa6Var.f31181b).m11443Z();
                                                                                                qa6Var.m11054c();
                                                                                                ((ua6) qa6Var.f31181b).m11440Y(arrayList4);
                                                                                            }
                                                                                            if (z3) {
                                                                                                m9977u(qa6Var.m9848o(), true, lValueOf, lValueOf2);
                                                                                            }
                                                                                            if (qa6Var.m9832V() != 0) {
                                                                                                if (m9950d0().m9225E(str3, e56.f17722C0)) {
                                                                                                    qa6Var.m9826P(m9958i0().m9796i0(((ua6) qa6Var.m11056e()).m5118a()));
                                                                                                }
                                                                                                nb6Var = sl6VarM11932u.f30381d;
                                                                                                if (nb6Var != null) {
                                                                                                    qa6Var.m9812B(nb6Var);
                                                                                                }
                                                                                                fa6VarM9446v.m11054c();
                                                                                                ((pa6) fa6VarM9446v.f31181b).m9460y((ua6) qa6Var.m11056e());
                                                                                            }
                                                                                            i2 = i6 + 1;
                                                                                            i3 = i5;
                                                                                            size = i13;
                                                                                            list4 = list5;
                                                                                            zM12660i2 = z4;
                                                                                            zM9225E2 = z5;
                                                                                        }
                                                                                        if (((pa6) fa6VarM9446v.f31181b).m9453p() == 0) {
                                                                                            m9971p(arrayList);
                                                                                            m9980x(false, 204, null, null, str3, Collections.EMPTY_LIST);
                                                                                            return;
                                                                                        }
                                                                                        pa6Var = (pa6) fa6VarM9446v.m11056e();
                                                                                        arrayList2 = new ArrayList();
                                                                                        ch6Var = sl6VarM11932u.f30380c;
                                                                                        if (ch6Var == ch6.f16035e) {
                                                                                            z = true;
                                                                                        } else {
                                                                                            z = false;
                                                                                        }
                                                                                        if (ch6Var == ch6.f16034d) {
                                                                                            it = ((pa6) fa6VarM9446v.m11056e()).m9452o().iterator();
                                                                                            while (true) {
                                                                                                if (it.hasNext()) {
                                                                                                    if (((ua6) it.next()).m11406M()) {
                                                                                                        string = UUID.randomUUID().toString();
                                                                                                        break;
                                                                                                    }
                                                                                                } else {
                                                                                                    string = null;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            pa6 pa6Var3 = (pa6) fa6VarM9446v.m11056e();
                                                                                            mo9020c().mo5038t();
                                                                                            m9962k0();
                                                                                            fa6VarM9447w = pa6.m9447w(pa6Var3);
                                                                                            if (!TextUtils.isEmpty(string)) {
                                                                                                fa6VarM9447w.m11054c();
                                                                                                ((pa6) fa6VarM9447w.f31181b).m9449B(string);
                                                                                            }
                                                                                            strM8643H = m9951e0().m8643H(str3);
                                                                                            if (!TextUtils.isEmpty(strM8643H)) {
                                                                                                fa6VarM9447w.m5628i(strM8643H);
                                                                                            }
                                                                                            arrayList3 = new ArrayList();
                                                                                            it2 = pa6Var3.m9452o().iterator();
                                                                                            while (it2.hasNext()) {
                                                                                                qa6 qa6VarM11369U = ua6.m11369U((ua6) it2.next());
                                                                                                qa6VarM11369U.m11054c();
                                                                                                ((ua6) qa6VarM11369U.f31181b).m11422R0();
                                                                                                arrayList3.add((ua6) qa6VarM11369U.m11056e());
                                                                                            }
                                                                                            fa6VarM9447w.m11054c();
                                                                                            ((pa6) fa6VarM9447w.f31181b).m9448A();
                                                                                            fa6VarM9447w.m11054c();
                                                                                            ((pa6) fa6VarM9447w.f31181b).m9461z(arrayList3);
                                                                                            x66 x66Var2 = mo9019b().f16831L;
                                                                                            if (TextUtils.isEmpty(string)) {
                                                                                                strM5627h = "null";
                                                                                            } else {
                                                                                                strM5627h = fa6VarM9447w.m5627h();
                                                                                            }
                                                                                            x66Var2.m12505b(strM5627h, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                                                                                            pa6Var2 = (pa6) fa6VarM9447w.m11056e();
                                                                                            if (TextUtils.isEmpty(string)) {
                                                                                                str2 = null;
                                                                                            } else {
                                                                                                pa6 pa6Var4 = (pa6) fa6VarM9446v.m11056e();
                                                                                                mo9020c().mo5038t();
                                                                                                m9962k0();
                                                                                                fa6VarM9446v2 = pa6.m9446v();
                                                                                                mo9019b().f16831L.m12505b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                                                                                fa6VarM9446v2.m11054c();
                                                                                                ((pa6) fa6VarM9446v2.f31181b).m9449B(string);
                                                                                                for (ua6 ua6Var3 : pa6Var4.m9452o()) {
                                                                                                    qa6 qa6VarM11368T = ua6.m11368T();
                                                                                                    String strM11409N = ua6Var3.m11409N();
                                                                                                    qa6VarM11368T.m11054c();
                                                                                                    ((ua6) qa6VarM11368T.f31181b).m11419Q0(strM11409N);
                                                                                                    int iM11398J0 = ua6Var3.m11398J0();
                                                                                                    qa6VarM11368T.m11054c();
                                                                                                    ((ua6) qa6VarM11368T.f31181b).m11471i1(iM11398J0);
                                                                                                    fa6VarM9446v2.m11054c();
                                                                                                    ((pa6) fa6VarM9446v2.f31181b).m9460y((ua6) qa6VarM11368T.m11056e());
                                                                                                }
                                                                                                pa6 pa6Var5 = (pa6) fa6VarM9446v2.m11056e();
                                                                                                strM8643H2 = vl6Var.f19870f.m9951e0().m8643H(str3);
                                                                                                zIsEmpty = TextUtils.isEmpty(strM8643H2);
                                                                                                ch6Var2 = ch6.f16033c;
                                                                                                ch6Var3 = ch6.f16036f;
                                                                                                if (zIsEmpty) {
                                                                                                    str2 = null;
                                                                                                    String str4 = (String) e56.f17815s.m4379a(null);
                                                                                                    if (z) {
                                                                                                        ch6Var2 = ch6Var3;
                                                                                                    }
                                                                                                    sl6Var = new sl6(str4, Collections.EMPTY_MAP, ch6Var2, null);
                                                                                                } else {
                                                                                                    Uri uri = Uri.parse((String) e56.f17815s.m4379a(null));
                                                                                                    Uri.Builder builderBuildUpon = uri.buildUpon();
                                                                                                    String authority = uri.getAuthority();
                                                                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(strM8643H2).length() + 1 + String.valueOf(authority).length());
                                                                                                    sb2.append(strM8643H2);
                                                                                                    sb2.append(".");
                                                                                                    sb2.append(authority);
                                                                                                    builderBuildUpon.authority(sb2.toString());
                                                                                                    String string2 = builderBuildUpon.build().toString();
                                                                                                    if (z) {
                                                                                                        ch6Var2 = ch6Var3;
                                                                                                    }
                                                                                                    str2 = null;
                                                                                                    sl6Var = new sl6(string2, Collections.EMPTY_MAP, ch6Var2, null);
                                                                                                }
                                                                                                arrayList2.add(Pair.create(pa6Var5, sl6Var));
                                                                                            }
                                                                                            if (z) {
                                                                                                fa6Var = (fa6) pa6Var2.m13569g();
                                                                                                for (i4 = 0; i4 < pa6Var2.m9453p(); i4++) {
                                                                                                    qa6 qa6Var3 = (qa6) pa6Var2.m9454q(i4).m13569g();
                                                                                                    qa6Var3.m9838b0();
                                                                                                    qa6Var3.m9813C(j);
                                                                                                    fa6Var.m11054c();
                                                                                                    ((pa6) fa6Var.f31181b).m9459x(i4, (ua6) qa6Var3.m11056e());
                                                                                                }
                                                                                                arrayList2.add(Pair.create((pa6) fa6Var.m11056e(), sl6VarM11932u));
                                                                                                m9971p(arrayList);
                                                                                                m9980x(false, 204, null, null, str, arrayList2);
                                                                                                if (m9975s(str, sl6VarM11932u.f30378a)) {
                                                                                                    mo9019b().f16831L.m12505b(str, "[sgtm] Sending sgtm batches available notification to app");
                                                                                                    intent = new Intent();
                                                                                                    intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                                                                    intent.setPackage(str);
                                                                                                    contextMo9021d = oa6Var.mo9021d();
                                                                                                    if (Build.VERSION.SDK_INT < i) {
                                                                                                        contextMo9021d.sendBroadcast(intent);
                                                                                                        return;
                                                                                                    } else {
                                                                                                        contextMo9021d.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            str3 = str;
                                                                                            pa6Var = pa6Var2;
                                                                                        } else if (z) {
                                                                                            z = true;
                                                                                            it = ((pa6) fa6VarM9446v.m11056e()).m9452o().iterator();
                                                                                            while (true) {
                                                                                                if (it.hasNext()) {
                                                                                                    if (((ua6) it.next()).m11406M()) {
                                                                                                        string = UUID.randomUUID().toString();
                                                                                                        break;
                                                                                                    }
                                                                                                } else {
                                                                                                    string = null;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            pa6 pa6Var6 = (pa6) fa6VarM9446v.m11056e();
                                                                                            mo9020c().mo5038t();
                                                                                            m9962k0();
                                                                                            fa6VarM9447w = pa6.m9447w(pa6Var6);
                                                                                            if (!TextUtils.isEmpty(string)) {
                                                                                                fa6VarM9447w.m11054c();
                                                                                                ((pa6) fa6VarM9447w.f31181b).m9449B(string);
                                                                                            }
                                                                                            strM8643H = m9951e0().m8643H(str3);
                                                                                            if (!TextUtils.isEmpty(strM8643H)) {
                                                                                                fa6VarM9447w.m5628i(strM8643H);
                                                                                            }
                                                                                            arrayList3 = new ArrayList();
                                                                                            it2 = pa6Var6.m9452o().iterator();
                                                                                            while (it2.hasNext()) {
                                                                                                qa6 qa6VarM11369U2 = ua6.m11369U((ua6) it2.next());
                                                                                                qa6VarM11369U2.m11054c();
                                                                                                ((ua6) qa6VarM11369U2.f31181b).m11422R0();
                                                                                                arrayList3.add((ua6) qa6VarM11369U2.m11056e());
                                                                                            }
                                                                                            fa6VarM9447w.m11054c();
                                                                                            ((pa6) fa6VarM9447w.f31181b).m9448A();
                                                                                            fa6VarM9447w.m11054c();
                                                                                            ((pa6) fa6VarM9447w.f31181b).m9461z(arrayList3);
                                                                                            x66 x66Var3 = mo9019b().f16831L;
                                                                                            if (TextUtils.isEmpty(string)) {
                                                                                                strM5627h = "null";
                                                                                            } else {
                                                                                                strM5627h = fa6VarM9447w.m5627h();
                                                                                            }
                                                                                            x66Var3.m12505b(strM5627h, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                                                                                            pa6Var2 = (pa6) fa6VarM9447w.m11056e();
                                                                                            if (TextUtils.isEmpty(string)) {
                                                                                                pa6 pa6Var7 = (pa6) fa6VarM9446v.m11056e();
                                                                                                mo9020c().mo5038t();
                                                                                                m9962k0();
                                                                                                fa6VarM9446v2 = pa6.m9446v();
                                                                                                mo9019b().f16831L.m12505b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                                                                                fa6VarM9446v2.m11054c();
                                                                                                ((pa6) fa6VarM9446v2.f31181b).m9449B(string);
                                                                                                while (r0.hasNext()) {
                                                                                                    qa6 qa6VarM11368T2 = ua6.m11368T();
                                                                                                    String strM11409N2 = ua6Var3.m11409N();
                                                                                                    qa6VarM11368T2.m11054c();
                                                                                                    ((ua6) qa6VarM11368T2.f31181b).m11419Q0(strM11409N2);
                                                                                                    int iM11398J1 = ua6Var3.m11398J0();
                                                                                                    qa6VarM11368T2.m11054c();
                                                                                                    ((ua6) qa6VarM11368T2.f31181b).m11471i1(iM11398J1);
                                                                                                    fa6VarM9446v2.m11054c();
                                                                                                    ((pa6) fa6VarM9446v2.f31181b).m9460y((ua6) qa6VarM11368T2.m11056e());
                                                                                                }
                                                                                                pa6 pa6Var8 = (pa6) fa6VarM9446v2.m11056e();
                                                                                                strM8643H2 = vl6Var.f19870f.m9951e0().m8643H(str3);
                                                                                                zIsEmpty = TextUtils.isEmpty(strM8643H2);
                                                                                                ch6Var2 = ch6.f16033c;
                                                                                                ch6Var3 = ch6.f16036f;
                                                                                                if (zIsEmpty) {
                                                                                                    Uri uri2 = Uri.parse((String) e56.f17815s.m4379a(null));
                                                                                                    Uri.Builder builderBuildUpon2 = uri2.buildUpon();
                                                                                                    String authority2 = uri2.getAuthority();
                                                                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(strM8643H2).length() + 1 + String.valueOf(authority2).length());
                                                                                                    sb3.append(strM8643H2);
                                                                                                    sb3.append(".");
                                                                                                    sb3.append(authority2);
                                                                                                    builderBuildUpon2.authority(sb3.toString());
                                                                                                    String string3 = builderBuildUpon2.build().toString();
                                                                                                    if (z) {
                                                                                                        ch6Var2 = ch6Var3;
                                                                                                    }
                                                                                                    str2 = null;
                                                                                                    sl6Var = new sl6(string3, Collections.EMPTY_MAP, ch6Var2, null);
                                                                                                } else {
                                                                                                    str2 = null;
                                                                                                    String str5 = (String) e56.f17815s.m4379a(null);
                                                                                                    if (z) {
                                                                                                        ch6Var2 = ch6Var3;
                                                                                                    }
                                                                                                    sl6Var = new sl6(str5, Collections.EMPTY_MAP, ch6Var2, null);
                                                                                                }
                                                                                                arrayList2.add(Pair.create(pa6Var8, sl6Var));
                                                                                            } else {
                                                                                                str2 = null;
                                                                                            }
                                                                                            if (z) {
                                                                                                fa6Var = (fa6) pa6Var2.m13569g();
                                                                                                while (i4 < pa6Var2.m9453p()) {
                                                                                                    qa6 qa6Var4 = (qa6) pa6Var2.m9454q(i4).m13569g();
                                                                                                    qa6Var4.m9838b0();
                                                                                                    qa6Var4.m9813C(j);
                                                                                                    fa6Var.m11054c();
                                                                                                    ((pa6) fa6Var.f31181b).m9459x(i4, (ua6) qa6Var4.m11056e());
                                                                                                }
                                                                                                arrayList2.add(Pair.create((pa6) fa6Var.m11056e(), sl6VarM11932u));
                                                                                                m9971p(arrayList);
                                                                                                m9980x(false, 204, null, null, str, arrayList2);
                                                                                                if (m9975s(str, sl6VarM11932u.f30378a)) {
                                                                                                    mo9019b().f16831L.m12505b(str, "[sgtm] Sending sgtm batches available notification to app");
                                                                                                    intent = new Intent();
                                                                                                    intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                                                                    intent.setPackage(str);
                                                                                                    contextMo9021d = oa6Var.mo9021d();
                                                                                                    if (Build.VERSION.SDK_INT < i) {
                                                                                                        contextMo9021d.sendBroadcast(intent);
                                                                                                        return;
                                                                                                    } else {
                                                                                                        contextMo9021d.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            str3 = str;
                                                                                            pa6Var = pa6Var2;
                                                                                        } else {
                                                                                            str2 = null;
                                                                                        }
                                                                                        q76Var = this.f28592b;
                                                                                        m9925S(q76Var);
                                                                                        if (q76Var.m9785O()) {
                                                                                            if (Log.isLoggable(mo9019b().m4402A(), 2)) {
                                                                                                strM9791a0 = m9958i0().m9791a0(pa6Var);
                                                                                            } else {
                                                                                                strM9791a0 = str2;
                                                                                            }
                                                                                            m9958i0();
                                                                                            byte[] bArrM5118a = pa6Var.m5118a();
                                                                                            m9971p(arrayList);
                                                                                            this.f28599i.f29367m.m8624b(j);
                                                                                            mo9019b().f16831L.m12507d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrM5118a.length), strM9791a0);
                                                                                            this.f28611u = true;
                                                                                            m9925S(q76Var);
                                                                                            q76Var.m9786V(str3, sl6VarM11932u, pa6Var, new tt2((qm6) this, str3, arrayList2));
                                                                                        }
                                                                                    }
                                                                                }
                                                                                cursorQuery2.close();
                                                                                try {
                                                                                    int iDelete2 = sQLiteDatabaseM3197l0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                                                                    x66 x66Var4 = oa6Var3.mo9019b().f16831L;
                                                                                    StringBuilder sb4 = new StringBuilder(String.valueOf(iDelete2).length() + 34);
                                                                                    sb4.append("Pruned ");
                                                                                    sb4.append(iDelete2);
                                                                                    sb4.append(" NO_DATA mode events. appId");
                                                                                    x66Var4.m12505b(str3, sb4.toString());
                                                                                } catch (SQLiteException e8) {
                                                                                    e = e8;
                                                                                    cursorQuery2 = null;
                                                                                    oa6Var3.mo9019b().f16835j.m12506c("Error flushing NO_DATA mode events. appId", d76.m4401y(str3), e);
                                                                                    list7 = Collections.EMPTY_LIST;
                                                                                    if (cursorQuery2 != null) {
                                                                                        cursorQuery2.close();
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                arrayList6 = arrayList6;
                                                                                cursorQuery2.close();
                                                                            }
                                                                            list7 = arrayList6;
                                                                        } catch (SQLiteException e9) {
                                                                            e = e9;
                                                                            cursorQuery2 = cursorQuery2;
                                                                            oa6Var3 = oa6Var2;
                                                                        }
                                                                        it5 = list2.iterator();
                                                                        z6 = true;
                                                                        while (it5.hasNext()) {
                                                                            Pair pair3 = (Pair) it5.next();
                                                                            qa6Var2 = (qa6) ((ua6) pair3.first).m13569g();
                                                                            if (z6) {
                                                                                List listM9831U3 = qa6Var2.m9831U();
                                                                                qa6Var2.m11054c();
                                                                                ((ua6) qa6Var2.f31181b).m11443Z();
                                                                                qa6Var2.m11054c();
                                                                                ((ua6) qa6Var2.f31181b).m11440Y(list7);
                                                                                qa6Var2.m11054c();
                                                                                ((ua6) qa6Var2.f31181b).m11440Y(listM9831U3);
                                                                                z6 = false;
                                                                            }
                                                                            u86 u86VarM5618p3 = f96.m5618p();
                                                                            a66VarM8651P = m9951e0().m8651P(str3);
                                                                            arrayList7 = new ArrayList();
                                                                            if (a66VarM8651P != null) {
                                                                                it6 = a66VarM8651P.m106o().iterator();
                                                                                while (it6.hasNext()) {
                                                                                    a56 a56Var3 = (a56) it6.next();
                                                                                    Iterator it12 = it5;
                                                                                    a96 a96VarM3516o3 = b96.m3516o();
                                                                                    boolean z11 = z6;
                                                                                    iM98o = a56Var3.m98o() - 1;
                                                                                    List list12 = list7;
                                                                                    if (iM98o != 1) {
                                                                                        it7 = it6;
                                                                                        i8 = 3;
                                                                                        i9 = 2;
                                                                                    } else if (iM98o != 2) {
                                                                                        it7 = it6;
                                                                                        i8 = 3;
                                                                                        if (iM98o != 3) {
                                                                                            i9 = 4;
                                                                                        } else if (iM98o != 4) {
                                                                                            i9 = 1;
                                                                                        } else {
                                                                                            i9 = 5;
                                                                                        }
                                                                                    } else {
                                                                                        it7 = it6;
                                                                                        i8 = 3;
                                                                                        i9 = 3;
                                                                                    }
                                                                                    a96VarM3516o3.m152h(i9);
                                                                                    iM100q = a56Var3.m100q() - 1;
                                                                                    if (iM100q != 1) {
                                                                                        i8 = 2;
                                                                                    } else if (iM100q != 2) {
                                                                                        i8 = 1;
                                                                                    }
                                                                                    a96VarM3516o3.m153i(i8);
                                                                                    arrayList7.add((b96) a96VarM3516o3.m11056e());
                                                                                    it5 = it12;
                                                                                    list7 = list12;
                                                                                    z6 = z11;
                                                                                    it6 = it7;
                                                                                }
                                                                            }
                                                                            Iterator it13 = it5;
                                                                            boolean z12 = z6;
                                                                            List list13 = list7;
                                                                            u86VarM5618p3.m11303h(arrayList7);
                                                                            qa6Var2.m9815E(u86VarM5618p3);
                                                                            arrayList5.add(Pair.create((ua6) qa6Var2.m11056e(), (Long) pair3.second));
                                                                            it5 = it13;
                                                                            list7 = list13;
                                                                            z6 = z12;
                                                                        }
                                                                        list6 = arrayList5;
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        cursorQuery2 = cursorQuery2;
                                                                        cursor = cursorQuery2;
                                                                        if (cursor != null) {
                                                                            cursor.close();
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (SQLiteException e10) {
                                                                    e = e10;
                                                                    oa6Var3 = oa6Var2;
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                cursor = null;
                                                                if (cursor != null) {
                                                                    cursor.close();
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        zIsEmpty2 = list6.isEmpty();
                                                        list3 = list6;
                                                        if (zIsEmpty2) {
                                                            return;
                                                        }
                                                    } else {
                                                        i = 34;
                                                        list3 = list2;
                                                    }
                                                    xc6VarM9947a = m9947a(str);
                                                    vc6Var2 = vc6.AD_STORAGE;
                                                    if (xc6VarM9947a.m12660i(vc6Var2)) {
                                                        i2 = 0;
                                                        listSubList = list3;
                                                        break;
                                                    }
                                                    it4 = list3.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            strM11505u2 = null;
                                                            break;
                                                        }
                                                        ua6Var2 = (ua6) ((Pair) it4.next()).first;
                                                        if (!ua6Var2.m11505u().isEmpty()) {
                                                            strM11505u2 = ua6Var2.m11505u();
                                                            break;
                                                        }
                                                    }
                                                    if (strM11505u2 != null) {
                                                        i2 = 0;
                                                        listSubList = list3;
                                                        break;
                                                    }
                                                    i7 = 0;
                                                    while (true) {
                                                        if (i7 < list3.size()) {
                                                            i2 = 0;
                                                            listSubList = list3;
                                                            break;
                                                        }
                                                        ua6Var = (ua6) ((Pair) list3.get(i7)).first;
                                                        if (!ua6Var.m11505u().isEmpty()) {
                                                            i2 = 0;
                                                            listSubList = list3.subList(0, i7);
                                                            break;
                                                        }
                                                        i7++;
                                                    }
                                                    fa6VarM9446v = pa6.m9446v();
                                                    size = listSubList.size();
                                                    arrayList = new ArrayList(listSubList.size());
                                                    if (m9950d0().m9231u(str3)) {
                                                        i3 = i2;
                                                    } else {
                                                        i3 = i2;
                                                    }
                                                    zM12660i = m9947a(str).m12660i(vc6Var2);
                                                    zM12660i2 = m9947a(str).m12660i(vc6Var);
                                                    zM9225E2 = m9950d0().m9225E(str3, e56.f17742M0);
                                                    vl6Var = this.f28600j;
                                                    sl6VarM11932u = vl6Var.m11932u(str3);
                                                    list4 = listSubList;
                                                    while (true) {
                                                        oa6Var = this.f28602l;
                                                        if (i2 < size) {
                                                            break;
                                                            break;
                                                        }
                                                        qa6Var = (qa6) ((ua6) ((Pair) list4.get(i2)).first).m13569g();
                                                        int i14 = size;
                                                        arrayList.add((Long) ((Pair) list4.get(i2)).second);
                                                        m9950d0().m9235z();
                                                        qa6Var.m9852s();
                                                        qa6Var.m11054c();
                                                        ((ua6) qa6Var.f31181b).m11458e0(j);
                                                        oa6Var.getClass();
                                                        qa6Var.m9819I();
                                                        if (i3 == 0) {
                                                            qa6Var.m11054c();
                                                            ((ua6) qa6Var.f31181b).m11422R0();
                                                        }
                                                        if (!zM12660i) {
                                                            qa6Var.m11054c();
                                                            ((ua6) qa6Var.f31181b).m11519y1();
                                                            qa6Var.m11054c();
                                                            ((ua6) qa6Var.f31181b).m11372A1();
                                                        }
                                                        if (!zM12660i2) {
                                                            qa6Var.m11054c();
                                                            ((ua6) qa6Var.f31181b).m11378C1();
                                                        }
                                                        m9978v(str3, qa6Var);
                                                        if (!zM9225E2) {
                                                            qa6Var.m11054c();
                                                            ((ua6) qa6Var.f31181b).m11441Y0();
                                                        }
                                                        if (!zM12660i2) {
                                                            qa6Var.m11054c();
                                                            ((ua6) qa6Var.f31181b).m11402K1();
                                                        }
                                                        strM11505u = ((ua6) qa6Var.f31181b).m11505u();
                                                        if (TextUtils.isEmpty(strM11505u)) {
                                                            i5 = i3;
                                                            if (strM11505u.equals("00000000-0000-0000-0000-000000000000")) {
                                                                i6 = i2;
                                                                z4 = zM12660i2;
                                                                list5 = list4;
                                                                z5 = zM9225E2;
                                                            }
                                                            if (qa6Var.m9832V() != 0) {
                                                                if (m9950d0().m9225E(str3, e56.f17722C0)) {
                                                                    qa6Var.m9826P(m9958i0().m9796i0(((ua6) qa6Var.m11056e()).m5118a()));
                                                                }
                                                                nb6Var = sl6VarM11932u.f30381d;
                                                                if (nb6Var != null) {
                                                                    qa6Var.m9812B(nb6Var);
                                                                }
                                                                fa6VarM9446v.m11054c();
                                                                ((pa6) fa6VarM9446v.f31181b).m9460y((ua6) qa6Var.m11056e());
                                                            }
                                                            i2 = i6 + 1;
                                                            i3 = i5;
                                                            size = i14;
                                                            list4 = list5;
                                                            zM12660i2 = z4;
                                                            zM9225E2 = z5;
                                                        } else {
                                                            i5 = i3;
                                                        }
                                                        arrayList4 = new ArrayList(qa6Var.m9831U());
                                                        it3 = arrayList4.iterator();
                                                        i6 = i2;
                                                        lValueOf = null;
                                                        lValueOf2 = null;
                                                        z2 = false;
                                                        z3 = false;
                                                        while (it3.hasNext()) {
                                                            zM12660i2 = zM12660i2;
                                                            m96Var = (m96) it3.next();
                                                            list4 = list4;
                                                            zM9225E2 = zM9225E2;
                                                            if ("_fx".equals(m96Var.m8247r())) {
                                                                it3.remove();
                                                                z2 = true;
                                                            } else if ("_f".equals(m96Var.m8247r())) {
                                                                m9958i0();
                                                                x96VarM9761C = q76.m9761C("_pfo", m96Var);
                                                                if (x96VarM9761C != null) {
                                                                    lValueOf = Long.valueOf(x96VarM9761C.m12551t());
                                                                }
                                                                m9958i0();
                                                                x96VarM9761C2 = q76.m9761C("_uwa", m96Var);
                                                                if (x96VarM9761C2 != null) {
                                                                    lValueOf2 = Long.valueOf(x96VarM9761C2.m12551t());
                                                                }
                                                            } else {
                                                                list4 = list4;
                                                                zM12660i2 = zM12660i2;
                                                                zM9225E2 = zM9225E2;
                                                            }
                                                            z3 = true;
                                                        }
                                                        z4 = zM12660i2;
                                                        list5 = list4;
                                                        z5 = zM9225E2;
                                                        if (z2) {
                                                            qa6Var.m11054c();
                                                            ((ua6) qa6Var.f31181b).m11443Z();
                                                            qa6Var.m11054c();
                                                            ((ua6) qa6Var.f31181b).m11440Y(arrayList4);
                                                        }
                                                        if (z3) {
                                                            m9977u(qa6Var.m9848o(), true, lValueOf, lValueOf2);
                                                        }
                                                        if (qa6Var.m9832V() != 0) {
                                                            if (m9950d0().m9225E(str3, e56.f17722C0)) {
                                                                qa6Var.m9826P(m9958i0().m9796i0(((ua6) qa6Var.m11056e()).m5118a()));
                                                            }
                                                            nb6Var = sl6VarM11932u.f30381d;
                                                            if (nb6Var != null) {
                                                                qa6Var.m9812B(nb6Var);
                                                            }
                                                            fa6VarM9446v.m11054c();
                                                            ((pa6) fa6VarM9446v.f31181b).m9460y((ua6) qa6Var.m11056e());
                                                        }
                                                        i2 = i6 + 1;
                                                        i3 = i5;
                                                        size = i14;
                                                        list4 = list5;
                                                        zM12660i2 = z4;
                                                        zM9225E2 = z5;
                                                    }
                                                    if (((pa6) fa6VarM9446v.f31181b).m9453p() == 0) {
                                                        m9971p(arrayList);
                                                        m9980x(false, 204, null, null, str3, Collections.EMPTY_LIST);
                                                        return;
                                                    }
                                                    pa6Var = (pa6) fa6VarM9446v.m11056e();
                                                    arrayList2 = new ArrayList();
                                                    ch6Var = sl6VarM11932u.f30380c;
                                                    if (ch6Var == ch6.f16035e) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (ch6Var == ch6.f16034d) {
                                                        it = ((pa6) fa6VarM9446v.m11056e()).m9452o().iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                if (((ua6) it.next()).m11406M()) {
                                                                    string = UUID.randomUUID().toString();
                                                                    break;
                                                                }
                                                            } else {
                                                                string = null;
                                                                break;
                                                            }
                                                        }
                                                        pa6 pa6Var9 = (pa6) fa6VarM9446v.m11056e();
                                                        mo9020c().mo5038t();
                                                        m9962k0();
                                                        fa6VarM9447w = pa6.m9447w(pa6Var9);
                                                        if (!TextUtils.isEmpty(string)) {
                                                            fa6VarM9447w.m11054c();
                                                            ((pa6) fa6VarM9447w.f31181b).m9449B(string);
                                                        }
                                                        strM8643H = m9951e0().m8643H(str3);
                                                        if (!TextUtils.isEmpty(strM8643H)) {
                                                            fa6VarM9447w.m5628i(strM8643H);
                                                        }
                                                        arrayList3 = new ArrayList();
                                                        it2 = pa6Var9.m9452o().iterator();
                                                        while (it2.hasNext()) {
                                                            qa6 qa6VarM11369U3 = ua6.m11369U((ua6) it2.next());
                                                            qa6VarM11369U3.m11054c();
                                                            ((ua6) qa6VarM11369U3.f31181b).m11422R0();
                                                            arrayList3.add((ua6) qa6VarM11369U3.m11056e());
                                                        }
                                                        fa6VarM9447w.m11054c();
                                                        ((pa6) fa6VarM9447w.f31181b).m9448A();
                                                        fa6VarM9447w.m11054c();
                                                        ((pa6) fa6VarM9447w.f31181b).m9461z(arrayList3);
                                                        x66 x66Var5 = mo9019b().f16831L;
                                                        if (TextUtils.isEmpty(string)) {
                                                            strM5627h = "null";
                                                        } else {
                                                            strM5627h = fa6VarM9447w.m5627h();
                                                        }
                                                        x66Var5.m12505b(strM5627h, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                                                        pa6Var2 = (pa6) fa6VarM9447w.m11056e();
                                                        if (TextUtils.isEmpty(string)) {
                                                            pa6 pa6Var10 = (pa6) fa6VarM9446v.m11056e();
                                                            mo9020c().mo5038t();
                                                            m9962k0();
                                                            fa6VarM9446v2 = pa6.m9446v();
                                                            mo9019b().f16831L.m12505b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                                            fa6VarM9446v2.m11054c();
                                                            ((pa6) fa6VarM9446v2.f31181b).m9449B(string);
                                                            while (r0.hasNext()) {
                                                                qa6 qa6VarM11368T3 = ua6.m11368T();
                                                                String strM11409N3 = ua6Var3.m11409N();
                                                                qa6VarM11368T3.m11054c();
                                                                ((ua6) qa6VarM11368T3.f31181b).m11419Q0(strM11409N3);
                                                                int iM11398J2 = ua6Var3.m11398J0();
                                                                qa6VarM11368T3.m11054c();
                                                                ((ua6) qa6VarM11368T3.f31181b).m11471i1(iM11398J2);
                                                                fa6VarM9446v2.m11054c();
                                                                ((pa6) fa6VarM9446v2.f31181b).m9460y((ua6) qa6VarM11368T3.m11056e());
                                                            }
                                                            pa6 pa6Var11 = (pa6) fa6VarM9446v2.m11056e();
                                                            strM8643H2 = vl6Var.f19870f.m9951e0().m8643H(str3);
                                                            zIsEmpty = TextUtils.isEmpty(strM8643H2);
                                                            ch6Var2 = ch6.f16033c;
                                                            ch6Var3 = ch6.f16036f;
                                                            if (zIsEmpty) {
                                                                Uri uri3 = Uri.parse((String) e56.f17815s.m4379a(null));
                                                                Uri.Builder builderBuildUpon3 = uri3.buildUpon();
                                                                String authority3 = uri3.getAuthority();
                                                                StringBuilder sb5 = new StringBuilder(String.valueOf(strM8643H2).length() + 1 + String.valueOf(authority3).length());
                                                                sb5.append(strM8643H2);
                                                                sb5.append(".");
                                                                sb5.append(authority3);
                                                                builderBuildUpon3.authority(sb5.toString());
                                                                String string4 = builderBuildUpon3.build().toString();
                                                                if (z) {
                                                                    ch6Var2 = ch6Var3;
                                                                }
                                                                str2 = null;
                                                                sl6Var = new sl6(string4, Collections.EMPTY_MAP, ch6Var2, null);
                                                            } else {
                                                                str2 = null;
                                                                String str6 = (String) e56.f17815s.m4379a(null);
                                                                if (z) {
                                                                    ch6Var2 = ch6Var3;
                                                                }
                                                                sl6Var = new sl6(str6, Collections.EMPTY_MAP, ch6Var2, null);
                                                            }
                                                            arrayList2.add(Pair.create(pa6Var11, sl6Var));
                                                        } else {
                                                            str2 = null;
                                                        }
                                                        if (z) {
                                                            fa6Var = (fa6) pa6Var2.m13569g();
                                                            while (i4 < pa6Var2.m9453p()) {
                                                                qa6 qa6Var5 = (qa6) pa6Var2.m9454q(i4).m13569g();
                                                                qa6Var5.m9838b0();
                                                                qa6Var5.m9813C(j);
                                                                fa6Var.m11054c();
                                                                ((pa6) fa6Var.f31181b).m9459x(i4, (ua6) qa6Var5.m11056e());
                                                            }
                                                            arrayList2.add(Pair.create((pa6) fa6Var.m11056e(), sl6VarM11932u));
                                                            m9971p(arrayList);
                                                            m9980x(false, 204, null, null, str, arrayList2);
                                                            if (m9975s(str, sl6VarM11932u.f30378a)) {
                                                                mo9019b().f16831L.m12505b(str, "[sgtm] Sending sgtm batches available notification to app");
                                                                intent = new Intent();
                                                                intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                                intent.setPackage(str);
                                                                contextMo9021d = oa6Var.mo9021d();
                                                                if (Build.VERSION.SDK_INT < i) {
                                                                    contextMo9021d.sendBroadcast(intent);
                                                                    return;
                                                                } else {
                                                                    contextMo9021d.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                                                    return;
                                                                }
                                                            }
                                                            return;
                                                        }
                                                        str3 = str;
                                                        pa6Var = pa6Var2;
                                                    } else if (z) {
                                                        z = true;
                                                        it = ((pa6) fa6VarM9446v.m11056e()).m9452o().iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                if (((ua6) it.next()).m11406M()) {
                                                                    string = UUID.randomUUID().toString();
                                                                    break;
                                                                }
                                                            } else {
                                                                string = null;
                                                                break;
                                                            }
                                                        }
                                                        pa6 pa6Var12 = (pa6) fa6VarM9446v.m11056e();
                                                        mo9020c().mo5038t();
                                                        m9962k0();
                                                        fa6VarM9447w = pa6.m9447w(pa6Var12);
                                                        if (!TextUtils.isEmpty(string)) {
                                                            fa6VarM9447w.m11054c();
                                                            ((pa6) fa6VarM9447w.f31181b).m9449B(string);
                                                        }
                                                        strM8643H = m9951e0().m8643H(str3);
                                                        if (!TextUtils.isEmpty(strM8643H)) {
                                                            fa6VarM9447w.m5628i(strM8643H);
                                                        }
                                                        arrayList3 = new ArrayList();
                                                        it2 = pa6Var12.m9452o().iterator();
                                                        while (it2.hasNext()) {
                                                            qa6 qa6VarM11369U4 = ua6.m11369U((ua6) it2.next());
                                                            qa6VarM11369U4.m11054c();
                                                            ((ua6) qa6VarM11369U4.f31181b).m11422R0();
                                                            arrayList3.add((ua6) qa6VarM11369U4.m11056e());
                                                        }
                                                        fa6VarM9447w.m11054c();
                                                        ((pa6) fa6VarM9447w.f31181b).m9448A();
                                                        fa6VarM9447w.m11054c();
                                                        ((pa6) fa6VarM9447w.f31181b).m9461z(arrayList3);
                                                        x66 x66Var6 = mo9019b().f16831L;
                                                        if (TextUtils.isEmpty(string)) {
                                                            strM5627h = "null";
                                                        } else {
                                                            strM5627h = fa6VarM9447w.m5627h();
                                                        }
                                                        x66Var6.m12505b(strM5627h, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                                                        pa6Var2 = (pa6) fa6VarM9447w.m11056e();
                                                        if (TextUtils.isEmpty(string)) {
                                                            pa6 pa6Var13 = (pa6) fa6VarM9446v.m11056e();
                                                            mo9020c().mo5038t();
                                                            m9962k0();
                                                            fa6VarM9446v2 = pa6.m9446v();
                                                            mo9019b().f16831L.m12505b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                                            fa6VarM9446v2.m11054c();
                                                            ((pa6) fa6VarM9446v2.f31181b).m9449B(string);
                                                            while (r0.hasNext()) {
                                                                qa6 qa6VarM11368T4 = ua6.m11368T();
                                                                String strM11409N4 = ua6Var3.m11409N();
                                                                qa6VarM11368T4.m11054c();
                                                                ((ua6) qa6VarM11368T4.f31181b).m11419Q0(strM11409N4);
                                                                int iM11398J3 = ua6Var3.m11398J0();
                                                                qa6VarM11368T4.m11054c();
                                                                ((ua6) qa6VarM11368T4.f31181b).m11471i1(iM11398J3);
                                                                fa6VarM9446v2.m11054c();
                                                                ((pa6) fa6VarM9446v2.f31181b).m9460y((ua6) qa6VarM11368T4.m11056e());
                                                            }
                                                            pa6 pa6Var14 = (pa6) fa6VarM9446v2.m11056e();
                                                            strM8643H2 = vl6Var.f19870f.m9951e0().m8643H(str3);
                                                            zIsEmpty = TextUtils.isEmpty(strM8643H2);
                                                            ch6Var2 = ch6.f16033c;
                                                            ch6Var3 = ch6.f16036f;
                                                            if (zIsEmpty) {
                                                                Uri uri4 = Uri.parse((String) e56.f17815s.m4379a(null));
                                                                Uri.Builder builderBuildUpon4 = uri4.buildUpon();
                                                                String authority4 = uri4.getAuthority();
                                                                StringBuilder sb6 = new StringBuilder(String.valueOf(strM8643H2).length() + 1 + String.valueOf(authority4).length());
                                                                sb6.append(strM8643H2);
                                                                sb6.append(".");
                                                                sb6.append(authority4);
                                                                builderBuildUpon4.authority(sb6.toString());
                                                                String string5 = builderBuildUpon4.build().toString();
                                                                if (z) {
                                                                    ch6Var2 = ch6Var3;
                                                                }
                                                                str2 = null;
                                                                sl6Var = new sl6(string5, Collections.EMPTY_MAP, ch6Var2, null);
                                                            } else {
                                                                str2 = null;
                                                                String str7 = (String) e56.f17815s.m4379a(null);
                                                                if (z) {
                                                                    ch6Var2 = ch6Var3;
                                                                }
                                                                sl6Var = new sl6(str7, Collections.EMPTY_MAP, ch6Var2, null);
                                                            }
                                                            arrayList2.add(Pair.create(pa6Var14, sl6Var));
                                                        } else {
                                                            str2 = null;
                                                        }
                                                        if (z) {
                                                            fa6Var = (fa6) pa6Var2.m13569g();
                                                            while (i4 < pa6Var2.m9453p()) {
                                                                qa6 qa6Var6 = (qa6) pa6Var2.m9454q(i4).m13569g();
                                                                qa6Var6.m9838b0();
                                                                qa6Var6.m9813C(j);
                                                                fa6Var.m11054c();
                                                                ((pa6) fa6Var.f31181b).m9459x(i4, (ua6) qa6Var6.m11056e());
                                                            }
                                                            arrayList2.add(Pair.create((pa6) fa6Var.m11056e(), sl6VarM11932u));
                                                            m9971p(arrayList);
                                                            m9980x(false, 204, null, null, str, arrayList2);
                                                            if (m9975s(str, sl6VarM11932u.f30378a)) {
                                                                mo9019b().f16831L.m12505b(str, "[sgtm] Sending sgtm batches available notification to app");
                                                                intent = new Intent();
                                                                intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                                intent.setPackage(str);
                                                                contextMo9021d = oa6Var.mo9021d();
                                                                if (Build.VERSION.SDK_INT < i) {
                                                                    contextMo9021d.sendBroadcast(intent);
                                                                    return;
                                                                } else {
                                                                    contextMo9021d.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                                                    return;
                                                                }
                                                            }
                                                            return;
                                                        }
                                                        str3 = str;
                                                        pa6Var = pa6Var2;
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    q76Var = this.f28592b;
                                                    m9925S(q76Var);
                                                    if (q76Var.m9785O()) {
                                                        if (Log.isLoggable(mo9019b().m4402A(), 2)) {
                                                            strM9791a0 = m9958i0().m9791a0(pa6Var);
                                                        } else {
                                                            strM9791a0 = str2;
                                                        }
                                                        m9958i0();
                                                        byte[] bArrM5118a2 = pa6Var.m5118a();
                                                        m9971p(arrayList);
                                                        this.f28599i.f29367m.m8624b(j);
                                                        mo9019b().f16831L.m12507d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrM5118a2.length), strM9791a0);
                                                        this.f28611u = true;
                                                        m9925S(q76Var);
                                                        q76Var.m9786V(str3, sl6VarM11932u, pa6Var, new tt2((qm6) this, str3, arrayList2));
                                                    }
                                                }
                                            }
                                            gZIPInputStream.close();
                                            byteArrayInputStream.close();
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            if (!arrayList8.isEmpty() && byteArray.length + length > iMax) {
                                                break;
                                            }
                                            try {
                                                qa6 qa6Var7 = (qa6) q76.m9777k0(ua6.m11368T(), byteArray);
                                                if (!arrayList8.isEmpty()) {
                                                    ua6 ua6Var4 = (ua6) ((Pair) arrayList8.get(0)).first;
                                                    ua6 ua6Var5 = (ua6) qa6Var7.m11056e();
                                                    if (!ua6Var4.m11503t0().equals(ua6Var5.m11503t0()) || !ua6Var4.m11371A0().equals(ua6Var5.m11371A0()) || ua6Var4.m11377C0() != ua6Var5.m11377C0() || !ua6Var4.m11383E0().equals(ua6Var5.m11383E0())) {
                                                        break;
                                                    }
                                                    Iterator it14 = ua6Var4.m11428T1().iterator();
                                                    while (true) {
                                                        if (!it14.hasNext()) {
                                                            jM9486u = -1;
                                                            break;
                                                        }
                                                        pb6 pb6Var = (pb6) it14.next();
                                                        Iterator it15 = it14;
                                                        if ("_npa".equals(pb6Var.m9482q())) {
                                                            jM9486u = pb6Var.m9486u();
                                                            break;
                                                        }
                                                        it14 = it15;
                                                    }
                                                    Iterator it16 = ua6Var5.m11428T1().iterator();
                                                    while (true) {
                                                        if (!it16.hasNext()) {
                                                            jM9486u2 = -1;
                                                            break;
                                                        }
                                                        pb6 pb6Var2 = (pb6) it16.next();
                                                        if ("_npa".equals(pb6Var2.m9482q())) {
                                                            jM9486u2 = pb6Var2.m9486u();
                                                            break;
                                                        }
                                                    }
                                                    if (jM9486u != jM9486u2) {
                                                        break;
                                                    }
                                                }
                                                if (!cursorQuery.isNull(2)) {
                                                    int i15 = cursorQuery.getInt(2);
                                                    qa6Var7.m11054c();
                                                    ((ua6) qa6Var7.f31181b).m11425S0(i15);
                                                }
                                                length += byteArray.length;
                                                arrayList8.add(Pair.create((ua6) qa6Var7.m11056e(), Long.valueOf(j3)));
                                            } catch (IOException e11) {
                                                oa6Var4.mo9019b().f16835j.m12506c("Failed to merge queued bundle. appId", d76.m4401y(str3), e11);
                                            }
                                            oa6Var4 = oa6Var4;
                                            if (cursorQuery.moveToNext() || length > iMax) {
                                                break;
                                                break;
                                            }
                                            ar5VarM9952f0 = ar5Var;
                                            oa6Var4 = oa6Var4;
                                            i10 = 0;
                                            i11 = 1;
                                        } catch (IOException e12) {
                                            e = e12;
                                            ar5Var = ar5VarM9952f0;
                                        }
                                    } catch (IOException e13) {
                                        e = e13;
                                        ar5Var = ar5VarM9952f0;
                                        oa6Var4 = oa6Var4;
                                    }
                                }
                                cursorQuery.close();
                                list2 = arrayList8;
                            } else {
                                list = Collections.EMPTY_LIST;
                                cursorQuery.close();
                                list2 = list;
                            }
                        } catch (SQLiteException e14) {
                            e = e14;
                            oa6Var4 = oa6Var4;
                        }
                    } catch (SQLiteException e15) {
                        e = e15;
                        cursorQuery = null;
                        oa6Var4.mo9019b().f16835j.m12506c("Error querying bundles. appId", d76.m4401y(str3), e);
                        list = Collections.EMPTY_LIST;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        list2 = list;
                        if (list2.isEmpty()) {
                            return;
                        }
                        wm6Var = wm6.f33509b;
                        op5 op5VarM9950d1 = m9950d0();
                        d56Var = e56.f17795i1;
                        zM9225E = op5VarM9950d1.m9225E(null, d56Var);
                        vc6Var = vc6.ANALYTICS_STORAGE;
                        if (zM9225E) {
                            if (!m9950d0().m9225E(null, d56Var)) {
                                i = 34;
                                list6 = list2;
                            } else if (m9947a(str).m12660i(vc6Var)) {
                                i = 34;
                                arrayList5 = new ArrayList(list2.size());
                                ar5 ar5VarM9952f3 = m9952f0();
                                oa6Var2 = (oa6) ar5VarM9952f3.f36084a;
                                y42.m12851X(str3);
                                ar5VarM9952f3.mo5038t();
                                ar5VarM9952f3.m10368u();
                                arrayList6 = new ArrayList();
                                sQLiteDatabaseM3197l0 = ar5VarM9952f3.m3197l0();
                                oa6Var2.mo9022e().getClass();
                                jCurrentTimeMillis = System.currentTimeMillis();
                                cursorQuery2 = sQLiteDatabaseM3197l0.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                if (cursorQuery2.moveToFirst()) {
                                    oa6Var3 = oa6Var2;
                                    while (true) {
                                        arrayList6.add((m96) ((l96) q76.m9777k0(m96.m8235y(), cursorQuery2.getBlob(0))).m11056e());
                                        if (!cursorQuery2.moveToNext()) {
                                            break;
                                            break;
                                        } else {
                                            cursorQuery2 = cursorQuery2;
                                            arrayList6 = arrayList6;
                                        }
                                    }
                                    cursorQuery2.close();
                                    int iDelete3 = sQLiteDatabaseM3197l0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                    x66 x66Var7 = oa6Var3.mo9019b().f16831L;
                                    StringBuilder sb7 = new StringBuilder(String.valueOf(iDelete3).length() + 34);
                                    sb7.append("Pruned ");
                                    sb7.append(iDelete3);
                                    sb7.append(" NO_DATA mode events. appId");
                                    x66Var7.m12505b(str3, sb7.toString());
                                } else {
                                    arrayList6 = arrayList6;
                                    cursorQuery2.close();
                                }
                                list7 = arrayList6;
                                it5 = list2.iterator();
                                z6 = true;
                                while (it5.hasNext()) {
                                    Pair pair4 = (Pair) it5.next();
                                    qa6Var2 = (qa6) ((ua6) pair4.first).m13569g();
                                    if (z6) {
                                        List listM9831U4 = qa6Var2.m9831U();
                                        qa6Var2.m11054c();
                                        ((ua6) qa6Var2.f31181b).m11443Z();
                                        qa6Var2.m11054c();
                                        ((ua6) qa6Var2.f31181b).m11440Y(list7);
                                        qa6Var2.m11054c();
                                        ((ua6) qa6Var2.f31181b).m11440Y(listM9831U4);
                                        z6 = false;
                                    }
                                    u86 u86VarM5618p4 = f96.m5618p();
                                    a66VarM8651P = m9951e0().m8651P(str3);
                                    arrayList7 = new ArrayList();
                                    if (a66VarM8651P != null) {
                                        it6 = a66VarM8651P.m106o().iterator();
                                        while (it6.hasNext()) {
                                            a56 a56Var4 = (a56) it6.next();
                                            Iterator it17 = it5;
                                            a96 a96VarM3516o4 = b96.m3516o();
                                            boolean z13 = z6;
                                            iM98o = a56Var4.m98o() - 1;
                                            List list14 = list7;
                                            if (iM98o != 1) {
                                                it7 = it6;
                                                i8 = 3;
                                                i9 = 2;
                                            } else if (iM98o != 2) {
                                                it7 = it6;
                                                i8 = 3;
                                                if (iM98o != 3) {
                                                    i9 = 4;
                                                } else if (iM98o != 4) {
                                                    i9 = 1;
                                                } else {
                                                    i9 = 5;
                                                }
                                            } else {
                                                it7 = it6;
                                                i8 = 3;
                                                i9 = 3;
                                            }
                                            a96VarM3516o4.m152h(i9);
                                            iM100q = a56Var4.m100q() - 1;
                                            if (iM100q != 1) {
                                                i8 = 2;
                                            } else if (iM100q != 2) {
                                                i8 = 1;
                                            }
                                            a96VarM3516o4.m153i(i8);
                                            arrayList7.add((b96) a96VarM3516o4.m11056e());
                                            it5 = it17;
                                            list7 = list14;
                                            z6 = z13;
                                            it6 = it7;
                                        }
                                    }
                                    Iterator it18 = it5;
                                    boolean z14 = z6;
                                    List list15 = list7;
                                    u86VarM5618p4.m11303h(arrayList7);
                                    qa6Var2.m9815E(u86VarM5618p4);
                                    arrayList5.add(Pair.create((ua6) qa6Var2.m11056e(), (Long) pair4.second));
                                    it5 = it18;
                                    list7 = list15;
                                    z6 = z14;
                                }
                                list6 = arrayList5;
                            } else {
                                i = 34;
                                arrayList5 = new ArrayList(list2.size());
                                ar5 ar5VarM9952f4 = m9952f0();
                                oa6Var2 = (oa6) ar5VarM9952f4.f36084a;
                                y42.m12851X(str3);
                                ar5VarM9952f4.mo5038t();
                                ar5VarM9952f4.m10368u();
                                arrayList6 = new ArrayList();
                                sQLiteDatabaseM3197l0 = ar5VarM9952f4.m3197l0();
                                oa6Var2.mo9022e().getClass();
                                jCurrentTimeMillis = System.currentTimeMillis();
                                cursorQuery2 = sQLiteDatabaseM3197l0.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                if (cursorQuery2.moveToFirst()) {
                                    oa6Var3 = oa6Var2;
                                    while (true) {
                                        arrayList6.add((m96) ((l96) q76.m9777k0(m96.m8235y(), cursorQuery2.getBlob(0))).m11056e());
                                        if (!cursorQuery2.moveToNext()) {
                                            break;
                                            break;
                                        } else {
                                            cursorQuery2 = cursorQuery2;
                                            arrayList6 = arrayList6;
                                        }
                                    }
                                    cursorQuery2.close();
                                    int iDelete4 = sQLiteDatabaseM3197l0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                    x66 x66Var8 = oa6Var3.mo9019b().f16831L;
                                    StringBuilder sb8 = new StringBuilder(String.valueOf(iDelete4).length() + 34);
                                    sb8.append("Pruned ");
                                    sb8.append(iDelete4);
                                    sb8.append(" NO_DATA mode events. appId");
                                    x66Var8.m12505b(str3, sb8.toString());
                                } else {
                                    arrayList6 = arrayList6;
                                    cursorQuery2.close();
                                }
                                list7 = arrayList6;
                                it5 = list2.iterator();
                                z6 = true;
                                while (it5.hasNext()) {
                                    Pair pair5 = (Pair) it5.next();
                                    qa6Var2 = (qa6) ((ua6) pair5.first).m13569g();
                                    if (z6) {
                                        List listM9831U5 = qa6Var2.m9831U();
                                        qa6Var2.m11054c();
                                        ((ua6) qa6Var2.f31181b).m11443Z();
                                        qa6Var2.m11054c();
                                        ((ua6) qa6Var2.f31181b).m11440Y(list7);
                                        qa6Var2.m11054c();
                                        ((ua6) qa6Var2.f31181b).m11440Y(listM9831U5);
                                        z6 = false;
                                    }
                                    u86 u86VarM5618p5 = f96.m5618p();
                                    a66VarM8651P = m9951e0().m8651P(str3);
                                    arrayList7 = new ArrayList();
                                    if (a66VarM8651P != null) {
                                        it6 = a66VarM8651P.m106o().iterator();
                                        while (it6.hasNext()) {
                                            a56 a56Var5 = (a56) it6.next();
                                            Iterator it19 = it5;
                                            a96 a96VarM3516o5 = b96.m3516o();
                                            boolean z15 = z6;
                                            iM98o = a56Var5.m98o() - 1;
                                            List list16 = list7;
                                            if (iM98o != 1) {
                                                it7 = it6;
                                                i8 = 3;
                                                i9 = 2;
                                            } else if (iM98o != 2) {
                                                it7 = it6;
                                                i8 = 3;
                                                if (iM98o != 3) {
                                                    i9 = 4;
                                                } else if (iM98o != 4) {
                                                    i9 = 1;
                                                } else {
                                                    i9 = 5;
                                                }
                                            } else {
                                                it7 = it6;
                                                i8 = 3;
                                                i9 = 3;
                                            }
                                            a96VarM3516o5.m152h(i9);
                                            iM100q = a56Var5.m100q() - 1;
                                            if (iM100q != 1) {
                                                i8 = 2;
                                            } else if (iM100q != 2) {
                                                i8 = 1;
                                            }
                                            a96VarM3516o5.m153i(i8);
                                            arrayList7.add((b96) a96VarM3516o5.m11056e());
                                            it5 = it19;
                                            list7 = list16;
                                            z6 = z15;
                                            it6 = it7;
                                        }
                                    }
                                    Iterator it110 = it5;
                                    boolean z16 = z6;
                                    List list17 = list7;
                                    u86VarM5618p5.m11303h(arrayList7);
                                    qa6Var2.m9815E(u86VarM5618p5);
                                    arrayList5.add(Pair.create((ua6) qa6Var2.m11056e(), (Long) pair5.second));
                                    it5 = it110;
                                    list7 = list17;
                                    z6 = z16;
                                }
                                list6 = arrayList5;
                            }
                            zIsEmpty2 = list6.isEmpty();
                            list3 = list6;
                            if (zIsEmpty2) {
                                return;
                            }
                        } else {
                            i = 34;
                            list3 = list2;
                        }
                        xc6VarM9947a = m9947a(str);
                        vc6Var2 = vc6.AD_STORAGE;
                        if (xc6VarM9947a.m12660i(vc6Var2)) {
                            i2 = 0;
                            listSubList = list3;
                            break;
                        }
                        it4 = list3.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                strM11505u2 = null;
                                break;
                            }
                            ua6Var2 = (ua6) ((Pair) it4.next()).first;
                            if (!ua6Var2.m11505u().isEmpty()) {
                                strM11505u2 = ua6Var2.m11505u();
                                break;
                            }
                        }
                        if (strM11505u2 != null) {
                            i2 = 0;
                            listSubList = list3;
                            break;
                        }
                        i7 = 0;
                        while (true) {
                            if (i7 < list3.size()) {
                                i2 = 0;
                                listSubList = list3;
                                break;
                            }
                            ua6Var = (ua6) ((Pair) list3.get(i7)).first;
                            if (!ua6Var.m11505u().isEmpty()) {
                                i2 = 0;
                                listSubList = list3.subList(0, i7);
                                break;
                            }
                            i7++;
                        }
                        fa6VarM9446v = pa6.m9446v();
                        size = listSubList.size();
                        arrayList = new ArrayList(listSubList.size());
                        if (m9950d0().m9231u(str3)) {
                            i3 = i2;
                        } else {
                            i3 = i2;
                        }
                        zM12660i = m9947a(str).m12660i(vc6Var2);
                        zM12660i2 = m9947a(str).m12660i(vc6Var);
                        zM9225E2 = m9950d0().m9225E(str3, e56.f17742M0);
                        vl6Var = this.f28600j;
                        sl6VarM11932u = vl6Var.m11932u(str3);
                        list4 = listSubList;
                        while (true) {
                            oa6Var = this.f28602l;
                            if (i2 < size) {
                                break;
                                break;
                            }
                            qa6Var = (qa6) ((ua6) ((Pair) list4.get(i2)).first).m13569g();
                            int i16 = size;
                            arrayList.add((Long) ((Pair) list4.get(i2)).second);
                            m9950d0().m9235z();
                            qa6Var.m9852s();
                            qa6Var.m11054c();
                            ((ua6) qa6Var.f31181b).m11458e0(j);
                            oa6Var.getClass();
                            qa6Var.m9819I();
                            if (i3 == 0) {
                                qa6Var.m11054c();
                                ((ua6) qa6Var.f31181b).m11422R0();
                            }
                            if (!zM12660i) {
                                qa6Var.m11054c();
                                ((ua6) qa6Var.f31181b).m11519y1();
                                qa6Var.m11054c();
                                ((ua6) qa6Var.f31181b).m11372A1();
                            }
                            if (!zM12660i2) {
                                qa6Var.m11054c();
                                ((ua6) qa6Var.f31181b).m11378C1();
                            }
                            m9978v(str3, qa6Var);
                            if (!zM9225E2) {
                                qa6Var.m11054c();
                                ((ua6) qa6Var.f31181b).m11441Y0();
                            }
                            if (!zM12660i2) {
                                qa6Var.m11054c();
                                ((ua6) qa6Var.f31181b).m11402K1();
                            }
                            strM11505u = ((ua6) qa6Var.f31181b).m11505u();
                            if (TextUtils.isEmpty(strM11505u)) {
                                i5 = i3;
                                if (strM11505u.equals("00000000-0000-0000-0000-000000000000")) {
                                    i6 = i2;
                                    z4 = zM12660i2;
                                    list5 = list4;
                                    z5 = zM9225E2;
                                }
                                if (qa6Var.m9832V() != 0) {
                                    if (m9950d0().m9225E(str3, e56.f17722C0)) {
                                        qa6Var.m9826P(m9958i0().m9796i0(((ua6) qa6Var.m11056e()).m5118a()));
                                    }
                                    nb6Var = sl6VarM11932u.f30381d;
                                    if (nb6Var != null) {
                                        qa6Var.m9812B(nb6Var);
                                    }
                                    fa6VarM9446v.m11054c();
                                    ((pa6) fa6VarM9446v.f31181b).m9460y((ua6) qa6Var.m11056e());
                                }
                                i2 = i6 + 1;
                                i3 = i5;
                                size = i16;
                                list4 = list5;
                                zM12660i2 = z4;
                                zM9225E2 = z5;
                            } else {
                                i5 = i3;
                            }
                            arrayList4 = new ArrayList(qa6Var.m9831U());
                            it3 = arrayList4.iterator();
                            i6 = i2;
                            lValueOf = null;
                            lValueOf2 = null;
                            z2 = false;
                            z3 = false;
                            while (it3.hasNext()) {
                                zM12660i2 = zM12660i2;
                                m96Var = (m96) it3.next();
                                list4 = list4;
                                zM9225E2 = zM9225E2;
                                if ("_fx".equals(m96Var.m8247r())) {
                                    it3.remove();
                                    z2 = true;
                                } else if ("_f".equals(m96Var.m8247r())) {
                                    m9958i0();
                                    x96VarM9761C = q76.m9761C("_pfo", m96Var);
                                    if (x96VarM9761C != null) {
                                        lValueOf = Long.valueOf(x96VarM9761C.m12551t());
                                    }
                                    m9958i0();
                                    x96VarM9761C2 = q76.m9761C("_uwa", m96Var);
                                    if (x96VarM9761C2 != null) {
                                        lValueOf2 = Long.valueOf(x96VarM9761C2.m12551t());
                                    }
                                } else {
                                    list4 = list4;
                                    zM12660i2 = zM12660i2;
                                    zM9225E2 = zM9225E2;
                                }
                                z3 = true;
                            }
                            z4 = zM12660i2;
                            list5 = list4;
                            z5 = zM9225E2;
                            if (z2) {
                                qa6Var.m11054c();
                                ((ua6) qa6Var.f31181b).m11443Z();
                                qa6Var.m11054c();
                                ((ua6) qa6Var.f31181b).m11440Y(arrayList4);
                            }
                            if (z3) {
                                m9977u(qa6Var.m9848o(), true, lValueOf, lValueOf2);
                            }
                            if (qa6Var.m9832V() != 0) {
                                if (m9950d0().m9225E(str3, e56.f17722C0)) {
                                    qa6Var.m9826P(m9958i0().m9796i0(((ua6) qa6Var.m11056e()).m5118a()));
                                }
                                nb6Var = sl6VarM11932u.f30381d;
                                if (nb6Var != null) {
                                    qa6Var.m9812B(nb6Var);
                                }
                                fa6VarM9446v.m11054c();
                                ((pa6) fa6VarM9446v.f31181b).m9460y((ua6) qa6Var.m11056e());
                            }
                            i2 = i6 + 1;
                            i3 = i5;
                            size = i16;
                            list4 = list5;
                            zM12660i2 = z4;
                            zM9225E2 = z5;
                        }
                        if (((pa6) fa6VarM9446v.f31181b).m9453p() == 0) {
                            m9971p(arrayList);
                            m9980x(false, 204, null, null, str3, Collections.EMPTY_LIST);
                            return;
                        }
                        pa6Var = (pa6) fa6VarM9446v.m11056e();
                        arrayList2 = new ArrayList();
                        ch6Var = sl6VarM11932u.f30380c;
                        if (ch6Var == ch6.f16035e) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (ch6Var == ch6.f16034d) {
                            it = ((pa6) fa6VarM9446v.m11056e()).m9452o().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((ua6) it.next()).m11406M()) {
                                        string = UUID.randomUUID().toString();
                                        break;
                                    }
                                } else {
                                    string = null;
                                    break;
                                }
                            }
                            pa6 pa6Var15 = (pa6) fa6VarM9446v.m11056e();
                            mo9020c().mo5038t();
                            m9962k0();
                            fa6VarM9447w = pa6.m9447w(pa6Var15);
                            if (!TextUtils.isEmpty(string)) {
                                fa6VarM9447w.m11054c();
                                ((pa6) fa6VarM9447w.f31181b).m9449B(string);
                            }
                            strM8643H = m9951e0().m8643H(str3);
                            if (!TextUtils.isEmpty(strM8643H)) {
                                fa6VarM9447w.m5628i(strM8643H);
                            }
                            arrayList3 = new ArrayList();
                            it2 = pa6Var15.m9452o().iterator();
                            while (it2.hasNext()) {
                                qa6 qa6VarM11369U5 = ua6.m11369U((ua6) it2.next());
                                qa6VarM11369U5.m11054c();
                                ((ua6) qa6VarM11369U5.f31181b).m11422R0();
                                arrayList3.add((ua6) qa6VarM11369U5.m11056e());
                            }
                            fa6VarM9447w.m11054c();
                            ((pa6) fa6VarM9447w.f31181b).m9448A();
                            fa6VarM9447w.m11054c();
                            ((pa6) fa6VarM9447w.f31181b).m9461z(arrayList3);
                            x66 x66Var9 = mo9019b().f16831L;
                            if (TextUtils.isEmpty(string)) {
                                strM5627h = "null";
                            } else {
                                strM5627h = fa6VarM9447w.m5627h();
                            }
                            x66Var9.m12505b(strM5627h, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                            pa6Var2 = (pa6) fa6VarM9447w.m11056e();
                            if (TextUtils.isEmpty(string)) {
                                pa6 pa6Var16 = (pa6) fa6VarM9446v.m11056e();
                                mo9020c().mo5038t();
                                m9962k0();
                                fa6VarM9446v2 = pa6.m9446v();
                                mo9019b().f16831L.m12505b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                fa6VarM9446v2.m11054c();
                                ((pa6) fa6VarM9446v2.f31181b).m9449B(string);
                                while (r0.hasNext()) {
                                    qa6 qa6VarM11368T5 = ua6.m11368T();
                                    String strM11409N5 = ua6Var3.m11409N();
                                    qa6VarM11368T5.m11054c();
                                    ((ua6) qa6VarM11368T5.f31181b).m11419Q0(strM11409N5);
                                    int iM11398J4 = ua6Var3.m11398J0();
                                    qa6VarM11368T5.m11054c();
                                    ((ua6) qa6VarM11368T5.f31181b).m11471i1(iM11398J4);
                                    fa6VarM9446v2.m11054c();
                                    ((pa6) fa6VarM9446v2.f31181b).m9460y((ua6) qa6VarM11368T5.m11056e());
                                }
                                pa6 pa6Var17 = (pa6) fa6VarM9446v2.m11056e();
                                strM8643H2 = vl6Var.f19870f.m9951e0().m8643H(str3);
                                zIsEmpty = TextUtils.isEmpty(strM8643H2);
                                ch6Var2 = ch6.f16033c;
                                ch6Var3 = ch6.f16036f;
                                if (zIsEmpty) {
                                    Uri uri5 = Uri.parse((String) e56.f17815s.m4379a(null));
                                    Uri.Builder builderBuildUpon5 = uri5.buildUpon();
                                    String authority5 = uri5.getAuthority();
                                    StringBuilder sb9 = new StringBuilder(String.valueOf(strM8643H2).length() + 1 + String.valueOf(authority5).length());
                                    sb9.append(strM8643H2);
                                    sb9.append(".");
                                    sb9.append(authority5);
                                    builderBuildUpon5.authority(sb9.toString());
                                    String string6 = builderBuildUpon5.build().toString();
                                    if (z) {
                                        ch6Var2 = ch6Var3;
                                    }
                                    str2 = null;
                                    sl6Var = new sl6(string6, Collections.EMPTY_MAP, ch6Var2, null);
                                } else {
                                    str2 = null;
                                    String str8 = (String) e56.f17815s.m4379a(null);
                                    if (z) {
                                        ch6Var2 = ch6Var3;
                                    }
                                    sl6Var = new sl6(str8, Collections.EMPTY_MAP, ch6Var2, null);
                                }
                                arrayList2.add(Pair.create(pa6Var17, sl6Var));
                            } else {
                                str2 = null;
                            }
                            if (z) {
                                fa6Var = (fa6) pa6Var2.m13569g();
                                while (i4 < pa6Var2.m9453p()) {
                                    qa6 qa6Var8 = (qa6) pa6Var2.m9454q(i4).m13569g();
                                    qa6Var8.m9838b0();
                                    qa6Var8.m9813C(j);
                                    fa6Var.m11054c();
                                    ((pa6) fa6Var.f31181b).m9459x(i4, (ua6) qa6Var8.m11056e());
                                }
                                arrayList2.add(Pair.create((pa6) fa6Var.m11056e(), sl6VarM11932u));
                                m9971p(arrayList);
                                m9980x(false, 204, null, null, str, arrayList2);
                                if (m9975s(str, sl6VarM11932u.f30378a)) {
                                    mo9019b().f16831L.m12505b(str, "[sgtm] Sending sgtm batches available notification to app");
                                    intent = new Intent();
                                    intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    intent.setPackage(str);
                                    contextMo9021d = oa6Var.mo9021d();
                                    if (Build.VERSION.SDK_INT < i) {
                                        contextMo9021d.sendBroadcast(intent);
                                        return;
                                    } else {
                                        contextMo9021d.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                        return;
                                    }
                                }
                                return;
                            }
                            str3 = str;
                            pa6Var = pa6Var2;
                        } else if (z) {
                            z = true;
                            it = ((pa6) fa6VarM9446v.m11056e()).m9452o().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((ua6) it.next()).m11406M()) {
                                        string = UUID.randomUUID().toString();
                                        break;
                                    }
                                } else {
                                    string = null;
                                    break;
                                }
                            }
                            pa6 pa6Var18 = (pa6) fa6VarM9446v.m11056e();
                            mo9020c().mo5038t();
                            m9962k0();
                            fa6VarM9447w = pa6.m9447w(pa6Var18);
                            if (!TextUtils.isEmpty(string)) {
                                fa6VarM9447w.m11054c();
                                ((pa6) fa6VarM9447w.f31181b).m9449B(string);
                            }
                            strM8643H = m9951e0().m8643H(str3);
                            if (!TextUtils.isEmpty(strM8643H)) {
                                fa6VarM9447w.m5628i(strM8643H);
                            }
                            arrayList3 = new ArrayList();
                            it2 = pa6Var18.m9452o().iterator();
                            while (it2.hasNext()) {
                                qa6 qa6VarM11369U6 = ua6.m11369U((ua6) it2.next());
                                qa6VarM11369U6.m11054c();
                                ((ua6) qa6VarM11369U6.f31181b).m11422R0();
                                arrayList3.add((ua6) qa6VarM11369U6.m11056e());
                            }
                            fa6VarM9447w.m11054c();
                            ((pa6) fa6VarM9447w.f31181b).m9448A();
                            fa6VarM9447w.m11054c();
                            ((pa6) fa6VarM9447w.f31181b).m9461z(arrayList3);
                            x66 x66Var10 = mo9019b().f16831L;
                            if (TextUtils.isEmpty(string)) {
                                strM5627h = "null";
                            } else {
                                strM5627h = fa6VarM9447w.m5627h();
                            }
                            x66Var10.m12505b(strM5627h, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                            pa6Var2 = (pa6) fa6VarM9447w.m11056e();
                            if (TextUtils.isEmpty(string)) {
                                pa6 pa6Var19 = (pa6) fa6VarM9446v.m11056e();
                                mo9020c().mo5038t();
                                m9962k0();
                                fa6VarM9446v2 = pa6.m9446v();
                                mo9019b().f16831L.m12505b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                fa6VarM9446v2.m11054c();
                                ((pa6) fa6VarM9446v2.f31181b).m9449B(string);
                                while (r0.hasNext()) {
                                    qa6 qa6VarM11368T6 = ua6.m11368T();
                                    String strM11409N6 = ua6Var3.m11409N();
                                    qa6VarM11368T6.m11054c();
                                    ((ua6) qa6VarM11368T6.f31181b).m11419Q0(strM11409N6);
                                    int iM11398J5 = ua6Var3.m11398J0();
                                    qa6VarM11368T6.m11054c();
                                    ((ua6) qa6VarM11368T6.f31181b).m11471i1(iM11398J5);
                                    fa6VarM9446v2.m11054c();
                                    ((pa6) fa6VarM9446v2.f31181b).m9460y((ua6) qa6VarM11368T6.m11056e());
                                }
                                pa6 pa6Var110 = (pa6) fa6VarM9446v2.m11056e();
                                strM8643H2 = vl6Var.f19870f.m9951e0().m8643H(str3);
                                zIsEmpty = TextUtils.isEmpty(strM8643H2);
                                ch6Var2 = ch6.f16033c;
                                ch6Var3 = ch6.f16036f;
                                if (zIsEmpty) {
                                    Uri uri6 = Uri.parse((String) e56.f17815s.m4379a(null));
                                    Uri.Builder builderBuildUpon6 = uri6.buildUpon();
                                    String authority6 = uri6.getAuthority();
                                    StringBuilder sb10 = new StringBuilder(String.valueOf(strM8643H2).length() + 1 + String.valueOf(authority6).length());
                                    sb10.append(strM8643H2);
                                    sb10.append(".");
                                    sb10.append(authority6);
                                    builderBuildUpon6.authority(sb10.toString());
                                    String string7 = builderBuildUpon6.build().toString();
                                    if (z) {
                                        ch6Var2 = ch6Var3;
                                    }
                                    str2 = null;
                                    sl6Var = new sl6(string7, Collections.EMPTY_MAP, ch6Var2, null);
                                } else {
                                    str2 = null;
                                    String str9 = (String) e56.f17815s.m4379a(null);
                                    if (z) {
                                        ch6Var2 = ch6Var3;
                                    }
                                    sl6Var = new sl6(str9, Collections.EMPTY_MAP, ch6Var2, null);
                                }
                                arrayList2.add(Pair.create(pa6Var110, sl6Var));
                            } else {
                                str2 = null;
                            }
                            if (z) {
                                fa6Var = (fa6) pa6Var2.m13569g();
                                while (i4 < pa6Var2.m9453p()) {
                                    qa6 qa6Var9 = (qa6) pa6Var2.m9454q(i4).m13569g();
                                    qa6Var9.m9838b0();
                                    qa6Var9.m9813C(j);
                                    fa6Var.m11054c();
                                    ((pa6) fa6Var.f31181b).m9459x(i4, (ua6) qa6Var9.m11056e());
                                }
                                arrayList2.add(Pair.create((pa6) fa6Var.m11056e(), sl6VarM11932u));
                                m9971p(arrayList);
                                m9980x(false, 204, null, null, str, arrayList2);
                                if (m9975s(str, sl6VarM11932u.f30378a)) {
                                    mo9019b().f16831L.m12505b(str, "[sgtm] Sending sgtm batches available notification to app");
                                    intent = new Intent();
                                    intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    intent.setPackage(str);
                                    contextMo9021d = oa6Var.mo9021d();
                                    if (Build.VERSION.SDK_INT < i) {
                                        contextMo9021d.sendBroadcast(intent);
                                        return;
                                    } else {
                                        contextMo9021d.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                        return;
                                    }
                                }
                                return;
                            }
                            str3 = str;
                            pa6Var = pa6Var2;
                        } else {
                            str2 = null;
                        }
                        q76Var = this.f28592b;
                        m9925S(q76Var);
                        if (q76Var.m9785O()) {
                            if (Log.isLoggable(mo9019b().m4402A(), 2)) {
                                strM9791a0 = m9958i0().m9791a0(pa6Var);
                            } else {
                                strM9791a0 = str2;
                            }
                            m9958i0();
                            byte[] bArrM5118a3 = pa6Var.m5118a();
                            m9971p(arrayList);
                            this.f28599i.f29367m.m8624b(j);
                            mo9019b().f16831L.m12507d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrM5118a3.length), strM9791a0);
                            this.f28611u = true;
                            m9925S(q76Var);
                            q76Var.m9786V(str3, sl6VarM11932u, pa6Var, new tt2((qm6) this, str3, arrayList2));
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r14 = 0;
                    if (r14 != 0) {
                        r14.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e16) {
                e = e16;
                j2 = -1;
            }
            if (list2.isEmpty()) {
                return;
            }
            wm6Var = wm6.f33509b;
            op5 op5VarM9950d2 = m9950d0();
            d56Var = e56.f17795i1;
            zM9225E = op5VarM9950d2.m9225E(null, d56Var);
            vc6Var = vc6.ANALYTICS_STORAGE;
            if (zM9225E) {
                if (!m9950d0().m9225E(null, d56Var)) {
                    i = 34;
                    list6 = list2;
                } else if (m9947a(str).m12660i(vc6Var) || !m9951e0().m8653z(str3)) {
                    i = 34;
                    arrayList5 = new ArrayList(list2.size());
                    ar5 ar5VarM9952f5 = m9952f0();
                    oa6Var2 = (oa6) ar5VarM9952f5.f36084a;
                    y42.m12851X(str3);
                    ar5VarM9952f5.mo5038t();
                    ar5VarM9952f5.m10368u();
                    arrayList6 = new ArrayList();
                    sQLiteDatabaseM3197l0 = ar5VarM9952f5.m3197l0();
                    oa6Var2.mo9022e().getClass();
                    jCurrentTimeMillis = System.currentTimeMillis();
                    cursorQuery2 = sQLiteDatabaseM3197l0.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                    if (cursorQuery2.moveToFirst()) {
                        oa6Var3 = oa6Var2;
                        while (true) {
                            arrayList6.add((m96) ((l96) q76.m9777k0(m96.m8235y(), cursorQuery2.getBlob(0))).m11056e());
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            } else {
                                cursorQuery2 = cursorQuery2;
                                arrayList6 = arrayList6;
                            }
                        }
                        cursorQuery2.close();
                        int iDelete5 = sQLiteDatabaseM3197l0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                        x66 x66Var11 = oa6Var3.mo9019b().f16831L;
                        StringBuilder sb11 = new StringBuilder(String.valueOf(iDelete5).length() + 34);
                        sb11.append("Pruned ");
                        sb11.append(iDelete5);
                        sb11.append(" NO_DATA mode events. appId");
                        x66Var11.m12505b(str3, sb11.toString());
                    } else {
                        arrayList6 = arrayList6;
                        cursorQuery2.close();
                    }
                    list7 = arrayList6;
                    it5 = list2.iterator();
                    z6 = true;
                    while (it5.hasNext()) {
                        Pair pair6 = (Pair) it5.next();
                        qa6Var2 = (qa6) ((ua6) pair6.first).m13569g();
                        if (z6 && !list7.isEmpty()) {
                            List listM9831U6 = qa6Var2.m9831U();
                            qa6Var2.m11054c();
                            ((ua6) qa6Var2.f31181b).m11443Z();
                            qa6Var2.m11054c();
                            ((ua6) qa6Var2.f31181b).m11440Y(list7);
                            qa6Var2.m11054c();
                            ((ua6) qa6Var2.f31181b).m11440Y(listM9831U6);
                            z6 = false;
                        }
                        u86 u86VarM5618p6 = f96.m5618p();
                        a66VarM8651P = m9951e0().m8651P(str3);
                        arrayList7 = new ArrayList();
                        if (a66VarM8651P != null) {
                            it6 = a66VarM8651P.m106o().iterator();
                            while (it6.hasNext()) {
                                a56 a56Var6 = (a56) it6.next();
                                Iterator it111 = it5;
                                a96 a96VarM3516o6 = b96.m3516o();
                                boolean z17 = z6;
                                iM98o = a56Var6.m98o() - 1;
                                List list18 = list7;
                                if (iM98o != 1) {
                                    it7 = it6;
                                    i8 = 3;
                                    i9 = 2;
                                } else if (iM98o != 2) {
                                    it7 = it6;
                                    i8 = 3;
                                    if (iM98o != 3) {
                                        i9 = 4;
                                    } else if (iM98o != 4) {
                                        i9 = 1;
                                    } else {
                                        i9 = 5;
                                    }
                                } else {
                                    it7 = it6;
                                    i8 = 3;
                                    i9 = 3;
                                }
                                a96VarM3516o6.m152h(i9);
                                iM100q = a56Var6.m100q() - 1;
                                if (iM100q != 1) {
                                    i8 = 2;
                                } else if (iM100q != 2) {
                                    i8 = 1;
                                }
                                a96VarM3516o6.m153i(i8);
                                arrayList7.add((b96) a96VarM3516o6.m11056e());
                                it5 = it111;
                                list7 = list18;
                                z6 = z17;
                                it6 = it7;
                            }
                        }
                        Iterator it112 = it5;
                        boolean z18 = z6;
                        List list19 = list7;
                        u86VarM5618p6.m11303h(arrayList7);
                        qa6Var2.m9815E(u86VarM5618p6);
                        arrayList5.add(Pair.create((ua6) qa6Var2.m11056e(), (Long) pair6.second));
                        it5 = it112;
                        list7 = list19;
                        z6 = z18;
                    }
                    list6 = arrayList5;
                } else {
                    List listAsList = Arrays.asList(((String) e56.f17798j1.m4379a(null)).split(","));
                    for (Pair pair7 : list2) {
                        try {
                            m9952f0().m3164D(((Long) pair7.second).longValue());
                            for (m96 m96Var2 : ((ua6) pair7.first).m11414O1()) {
                                if (listAsList.contains(m96Var2.m8247r())) {
                                    if (m96Var2.m8247r().equals("_f") || m96Var2.m8247r().equals("_v")) {
                                        l96 l96Var = (l96) m96Var2.m13569g();
                                        m9958i0();
                                        q76.m9759A(l96Var, "_dac", 1L);
                                        m96Var2 = (m96) l96Var.m11056e();
                                    }
                                    ar5 ar5VarM9952f6 = m9952f0();
                                    ar5VarM9952f6.mo5038t();
                                    ar5VarM9952f6.m10368u();
                                    y42.m12851X(str3);
                                    oa6 oa6Var5 = (oa6) ar5VarM9952f6.f36084a;
                                    try {
                                        oa6Var5.mo9019b().f16831L.m12505b(m96Var2, "Caching events in NO_DATA mode");
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("app_id", str3);
                                        m96 m96Var3 = m96Var2;
                                        contentValues.put("name", m96Var3.m8247r());
                                        contentValues.put("data", m96Var3.m5118a());
                                        contentValues.put("timestamp_millis", Long.valueOf(m96Var3.m8249t()));
                                        try {
                                            if (ar5VarM9952f6.m3197l0().insert("no_data_mode_events", null, contentValues) == j2) {
                                                oa6Var5.mo9019b().f16835j.m12505b(d76.m4401y(str3), "Failed to insert NO_DATA mode event (got -1). appId");
                                            }
                                        } catch (SQLiteException e17) {
                                            ((oa6) ar5VarM9952f6.f36084a).mo9019b().f16835j.m12506c("Error storing NO_DATA mode event. appId", d76.m4401y(str3), e17);
                                        }
                                    } catch (SQLiteException unused) {
                                        mo9019b().f16840o.m12505b(str3, "Failed handling NO_DATA mode bundles. appId");
                                    }
                                }
                            }
                        } catch (SQLiteException unused2) {
                        }
                    }
                    i = 34;
                    list6 = Collections.EMPTY_LIST;
                }
                zIsEmpty2 = list6.isEmpty();
                list3 = list6;
                if (zIsEmpty2) {
                    return;
                }
            } else {
                i = 34;
                list3 = list2;
            }
            xc6VarM9947a = m9947a(str);
            vc6Var2 = vc6.AD_STORAGE;
            if (xc6VarM9947a.m12660i(vc6Var2)) {
                i2 = 0;
                listSubList = list3;
                break;
            }
            it4 = list3.iterator();
            while (true) {
                if (it4.hasNext()) {
                    strM11505u2 = null;
                    break;
                }
                ua6Var2 = (ua6) ((Pair) it4.next()).first;
                if (!ua6Var2.m11505u().isEmpty()) {
                    strM11505u2 = ua6Var2.m11505u();
                    break;
                }
            }
            if (strM11505u2 != null) {
                i2 = 0;
                listSubList = list3;
                break;
            }
            i7 = 0;
            while (true) {
                if (i7 < list3.size()) {
                    i2 = 0;
                    listSubList = list3;
                    break;
                }
                ua6Var = (ua6) ((Pair) list3.get(i7)).first;
                if (!ua6Var.m11505u().isEmpty() && !ua6Var.m11505u().equals(strM11505u2)) {
                    i2 = 0;
                    listSubList = list3.subList(0, i7);
                    break;
                }
                i7++;
            }
            fa6VarM9446v = pa6.m9446v();
            size = listSubList.size();
            arrayList = new ArrayList(listSubList.size());
            if (m9950d0().m9231u(str3) || !m9947a(str).m12660i(vc6Var2)) {
                i3 = i2;
            } else {
                i3 = 1;
            }
            zM12660i = m9947a(str).m12660i(vc6Var2);
            zM12660i2 = m9947a(str).m12660i(vc6Var);
            zM9225E2 = m9950d0().m9225E(str3, e56.f17742M0);
            vl6Var = this.f28600j;
            sl6VarM11932u = vl6Var.m11932u(str3);
            list4 = listSubList;
            while (true) {
                oa6Var = this.f28602l;
                if (i2 < size) {
                    break;
                    break;
                }
                qa6Var = (qa6) ((ua6) ((Pair) list4.get(i2)).first).m13569g();
                int i17 = size;
                arrayList.add((Long) ((Pair) list4.get(i2)).second);
                m9950d0().m9235z();
                qa6Var.m9852s();
                qa6Var.m11054c();
                ((ua6) qa6Var.f31181b).m11458e0(j);
                oa6Var.getClass();
                qa6Var.m9819I();
                if (i3 == 0) {
                    qa6Var.m11054c();
                    ((ua6) qa6Var.f31181b).m11422R0();
                }
                if (!zM12660i) {
                    qa6Var.m11054c();
                    ((ua6) qa6Var.f31181b).m11519y1();
                    qa6Var.m11054c();
                    ((ua6) qa6Var.f31181b).m11372A1();
                }
                if (!zM12660i2) {
                    qa6Var.m11054c();
                    ((ua6) qa6Var.f31181b).m11378C1();
                }
                m9978v(str3, qa6Var);
                if (!zM9225E2) {
                    qa6Var.m11054c();
                    ((ua6) qa6Var.f31181b).m11441Y0();
                }
                if (!zM12660i2) {
                    qa6Var.m11054c();
                    ((ua6) qa6Var.f31181b).m11402K1();
                }
                strM11505u = ((ua6) qa6Var.f31181b).m11505u();
                if (TextUtils.isEmpty(strM11505u)) {
                    i5 = i3;
                    if (strM11505u.equals("00000000-0000-0000-0000-000000000000")) {
                        i6 = i2;
                        z4 = zM12660i2;
                        list5 = list4;
                        z5 = zM9225E2;
                    }
                    if (qa6Var.m9832V() != 0) {
                        if (m9950d0().m9225E(str3, e56.f17722C0)) {
                            qa6Var.m9826P(m9958i0().m9796i0(((ua6) qa6Var.m11056e()).m5118a()));
                        }
                        nb6Var = sl6VarM11932u.f30381d;
                        if (nb6Var != null) {
                            qa6Var.m9812B(nb6Var);
                        }
                        fa6VarM9446v.m11054c();
                        ((pa6) fa6VarM9446v.f31181b).m9460y((ua6) qa6Var.m11056e());
                    }
                    i2 = i6 + 1;
                    i3 = i5;
                    size = i17;
                    list4 = list5;
                    zM12660i2 = z4;
                    zM9225E2 = z5;
                } else {
                    i5 = i3;
                }
                arrayList4 = new ArrayList(qa6Var.m9831U());
                it3 = arrayList4.iterator();
                i6 = i2;
                lValueOf = null;
                lValueOf2 = null;
                z2 = false;
                z3 = false;
                while (it3.hasNext()) {
                    zM12660i2 = zM12660i2;
                    m96Var = (m96) it3.next();
                    list4 = list4;
                    zM9225E2 = zM9225E2;
                    if ("_fx".equals(m96Var.m8247r())) {
                        it3.remove();
                        z2 = true;
                    } else if ("_f".equals(m96Var.m8247r())) {
                        m9958i0();
                        x96VarM9761C = q76.m9761C("_pfo", m96Var);
                        if (x96VarM9761C != null) {
                            lValueOf = Long.valueOf(x96VarM9761C.m12551t());
                        }
                        m9958i0();
                        x96VarM9761C2 = q76.m9761C("_uwa", m96Var);
                        if (x96VarM9761C2 != null) {
                            lValueOf2 = Long.valueOf(x96VarM9761C2.m12551t());
                        }
                    } else {
                        list4 = list4;
                        zM12660i2 = zM12660i2;
                        zM9225E2 = zM9225E2;
                    }
                    z3 = true;
                }
                z4 = zM12660i2;
                list5 = list4;
                z5 = zM9225E2;
                if (z2) {
                    qa6Var.m11054c();
                    ((ua6) qa6Var.f31181b).m11443Z();
                    qa6Var.m11054c();
                    ((ua6) qa6Var.f31181b).m11440Y(arrayList4);
                }
                if (z3) {
                    m9977u(qa6Var.m9848o(), true, lValueOf, lValueOf2);
                }
                if (qa6Var.m9832V() != 0) {
                    if (m9950d0().m9225E(str3, e56.f17722C0)) {
                        qa6Var.m9826P(m9958i0().m9796i0(((ua6) qa6Var.m11056e()).m5118a()));
                    }
                    nb6Var = sl6VarM11932u.f30381d;
                    if (nb6Var != null) {
                        qa6Var.m9812B(nb6Var);
                    }
                    fa6VarM9446v.m11054c();
                    ((pa6) fa6VarM9446v.f31181b).m9460y((ua6) qa6Var.m11056e());
                }
                i2 = i6 + 1;
                i3 = i5;
                size = i17;
                list4 = list5;
                zM12660i2 = z4;
                zM9225E2 = z5;
            }
            if (((pa6) fa6VarM9446v.f31181b).m9453p() == 0) {
                m9971p(arrayList);
                m9980x(false, 204, null, null, str3, Collections.EMPTY_LIST);
                return;
            }
            pa6Var = (pa6) fa6VarM9446v.m11056e();
            arrayList2 = new ArrayList();
            ch6Var = sl6VarM11932u.f30380c;
            if (ch6Var == ch6.f16035e) {
                z = true;
            } else {
                z = false;
            }
            if (ch6Var == ch6.f16034d) {
                it = ((pa6) fa6VarM9446v.m11056e()).m9452o().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((ua6) it.next()).m11406M()) {
                            string = UUID.randomUUID().toString();
                            break;
                        }
                    } else {
                        string = null;
                        break;
                    }
                }
                pa6 pa6Var111 = (pa6) fa6VarM9446v.m11056e();
                mo9020c().mo5038t();
                m9962k0();
                fa6VarM9447w = pa6.m9447w(pa6Var111);
                if (!TextUtils.isEmpty(string)) {
                    fa6VarM9447w.m11054c();
                    ((pa6) fa6VarM9447w.f31181b).m9449B(string);
                }
                strM8643H = m9951e0().m8643H(str3);
                if (!TextUtils.isEmpty(strM8643H)) {
                    fa6VarM9447w.m5628i(strM8643H);
                }
                arrayList3 = new ArrayList();
                it2 = pa6Var111.m9452o().iterator();
                while (it2.hasNext()) {
                    qa6 qa6VarM11369U7 = ua6.m11369U((ua6) it2.next());
                    qa6VarM11369U7.m11054c();
                    ((ua6) qa6VarM11369U7.f31181b).m11422R0();
                    arrayList3.add((ua6) qa6VarM11369U7.m11056e());
                }
                fa6VarM9447w.m11054c();
                ((pa6) fa6VarM9447w.f31181b).m9448A();
                fa6VarM9447w.m11054c();
                ((pa6) fa6VarM9447w.f31181b).m9461z(arrayList3);
                x66 x66Var12 = mo9019b().f16831L;
                if (TextUtils.isEmpty(string)) {
                    strM5627h = "null";
                } else {
                    strM5627h = fa6VarM9447w.m5627h();
                }
                x66Var12.m12505b(strM5627h, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                pa6Var2 = (pa6) fa6VarM9447w.m11056e();
                if (TextUtils.isEmpty(string)) {
                    pa6 pa6Var112 = (pa6) fa6VarM9446v.m11056e();
                    mo9020c().mo5038t();
                    m9962k0();
                    fa6VarM9446v2 = pa6.m9446v();
                    mo9019b().f16831L.m12505b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                    fa6VarM9446v2.m11054c();
                    ((pa6) fa6VarM9446v2.f31181b).m9449B(string);
                    while (r0.hasNext()) {
                        qa6 qa6VarM11368T7 = ua6.m11368T();
                        String strM11409N7 = ua6Var3.m11409N();
                        qa6VarM11368T7.m11054c();
                        ((ua6) qa6VarM11368T7.f31181b).m11419Q0(strM11409N7);
                        int iM11398J6 = ua6Var3.m11398J0();
                        qa6VarM11368T7.m11054c();
                        ((ua6) qa6VarM11368T7.f31181b).m11471i1(iM11398J6);
                        fa6VarM9446v2.m11054c();
                        ((pa6) fa6VarM9446v2.f31181b).m9460y((ua6) qa6VarM11368T7.m11056e());
                    }
                    pa6 pa6Var113 = (pa6) fa6VarM9446v2.m11056e();
                    strM8643H2 = vl6Var.f19870f.m9951e0().m8643H(str3);
                    zIsEmpty = TextUtils.isEmpty(strM8643H2);
                    ch6Var2 = ch6.f16033c;
                    ch6Var3 = ch6.f16036f;
                    if (zIsEmpty) {
                        Uri uri7 = Uri.parse((String) e56.f17815s.m4379a(null));
                        Uri.Builder builderBuildUpon7 = uri7.buildUpon();
                        String authority7 = uri7.getAuthority();
                        StringBuilder sb12 = new StringBuilder(String.valueOf(strM8643H2).length() + 1 + String.valueOf(authority7).length());
                        sb12.append(strM8643H2);
                        sb12.append(".");
                        sb12.append(authority7);
                        builderBuildUpon7.authority(sb12.toString());
                        String string8 = builderBuildUpon7.build().toString();
                        if (z) {
                            ch6Var2 = ch6Var3;
                        }
                        str2 = null;
                        sl6Var = new sl6(string8, Collections.EMPTY_MAP, ch6Var2, null);
                    } else {
                        str2 = null;
                        String str10 = (String) e56.f17815s.m4379a(null);
                        if (z) {
                            ch6Var2 = ch6Var3;
                        }
                        sl6Var = new sl6(str10, Collections.EMPTY_MAP, ch6Var2, null);
                    }
                    arrayList2.add(Pair.create(pa6Var113, sl6Var));
                } else {
                    str2 = null;
                }
                if (z) {
                    fa6Var = (fa6) pa6Var2.m13569g();
                    while (i4 < pa6Var2.m9453p()) {
                        qa6 qa6Var10 = (qa6) pa6Var2.m9454q(i4).m13569g();
                        qa6Var10.m9838b0();
                        qa6Var10.m9813C(j);
                        fa6Var.m11054c();
                        ((pa6) fa6Var.f31181b).m9459x(i4, (ua6) qa6Var10.m11056e());
                    }
                    arrayList2.add(Pair.create((pa6) fa6Var.m11056e(), sl6VarM11932u));
                    m9971p(arrayList);
                    m9980x(false, 204, null, null, str, arrayList2);
                    if (m9975s(str, sl6VarM11932u.f30378a)) {
                        mo9019b().f16831L.m12505b(str, "[sgtm] Sending sgtm batches available notification to app");
                        intent = new Intent();
                        intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        intent.setPackage(str);
                        contextMo9021d = oa6Var.mo9021d();
                        if (Build.VERSION.SDK_INT < i) {
                            contextMo9021d.sendBroadcast(intent);
                            return;
                        } else {
                            contextMo9021d.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                            return;
                        }
                    }
                    return;
                }
                str3 = str;
                pa6Var = pa6Var2;
            } else if (z) {
                z = true;
                it = ((pa6) fa6VarM9446v.m11056e()).m9452o().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((ua6) it.next()).m11406M()) {
                            string = UUID.randomUUID().toString();
                            break;
                        }
                    } else {
                        string = null;
                        break;
                    }
                }
                pa6 pa6Var114 = (pa6) fa6VarM9446v.m11056e();
                mo9020c().mo5038t();
                m9962k0();
                fa6VarM9447w = pa6.m9447w(pa6Var114);
                if (!TextUtils.isEmpty(string)) {
                    fa6VarM9447w.m11054c();
                    ((pa6) fa6VarM9447w.f31181b).m9449B(string);
                }
                strM8643H = m9951e0().m8643H(str3);
                if (!TextUtils.isEmpty(strM8643H)) {
                    fa6VarM9447w.m5628i(strM8643H);
                }
                arrayList3 = new ArrayList();
                it2 = pa6Var114.m9452o().iterator();
                while (it2.hasNext()) {
                    qa6 qa6VarM11369U8 = ua6.m11369U((ua6) it2.next());
                    qa6VarM11369U8.m11054c();
                    ((ua6) qa6VarM11369U8.f31181b).m11422R0();
                    arrayList3.add((ua6) qa6VarM11369U8.m11056e());
                }
                fa6VarM9447w.m11054c();
                ((pa6) fa6VarM9447w.f31181b).m9448A();
                fa6VarM9447w.m11054c();
                ((pa6) fa6VarM9447w.f31181b).m9461z(arrayList3);
                x66 x66Var13 = mo9019b().f16831L;
                if (TextUtils.isEmpty(string)) {
                    strM5627h = "null";
                } else {
                    strM5627h = fa6VarM9447w.m5627h();
                }
                x66Var13.m12505b(strM5627h, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                pa6Var2 = (pa6) fa6VarM9447w.m11056e();
                if (TextUtils.isEmpty(string)) {
                    pa6 pa6Var115 = (pa6) fa6VarM9446v.m11056e();
                    mo9020c().mo5038t();
                    m9962k0();
                    fa6VarM9446v2 = pa6.m9446v();
                    mo9019b().f16831L.m12505b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                    fa6VarM9446v2.m11054c();
                    ((pa6) fa6VarM9446v2.f31181b).m9449B(string);
                    while (r0.hasNext()) {
                        qa6 qa6VarM11368T8 = ua6.m11368T();
                        String strM11409N8 = ua6Var3.m11409N();
                        qa6VarM11368T8.m11054c();
                        ((ua6) qa6VarM11368T8.f31181b).m11419Q0(strM11409N8);
                        int iM11398J7 = ua6Var3.m11398J0();
                        qa6VarM11368T8.m11054c();
                        ((ua6) qa6VarM11368T8.f31181b).m11471i1(iM11398J7);
                        fa6VarM9446v2.m11054c();
                        ((pa6) fa6VarM9446v2.f31181b).m9460y((ua6) qa6VarM11368T8.m11056e());
                    }
                    pa6 pa6Var116 = (pa6) fa6VarM9446v2.m11056e();
                    strM8643H2 = vl6Var.f19870f.m9951e0().m8643H(str3);
                    zIsEmpty = TextUtils.isEmpty(strM8643H2);
                    ch6Var2 = ch6.f16033c;
                    ch6Var3 = ch6.f16036f;
                    if (zIsEmpty) {
                        Uri uri8 = Uri.parse((String) e56.f17815s.m4379a(null));
                        Uri.Builder builderBuildUpon8 = uri8.buildUpon();
                        String authority8 = uri8.getAuthority();
                        StringBuilder sb13 = new StringBuilder(String.valueOf(strM8643H2).length() + 1 + String.valueOf(authority8).length());
                        sb13.append(strM8643H2);
                        sb13.append(".");
                        sb13.append(authority8);
                        builderBuildUpon8.authority(sb13.toString());
                        String string9 = builderBuildUpon8.build().toString();
                        if (z) {
                            ch6Var2 = ch6Var3;
                        }
                        str2 = null;
                        sl6Var = new sl6(string9, Collections.EMPTY_MAP, ch6Var2, null);
                    } else {
                        str2 = null;
                        String str11 = (String) e56.f17815s.m4379a(null);
                        if (z) {
                            ch6Var2 = ch6Var3;
                        }
                        sl6Var = new sl6(str11, Collections.EMPTY_MAP, ch6Var2, null);
                    }
                    arrayList2.add(Pair.create(pa6Var116, sl6Var));
                } else {
                    str2 = null;
                }
                if (z) {
                    fa6Var = (fa6) pa6Var2.m13569g();
                    while (i4 < pa6Var2.m9453p()) {
                        qa6 qa6Var11 = (qa6) pa6Var2.m9454q(i4).m13569g();
                        qa6Var11.m9838b0();
                        qa6Var11.m9813C(j);
                        fa6Var.m11054c();
                        ((pa6) fa6Var.f31181b).m9459x(i4, (ua6) qa6Var11.m11056e());
                    }
                    arrayList2.add(Pair.create((pa6) fa6Var.m11056e(), sl6VarM11932u));
                    m9971p(arrayList);
                    m9980x(false, 204, null, null, str, arrayList2);
                    if (m9975s(str, sl6VarM11932u.f30378a)) {
                        mo9019b().f16831L.m12505b(str, "[sgtm] Sending sgtm batches available notification to app");
                        intent = new Intent();
                        intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        intent.setPackage(str);
                        contextMo9021d = oa6Var.mo9021d();
                        if (Build.VERSION.SDK_INT < i) {
                            contextMo9021d.sendBroadcast(intent);
                            return;
                        } else {
                            contextMo9021d.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                            return;
                        }
                    }
                    return;
                }
                str3 = str;
                pa6Var = pa6Var2;
            } else {
                str2 = null;
            }
            q76Var = this.f28592b;
            m9925S(q76Var);
            if (q76Var.m9785O()) {
                if (Log.isLoggable(mo9019b().m4402A(), 2)) {
                    strM9791a0 = m9958i0().m9791a0(pa6Var);
                } else {
                    strM9791a0 = str2;
                }
                m9958i0();
                byte[] bArrM5118a4 = pa6Var.m5118a();
                m9971p(arrayList);
                this.f28599i.f29367m.m8624b(j);
                mo9019b().f16831L.m12507d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrM5118a4.length), strM9791a0);
                this.f28611u = true;
                m9925S(q76Var);
                q76Var.m9786V(str3, sl6VarM11932u, pa6Var, new tt2((qm6) this, str3, arrayList2));
            }
        } catch (Throwable th5) {
            th = th5;
            r14 = r11;
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m9975s(String str, String str2) throws Throwable {
        ar5 ar5Var = this.f28593c;
        m9925S(ar5Var);
        z76 z76VarM3212y0 = ar5Var.m3212y0(str);
        HashMap map = this.f28585E;
        if (z76VarM3212y0 != null && m9960j0().m4596U(str, z76VarM3212y0.m13403C())) {
            map.remove(str2);
            return true;
        }
        nm6 nm6Var = (nm6) map.get(str2);
        if (nm6Var != null) {
            nm6Var.f25950a.mo9022e().getClass();
            if (System.currentTimeMillis() < nm6Var.f25952c) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final void m9976t(String str) {
        pa6 pa6Var;
        mo9020c().mo5038t();
        m9962k0();
        this.f28612v = true;
        try {
            oa6 oa6Var = this.f28602l;
            oa6Var.getClass();
            Boolean bool = oa6Var.m9027n().f26790i;
            if (bool == null) {
                mo9019b().f16838m.m12504a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                mo9019b().f16835j.m12504a("Upload called in the client side when service should be used");
            } else if (this.f28605o > 0) {
                m9936L();
            } else {
                q76 q76Var = this.f28592b;
                m9925S(q76Var);
                if (q76Var.m9785O()) {
                    ar5 ar5Var = this.f28593c;
                    m9925S(ar5Var);
                    if (ar5Var.m3158A(str)) {
                        ar5 ar5Var2 = this.f28593c;
                        m9925S(ar5Var2);
                        y42.m12851X(str);
                        ar5Var2.mo5038t();
                        ar5Var2.m10368u();
                        List listM3213z = ar5Var2.m3213z(str, ll6.m8036a(ch6.f16033c), 1);
                        um6 um6Var = listM3213z.isEmpty() ? null : (um6) listM3213z.get(0);
                        if (um6Var != null && (pa6Var = um6Var.f31999b) != null) {
                            mo9019b().f16831L.m12507d("[sgtm] Uploading data from upload queue. appId, type, url", str, um6Var.f32002e, um6Var.f32000c);
                            byte[] bArrM5118a = pa6Var.m5118a();
                            if (Log.isLoggable(mo9019b().m4402A(), 2)) {
                                q76 q76Var2 = this.f28597g;
                                m9925S(q76Var2);
                                mo9019b().f16831L.m12507d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrM5118a.length), q76Var2.m9791a0(pa6Var));
                            }
                            sl6 sl6Var = new sl6(um6Var.f32000c, um6Var.f32001d, um6Var.f32002e, null);
                            this.f28611u = true;
                            q76 q76Var3 = this.f28592b;
                            m9925S(q76Var3);
                            xl6 xl6Var = new xl6();
                            xl6Var.f34400a = str;
                            xl6Var.f34401b = um6Var;
                            xl6Var.f34402c = this;
                            VarHandle.storeStoreFence();
                            q76Var3.m9786V(str, sl6Var, pa6Var, xl6Var);
                        }
                    } else {
                        mo9019b().f16831L.m12505b(str, "[sgtm] Upload queue has no batches for appId");
                    }
                } else {
                    mo9019b().f16831L.m12504a("Network not connected, ignoring upload request");
                    m9936L();
                }
            }
        } finally {
            this.f28612v = false;
            m9937M();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m9977u(String str, boolean z, Long l, Long l2) throws Throwable {
        ar5 ar5Var = this.f28593c;
        m9925S(ar5Var);
        z76 z76VarM3212y0 = ar5Var.m3212y0(str);
        if (z76VarM3212y0 != null) {
            oa6 oa6Var = z76VarM3212y0.f35837a;
            ea6 ea6Var = oa6Var.f26515g;
            oa6.m9016l(ea6Var);
            ea6Var.mo5038t();
            z76VarM3212y0.f35834Q |= z76VarM3212y0.f35861y != z;
            z76VarM3212y0.f35861y = z;
            ea6 ea6Var2 = oa6Var.f26515g;
            oa6.m9016l(ea6Var2);
            ea6Var2.mo5038t();
            z76VarM3212y0.f35834Q |= !Objects.equals(z76VarM3212y0.f35862z, l);
            z76VarM3212y0.f35862z = l;
            ea6 ea6Var3 = oa6Var.f26515g;
            oa6.m9016l(ea6Var3);
            ea6Var3.mo5038t();
            z76VarM3212y0.f35834Q |= !Objects.equals(z76VarM3212y0.f35818A, l2);
            z76VarM3212y0.f35818A = l2;
            if (z76VarM3212y0.m13434o()) {
                ar5 ar5Var2 = this.f28593c;
                m9925S(ar5Var2);
                ar5Var2.m3214z0(z76VarM3212y0, false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0121  */
    /* JADX INFO: renamed from: v */
    public final void m9978v(String str, qa6 qa6Var) {
        int iM9778l0;
        int iIndexOf;
        n96 n96Var = this.f28591a;
        m9925S(n96Var);
        n96Var.mo5038t();
        n96Var.m8638A(str);
        C0805jo c0805jo = n96Var.f25582i;
        Set set = (Set) c0805jo.get(str);
        if (set != null) {
            qa6Var.m11054c();
            ((ua6) qa6Var.f31181b).m11444Z0(set);
        }
        m9925S(n96Var);
        n96Var.mo5038t();
        n96Var.m8638A(str);
        if (c0805jo.get(str) != null && (((Set) c0805jo.get(str)).contains("device_model") || ((Set) c0805jo.get(str)).contains("device_info"))) {
            qa6Var.m11054c();
            ((ua6) qa6Var.f31181b).m11492p1();
        }
        m9925S(n96Var);
        if (n96Var.m8648M(str)) {
            String strM11469h2 = ((ua6) qa6Var.f31181b).m11469h2();
            if (!TextUtils.isEmpty(strM11469h2) && (iIndexOf = strM11469h2.indexOf(".")) != -1) {
                String strSubstring = strM11469h2.substring(0, iIndexOf);
                qa6Var.m11054c();
                ((ua6) qa6Var.f31181b).m11485n0(strSubstring);
            }
        }
        m9925S(n96Var);
        n96Var.mo5038t();
        n96Var.m8638A(str);
        if (c0805jo.get(str) != null && ((Set) c0805jo.get(str)).contains("user_id") && (iM9778l0 = q76.m9778l0("_id", qa6Var)) != -1) {
            qa6Var.m11054c();
            ((ua6) qa6Var.f31181b).m11455d0(iM9778l0);
        }
        m9925S(n96Var);
        n96Var.mo5038t();
        n96Var.m8638A(str);
        if (c0805jo.get(str) != null && ((Set) c0805jo.get(str)).contains("google_signals")) {
            qa6Var.m11054c();
            ((ua6) qa6Var.f31181b).m11422R0();
        }
        m9925S(n96Var);
        if (n96Var.m8649N(str)) {
            qa6Var.m11054c();
            ((ua6) qa6Var.f31181b).m11378C1();
            if (m9947a(str).m12660i(vc6.ANALYTICS_STORAGE)) {
                HashMap map = this.f28584D;
                km6 km6Var = (km6) map.get(str);
                if (km6Var != null) {
                    long jM9222B = m9950d0().m9222B(str, e56.f17800k0) + km6Var.f23243b;
                    mo9022e().getClass();
                    if (jM9222B < SystemClock.elapsedRealtime()) {
                        km6Var = new km6(this, m9960j0().m4610m0());
                        map.put(str, km6Var);
                    }
                } else {
                    km6Var = new km6(this, m9960j0().m4610m0());
                    map.put(str, km6Var);
                }
                String str2 = km6Var.f23242a;
                qa6Var.m11054c();
                ((ua6) qa6Var.f31181b).m11447a1(str2);
            }
        }
        m9925S(n96Var);
        n96Var.mo5038t();
        n96Var.m8638A(str);
        if (c0805jo.get(str) == null || !((Set) c0805jo.get(str)).contains("enhanced_user_id")) {
            return;
        }
        qa6Var.m11054c();
        ((ua6) qa6Var.f31181b).m11441Y0();
    }

    /* JADX INFO: renamed from: w */
    public final void m9979w(String str, u96 u96Var, Bundle bundle, String str2) {
        d56 d56Var;
        int iMax;
        List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
        if (dn6.m4569S(((x96) u96Var.f31181b).m12547p()) || dn6.m4569S(str)) {
            op5 op5VarM9950d0 = m9950d0();
            op5VarM9950d0.getClass();
            d56Var = e56.f17791h0;
            iMax = Math.max(Math.max(Math.min(op5VarM9950d0.m9223C(str2, d56Var), 500), 100), 256);
        } else {
            op5 op5VarM9950d1 = m9950d0();
            op5VarM9950d1.getClass();
            d56Var = e56.f17791h0;
            iMax = Math.max(Math.min(op5VarM9950d1.m9223C(str2, d56Var), 500), 100);
        }
        long j = iMax;
        long jCodePointCount = ((x96) u96Var.f31181b).m12549r().codePointCount(0, ((x96) u96Var.f31181b).m12549r().length());
        m9960j0();
        String strM12547p = ((x96) u96Var.f31181b).m12547p();
        m9950d0();
        String strM4577z = dn6.m4577z(strM12547p, true, 40);
        if (jCodePointCount <= j || listUnmodifiableList.contains(((x96) u96Var.f31181b).m12547p())) {
            return;
        }
        if ("_ev".equals(((x96) u96Var.f31181b).m12547p())) {
            m9960j0();
            String strM12549r = ((x96) u96Var.f31181b).m12549r();
            op5 op5VarM9950d2 = m9950d0();
            op5VarM9950d2.getClass();
            bundle.putString("_ev", dn6.m4577z(strM12549r, true, Math.max(Math.max(Math.min(op5VarM9950d2.m9223C(str2, d56Var), 500), 100), 256)));
            return;
        }
        mo9019b().f16840o.m12506c("Param value is too long; discarded. Name, value length", strM4577z, Long.valueOf(jCodePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strM4577z);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(((x96) u96Var.f31181b).m12547p());
    }

    /* JADX WARN: Code duplicated, block: B:110:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x015f A[EDGE_INSN: B:113:0x015f->B:55:0x015f BREAK  A[LOOP:0: B:37:0x00f7->B:115:0x00f7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0091 A[Catch: all -> 0x0252, PHI: r0
  0x0091: PHI (r0v4 int) = (r0v0 int), (r0v38 int) binds: [B:10:0x0026, B:16:0x0031] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0252, blocks: (B:9:0x001e, B:24:0x0091, B:30:0x00bc, B:35:0x00e6, B:83:0x022e, B:85:0x0241, B:87:0x024c, B:97:0x026e, B:91:0x0255, B:93:0x025e, B:95:0x0264, B:96:0x0268, B:99:0x0272, B:100:0x027a, B:34:0x00db, B:101:0x027b, B:26:0x00a6, B:32:0x00ca), top: B:107:0x001e, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ca A[Catch: all -> 0x0018, SQLiteException -> 0x00b9, TRY_ENTER, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x00b9, blocks: (B:26:0x00a6, B:30:0x00bc, B:32:0x00ca, B:35:0x00e6, B:83:0x022e, B:85:0x0241, B:87:0x024c, B:97:0x026e, B:91:0x0255, B:93:0x025e, B:95:0x0264, B:96:0x0268, B:99:0x0272, B:100:0x027a, B:34:0x00db), top: B:110:0x00a6, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00db A[Catch: SQLiteException -> 0x00b9, all -> 0x0252, TRY_ENTER, TryCatch #2 {SQLiteException -> 0x00b9, blocks: (B:26:0x00a6, B:30:0x00bc, B:32:0x00ca, B:35:0x00e6, B:83:0x022e, B:85:0x0241, B:87:0x024c, B:97:0x026e, B:91:0x0255, B:93:0x025e, B:95:0x0264, B:96:0x0268, B:99:0x0272, B:100:0x027a, B:34:0x00db), top: B:110:0x00a6, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0101 A[Catch: all -> 0x015c, TRY_ENTER, TryCatch #4 {all -> 0x015c, blocks: (B:36:0x00ee, B:37:0x00f7, B:40:0x0101, B:42:0x0113, B:44:0x011f, B:45:0x0121, B:49:0x0141, B:51:0x014b, B:55:0x015f, B:56:0x0166, B:58:0x016c, B:60:0x017f, B:62:0x0196, B:63:0x0198, B:65:0x01a8, B:67:0x01c3, B:69:0x01e9, B:70:0x01f8, B:72:0x01ff, B:73:0x0209, B:76:0x021a, B:78:0x021e, B:81:0x0225, B:82:0x0226), top: B:112:0x00ee, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x011f A[Catch: all -> 0x015c, TryCatch #4 {all -> 0x015c, blocks: (B:36:0x00ee, B:37:0x00f7, B:40:0x0101, B:42:0x0113, B:44:0x011f, B:45:0x0121, B:49:0x0141, B:51:0x014b, B:55:0x015f, B:56:0x0166, B:58:0x016c, B:60:0x017f, B:62:0x0196, B:63:0x0198, B:65:0x01a8, B:67:0x01c3, B:69:0x01e9, B:70:0x01f8, B:72:0x01ff, B:73:0x0209, B:76:0x021a, B:78:0x021e, B:81:0x0225, B:82:0x0226), top: B:112:0x00ee, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x013d  */
    /* JADX WARN: Code duplicated, block: B:58:0x016c A[Catch: all -> 0x015c, TryCatch #4 {all -> 0x015c, blocks: (B:36:0x00ee, B:37:0x00f7, B:40:0x0101, B:42:0x0113, B:44:0x011f, B:45:0x0121, B:49:0x0141, B:51:0x014b, B:55:0x015f, B:56:0x0166, B:58:0x016c, B:60:0x017f, B:62:0x0196, B:63:0x0198, B:65:0x01a8, B:67:0x01c3, B:69:0x01e9, B:70:0x01f8, B:72:0x01ff, B:73:0x0209, B:76:0x021a, B:78:0x021e, B:81:0x0225, B:82:0x0226), top: B:112:0x00ee, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0196 A[Catch: all -> 0x015c, TryCatch #4 {all -> 0x015c, blocks: (B:36:0x00ee, B:37:0x00f7, B:40:0x0101, B:42:0x0113, B:44:0x011f, B:45:0x0121, B:49:0x0141, B:51:0x014b, B:55:0x015f, B:56:0x0166, B:58:0x016c, B:60:0x017f, B:62:0x0196, B:63:0x0198, B:65:0x01a8, B:67:0x01c3, B:69:0x01e9, B:70:0x01f8, B:72:0x01ff, B:73:0x0209, B:76:0x021a, B:78:0x021e, B:81:0x0225, B:82:0x0226), top: B:112:0x00ee, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01c3 A[Catch: all -> 0x015c, TryCatch #4 {all -> 0x015c, blocks: (B:36:0x00ee, B:37:0x00f7, B:40:0x0101, B:42:0x0113, B:44:0x011f, B:45:0x0121, B:49:0x0141, B:51:0x014b, B:55:0x015f, B:56:0x0166, B:58:0x016c, B:60:0x017f, B:62:0x0196, B:63:0x0198, B:65:0x01a8, B:67:0x01c3, B:69:0x01e9, B:70:0x01f8, B:72:0x01ff, B:73:0x0209, B:76:0x021a, B:78:0x021e, B:81:0x0225, B:82:0x0226), top: B:112:0x00ee, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01e9 A[Catch: all -> 0x015c, TryCatch #4 {all -> 0x015c, blocks: (B:36:0x00ee, B:37:0x00f7, B:40:0x0101, B:42:0x0113, B:44:0x011f, B:45:0x0121, B:49:0x0141, B:51:0x014b, B:55:0x015f, B:56:0x0166, B:58:0x016c, B:60:0x017f, B:62:0x0196, B:63:0x0198, B:65:0x01a8, B:67:0x01c3, B:69:0x01e9, B:70:0x01f8, B:72:0x01ff, B:73:0x0209, B:76:0x021a, B:78:0x021e, B:81:0x0225, B:82:0x0226), top: B:112:0x00ee, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01ff A[Catch: all -> 0x015c, TRY_LEAVE, TryCatch #4 {all -> 0x015c, blocks: (B:36:0x00ee, B:37:0x00f7, B:40:0x0101, B:42:0x0113, B:44:0x011f, B:45:0x0121, B:49:0x0141, B:51:0x014b, B:55:0x015f, B:56:0x0166, B:58:0x016c, B:60:0x017f, B:62:0x0196, B:63:0x0198, B:65:0x01a8, B:67:0x01c3, B:69:0x01e9, B:70:0x01f8, B:72:0x01ff, B:73:0x0209, B:76:0x021a, B:78:0x021e, B:81:0x0225, B:82:0x0226), top: B:112:0x00ee, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0241 A[Catch: SQLiteException -> 0x00b9, all -> 0x0252, TryCatch #2 {SQLiteException -> 0x00b9, blocks: (B:26:0x00a6, B:30:0x00bc, B:32:0x00ca, B:35:0x00e6, B:83:0x022e, B:85:0x0241, B:87:0x024c, B:97:0x026e, B:91:0x0255, B:93:0x025e, B:95:0x0264, B:96:0x0268, B:99:0x0272, B:100:0x027a, B:34:0x00db), top: B:110:0x00a6, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x024c A[Catch: SQLiteException -> 0x00b9, all -> 0x0252, TryCatch #2 {SQLiteException -> 0x00b9, blocks: (B:26:0x00a6, B:30:0x00bc, B:32:0x00ca, B:35:0x00e6, B:83:0x022e, B:85:0x0241, B:87:0x024c, B:97:0x026e, B:91:0x0255, B:93:0x025e, B:95:0x0264, B:96:0x0268, B:99:0x0272, B:100:0x027a, B:34:0x00db), top: B:110:0x00a6, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0255 A[Catch: SQLiteException -> 0x00b9, all -> 0x0252, TryCatch #2 {SQLiteException -> 0x00b9, blocks: (B:26:0x00a6, B:30:0x00bc, B:32:0x00ca, B:35:0x00e6, B:83:0x022e, B:85:0x0241, B:87:0x024c, B:97:0x026e, B:91:0x0255, B:93:0x025e, B:95:0x0264, B:96:0x0268, B:99:0x0272, B:100:0x027a, B:34:0x00db), top: B:110:0x00a6, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x025e A[Catch: SQLiteException -> 0x00b9, all -> 0x0252, TryCatch #2 {SQLiteException -> 0x00b9, blocks: (B:26:0x00a6, B:30:0x00bc, B:32:0x00ca, B:35:0x00e6, B:83:0x022e, B:85:0x0241, B:87:0x024c, B:97:0x026e, B:91:0x0255, B:93:0x025e, B:95:0x0264, B:96:0x0268, B:99:0x0272, B:100:0x027a, B:34:0x00db), top: B:110:0x00a6, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0268 A[Catch: SQLiteException -> 0x00b9, all -> 0x0252, TryCatch #2 {SQLiteException -> 0x00b9, blocks: (B:26:0x00a6, B:30:0x00bc, B:32:0x00ca, B:35:0x00e6, B:83:0x022e, B:85:0x0241, B:87:0x024c, B:97:0x026e, B:91:0x0255, B:93:0x025e, B:95:0x0264, B:96:0x0268, B:99:0x0272, B:100:0x027a, B:34:0x00db), top: B:110:0x00a6, outer: #0 }] */
    /* JADX INFO: renamed from: x */
    public final void m9980x(boolean z, int i, Throwable th, byte[] bArr, String str, List list) {
        boolean z2;
        byte[] bArr2;
        Integer numValueOf;
        boolean z3;
        HashMap map;
        Iterator it;
        boolean zHasNext;
        ch6 ch6Var;
        ArrayList arrayList;
        Iterator it2;
        List listM3213z;
        int size;
        int i2;
        ar5 ar5Var;
        Long l;
        long j;
        pa6 pa6Var;
        sl6 sl6Var;
        Map map2;
        pa6 pa6Var2;
        sl6 sl6Var2;
        Map map3;
        long jM3211y;
        int i3 = i;
        q76 q76Var = this.f28592b;
        mo9020c().mo5038t();
        m9962k0();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } catch (Throwable th2) {
                th = th2;
                z2 = false;
                this.f28611u = z2;
                m9937M();
                throw th;
            }
        } else {
            bArr2 = bArr;
        }
        try {
            ArrayList arrayList2 = this.f28615y;
            y42.m12854a0(arrayList2);
            this.f28615y = null;
            if (z) {
                if (i3 == 200) {
                    if (th != null) {
                        x66 x66Var = mo9019b().f16831L;
                        numValueOf = Integer.valueOf(i3);
                        x66Var.m12506c("Network upload successful with code, uploadAttempted", numValueOf, Boolean.valueOf(z));
                        if (z) {
                            n86 n86Var = this.f28599i.f29366l;
                            mo9022e().getClass();
                            n86Var.m8624b(System.currentTimeMillis());
                        }
                        this.f28599i.f29367m.m8624b(0L);
                        m9936L();
                        if (z) {
                            mo9019b().f16831L.m12506c("Successful upload. Got network response. code, size", numValueOf, Integer.valueOf(bArr2.length));
                        } else {
                            mo9019b().f16831L.m12504a("Purged empty bundles");
                        }
                        ar5 ar5Var2 = this.f28593c;
                        m9925S(ar5Var2);
                        ar5Var2.m3194i0();
                        map = new HashMap();
                        it = list.iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            ch6Var = ch6.f16035e;
                            if (!zHasNext) {
                                break;
                                break;
                            }
                            Pair pair = (Pair) it.next();
                            pa6Var2 = (pa6) pair.first;
                            sl6Var2 = (sl6) pair.second;
                            if (sl6Var2.f30380c != ch6Var) {
                                ar5 ar5Var3 = this.f28593c;
                                m9925S(ar5Var3);
                                String str2 = sl6Var2.f30378a;
                                map3 = sl6Var2.f30379b;
                                if (map3 == null) {
                                    map3 = Collections.EMPTY_MAP;
                                }
                                ArrayList arrayList3 = arrayList2;
                                jM3211y = ar5Var3.m3211y(str, pa6Var2, str2, map3, sl6Var2.f30380c, null);
                                if (sl6Var2.f30380c == ch6.f16036f) {
                                    map.put(pa6Var2.m9456s(), Long.valueOf(jM3211y));
                                }
                                arrayList2 = arrayList3;
                            }
                        }
                        arrayList = arrayList2;
                        it2 = list.iterator();
                        while (it2.hasNext()) {
                            Pair pair2 = (Pair) it2.next();
                            pa6Var = (pa6) pair2.first;
                            sl6Var = (sl6) pair2.second;
                            if (sl6Var.f30380c == ch6Var) {
                                Long l2 = (Long) map.get(pa6Var.m9456s());
                                ar5 ar5Var4 = this.f28593c;
                                m9925S(ar5Var4);
                                ch6 ch6Var2 = ch6Var;
                                String str3 = sl6Var.f30378a;
                                map2 = sl6Var.f30379b;
                                if (map2 == null) {
                                    map2 = Collections.EMPTY_MAP;
                                }
                                ar5Var4.m3211y(str, pa6Var, str3, map2, sl6Var.f30380c, l2);
                                ch6Var = ch6Var2;
                            }
                        }
                        ar5 ar5Var5 = this.f28593c;
                        m9925S(ar5Var5);
                        listM3213z = ar5Var5.m3213z(str, ll6.m8036a(ch6Var), 1);
                        if (!listM3213z.isEmpty()) {
                            j = ((um6) listM3213z.get(0)).f32003f;
                            mo9022e().getClass();
                            if (System.currentTimeMillis() > j + ((Long) e56.f17727F.m4379a(null)).longValue()) {
                                mo9019b().f16838m.m12506c("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(j));
                            }
                        }
                        size = arrayList.size();
                        i2 = 0;
                        while (i2 < size) {
                            ArrayList arrayList4 = arrayList;
                            int i4 = i2 + 1;
                            l = (Long) arrayList4.get(i2);
                            ar5 ar5Var6 = this.f28593c;
                            m9925S(ar5Var6);
                            ar5Var6.m3164D(l.longValue());
                            arrayList = arrayList4;
                            i2 = i4;
                        }
                        ar5 ar5Var7 = this.f28593c;
                        m9925S(ar5Var7);
                        ar5Var7.m3195j0();
                        ar5 ar5Var8 = this.f28593c;
                        m9925S(ar5Var8);
                        ar5Var8.m3196k0();
                        this.f28616z = null;
                        m9925S(q76Var);
                        if (q76Var.m9785O()) {
                            ar5Var = this.f28593c;
                            m9925S(ar5Var);
                            if (ar5Var.m3158A(str)) {
                                m9976t(str);
                            } else {
                                m9925S(q76Var);
                                if (q76Var.m9785O()) {
                                    this.f28581A = -1L;
                                    m9936L();
                                } else {
                                    this.f28581A = -1L;
                                    m9936L();
                                }
                            }
                        } else {
                            m9925S(q76Var);
                            if (q76Var.m9785O()) {
                                this.f28581A = -1L;
                                m9936L();
                            } else {
                                this.f28581A = -1L;
                                m9936L();
                            }
                        }
                        this.f28605o = 0L;
                        z3 = false;
                    }
                } else if (i3 == 204) {
                    i3 = 204;
                    if (th != null) {
                        x66 x66Var2 = mo9019b().f16831L;
                        numValueOf = Integer.valueOf(i3);
                        x66Var2.m12506c("Network upload successful with code, uploadAttempted", numValueOf, Boolean.valueOf(z));
                        if (z) {
                            n86 n86Var2 = this.f28599i.f29366l;
                            mo9022e().getClass();
                            n86Var2.m8624b(System.currentTimeMillis());
                        }
                        this.f28599i.f29367m.m8624b(0L);
                        m9936L();
                        if (z) {
                            mo9019b().f16831L.m12506c("Successful upload. Got network response. code, size", numValueOf, Integer.valueOf(bArr2.length));
                        } else {
                            mo9019b().f16831L.m12504a("Purged empty bundles");
                        }
                        ar5 ar5Var9 = this.f28593c;
                        m9925S(ar5Var9);
                        ar5Var9.m3194i0();
                        map = new HashMap();
                        it = list.iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            ch6Var = ch6.f16035e;
                            if (!zHasNext) {
                                break;
                                break;
                            }
                            Pair pair3 = (Pair) it.next();
                            pa6Var2 = (pa6) pair3.first;
                            sl6Var2 = (sl6) pair3.second;
                            if (sl6Var2.f30380c != ch6Var) {
                                ar5 ar5Var10 = this.f28593c;
                                m9925S(ar5Var10);
                                String str4 = sl6Var2.f30378a;
                                map3 = sl6Var2.f30379b;
                                if (map3 == null) {
                                    map3 = Collections.EMPTY_MAP;
                                }
                                ArrayList arrayList5 = arrayList2;
                                jM3211y = ar5Var10.m3211y(str, pa6Var2, str4, map3, sl6Var2.f30380c, null);
                                if (sl6Var2.f30380c == ch6.f16036f) {
                                    map.put(pa6Var2.m9456s(), Long.valueOf(jM3211y));
                                }
                                arrayList2 = arrayList5;
                            }
                        }
                        arrayList = arrayList2;
                        it2 = list.iterator();
                        while (it2.hasNext()) {
                            Pair pair4 = (Pair) it2.next();
                            pa6Var = (pa6) pair4.first;
                            sl6Var = (sl6) pair4.second;
                            if (sl6Var.f30380c == ch6Var) {
                                Long l3 = (Long) map.get(pa6Var.m9456s());
                                ar5 ar5Var11 = this.f28593c;
                                m9925S(ar5Var11);
                                ch6 ch6Var3 = ch6Var;
                                String str5 = sl6Var.f30378a;
                                map2 = sl6Var.f30379b;
                                if (map2 == null) {
                                    map2 = Collections.EMPTY_MAP;
                                }
                                ar5Var11.m3211y(str, pa6Var, str5, map2, sl6Var.f30380c, l3);
                                ch6Var = ch6Var3;
                            }
                        }
                        ar5 ar5Var12 = this.f28593c;
                        m9925S(ar5Var12);
                        listM3213z = ar5Var12.m3213z(str, ll6.m8036a(ch6Var), 1);
                        if (!listM3213z.isEmpty()) {
                            j = ((um6) listM3213z.get(0)).f32003f;
                            mo9022e().getClass();
                            if (System.currentTimeMillis() > j + ((Long) e56.f17727F.m4379a(null)).longValue()) {
                                mo9019b().f16838m.m12506c("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(j));
                            }
                        }
                        size = arrayList.size();
                        i2 = 0;
                        while (i2 < size) {
                            ArrayList arrayList6 = arrayList;
                            int i5 = i2 + 1;
                            l = (Long) arrayList6.get(i2);
                            ar5 ar5Var13 = this.f28593c;
                            m9925S(ar5Var13);
                            ar5Var13.m3164D(l.longValue());
                            arrayList = arrayList6;
                            i2 = i5;
                        }
                        ar5 ar5Var14 = this.f28593c;
                        m9925S(ar5Var14);
                        ar5Var14.m3195j0();
                        ar5 ar5Var15 = this.f28593c;
                        m9925S(ar5Var15);
                        ar5Var15.m3196k0();
                        this.f28616z = null;
                        m9925S(q76Var);
                        if (q76Var.m9785O()) {
                            ar5Var = this.f28593c;
                            m9925S(ar5Var);
                            if (ar5Var.m3158A(str)) {
                                m9976t(str);
                            } else {
                                m9925S(q76Var);
                                if (q76Var.m9785O()) {
                                    this.f28581A = -1L;
                                    m9936L();
                                } else {
                                    this.f28581A = -1L;
                                    m9936L();
                                }
                            }
                        } else {
                            m9925S(q76Var);
                            if (q76Var.m9785O()) {
                                this.f28581A = -1L;
                                m9936L();
                            } else {
                                this.f28581A = -1L;
                                m9936L();
                            }
                        }
                        this.f28605o = 0L;
                        z3 = false;
                    }
                }
                String str6 = new String(bArr2, StandardCharsets.UTF_8);
                mo9019b().f16840o.m12507d("Network upload failed. Will retry later. code, error", Integer.valueOf(i3), th, str6.substring(0, Math.min(32, str6.length())));
                n86 n86Var3 = this.f28599i.f29367m;
                mo9022e().getClass();
                n86Var3.m8624b(System.currentTimeMillis());
                if (i3 == 503 || i3 == 429) {
                    n86 n86Var4 = this.f28599i.f29365k;
                    mo9022e().getClass();
                    n86Var4.m8624b(System.currentTimeMillis());
                }
                ar5 ar5Var16 = this.f28593c;
                m9925S(ar5Var16);
                ar5Var16.m3167F(arrayList2);
                m9936L();
                z3 = false;
            } else {
                x66 x66Var3 = mo9019b().f16831L;
                numValueOf = Integer.valueOf(i3);
                x66Var3.m12506c("Network upload successful with code, uploadAttempted", numValueOf, Boolean.valueOf(z));
                if (z) {
                    try {
                        n86 n86Var5 = this.f28599i.f29366l;
                        mo9022e().getClass();
                        n86Var5.m8624b(System.currentTimeMillis());
                    } catch (SQLiteException e) {
                        mo9019b().f16835j.m12505b(e, "Database error while trying to delete uploaded bundles");
                        mo9022e().getClass();
                        this.f28605o = SystemClock.elapsedRealtime();
                        mo9019b().f16831L.m12505b(Long.valueOf(this.f28605o), "Disable upload, time");
                    }
                }
                this.f28599i.f29367m.m8624b(0L);
                m9936L();
                if (z) {
                    mo9019b().f16831L.m12506c("Successful upload. Got network response. code, size", numValueOf, Integer.valueOf(bArr2.length));
                } else {
                    mo9019b().f16831L.m12504a("Purged empty bundles");
                }
                ar5 ar5Var17 = this.f28593c;
                m9925S(ar5Var17);
                ar5Var17.m3194i0();
                try {
                    map = new HashMap();
                    it = list.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        ch6Var = ch6.f16035e;
                        if (!zHasNext) {
                            break;
                        }
                        Pair pair5 = (Pair) it.next();
                        pa6Var2 = (pa6) pair5.first;
                        sl6Var2 = (sl6) pair5.second;
                        if (sl6Var2.f30380c != ch6Var) {
                            ar5 ar5Var18 = this.f28593c;
                            m9925S(ar5Var18);
                            String str7 = sl6Var2.f30378a;
                            map3 = sl6Var2.f30379b;
                            if (map3 == null) {
                                map3 = Collections.EMPTY_MAP;
                            }
                            ArrayList arrayList7 = arrayList2;
                            jM3211y = ar5Var18.m3211y(str, pa6Var2, str7, map3, sl6Var2.f30380c, null);
                            if (sl6Var2.f30380c == ch6.f16036f && jM3211y != -1 && !pa6Var2.m9456s().isEmpty()) {
                                map.put(pa6Var2.m9456s(), Long.valueOf(jM3211y));
                            }
                            arrayList2 = arrayList7;
                        }
                    }
                    arrayList = arrayList2;
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        Pair pair6 = (Pair) it2.next();
                        pa6Var = (pa6) pair6.first;
                        sl6Var = (sl6) pair6.second;
                        if (sl6Var.f30380c == ch6Var) {
                            Long l4 = (Long) map.get(pa6Var.m9456s());
                            ar5 ar5Var19 = this.f28593c;
                            m9925S(ar5Var19);
                            ch6 ch6Var4 = ch6Var;
                            String str8 = sl6Var.f30378a;
                            map2 = sl6Var.f30379b;
                            if (map2 == null) {
                                map2 = Collections.EMPTY_MAP;
                            }
                            ar5Var19.m3211y(str, pa6Var, str8, map2, sl6Var.f30380c, l4);
                            ch6Var = ch6Var4;
                        }
                    }
                    ar5 ar5Var110 = this.f28593c;
                    m9925S(ar5Var110);
                    listM3213z = ar5Var110.m3213z(str, ll6.m8036a(ch6Var), 1);
                    if (!listM3213z.isEmpty()) {
                        j = ((um6) listM3213z.get(0)).f32003f;
                        mo9022e().getClass();
                        if (System.currentTimeMillis() > j + ((Long) e56.f17727F.m4379a(null)).longValue()) {
                            mo9019b().f16838m.m12506c("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(j));
                        }
                    }
                    size = arrayList.size();
                    i2 = 0;
                    while (i2 < size) {
                        ArrayList arrayList8 = arrayList;
                        int i6 = i2 + 1;
                        l = (Long) arrayList8.get(i2);
                        try {
                            ar5 ar5Var111 = this.f28593c;
                            m9925S(ar5Var111);
                            ar5Var111.m3164D(l.longValue());
                        } catch (SQLiteException e2) {
                            ArrayList arrayList9 = this.f28616z;
                            if (arrayList9 == null || !arrayList9.contains(l)) {
                                throw e2;
                            }
                        }
                        arrayList = arrayList8;
                        i2 = i6;
                    }
                    ar5 ar5Var112 = this.f28593c;
                    m9925S(ar5Var112);
                    ar5Var112.m3195j0();
                    ar5 ar5Var113 = this.f28593c;
                    m9925S(ar5Var113);
                    ar5Var113.m3196k0();
                    this.f28616z = null;
                    m9925S(q76Var);
                    if (q76Var.m9785O()) {
                        ar5Var = this.f28593c;
                        m9925S(ar5Var);
                        if (ar5Var.m3158A(str)) {
                            m9976t(str);
                        } else {
                            m9925S(q76Var);
                            if (q76Var.m9785O() || !m9935J()) {
                                this.f28581A = -1L;
                                m9936L();
                            } else {
                                m9973q();
                            }
                        }
                    } else {
                        m9925S(q76Var);
                        if (q76Var.m9785O()) {
                            this.f28581A = -1L;
                            m9936L();
                        } else {
                            this.f28581A = -1L;
                            m9936L();
                        }
                    }
                    this.f28605o = 0L;
                    z3 = false;
                } catch (Throwable th3) {
                    ar5 ar5Var20 = this.f28593c;
                    m9925S(ar5Var20);
                    ar5Var20.m3196k0();
                    throw th3;
                }
            }
            this.f28611u = z3;
            m9937M();
        } catch (Throwable th4) {
            th = th4;
            z2 = false;
            this.f28611u = z2;
            m9937M();
            throw th;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m9981y(z76 z76Var) {
        C0805jo c0805jo;
        C0805jo c0805jo2;
        mo9020c().mo5038t();
        if (TextUtils.isEmpty(z76Var.m13407G())) {
            String strM13404D = z76Var.m13404D();
            y42.m12854a0(strM13404D);
            m9982z(strM13404D, 204, null, null, null);
            return;
        }
        String strM13404D2 = z76Var.m13404D();
        y42.m12854a0(strM13404D2);
        mo9019b().f16831L.m12505b(strM13404D2, "Fetching remote configuration");
        n96 n96Var = this.f28591a;
        m9925S(n96Var);
        n66 n66VarM8642G = n96Var.m8642G(strM13404D2);
        m9925S(n96Var);
        n96Var.mo5038t();
        String str = (String) n96Var.f25590q.get(strM13404D2);
        if (n66VarM8642G != null) {
            if (TextUtils.isEmpty(str)) {
                c0805jo2 = null;
            } else {
                c0805jo2 = new C0805jo(0);
                c0805jo2.put("If-Modified-Since", str);
            }
            m9925S(n96Var);
            n96Var.mo5038t();
            String str2 = (String) n96Var.f25580L.get(strM13404D2);
            if (!TextUtils.isEmpty(str2)) {
                if (c0805jo2 == null) {
                    c0805jo2 = new C0805jo(0);
                }
                c0805jo2.put("If-None-Match", str2);
            }
            c0805jo = c0805jo2;
        } else {
            c0805jo = null;
        }
        this.f28610t = true;
        q76 q76Var = this.f28592b;
        m9925S(q76Var);
        rr5 rr5Var = new rr5((byte) 15);
        rr5Var.f29555b = this;
        VarHandle.storeStoreFence();
        oa6 oa6Var = (oa6) q76Var.f36084a;
        q76Var.mo5038t();
        q76Var.m10368u();
        vl6 vl6Var = q76Var.f19870f.f28600j;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) e56.f17784f.m4379a(null)).encodedAuthority((String) e56.f17787g.m4379a(null)).path("config/app/".concat(String.valueOf(z76Var.m13407G()))).appendQueryParameter("platform", "android");
        ((oa6) vl6Var.f36084a).f26512d.m9235z();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(130000L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            ea6 ea6Var = oa6Var.f26515g;
            oa6.m9016l(ea6Var);
            ea6Var.m5036G(new tq5(q76Var, z76Var.m13404D(), url, (byte[]) null, c0805jo, rr5Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12506c("Failed to parse config URL. Not fetching. appId", d76.m4401y(z76Var.m13404D()), string);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[PHI: r11
  0x0047: PHI (r11v12 int) = (r11v2 int), (r11v0 int) binds: [B:15:0x0049, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:54:0x015a A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:8:0x0030, B:18:0x004e, B:55:0x015d, B:26:0x006c, B:31:0x00c8, B:30:0x00b6, B:32:0x00cd, B:36:0x00de, B:40:0x00f4, B:42:0x010c, B:44:0x0127, B:46:0x0130, B:48:0x0136, B:49:0x013a, B:51:0x0143, B:53:0x0152, B:54:0x015a, B:43:0x0118, B:37:0x00e5, B:39:0x00ee), top: B:64:0x0030, outer: #0 }] */
    /* JADX INFO: renamed from: z */
    public final void m9982z(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        q76 q76Var = this.f28592b;
        mo9020c().mo5038t();
        m9962k0();
        y42.m12851X(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f28610t = false;
                m9937M();
                throw th2;
            }
        }
        x66 x66Var = mo9019b().f16831L;
        Integer numValueOf = Integer.valueOf(bArr.length);
        x66Var.m12505b(numValueOf, "onConfigFetched. Response size");
        ar5 ar5Var = this.f28593c;
        m9925S(ar5Var);
        ar5Var.m3194i0();
        try {
            ar5 ar5Var2 = this.f28593c;
            m9925S(ar5Var2);
            z76 z76VarM3212y0 = ar5Var2.m3212y0(str);
            if (i == 200 || i == 204) {
                if (th == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (i == 304) {
                i = 304;
                if (th == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z76VarM3212y0 == null) {
                mo9019b().f16838m.m12505b(d76.m4401y(str), "App does not exist in onConfigFetched. appId");
            } else {
                n96 n96Var = this.f28591a;
                if (z || i == 404) {
                    String strM9922K = m9922K("Last-Modified", map);
                    String strM9922K2 = m9922K("ETag", map);
                    if (i == 404 || i == 304) {
                        m9925S(n96Var);
                        if (n96Var.m8642G(str) == null) {
                            m9925S(n96Var);
                            n96Var.m8644I(str, null, null, null);
                        }
                    } else {
                        m9925S(n96Var);
                        n96Var.m8644I(str, bArr, strM9922K, strM9922K2);
                    }
                    mo9022e().getClass();
                    z76VarM3212y0.m13425f(System.currentTimeMillis());
                    ar5 ar5Var3 = this.f28593c;
                    m9925S(ar5Var3);
                    ar5Var3.m3214z0(z76VarM3212y0, false);
                    if (i == 404) {
                        mo9019b().f16840o.m12505b(str, "Config not found. Using empty config. appId");
                    } else {
                        mo9019b().f16831L.m12506c("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), numValueOf);
                    }
                    m9925S(q76Var);
                    if (q76Var.m9785O() && m9935J()) {
                        m9973q();
                    } else {
                        m9925S(q76Var);
                        if (q76Var.m9785O()) {
                            ar5 ar5Var4 = this.f28593c;
                            m9925S(ar5Var4);
                            if (ar5Var4.m3158A(z76VarM3212y0.m13404D())) {
                                m9976t(z76VarM3212y0.m13404D());
                            } else {
                                m9936L();
                            }
                        } else {
                            m9936L();
                        }
                    }
                } else {
                    mo9022e().getClass();
                    z76VarM3212y0.m13426g(System.currentTimeMillis());
                    ar5 ar5Var5 = this.f28593c;
                    m9925S(ar5Var5);
                    ar5Var5.m3214z0(z76VarM3212y0, false);
                    mo9019b().f16831L.m12506c("Fetching config failed. code, error", Integer.valueOf(i), th);
                    m9925S(n96Var);
                    n96Var.mo5038t();
                    n96Var.f25590q.put(str, null);
                    n86 n86Var = this.f28599i.f29367m;
                    mo9022e().getClass();
                    n86Var.m8624b(System.currentTimeMillis());
                    if (i == 503 || i == 429) {
                        n86 n86Var2 = this.f28599i.f29365k;
                        mo9022e().getClass();
                        n86Var2.m8624b(System.currentTimeMillis());
                    }
                    m9936L();
                }
            }
            ar5 ar5Var6 = this.f28593c;
            m9925S(ar5Var6);
            ar5Var6.m3195j0();
            ar5 ar5Var7 = this.f28593c;
            m9925S(ar5Var7);
            ar5Var7.m3196k0();
            this.f28610t = false;
            m9937M();
        } catch (Throwable th3) {
            ar5 ar5Var8 = this.f28593c;
            m9925S(ar5Var8);
            ar5Var8.m3196k0();
            throw th3;
        }
    }
}
