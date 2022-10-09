package kz.bitlab.trelloproject.Trelloroject.model;


import javax.persistence.*;

@Entity
@Table(name = "t_comments")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "comment", columnDefinition = "TEXT")
    private String comment;

//    @Column(name = "task")
//    private Tasks tasks;
}
