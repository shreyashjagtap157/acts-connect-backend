package com.connect.acts.ActsConnectBackend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post {

  @Id
  @GeneratedValue(generator = "uuid2")
  @UuidGenerator
  @Column(updatable = false, nullable = false)
  private UUID id;

  @Column(nullable = false)
  private String title;

  @Column(length = 500)
  private String content;

  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<Comment> comments;

  @ManyToMany
  @JoinTable(name = "post_likes",
          joinColumns = @JoinColumn(name = "post_id"),
          inverseJoinColumns = @JoinColumn(name = "user_id"))
  private Set<User> likedByUsers;
}